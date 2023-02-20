package com.example.first_acceptance_of_an_application.controller;

import com.example.first_acceptance_of_an_application.dto.CreditApplicationDTO;
import com.example.first_acceptance_of_an_application.dto.CreditResultResponseDTO;
import com.example.first_acceptance_of_an_application.servise.RequestForLoanServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static com.example.first_acceptance_of_an_application.constant.StaticConstant.API_CHECK_CLIENT_FORM;


@RestController
public class MainController {

    @Autowired
    private RequestForLoanServise requestForLoan;

    @PostMapping(API_CHECK_CLIENT_FORM)
    public @ResponseBody CreditResultResponseDTO getCheckFormApplication(@RequestBody CreditApplicationDTO creditApplicationDTO) {
        //создать пакет с валидацией
        CreditResultResponseDTO creditResultResponseDTO = requestForLoan.checkApplicationForm(creditApplicationDTO);
        return creditResultResponseDTO;
    }

}