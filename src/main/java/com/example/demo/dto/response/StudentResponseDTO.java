package com.example.demo.dto.response;

import com.example.demo.dto.Student;
import com.example.demo.entity.StudentEntity;
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
public class StudentResponseDTO {
    private Integer id;
    private String name;
    private String stuClass;
    private String fullAddress;

    public StudentResponseDTO(StudentEntity student) {
        this.id = student.getId();
        this.name = student.getName();
        this.stuClass = student.getStuClass();
        this.fullAddress = student.getAddress().getDistrict()+":"
            +student.getAddress().getStreet();
    }
}
