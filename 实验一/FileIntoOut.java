package ʵ��һ;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileIntoOut {
	static void readInput(LineSolution solution){
        try{
            FileReader fr = new FileReader( "/Volumes/Untitled/workplace/Ci.txt");
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
            String line = "";
            while(line!=null) {
            		line = br.readLine();
            	    if(line == null){
            			break;
            			}
            	    else if(line.length()>5) {solution.solveLine(line);}//ȥ���˴�����
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
   static void writeoutput(int num,ArrayList <String> list){
        try{
            BufferedWriter Buff=null;  
            File f=new File("/Volumes/Untitled/workplace/ͳ�ƽ��"+num+".txt");
            Buff=new BufferedWriter(new FileWriter(f));
            for(int i=0;i<list.size();i++){
            	Buff.write(list.get(i));  
            	Buff.newLine();
            } 
            Buff.close();       
            }catch(IOException e){
            e.printStackTrace();
        }
    }
}
