package สตั้หฤ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
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

}
