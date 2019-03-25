
public class Program {
	public static void main(String[] args) {
		
		Pravougaonik p= new Pravougaonik(5,9);
		System.out.println("Povrsina pravougaonika je: "+p.getP()+ ", a obim je: "+p.getO());
		
		Krug k= new Krug(6);
		System.out.println("Povrsina krug je: "+k.getP()+ ", a obim je: "+k.getO());
	}
}
