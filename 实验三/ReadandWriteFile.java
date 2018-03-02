package 实验三;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ReadandWriteFile {
	static String readInput(LineSolution Solution,String filename){
		String line = "";
        try{
            FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
            while(line!=null) {
            		line = br.readLine();
            		//System.out.println(line);
            	    if(line == null){
            			break;
            			}else {Solution.solveLine(line);}
            }
        }catch(IOException e){
            e.printStackTrace();
        }
		return line;
	}
	static void writeoutput(int num,ArrayList <String> list){
	        try{
	            BufferedWriter Buff=null;  
	            File f=new File("/Volumes/Untitled/workplace/"+num+"-gram分词统计.txt");
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
	static void writeout(int num,ArrayList <String> list){
        try{
            BufferedWriter Buff=null;  
            File f=new File("/Volumes/Untitled/workplace/"+num+"元词性统计.txt");
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


