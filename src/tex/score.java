package tex;
import java.util.Scanner;

public class score {

	public static void main(String[] args) 
	{
	Scanner KB = new Scanner(System.in);
	System.out.print(" ������ô : ");
	int A = KB.nextInt();
	
	if ( A < 50 )
		System.out.println("�ô F ");
	
	else if ((A >= 50) && (A <=55))	
		System.out.println("�ô D ");
		
	else if ((A >= 50) && (A <=59))			
		System.out.println("�ô D+ ");
	
	else if ((A >= 60 )&& (A <=65))		
		System.out.println("�ô C ");
		
	else if ((A >= 60) && (A <=69))			
		System.out.println("�ô C+ ");
	
	else if ((A >= 70) && (A <= 75))		
		System.out.println("�ô B ");
		
	else if ((A >= 70) && (A <=79))			
		System.out.println("�ô B+ ");
	
	else if ((A >= 80) && (A < 100))		
		System.out.println("�ô  A ");
	
	else if ( A >= 100 )
		System.out.println(" - Fail - ");


}
}
