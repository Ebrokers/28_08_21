package com.ebrokers.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ebrokers.Entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Integer>  {
	@Query("select t from Merchant t where t.id = :id")
	public Merchant getById(@Param("id") Integer id);
}
