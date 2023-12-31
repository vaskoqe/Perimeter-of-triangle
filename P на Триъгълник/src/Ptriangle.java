import java.util.Scanner;
public class Ptriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Добре дошли в програмата за намиране на обиколка на тръгълник. ");
		System.out.println("Въведи страна а: ");
		double a= input.nextDouble();
		System.out.println("Въведи страна b : ");
		double b = input.nextDouble();
		System.out.println("Въведи страна c: ");
		double c= input.nextDouble();
		double perimeter =(a+b+c);
		System.out.println("Обиколката на тръгълника е "+ perimeter+" cm");
	}
}
