package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("veritabanưna kaydedildi" + customer.getFirstName());
	}

}
