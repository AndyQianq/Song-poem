package ʵ���;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;
class GUI extends JFrame implements ActionListener
{
	static JFrame jf=new JFrame("�δ��Զ�����ϵͳ");
	
	public PrintWriter pw;
	
	public static JPanel jp1=new JPanel();
	public static JPanel jp2=new JPanel();
	public static JPanel jp3=new JPanel();
	public static JPanel jp4=new JPanel();
	public static JPanel jp5=new JPanel();
	public static JPanel jp6=new JPanel();
	public static JPanel jp7=new JPanel();
	
	public static JTextArea jta1=new JTextArea(12,42);
	static String[] cipai = {"ѡ�����", "����", "������" }; 
	String Cipai=null;
	public static JComboBox jcomb=new JComboBox(cipai);
	public static JButton jb1=new JButton("ˢ��");
	public static JButton jb2=new JButton("����");
	public String na;
	public String se;
	public String message;
	public void getMenu()//��ʾ�������
	{
		
		jta1.setEditable(false);
		
		JScrollPane jsp1=new JScrollPane(jta1);
		jsp1.setBorder(new TitledBorder("�����δ�"));
		jp1.setLayout(new GridLayout(2,1));
		jp1.add(jb1,BorderLayout.NORTH);
		jp2.add(jcomb);
		jp2.add(jsp1);
		jp4.setLayout(new GridLayout(2,1));
		jp4.add(jp2);
		jp4.add(jp3);
		jp5.setLayout(new BorderLayout());
		jp5.add(jp2,BorderLayout.NORTH);
		jp5.add(jp4,BorderLayout.SOUTH);
		jp5.add(jp1);
		jp5.add(jb2,BorderLayout.SOUTH);
		jp6.setLayout(new BorderLayout());
		
		jb1.addActionListener(this);
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
		
		
		jta1.setLineWrap(true);
		//jta2.setLineWrap(true);
		jsp1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		jsp1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jf.pack();
	}

	public GUI() {//���ô��ڹر��¼����������������Ͻǲ�Źرգ�ִ���±߳���
	jf.addWindowListener( new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				try {
				pw.println("456987");//�������߱�ʶ
				pw.println(na+":�뿪������");//����������Ϣ
				pw.flush();
				jf.dispose();//�رմ���
				}catch(Exception ex) {
				}
			}
		}
		);	
	}
	public void actionPerformed(ActionEvent event)//�¼�����
	{
		jb1.setText("ˢ��");
		jb2.setText("����");
		jcomb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == ItemEvent.SELECTED) {
					 if(jcomb.getSelectedItem()=="����")	{
						 System.out.println("ѡ��������");
						 Cipai="����";
						 }else if(jcomb.getSelectedItem()=="������")	{
						 System.out.println("ѡ���˽�����");
						 Cipai="������";
						 }
				}
				
			}
			
		});	
		try{
			if(event.getActionCommand().equals("����"))//������ʹ���
			{
				jta1.setText(CreateSongCi.Create(Cipai));
			}
			else if(event.getActionCommand().equals("ˢ��"))//���ˢ�´���
			{
				jta1.setText("");;
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