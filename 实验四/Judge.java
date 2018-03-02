package ʵ����;

import java.util.HashMap;
import java.util.Map;

public class Judge {
	public static boolean judge(String c) {
		final Map<String,Integer> dictFreq = new HashMap<String,Integer>();
		ReadFile.readInput(new LineSolution(){
			public void solveLine(String line){
				String[] lineDicts = line.split("\t times:");
				if(lineDicts != null){
					for(int i=0; i<lineDicts.length; i++){
						String word = lineDicts[i];
						if(dictFreq.containsKey(word)){
							int num = dictFreq.get(word);
						    dictFreq.put(word, ++num);
						    }else {
						    	dictFreq.put(word, 1);
						    	}
						}
					}
				}
			},"/Volumes/Untitled/workplace/1-gram�ִ�ͳ��.txt" );
		
        for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	    	 if(entry.getKey()!=null) {
	    		 if(c.equals(entry.getKey())) {
	    			// System.out.println("�ô��ǵ��ʣ�"); 
	    			 return true;
	    			 //break;
	    			 }
	    		 }
	        }
		return false;
        
	}

}
