package  µ—È“ª;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Operat {
	  static String[] lineParser(String line, int scale){
	        String[] lineDicts = null;
	        if(line != null ) {
	            String[] spliter = line.split("\\s+|£¨+|°£+|°¢");
	            List<String> container = new ArrayList<String>();
	            for(int i=0; i<spliter.length; i ++){
	               container=stringCut(spliter[i],scale);
	            }
	            lineDicts = new String[container.size()];
	            container.toArray(lineDicts);
	        }
	        return lineDicts;
	    } 
	    static List<String> stringCut(String s,int len) {
	    	List<String> result=new ArrayList<String>();
			int iLen=s.length();
			while(iLen>=len) {
				String tmp=s.substring(0, len);
				result.add(tmp);
				s=s.substring(len);
				iLen=s.length();
			}
			return result;
	    }
	    static double divide(double divisor, double dividend){
	        return new BigDecimal(divisor).divide(new BigDecimal(dividend), 5, BigDecimal.ROUND_HALF_UP).doubleValue();
	    }
}
