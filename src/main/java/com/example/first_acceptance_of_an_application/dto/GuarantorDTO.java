package com.example.first_acceptance_of_an_application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class GuarantorDTO {
    private String firstNameGuarantor;
    private String secondNameGuarantor;
    private String sexGuarantor;
    private String dateOfBirthGuarantor;
    private String cityOfBirthGuarantor;
    private String passportSerialGuarantor;
    private String passportNumberGuarantor;
    private List<String> placeOfWorkGuarantor;
    private List<String> propertyGuarantor;
}
