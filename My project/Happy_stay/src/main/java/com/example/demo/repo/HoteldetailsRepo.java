package com.example.demo.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Hoteldetails;
import jakarta.transaction.Transactional;
@Repository
public interface HoteldetailsRepo extends JpaRepository<Hoteldetails, Integer> {

	@Modifying
	@Transactional
	@Query(value = "update hoteldetails set noofrooms=:s where hotelid=:i",nativeQuery = true)
	public List<Hoteldetails> updatedet(@Param("s") int noofrooms, @Param("i") int hotelid);
	
	@Query(value="select * from hoteldetails where city=:s",nativeQuery = true)
	public List<Hoteldetails> show(@Param("s") String city);
	
	
	
}
