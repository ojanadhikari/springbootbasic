package com.example.demo.entity;

import jakarta.persistence.*;
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
@Entity
@Table(name = "addr")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "addr_street", length = 200, nullable = false)
    private String street;
    @Column(name = "addr_district", length = 200, nullable = false)
    private String district;
}
