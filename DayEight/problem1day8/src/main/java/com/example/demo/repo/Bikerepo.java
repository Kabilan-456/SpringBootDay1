package com.example.demo.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Bikedetails;
@Repository
public interface Bikerepo extends JpaRepository<Bikedetails, Integer>{
    @Query(value="select * from bikedetails where year=:s",nativeQuery = true)
    public List<Bikedetails> getbikedetails(@Param("s") int year);
    
    @Query(value="select * from bikedetails where bikename=:s1 or year=:s2",nativeQuery = true)
    public List<Bikedetails> getdetails(@Param("s1") String bikename,@Param("s2") int year);
}
