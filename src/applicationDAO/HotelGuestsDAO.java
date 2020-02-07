package applicationDAO;
import java.util.Scanner;
import entitiesTO.HotelGuestsTO;

public class HotelGuestsDAO {

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		HotelGuestsTO[]vect = new HotelGuestsTO[10];	
		
		System.out.println("How many rooms  will be rented");
		int n = sc.nextInt();
		
		for(int i =0;i<=n;i++){
			System.out.println();
			System.out.println("Rent# " + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("emai: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new HotelGuestsTO(name,email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0;i<10;i++){
			if(vect[i]!=null){
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		sc.close();
	}
	
}
