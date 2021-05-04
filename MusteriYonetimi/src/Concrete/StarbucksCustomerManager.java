package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private IPersonCheckService customerCheckService;
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}
	
	
}
