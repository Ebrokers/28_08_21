package com.ebrokers.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ebrokers.Entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer> {

}
