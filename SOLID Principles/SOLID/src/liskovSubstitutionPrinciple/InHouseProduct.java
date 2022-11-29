package liskovSubstitutionPrinciple;

public class InHouseProduct extends Product {
	
	public double getDiscount() {
		this.applyExtraDiscount();
		return discount;
	}
	
	public void applyExtraDiscount() {
		discount = discount * 1.5;
	}

}
