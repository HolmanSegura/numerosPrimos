import java.util.Scanner;
public class cuadrado{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		int s;
		System.out.print("digite la longitud de un lado: ");
		s = sc.nextInt();
		System.out.println("\n\tArea y perimetro del cuadrado\n");
		System.out.println("El perimetro del cuadrado es: "+(s*4));
		System.out.println("El area del cuadrado es: "+(s*s));
	}
}