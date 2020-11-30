import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuySellStock {
	
	public static void main(String[] args) {
		
		int[] input = {7,1,5,3,6,4};
		String [] str = {"entities/pYJJGs5/attributes/LegacyData/1cr97R82T/SRC_SYST_NM/1cr97RGYz",
                "entities/pYJJGs5/attributes/LegacyData/1cr97R82T"};
		
		//str ="entities/pYJJGs5/attributes/LegacyData/1cr97R82T/SRC_SYST_NM/1cr97RGY";
		String[] array = "entities/pYJJGs5/attributes/LegacyData/1cr97R82T/SRC_SYST_NM/1cr97RGYz".split("/");
		for(String x : array)
			System.out.println(x);
		
		
		// Extract the text between the two title elements
		//String pattern = "(?i)(<title.*?>)(.+?)()";
		//String updated = EXAMPLE_TEST.replaceAll(pattern, "$2");

		
		//System.out.println(maxProfit(input));
	}

	public static int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        
        int profit = prices[1] - prices[0];
        int min = prices[0];
        
        for(int i=1;i<prices.length;i++){
            
            if(prices[i] - min > profit)   profit = prices[i] - min;
            if(min< prices[i])  min = prices[i];
            
            
        }
        
        if(profit < 0) return 0;
        return profit;
    }

}
