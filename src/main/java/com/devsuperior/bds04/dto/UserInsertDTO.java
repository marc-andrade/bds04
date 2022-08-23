package com.devsuperior.bds04.dto;


import com.devsuperior.bds04.services.validation.UserInsertValid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@UserInsertValid
@NoArgsConstructor
@Getter
@Setter
public class UserInsertDTO extends UserDTO{

    private String password;
}
