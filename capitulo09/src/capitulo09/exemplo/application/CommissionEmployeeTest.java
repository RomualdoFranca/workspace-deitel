package capitulo09.exemplo.application;

import capitulo09.exemplo.entities.BasePlusCommissionEmployee;
import capitulo09.exemplo.entities.CommissionEmployee;

public class CommissionEmployeeTest {

	public static void main(String[] args) {

		// instacia o objeto do tipo CommissionEmployee
		CommissionEmployee employee = new CommissionEmployee("Puga", "Fedido", "00011122233", 1000, .06);

		// obtem dados do empregado comissionado
		System.out.println("Employee information obtained by toString:");
		System.out.printf("%n%s", employee);

		BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Bob", "Lewis", "333-333-33", 5000, 500,
				.04);
	}

}
