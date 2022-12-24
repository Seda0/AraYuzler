package AraYuzler;

public class Rectangle implements Plygon {

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		int en = 6;
		int boy = 5;
		int area = en * boy;

		System.out.println("Dikdortgenin Alani :" + area);

	}

	public void getSide() {
		System.out.println("Dikdortgenin 4 Kenari Vardir.");

	}

}
