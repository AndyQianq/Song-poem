package ʵ���;


import java.util.ArrayList;
import java.util.Vector;



public class CreateSongCi {
	public static Vector<Vector<String>> Create(int num) {
			Vector<Vector<String>> vector=new Vector<Vector<String>>(); 
			Vector<String> word=new Vector<String>();//һάԪ�� 
			Vector<String> time=new Vector<String>();//һάԪ�� 
			ReadFile.readInput(new LineSolution(){
				public void solveLine(String line){
					String[] lineDicts = line.split("\t times: ");
					if(lineDicts != null){
						for(int i=0; i<lineDicts.length-1; i++){
							if(Integer.parseInt(lineDicts[i+1])>(100/(num*num*num))) {
							    word.addElement(lineDicts[i]); 
								time.addElement(lineDicts[i+1]);}
							}
						   
						} 
					vector.addElement(word); 
					vector.addElement(time);
					
					}
				},"/Volumes/Untitled/workplace/ͳ�ƽ��"+num+".txt" );
			return vector;
		}
	
	
public static String ����(){
	//ArrayList<String> list= new ArrayList<String>();
    print("\n");        
    int temp = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp1 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp2 = (int) ( Create(3).firstElement().size() * Math.random() + 0);
    String con1="";
    con1=Create(2).firstElement().get(temp)+Create(2).firstElement().get(temp1)+Create(3).firstElement().get(temp2);
    System.out.println(con1); 
    //list.add(con1);
    int temp3 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp4 = (int) ( Create(1).firstElement().size() * Math.random() + 0);
    int temp5 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    String con2="";
    con2=Create(2).firstElement().get(temp3)+Create(1).firstElement().get(temp4)+Create(2).firstElement().get(temp5);
    //System.out.println(con2); 
    //list.add(con2);
    int temp6 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp7 = (int) ( Create(1).firstElement().size() * Math.random() + 0);
    int temp8 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    String con3="";
    con3=Create(2).firstElement().get(temp6)+Create(1).firstElement().get(temp7)+Create(2).firstElement().get(temp8);
   System.out.println(con3); 
    //list.add(con3);
    int temp9 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp10 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    String con4="";
    con4=Create(2).firstElement().get(temp9)+Create(2).firstElement().get(temp10);
    System.out.println(con4); 
    //list.add(con4);
    int temp11 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp12 = (int) ( Create(3).firstElement().size() * Math.random() + 0);
    String con5="";
    con5=Create(2).firstElement().get(temp11)+Create(3).firstElement().get(temp12);
    System.out.println(con5); 
    //list.add(con5);
   // System.out.println(list.toString()); 
    String songpoem="";
    songpoem=con1+"\n"+con2+"\n"+con3+"\n"+con4+"\n"+con5;
    //System.out.println(songpoem);
	return songpoem;
 }
public static String ������(){
	//ArrayList<String> list= new ArrayList<String>();
    print("\n");        
    int temp = (int) ( Create(3).firstElement().size() * Math.random() + 0);
    int temp1 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp2 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    String con1="";
    con1=Create(3).firstElement().get(temp)+Create(2).firstElement().get(temp1)+Create(2).firstElement().get(temp2);
    System.out.println(con1); 
    //list.add(con1);
    int temp3 = (int) ( Create(1).firstElement().size() * Math.random() + 0);
    int temp4 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    String con2="";
    System.out.print(con2);
    con2=Create(1).firstElement().get(temp3)+Create(2).firstElement().get(temp4);
    int temp5 = (int) ( Create(1).firstElement().size() * Math.random() + 0);
    int temp6 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    String con3="";
    con2=Create(1).firstElement().get(temp5)+Create(2).firstElement().get(temp6);
    System.out.print(con3); 
    //list.add(con2);
   
    int temp7 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp8 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
     int temp9 = (int) ( Create(3).firstElement().size() * Math.random() + 0);
    int temp10 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    String con4="";
    con4=Create(2).firstElement().get(temp7)+Create(2).firstElement().get(temp8)+"��"+Create(3).firstElement().get(temp9)+Create(2).firstElement().get(temp10);
   System.out.println(con4); 
    //list.add(con3);
   
    int temp11 = (int) ( Create(3).firstElement().size() * Math.random() + 0);
    int temp12 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp13 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp14 = (int) ( Create(1).firstElement().size() * Math.random() + 0);
    int temp15 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    int temp16 = (int) ( Create(1).firstElement().size() * Math.random() + 0);
    int temp17 = (int) ( Create(2).firstElement().size() * Math.random() + 0);
    String con5="";
    con5=Create(3).firstElement().get(temp11)+Create(2).firstElement().get(temp12)+Create(2).firstElement().get(temp13)+"��"+Create(1).firstElement().get(temp14)+Create(2).firstElement().get(temp15)+"��"+Create(1).firstElement().get(temp16)+Create(2).firstElement().get(temp17);
    System.out.println(con5); 
    
    String songpoem="";
    songpoem=con1+"\n"+con2+con3+con4+"\n"+con5+"\n";
    //System.out.println(songpoem);
	return songpoem;
 }
 private static void print(String str){
     System.out.print(str);
  
 }
 
 public static String Create(String cipai) {	
	 long begin0 = System.currentTimeMillis();
	 ArrayList<String> list= new ArrayList<String>();
	 if(cipai.equals("����")) {
		 list.add(����());
		 list.add(����());
	 }else if(cipai.equals("������")) {
		 list.add(������());
		 list.add(������());
	 }
	 long end0 = System.currentTimeMillis();
    print("ִ�к�ʱ:" + (end0 - begin0) + " ����"+'\n');
	return list.toString();
	
 }
 public static void main(String args[]) {
	 Create("����");
	 Create("������");
 }
}
interface LineSolution {
    void solveLine(String line);
}
