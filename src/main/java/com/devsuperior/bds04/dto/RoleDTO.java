package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoleDTO {

    private Long id;
    private String authority;

    public RoleDTO(Role role){
        id = role.getId();
        authority = role.getAuthority();
    }

}
