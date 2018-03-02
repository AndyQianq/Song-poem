package 实验一;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CutAndCount {
	    public static void Word(int partiSize){
	        final Map<String,Integer> dictFreq = new HashMap<String,Integer>();
	        FileIntoOut.readInput(new LineSolution(){
	            public void solveLine(String line){
	            	//System.out.println(line);
	                String[] lineDicts = Operat.lineParser(line, partiSize);
	                if(lineDicts != null){
	                    for(int i=0; i<lineDicts.length; i++){
	                        String word = lineDicts[i];
	                        if(dictFreq.containsKey(word)){
	                            int num = dictFreq.get(word);
	                            dictFreq.put(word, ++num);
	                        }
	                        else {
	                            dictFreq.put(word, 1);
	                        }
	                    }
	                }
	            }
	        });
	        int sum=0; 
	        String con=null;
	        int count=0;
	        ArrayList<String> list= new ArrayList<String>();
	        for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	        	if(entry.getValue()>3)count++;
	        	sum=sum+entry.getValue();
	        	}
	        System.out.println("总数："+count);
	        for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	        	con=entry.getKey() + "\t times: " + entry.getValue()+"\n";//+ "\t frequency:"+Operat.divide(entry.getValue(),sum)*100+"%"+'\n';
	           // System.out.print(con);
	            list.add(con);
	        }
	        FileIntoOut.writeoutput(partiSize,list);
	        //System.out.print(list.get(i));
	        System.out.println("输出统计的词总数："+sum);
	    }


}
