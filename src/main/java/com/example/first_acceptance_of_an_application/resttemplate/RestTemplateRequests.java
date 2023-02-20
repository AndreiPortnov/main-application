package com.example.first_acceptance_of_an_application.resttemplate;

import com.example.first_acceptance_of_an_application.dto.CreditApplicationDTO;

public interface RestTemplateRequests {
    String checkRequestClient(CreditApplicationDTO creditApplicationDTO);
}
