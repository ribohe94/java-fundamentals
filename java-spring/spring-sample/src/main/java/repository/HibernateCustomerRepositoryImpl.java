package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rdbv on 2/28/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer = new Customer();
        customer.setFirstName("Frodo");
        customer.setLastName("Baggings");

        customers.add(customer);

        return customers;
    }

}
