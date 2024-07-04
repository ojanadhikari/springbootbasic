package com.example.demo.dto.response;

import com.example.demo.entity.AddressEntity;
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
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDTO {
    private Integer id;
    private String street;
    private String district;

    public AddressResponseDTO(AddressEntity addressEntity) {
        this.id = addressEntity.getId();
        this.street = addressEntity.getStreet();
        this.district = addressEntity.getDistrict();
    }
}
