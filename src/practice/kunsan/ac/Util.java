package practice.kunsan.ac;

public class Util {
	public static double celsiusToFahrenheit(double celsius)
	{
		return (9.0 / 5.0) * celsius + 32;
	}
	
	public static void printLabel(int idx, String desc)
	{
		System.out.println(String.format(">> Practice #%d : %s", idx, desc));
		System.out.println("==============================");
	}
}
