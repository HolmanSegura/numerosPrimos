import java.util.Scanner;
public class numerosprimos{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int s;
		System.out.print("digite hasta donde quiere lleguen los numeros primos: ");
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