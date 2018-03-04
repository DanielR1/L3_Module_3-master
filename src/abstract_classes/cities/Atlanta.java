package abstract_classes.cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double tax= (population*growthRate)*(growthRate*2);
		// TODO Auto-generated method stub
		return tax;
	}

}
