package com.example.first_acceptance_of_an_application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MainBorrowerDTO {

    private String firstNameMain;
    private String secondNameMain;
    private String sexMain;
    private String dateOfBirthMain;
    private String cityOfBirthMain;
    private String passportSerialMain;
    private String passportNumberMain;
    private List<String> placeOfWorkMain;
    private Integer incomePerMonthMain;
    private Integer monthlyExpenseMain;
    private String familyStatusMain;
    private Integer amountOfChildrenMain;
    private List<String> propertyMain;

}
