package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Bookingdetails;
@Repository
public interface Bookingrepo extends JpaRepository<Bookingdetails, Integer> {

}
