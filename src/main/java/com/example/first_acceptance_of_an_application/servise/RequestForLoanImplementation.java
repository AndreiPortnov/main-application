package com.example.first_acceptance_of_an_application.servise;

import com.example.first_acceptance_of_an_application.dto.CreditApplicationDTO;
import com.example.first_acceptance_of_an_application.dto.CreditResultResponseDTO;
import com.example.first_acceptance_of_an_application.resttemplate.RestTemplateRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestForLoanImplementation implements RequestForLoanServise {

    @Autowired
    private RestTemplateRequests restTemplateRequests;


    @Override
    public CreditResultResponseDTO checkApplicationForm(CreditApplicationDTO creditApplicationDTO) {
        String checkMessage = restTemplateRequests.checkRequestClient(creditApplicationDTO);
        CreditResultResponseDTO creditResultResponseDTO = new CreditResultResponseDTO();

        if (checkMessage.equals("проверка прошла успешно, кредит одобрен")) {

            creditResultResponseDTO.setMessage("проверка прошла успешно, кредит одобрен");

            creditResultResponseDTO.setStatus("одобрение");

            creditResultResponseDTO.setCreditNumber(generateDocNumber());

            return creditResultResponseDTO;
        }
        creditResultResponseDTO.setStatus("в заявке отказано");
        creditResultResponseDTO.setMessage("ты плохой заемщик");

        return creditResultResponseDTO;
    }

    private String generateDocNumber() {
        return String.valueOf(Math.random());
    }
}
