package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Ozads
 * @version v1.0
 * @project cab demo
 * @since 2024-07-01
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo {
    private Integer id;
    private MultipartFile file;
}
