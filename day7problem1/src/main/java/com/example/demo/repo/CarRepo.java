package com.example.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Cardetails;
public interface CarRepo extends JpaRepository<Cardetails, Integer> {
      @Query(value="select * from cardetails where owners=:s",nativeQuery = true)
      public List<Cardetails> getbyowners(@Param("s") int owners);
      
      @Query(value="select * from cardetails where address=:s",nativeQuery = true)
      public List<Cardetails> getbyaddress(@Param("s") String address);
      
      @Query(value="select * from cardetails where carname=:s",nativeQuery = true)
      public List<Cardetails> getbycarname(@Param("s") String carname);
      
      @Query(value="select * from cardetails where owners=:s1 or cartype=:s2",nativeQuery = true)
      public List<Cardetails> getby(@Param("s1") int owners, @Param("s2") String cartype);
}
