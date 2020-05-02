package entities;

public class ImportedProduct extends Product {
	
	private double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		double som = price + customsFee;
		return name + " $ " + String.format("%.2f", som) + " (Customs fee: $ 20.00)";
	}
}
