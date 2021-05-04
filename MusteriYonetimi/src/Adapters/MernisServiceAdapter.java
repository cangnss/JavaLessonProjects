package Adapters;

import Abstract.IPersonCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements IPersonCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
/*
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapClient client = new KPSPublicSoapClient();
		return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth());
	}
*/
	
}
