
public class Krug implements Figura{

	private double poluprecnik;

	public Krug() {
		super();
	}

	public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public double getO() {
		return 2*poluprecnik*Math.PI;
	}

	public double getP() {
		return poluprecnik*poluprecnik*Math.PI;
	}
}
