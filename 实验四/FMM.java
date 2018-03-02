package 实验四;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FMM {
	@SuppressWarnings("unlikely-arg-type")
	public static String fmm(String s) {
			ArrayList<String> list= new ArrayList<String>(); 
			int max=s.length();
			String tryWord=null;
			  
			tryWord= s;
	        //取指定的最大长度的文本去词典里面匹配   
			while(s.length()>0) { 
	        	  // System.out.println(tryWord);
	            if(Judge.judge(tryWord)){    	
	            	list.add(tryWord+"/");  
	           // 	System.out.println(list.toString());
	            //从待分词文本中去除已经分词的文本
	            //System.out.println(tryWord.length());
	            s=s.substring(tryWord.length()); 
	            tryWord=s;
	            //System.out.println(s);
	            }else {   
	            	//如果匹配不到，则长度减一继续匹配
	            	if(tryWord.length()>1) {
	            		tryWord=tryWord.substring(0, tryWord.length()-1); 
	                //	System.out.println(tryWord);
	                }else {
	                	break;
	                }
	            }
	           
	            //System.out.println(s);
	            //}  
	           }
			
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			return list.toString();
			
		
	}
	
	 public static void main(String[] args){
	    	long begin0 = System.currentTimeMillis(); 
	    	 String Q = "请输入词语";
		        print(Q+'\n');
		        @SuppressWarnings("resource")
				Scanner in = new Scanner(System.in);
	    fmm(in.nextLine());
	    print("\n");        
	    long end0 = System.currentTimeMillis();
	    print("执行耗时:" + (end0 - begin0) + " 豪秒"+'\n');  
	     
	 }
	 
	 private static void print(String str){
   System.out.print(str);
}
}
interface LineSolution {
    void solveLine(String line);
}
