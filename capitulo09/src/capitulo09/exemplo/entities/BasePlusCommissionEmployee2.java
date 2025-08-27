package capitulo09.exemplo.entities;

public class BasePlusCommissionEmployee2 extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee2(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary) {
		// chamada explicita para o contrutor CommissionEmployee da superclasse
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		this.baseSalary = baseSalary;

	}

}
