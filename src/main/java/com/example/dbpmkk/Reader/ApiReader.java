package com.example.dbpmkk.Reader;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ApiReader implements ItemReader<PolicyResult> {

    @Override
    public PolicyResult read() {

        ExchangeStrategies strategies = ExchangeStrategies;
                 .builder()
                .codecs(clientDefaultCodecsConfigurer -> {
                    clientDefaultCodecsConfigurer.defaultCodecs()
                            .jackson2JsonEncoder
                                    (new Jackson2JsonEncoder(new ObjectMapper(),
                                            MediaType.APPLICATION_JSON));
                    clientDefaultCodecsConfigurer
                            .defaultCodecs()
                            .jackson2JsonDecoder
                                    (new Jackson2JsonDecoder(
                                            new ObjectMapper(),
                                            MediaType.APPLICATION_JSON));

                }).build();
    }


}
