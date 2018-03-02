package 实验四;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

import 实验二.CreateSongCi;


class GUI extends JFrame implements ActionListener
{
	static JFrame jf=new JFrame("中文分词系统");
	
	public PrintWriter pw;
	
	public static JPanel jp1=new JPanel();
	public static JPanel jp2=new JPanel();
	public static JPanel jp3=new JPanel();
	public static JPanel jp4=new JPanel();
	public static JPanel jp5=new JPanel();
	public static JPanel jp6=new JPanel();
	public static JPanel jp7=new JPanel();
	public static JTextArea jta1=new JTextArea(12,42);
	public static JTextArea jta2=new JTextArea(12,42);
	
	//public static JButton jb1=new JButton("刷新");
	public static JButton jb2=new JButton("分词");
	public String na;
	public String se;
	public String message;
	public void getMenu()//显示聊天界面
	{
		
		jta2.setEditable(false);
		JScrollPane jsp1=new JScrollPane(jta1);
		jsp1.setBorder(new TitledBorder("输入测试语句"));
		jp1.setLayout(new GridLayout(2,1));
		//jp1.add(jb1,BorderLayout.NORTH);
		jp2.add(jsp1);
		JScrollPane jsp2=new JScrollPane(jta2);
		jsp2.setBorder(new TitledBorder("分词结果"));
		jp2.setLayout(new GridLayout(2,1));
		//jp1.add(jb1,BorderLayout.NORTH);
		jp2.add(jsp2);
		jp4.setLayout(new GridLayout(2,1));
		jp4.add(jp2);
		jp4.add(jp3);
		jp5.setLayout(new BorderLayout());
		jp5.add(jp2,BorderLayout.NORTH);
		jp5.add(jp4,BorderLayout.SOUTH);
		jp5.add(jp1);
		jp5.add(jb2,BorderLayout.SOUTH);
		jp6.setLayout(new BorderLayout());
		
		//jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		jp7.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp7.add(jp5);
		jp7.add(jp6);
		
		jf.add(jp7);
		
		jf.setLocation(200,200);
		jf.setSize(700,650);
		
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		jf.setVisible(true);
		
		
		jta2.setLineWrap(true);
		//jta2.setLineWrap(true);
		jsp2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		jsp2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jf.pack();
	}
	public GUI() {//设置窗口关闭事件，如果点击窗口右上角叉号关闭，执行下边程序
		jf.addWindowListener( new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					try {
					jf.dispose();//关闭窗口
					}catch(Exception ex) {
					}
				}
			}
			);	
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			if(e.getActionCommand().equals("分词"))//点击发送触发
			{
				jta2.setText(FMM.fmm(jta1.getText()));
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	
	}
	public static void main(String args[]) {	
		 //getMenu();
		GUI a=new GUI();
		a.getMenu();
	}
	}
	