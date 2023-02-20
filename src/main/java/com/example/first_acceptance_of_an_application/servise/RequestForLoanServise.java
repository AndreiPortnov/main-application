package com.example.first_acceptance_of_an_application.servise;

import com.example.first_acceptance_of_an_application.dto.CreditApplicationDTO;
import com.example.first_acceptance_of_an_application.dto.CreditResultResponseDTO;

public interface RequestForLoanServise {
    CreditResultResponseDTO checkApplicationForm(CreditApplicationDTO creditApplicationDTO);


}
