package com.example.first_acceptance_of_an_application.mapper;

import com.example.first_acceptance_of_an_application.dto.CreditApplicationDTO;
import com.example.first_acceptance_of_an_application.dto.MainBorrowerDTO;
import org.springframework.stereotype.Component;

@Component
public interface MainBorrowerMapper {

    default MainBorrowerDTO creditAppDTOtoMainBorrowerDTO(CreditApplicationDTO creditApplicationDTO) {

        MainBorrowerDTO mainBorrowerDTO = new MainBorrowerDTO();
        mainBorrowerDTO.setFirstNameMain(creditApplicationDTO.getFirstNameMain());
        mainBorrowerDTO.setSecondNameMain(creditApplicationDTO.getSecondNameMain());
        mainBorrowerDTO.setSexMain(creditApplicationDTO.getSexMain());
        mainBorrowerDTO.setDateOfBirthMain(creditApplicationDTO.getDateOfBirthMain());
        mainBorrowerDTO.setCityOfBirthMain(creditApplicationDTO.getCityOfBirthMain());
        mainBorrowerDTO.setPassportSerialMain(creditApplicationDTO.getPassportSerialMain());
        mainBorrowerDTO.setPassportNumberMain(creditApplicationDTO.getPassportNumberMain());
        mainBorrowerDTO.setPlaceOfWorkMain(creditApplicationDTO.getPlaceOfWorkMain());
        mainBorrowerDTO.setIncomePerMonthMain(creditApplicationDTO.getIncomePerMonthMain());
        mainBorrowerDTO.setMonthlyExpenseMain(creditApplicationDTO.getMonthlyExpenseMain());
        mainBorrowerDTO.setFamilyStatusMain(creditApplicationDTO.getFamilyStatusMain());
        mainBorrowerDTO.setAmountOfChildrenMain(creditApplicationDTO.getAmountOfChildrenMain());
        mainBorrowerDTO.setPropertyMain(creditApplicationDTO.getPropertyMain());

        return mainBorrowerDTO;
    }
}
