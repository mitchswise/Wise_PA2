/**
 * Mitchell Wise
 * 09/21/2019
 * COP3330
 * Dr. Christopher D. Hollander
 * Rating program: Programming Assignment 2, problem 3.
 * This program rates 5 topics from multiple users, than outputs some statistics about the topics ratings.
 */

package wise_p03;

import java.util.Scanner;

public class wise_p03 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = {"Football", "Lacrosse", "Baseball", "Basketball", "Wrestling"};
	
		int responses[][] = new int[5][10];		
		int i, j, x, y, rating;
		float[] avg = {0, 0, 0, 0, 0};
		float counter = 0, num1, num2, highest, lowest;
		char ch;
		
		System.out.println("***** Welcome to the rating program! *****\n");
		
		while(true)
		{	
			
			counter++;
			
			System.out.println("----------------------------------------------------------\n");
			System.out.println("Rate these 5 topics (1-10).\n\nTopics: " + topics[0] + ", " + topics[1] + ", " + topics[2] + ", " + topics[3] + ", " + topics[4] +"\n");

			for(i = 0; i < 5; i++)
			{
				
				System.out.print(topics[i] + " (1-10): ");
				
				rating = scnr.nextInt();
				
				responses[i][rating-1] = 1;
				
				avg[i] = avg[i] + rating;
			}
			
			for(x = 0; x < 5; x++)
			{
				if(x == 0)
				{
					System.out.println("\n\t\t1 2 3 4 5 6 7 8 9 10 | AVG\n----------------------------------------------------------");
				}
				
				System.out.print(topics[x] + "\t");
				
				for(y = 0; y < 10; y++)
				{
					System.out.print(responses[x][y] + " ");
				}
				
				System.out.print("| ");
				System.out.printf("%.2f", (avg[x]) / (counter) );
				System.out.print("\n");
			}
			
			System.out.print("\nAre there more people to rate the 5 topics? (y or n): ");
			
			ch = scnr.next().charAt(0);	
			
			if(ch == 'y' || ch == 'Y')
			{

				System.out.print("\n");
				
				// display responses [x][y]
				

				
				// reset all values of responses[x][y] to = 0
				
				for(x = 0; x < 5; x++)
				{
					for(y = 0; y < 10; y++)
					{
						responses[x][y] = 0;
					}
				}
							
			}
						
			if(ch == 'n' || ch == 'N')
			{
				
				if(avg[0] > avg[1])
				{
					highest = avg[0];
				}
				else
				{
					highest = avg[1];
				}
				
				if(highest < avg[2])
				{
					highest = avg[2];
				}
				
				
				if(highest < avg[3])
				{
					highest = avg[3];
				}
				
				if(highest < avg[4])
				{
					highest = avg[4];
				}
				
				// lowest
				
				if(avg[0] < avg[1])
				{
					lowest = avg[0];
				}
				else
				{
					lowest = avg[1];
				}
				
				if(lowest > avg[2])
				{
					lowest = avg[2];
				}
				
				if(lowest > avg[3])
				{
					lowest = avg[3];
				}
				
				if(lowest > avg[4])
				{
					lowest = avg[4];
				}
				
				System.out.print("\nThe topic with the most points has " + highest + " points");
				System.out.print("\nThe topic with the least points has " + lowest + " points");

				System.out.print("\n\nThank you, goodbye!");
				return;
			}
			
		}
		
	}

}