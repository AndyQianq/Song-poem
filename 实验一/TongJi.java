package ʵ��һ;


import java.util.Scanner;

public class TongJi {
    public static void main(String[] args){
    	long begin0 = System.currentTimeMillis();   
        String Q1 = "1��ͳ�Ƶ��ִʵĸ����ʹ�Ƶ";
        String Q2 = "2��ͳ��˫�ִʵĸ����ʹ�Ƶ";
        String Q3 = "3��ͳ�����ִʵĸ����ʹ�Ƶ";
        
        print(Q1+'\n');
        print(Q2+'\n');
        print(Q3+'\n');
        print("\n");
        
        print("���������: ");
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        
        while(in.hasNextInt()){
            int num = in.nextInt();
            if(num == 1){
               CutAndCount.Word(1);
                break;
            }
            else if(num == 2){
               CutAndCount.Word(2);
                break;
            }
            else if(num == 3) {
            	CutAndCount.Word(3);
            	break;
            }
            else {
                print("\n��ѡ��ִʵĴ�С: ");
            }
          
        }
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
