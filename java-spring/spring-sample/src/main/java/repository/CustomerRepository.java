package repository;

import model.Customer;

import java.util.List;

/**
 * Created by rdbv on 2/28/2017.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
