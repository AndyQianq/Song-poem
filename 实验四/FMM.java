package ʵ����;

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
	        //ȡָ������󳤶ȵ��ı�ȥ�ʵ�����ƥ��   
			while(s.length()>0) { 
	        	  // System.out.println(tryWord);
	            if(Judge.judge(tryWord)){    	
	            	list.add(tryWord+"/");  
	           // 	System.out.println(list.toString());
	            //�Ӵ��ִ��ı���ȥ���Ѿ��ִʵ��ı�
	            //System.out.println(tryWord.length());
	            s=s.substring(tryWord.length()); 
	            tryWord=s;
	            //System.out.println(s);
	            }else {   
	            	//���ƥ�䲻�����򳤶ȼ�һ����ƥ��
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
	    	 String Q = "���������";
		        print(Q+'\n');
		        @SuppressWarnings("resource")
				Scanner in = new Scanner(System.in);
	    fmm(in.nextLine());
	    print("\n");        
	    long end0 = System.currentTimeMillis();
	    print("ִ�к�ʱ:" + (end0 - begin0) + " ����"+'\n');  
	     
	 }
	 
	 private static void print(String str){
   System.out.print(str);
}
}
interface LineSolution {
    void solveLine(String line);
}
