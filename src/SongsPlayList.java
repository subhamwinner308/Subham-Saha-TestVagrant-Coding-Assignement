import java.util.LinkedList;
import java.util.Scanner;

public class SongsPlayList {

	public static void main(String[] args) {
	
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		//Asking the size of playlist from the user
		System.out.println("Enter the size of playlist");
		//Taking the size of playlist and storing into int type variable
		int N = sc.nextInt();
		//Declaring the linkedlist for playlist
		LinkedList<String> pl = new LinkedList<String>();
		//Adding the first N songs into the playlist
		while(N!=0) {
			System.out.println("Play");
			pl.add(sc.next());
			N--;
		}
		//Displaying the initial playlist
		System.out.println("The Initial Playist -> "+pl);
		//The playlist gets updated every time when the next songs are played i.e. (N+1)th and the updated playlist is displayed
		for(int i=0;;i++) {
			System.out.println("Play");
			pl.add(sc.next());
			pl.removeFirst();
			System.out.println("The Updated Playist -> "+pl);
		}

	}

}
