import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "ferhat", "kara", "47832091", LocalDate.of(1997, 10, 10) ));
		
	}

}
