package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public abstract void save(Customer customer);

}
