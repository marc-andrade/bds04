package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.services.validation.UserUpdateValid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@UserUpdateValid
@NoArgsConstructor
@Getter
@Setter
public class UserUpdateDTO extends UserDTO{

}
