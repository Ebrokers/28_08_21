package com.ebrokers.Repositries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ebrokers.Entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer> {
	
	@Query("select t from Property t where t.meid = :meid")
	public List<Property> getByMeId(@Param("meid") Integer meid);
}
