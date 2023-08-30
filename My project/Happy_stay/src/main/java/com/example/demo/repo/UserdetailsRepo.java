package com.example.demo.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Userdetails;
@Repository
public interface UserdetailsRepo extends JpaRepository<Userdetails, Integer> {
  @Query(value="select * from userdetails where city=:s",nativeQuery = true)
  public List<Userdetails> getbycity(@Param("s") String city);
	
}
