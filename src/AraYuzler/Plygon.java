package AraYuzler;

public interface Plygon {
	void getArea();

	default void getSides() {
		System.out.println("Plygon Kenar Sayısı");

	}

	default void getPerimeter(int... sides) {


		int perimeter=0;
		for(int side:sides) {
			perimeter+=side;
			
		}
		System.out.println("Cokgenin Cevresi:"+ perimeter);
		
		
	}
}
