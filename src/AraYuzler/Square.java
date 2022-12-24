package AraYuzler;

public class Square implements Plygon {

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		int kenar=5;
		int area=kenar*kenar;
		System.out.println("Karenin Alani:"+area);
	}

	public void getSide() {
	System.out.println("Karenin 4 Kenarı Birbirine Esittir.");

}
}
