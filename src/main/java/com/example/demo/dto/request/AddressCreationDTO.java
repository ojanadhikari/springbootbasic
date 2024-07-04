package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Ozads
 * @version v1.0
 * @project cab demo
 * @since 2024-07-04
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressCreationDTO {
    private String street;
    private String district;
}
