package com.kcbgroup.validationexample.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "Username Required!!")
    private String name;

    @Email(message = "Invalid or Missing Email")
    private String email;

    @NotNull(message = "Phone Number Entered is Invalid")
    @Pattern(regexp = "^\\d{10}$")
    private String mobile;

    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String nationality;
}
