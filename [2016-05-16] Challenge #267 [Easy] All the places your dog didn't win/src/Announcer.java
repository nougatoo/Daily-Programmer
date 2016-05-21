import java.util.ArrayList;


public class Announcer {
	
	/**
	 * 
	 * @param myPlace the places your dog is in (number to be excluded)
	 * @param number_of_places inclusive number of places to show up to
	 * @param exclude_zero true if you don't want to show 0th place
	 */
	public void showPlaces(int myPlace, int number_of_places, boolean exclude_zero)
	{
		ArrayList<Integer> specials = new ArrayList<Integer>();
		ArrayList<Integer> th = new ArrayList<Integer>();
		ArrayList<Integer> st = new ArrayList<Integer>();
		ArrayList<Integer> rd = new ArrayList<Integer>();
		ArrayList<Integer> nd = new ArrayList<Integer>();
		int num = -1;
		
		specials.add(11);
		specials.add(12);
		specials.add(13);

		th.add(0);
		th.add(4);
		th.add(5);
		th.add(6);
		th.add(7);
		th.add(8);
		th.add(9);
		
		st.add(1);
		
		rd.add(3);
		
		nd.add(2);
		
		for(int i = exclude_zero? 1 : 0; i<= number_of_places; i++)
		{
			if(i != myPlace)
			{
				num = i%10;
				String suffix = "";
				
				if(specials.contains(i) || th.contains(num))
					suffix = "th";
				else if (st.contains(num))
					suffix = "st";
				else if (rd.contains(num))
					suffix = "rd";
				else if (nd.contains(num))
					suffix = "nd";
				
				System.out.print(i + suffix + ", ");
			}
		}
		
	}

}
