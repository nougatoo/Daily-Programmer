/*****************************
 * https://www.reddit.com/r/dailyprogrammer/comments/4ijtrt/20160509_challenge_266_easy_basic_graph/
 * 
 * 
 * @author Brandon Brien
 * 
 * Last Edited: May 21st, 2016
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class main {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = null;
		scanner = new Scanner(new File("input2.txt"));
		
		int [] degree_count = new int [scanner.nextInt()];
		
		// Initialize array to 0's
		for(int i = 0; i < degree_count.length; i++)
		{
			degree_count[i] = 0;
		}
		
		int i = 0;
		while(scanner.hasNextInt())
		{
		     degree_count[scanner.nextInt()-1] += 1;
		}
		
		for(int j = 0; j < degree_count.length; j++)
		{
			System.out.println("Node " + (j+1) + " has a degree of " + degree_count[j]);
		}
		

	}

}
