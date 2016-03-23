package cn.imeixi.chapter1.exer;

public class Exer11AllTheColorsOfTheRainbow {
	public static void main(String[] args) {
		AllTheColorsOfTheRainbow at = new AllTheColorsOfTheRainbow();
		at.changeTheHueOfTheColor(12);
		System.out.println(at.anIntegerRepresentingColors);
	}
}

class AllTheColorsOfTheRainbow{
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue){
		anIntegerRepresentingColors = newHue;
	}
}