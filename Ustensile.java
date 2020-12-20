package ustensiles;

public abstract class Ustensile {
	private int year;
	private double value;
	
	public double calculerValeur() {
		return 0;
	}
	
	public String AffichierValeurTotal() {
		return "dsnksd";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}

