package com.example.demo.repoisitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.modelproject.Modled;

import jakarta.transaction.Transactional;

public interface AppRepository extends JpaRepository<Modled, Integer> {
	//select
	@Query(value="select * from resrvationdetails where bookingid=:a",nativeQuery =true)
	public List<Modled>getstudentinfor(@Param("a")int bookingid);
	
	//delete
	@Modifying
	@Transactional
	@Query(value = "delete from resrvationdetails  where bookingid=:f",nativeQuery = true)
	public Integer deleteBookById(@Param("f") int bookingid);
	
	//update
	@Modifying
	@Transactional
	@Query(value = "update resrvationdetails   set bookingid=?1 where bookingid=?2",nativeQuery = true)
	public int updateBookById(int newid,int oldid);
}