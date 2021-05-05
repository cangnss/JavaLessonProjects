package Concrete;

import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements IGamerCheckService{

	@Override
	public boolean check(Gamer gamer) {
		boolean result; 
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
	
			try {
				result = kpsPublicSoapProxy.TCKimlikNoDogrula(
						Long.parseLong(gamer.getTcno()),					
						gamer.getFirstName().toUpperCase(),
						gamer.getLastName().toUpperCase(),
						gamer.getDateOfBirth()
						);
			} catch (NumberFormatException | RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = false;
			} 
		
		return result;
	}
	

}
