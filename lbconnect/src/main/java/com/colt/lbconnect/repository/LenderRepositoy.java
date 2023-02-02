package com.colt.lbconnect.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colt.lbconnect.entities.Lender;

@Repository
public interface LenderRepositoy extends CrudRepository<Lender, Integer> {

}
