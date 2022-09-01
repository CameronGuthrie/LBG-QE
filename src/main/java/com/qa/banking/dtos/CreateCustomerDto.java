package com.qa.banking.dtos;

import com.qa.banking.entities.CustomerAccount;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateCustomerDto {

    private String title;
    private String surname;
    private String firstName;
    private Date dateOfBirth;
    private String gender;
    private String customerType;
    private String address1;
    private String address2;
    private String cityTown;
    private String postcode;
    private String phoneNo;
    private String email;
    private String placeOfBirth;
    private String motherMaidenName;


}