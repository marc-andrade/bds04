package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private Long id;
    @NotBlank(message = "Campo obrigatório")
    private String firstName;
    private String lastName;
    @Email(message = "Favor entrar um email válido")
    private String email;

    Set<RoleDTO> roles = new HashSet<>();

    public UserDTO(Long id, String firstName, String email, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UserDTO(User entity) {
        id = entity.getId();
        email = entity.getEmail();

        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
    }
}
