package 实验三;


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
			},"/Volumes/Untitled/workplace/1-gram分词统计.txt" );
		
        for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	    	 if(entry.getKey()!=null) {
	    		 if(c.equals(entry.getKey())) {
	    			 System.out.println("该词是单词！"); 
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
			},"/Volumes/Untitled/workplace/2-gram分词统计.txt" );
        
		for(Map.Entry<String,Integer> entry : dictFreq.entrySet()) {
	    	 if(entry.getKey()!=null) {
	    		 if(c.equals(entry.getKey())) { 	
	    			 System.out.println("该词是双词词！");
	    		 return true;}
	    		 
	    	 }
	        }
        return false;
	}
	 public static void main(String[] args){
	    	long begin0 = System.currentTimeMillis();   
	        String Q = "请输入词语";
	        print(Q+'\n');
	        @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
	        if(judge(in.nextLine()))System.out.println("是单字词！");
	        else System.out.println("不是单字词！请重新输入：");
	        System.out.println("请再输入词语测试：");
	        Scanner in1 = new Scanner(System.in);
	        if(judgeagain(in1.nextLine()))System.out.println("是双字词！");
	        else System.out.println("找不到！");
	        print("\n");
	        long end0 = System.currentTimeMillis();
	        print("执行耗时:" + (end0 - begin0) + " 豪秒"+'\n');  
	     
	 }
   private static void print(String str){
	            System.out.print(str);
	        }
}
