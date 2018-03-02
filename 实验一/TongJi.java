package 实验一;


import java.util.Scanner;

public class TongJi {
    public static void main(String[] args){
    	long begin0 = System.currentTimeMillis();   
        String Q1 = "1：统计单字词的个数和词频";
        String Q2 = "2：统计双字词的个数和词频";
        String Q3 = "3：统计三字词的个数和词频";
        
        print(Q1+'\n');
        print(Q2+'\n');
        print(Q3+'\n');
        print("\n");
        
        print("请输入序号: ");
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
                print("\n请选择分词的大小: ");
            }
          
        }
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
