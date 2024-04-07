import EnumsRainbow.Enums;

public class rainbowProgram {

	public static void main(String[] args) {
		
		for (Enums color : Enums.values()) {
			System.out.println(color);
		}
	}

}
