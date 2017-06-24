package pl.ene.springbootrestjpa.repository;

import org.springframework.data.repository.CrudRepository;

import pl.ene.springbootrestjpa.domain.Customer;

/**
 * 
 * @author neugeeug
 *
 */
public interface UserRepository extends CrudRepository<Customer, Long> {

}
