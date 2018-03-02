package ʵ����;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Judge {
	public static boolean judge(String c) {
		final Map<String,Integer> dictFreq = new HashMap<String,Integer>();
		ReadandWriteFile.readInput(new LineSolution(){
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
	    			 System.out.println("�ô��ǵ��ʣ�"); 
	    			 return true;
	    			 //break;
	    			 }
	    		 }
	        }
		return false;
        
	}
	public static boolean judgeagain(String c) {
		final Map<String,Integer> dictFreq = new HashMap<String,Integer>();
		ReadandWriteFile.readInput(new LineSolution(){
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
			},"/Volumes/Untitled/workplace/2-gram�ִ�ͳ��.txt" );
        
		for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	    	 if(entry.getKey()!=null) {
	    		 if(c.equals(entry.getKey())) { 	
	    			 System.out.println("�ô���˫�ʴʣ�");
	    		 return true;}
	    		 
	    	 }
	        }
        return false;
	}
	 public static void main(String[] args){
	    	long begin0 = System.currentTimeMillis();   
	        String Q = "���������";
	        print(Q+'\n');
	        @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
	        if(judge(in.nextLine()))System.out.println("�ǵ��ִʣ�");
	        else System.out.println("���ǵ��ִʣ����������룺");
	        System.out.println("�������������ԣ�");
	        Scanner in1 = new Scanner(System.in);
	        if(judgeagain(in1.nextLine()))System.out.println("��˫�ִʣ�");
	        else System.out.println("�Ҳ�����");
	        print("\n");
	        long end0 = System.currentTimeMillis();
	        print("ִ�к�ʱ:" + (end0 - begin0) + " ����"+'\n');  
	     
	 }
   private static void print(String str){
	            System.out.print(str);
	        }
}
