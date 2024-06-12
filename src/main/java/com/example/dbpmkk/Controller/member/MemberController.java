package com.example.dbpmkk.Controller.member;

import com.example.dbpmkk.DTO.MemberDTO;
import com.example.dbpmkk.Domain.member.MemberEntity;
import com.example.dbpmkk.Service.member.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;
    // 회원가입 페이지 출력 요청
    @GetMapping("/")
    public String home(){
        return "members/login";
    }


    @GetMapping("/member/save")
    public String saveForm(@ModelAttribute MemberEntity member, Model model) {
        model.addAttribute("member",member);
        return "members/createMemberForm";
    }

    @PostMapping("/member/save")    // name값을 requestparam에 담아온다
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "members/login";
    }

    @GetMapping("/member/login")
    public String loginForm(){
        return "members/login";
    }

    @PostMapping("/member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession seesion){
        MemberDTO loginResult = memberService.login(memberDTO);
        if(loginResult != null) {
            seesion.setAttribute("loginEmail", loginResult.getMemberEmail());
            return "policy/main";
        } else {
            return "members/login";
        }
    }
}
