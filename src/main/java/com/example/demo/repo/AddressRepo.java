package com.example.demo.repo;

import com.example.demo.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Ozads
 * @version v1.0
 * @project cab demo
 * @since 2024-07-04
 **/
public interface AddressRepo extends JpaRepository<AddressEntity,Integer> {
    List<AddressEntity> findByDistrict(String district);

    @Query(
        nativeQuery = true,
        value = "select * from addr where addr_district = ?1"
    )
    List<AddressEntity> getByDis(String dist);
}
