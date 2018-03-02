package 实验三;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import 实验四.operat;

public class TongJi {
	public static void Word1(){
		final Map<String,Integer> dictFreq = new HashMap<String,Integer>();
		final Map<String,Integer> dictFreq2 = new HashMap<String,Integer>();
		ReadandWriteFile.readInput(new LineSolution(){
			
			public void solveLine(String line){
				for(int i=0;i<line.length();i++) {
					if(line.charAt(i)=='[')
						replace(line.charAt(i),'/');
					}
				String[] lineDicts = line.split("  ");
				if(lineDicts != null){
					for(int i=0; i<lineDicts.length; i++){
						String word = lineDicts[i];
						String[] WordDicts = word.split("/");
						String word1 = "";
						String word2 = "";
						for(int j=0;j< WordDicts.length;j++){
							 if(ChineseAndEnglish.isChinese(WordDicts[j]))
								 word1=word1+WordDicts[j];
							 else if(ChineseAndEnglish.isEnglish(WordDicts[j])) word2=word2+WordDicts[j];
						}
						if(dictFreq.containsKey(word1)){
							int num = dictFreq.get(word1);
						    dictFreq.put(word1, ++num);
						    }else {
						    	dictFreq.put(word1, 1);
						    	}
						if(dictFreq2.containsKey(word2)){
							int num = dictFreq2.get(word2);
						    dictFreq2.put(word2, ++num);
						    }else {
						    	dictFreq2.put(word2, 1);
						    	}
						}
					}
				}

			private void replace(char charAt, char c) {
				// TODO Auto-generated method stub
				charAt=c;
				
			}
			}, "/Volumes/Untitled/workplace/1998-01-2003版-带音.txt");
         int sum=0;
         int count=0;
	     String con=null;
	     String con2=null;
	     ArrayList<String> list= new ArrayList<String>();
	     ArrayList<String> list2= new ArrayList<String>();
	     for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	    	 if(entry.getKey()!=null) {
	        	sum=sum+entry.getValue();
	        	con=entry.getKey() + "\t times: " + entry.getValue() +'\n';}
	        	//System.out.println(con);
	            list.add(con);
	        }
	     for(Map.Entry<String,Integer> entry : dictFreq2.entrySet()) {
	    	 if(entry.getKey()!=null) {
	        	sum=sum+entry.getValue();
	        	con2=entry.getKey() + "\t times: " + entry.getValue() +'\n';
	        //System.out.println(con2);
	        	count++;}
	            list2.add(con2);
	        }
	     System.out.println("词性的种类个数："+count);
	     ReadandWriteFile.writeoutput(1,list);
	     ReadandWriteFile.writeout(1,list2);
	}
	public static void Word2(){
		final Map<String,Integer> dictFreq1 = new HashMap<String,Integer>();
		final Map<String,Integer> dictFreq2 = new HashMap<String,Integer>();
		ReadandWriteFile.readInput(new LineSolution(){
			public void solveLine(String line){
				String[] lineDicts = line.split("  ");
				if(lineDicts != null){
					for(int i=0; i<lineDicts.length-1; i++){
						
						String word1=lineDicts[i]+"/"+lineDicts[i+1];
						String word2 = "";
						String word3 = "";
						String[] WordDicts = word1.split("/");
						//System.out.println(WordDicts.length);
						for(int j=0;j< WordDicts.length;j++){
							//System.out.println(WordDicts[j]);
							 if(ChineseAndEnglish.isChinese(WordDicts[j]))
								 word2=word2+WordDicts[j];
							 else if(ChineseAndEnglish.isEnglish(WordDicts[j])) 
								 word3=word3+WordDicts[j]+"->";
						}
						if(dictFreq1.containsKey(word2)){
							int num = dictFreq1.get(word2);
						    dictFreq1.put(word2, ++num);
						    }else {
						    	dictFreq1.put(word2, 1);
						    	}
						if(dictFreq2.containsKey(word3)){
							int num = dictFreq2.get(word3);
						    dictFreq2.put(word3, ++num);
						    }else {
						    	dictFreq2.put(word3, 1);
						    	}
						}
					}
				}
			}, "/Volumes/Untitled/workplace/1998-01-2003版-带音.txt");
		int count=0;
	     String con1=null;
	     String con2=null;
	     ArrayList<String> list1= new ArrayList<String>();
	     ArrayList<String> list2= new ArrayList<String>();
	     for(Map.Entry<String,Integer> entry : dictFreq1.entrySet()) {
	    	 if(entry.getKey()!=null)
	        	con1=entry.getKey() + "\t times: " + entry.getValue() +'\n';
	        //System.out.println(con1);
	        	list1.add(con1);
	        }
	     
	     for(Map.Entry<String,Integer> entry : dictFreq2.entrySet()) {
	    	 if(entry.getKey()!=null) {
	        	con2=entry.getKey() + "\t times: " + entry.getValue() +'\n';
	        	count++;
	        	}
	        //	System.out.println(con2);
	        	list2.add(con2);
	        } 
	     ReadandWriteFile.writeoutput(2,list1);
	     ReadandWriteFile.writeout(2,list2);
	     //System.out.println(count1);
	     System.out.println("词性转换的种类数："+count); 	
	}
	public static int Sentence(){
		int count=0;
		String line = "";
        try{
            FileReader fr = new FileReader( "/Volumes/Untitled/workplace/1-gram分词统计.txt");
			BufferedReader br = new BufferedReader(fr);
            while(line!=null) {
            		line = br.readLine();
            		count++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("语料中句子的个数"+count);
		return count;
	}
	@SuppressWarnings("null")
	public static Vector<Double> state_p(){
		final Map<String,Integer> dictFreq = new HashMap<String,Integer>();
		ReadandWriteFile.readInput(new LineSolution(){
			public void solveLine(String line){
				String[] lineDicts = line.split("  ");
				if(lineDicts != null){
					for(int i=0; i<lineDicts.length-1; i++){
				String word = lineDicts[1];
				String[] WordDicts = word.split("/");
				String word1 = "";
				String word2 = "";
				for(int j=0;j< WordDicts.length;j++){
					 if(ChineseAndEnglish.isChinese(WordDicts[j]))
						 word1=word1+WordDicts[j];
						 else if(ChineseAndEnglish.isEnglish(WordDicts[j])) word2=word2+WordDicts[j];
						}
						if(dictFreq.containsKey(word2)){
							int num = dictFreq.get(word2);
						    dictFreq.put(word2, ++num);
						    }else {
						    	dictFreq.put(word2, 1);
						    	}
						}
				}
			}
			}, "/Volumes/Untitled/workplace/1998-01-2003版-带音.txt");
         int sum=0;
         int count=0;
         Vector<Double> state_pro = new Vector<Double>();
	     for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	    	 if(entry.getKey()!=null) {
	        //System.out.println(entry.getKey()+"\t times: " +entry.getValue());
	        	sum=sum+entry.getValue();
	        	count++;
	        	}
	    	
	        } 
	     System.out.println("总数："+sum);
	     System.out.println("初始词性个数："+count);
	     for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	    	 //for(int i=0;i<dictFreq.size();i++) {
	    		 state_pro.add(operat.divide(entry.getValue(),sum)*100);
	    		 //System.out.println();
	    		// }
	     }
	     for(int i=0;i<state_pro.size();i++) {
	    	 System.out.println(state_pro.get(i));
	    	 
	     }
	     //
	     //ReadandWriteFile.writeoutput(1,list);
	     //ReadandWriteFile.writeout(1,list2);
		return state_pro;
	}
	public static void main(String[] args) {
		long begin0 = System.currentTimeMillis();   
      	Word1();
      	Word2();
		//state_p();
      	//Sentence();
        System.out.println("词语统计完毕");
        long end0 = System.currentTimeMillis();
        System.out.println("执行耗时:" + (end0 - begin0) + " 豪秒"+'\n'); 
      	   
         }
} 

interface LineSolution {
    void solveLine(String line);
}