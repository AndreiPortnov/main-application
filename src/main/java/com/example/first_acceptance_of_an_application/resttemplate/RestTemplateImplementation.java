package com.example.first_acceptance_of_an_application.resttemplate;

import com.example.first_acceptance_of_an_application.dto.CreditApplicationDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static com.example.first_acceptance_of_an_application.constant.StaticConstant.MYURL;

@Component
public class RestTemplateImplementation implements RestTemplateRequests {


    @Override
    public String checkRequestClient(CreditApplicationDTO creditApplicationDTO) {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.exchange(MYURL,
                HttpMethod.POST,
                new HttpEntity<>(creditApplicationDTO),
                String.class).getBody();
    }
}
