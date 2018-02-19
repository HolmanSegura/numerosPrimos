import java.util.Scanner;
public class numerosprimos{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int s;
		System.out.println("digite el hasta donde quiere que imprman los numeros primos:");
		s = sc.nextInt();
		for (int j=2;j<=s;j++){
			int a=0;
			for(int i=1;i<=s;i++){
			     if(j%i==0)
			     a++;
			}
 			if (a==2){
			System.out.println(j);
			}
		}
	}
}