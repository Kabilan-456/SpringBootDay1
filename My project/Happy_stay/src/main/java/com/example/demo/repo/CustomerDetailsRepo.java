package com.example.demo.repo;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.CustomerDetails;

import jakarta.transaction.Transactional;
@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails, Integer>{
  
	@Query(value="select * from customerdetail where dayin=:s",nativeQuery = true)
	public List<CustomerDetails> getbydatein(@Param("s") Date dayin);
	
	@Query(value="select * from customerdetail where dayout=:s",nativeQuery = true)
	public List<CustomerDetails> getbydateout(@Param("s") Date dayout);
	
	@Modifying
	@Transactional
	@Query(value = "delete from customerdetail where custid=:s",nativeQuery = true)
	public int deletebyid(@Param("s") int custid);
}
