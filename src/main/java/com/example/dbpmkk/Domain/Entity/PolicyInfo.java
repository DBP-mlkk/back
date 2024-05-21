package com.example.dbpmkk.Domain.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "policy_info", schema = "dbp_db")
public class PolicyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "titleMain", length = 100)
    private String titleMain;

    @Column(name = "originWritten", length = 100)
    private String originWritten;

    @Column(name = "publicationYear")
    private Integer publicationYear;

    @Column(name = "author", length = 100)
    private String author;

    @Column(name = "contents", length = 4000)
    private String contents;

    public PolicyInfo(String titleMain, String originWritten, Integer publicationYear, String author, String contents) {
        this.titleMain = titleMain;
        this.originWritten = originWritten;
        this.publicationYear = publicationYear;
        this.author = author;
        this.contents = contents;
    }

    protected PolicyInfo() {}

    public void setId(int id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public String getTitleMain() {
        return titleMain;
    }

    public String getOriginWritten() {
        return originWritten;
    }

    public Integer getPublicationYear() {
        return publicationYear;

    }

    public String getAuthor() {
        return author;
    }

    public String getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "Policy [id=" + id + ", titleMain=" + titleMain + ", originWritten=" + originWritten + ", publicationYear=" +publicationYear +", author=" + author + ", contents=" + contents + "]";
    }

}