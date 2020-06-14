/**
 * 
 */
package com.example.demo.interfaces;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

/**
 * @author TAPENDU
 *
 */

@Repository
public interface IEmployeeRepository extends MongoRepository<Employee,String> {
	
	List<Employee> findAll();

}
