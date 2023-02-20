package com.example.first_acceptance_of_an_application.mapper;

import com.example.first_acceptance_of_an_application.dto.CreditApplicationDTO;
import com.example.first_acceptance_of_an_application.dto.GuarantorDTO;
import org.springframework.stereotype.Component;

@Component
public interface GuarantorMapper {

    default GuarantorDTO creditAppDTOtoGuarantorDTO(CreditApplicationDTO creditApplicationDTO) {

        GuarantorDTO guarantorDTO = new GuarantorDTO();

        guarantorDTO.setFirstNameGuarantor(creditApplicationDTO.getFirstNameGuarantor());
        guarantorDTO.setSecondNameGuarantor(creditApplicationDTO.getSecondNameGuarantor());
        guarantorDTO.setSexGuarantor(creditApplicationDTO.getSexGuarantor());
        guarantorDTO.setDateOfBirthGuarantor(creditApplicationDTO.getDateOfBirthGuarantor());
        guarantorDTO.setCityOfBirthGuarantor(creditApplicationDTO.getCityOfBirthGuarantor());
        guarantorDTO.setPassportSerialGuarantor(creditApplicationDTO.getPassportSerialGuarantor());
        guarantorDTO.setPassportNumberGuarantor(creditApplicationDTO.getPassportNumberGuarantor());
        guarantorDTO.setPlaceOfWorkGuarantor(creditApplicationDTO.getPlaceOfWorkGuarantor());
        guarantorDTO.setPropertyGuarantor(creditApplicationDTO.getPropertyGuarantor());

        return guarantorDTO;

    }
}

