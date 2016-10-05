package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import object.*;
import util.Object_OutIn_Stream;

public class YuDing extends JFrame {

	private JPanel contentPane;
	private JLabel desklb1;
	private JLabel desklb2;
	private JLabel desklb3;
	private JLabel desklb4;
	private JLabel desklb5;
	private JLabel desklb6;
	private JLabel desklb7;
	private JLabel desklb8;
	
	File file;
	String path;
	private JLabel lb;
	private JLabel desklb9;
	private JLabel desklb10;
	private JLabel desklb11;
	private JLabel desklb12;
	Desk desk;
	ArrayList<Desk> list;
	/**
	 * Create the frame.
	 */
	public YuDing() {
		setTitle("\u6B22\u8FCE\u9884\u5B9A\uFF01");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 746, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
	File	file1=new File("util_image/1.jpg");
	 String  path1=file1.getAbsolutePath();	
			
	 
		
		desklb1 = new JLabel("desk1");
		desklb1.addMouseListener(new MouseAdapter() {
			//�������Ԥ����һ������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("1������");
					
			}
		});
		desklb1.setBounds(10, 56, 101, 91);
		panel.add(desklb1);
		
		desklb2 = new JLabel("desk2");
		desklb2.setBounds(200, 56, 101, 91);
		panel.add(desklb2);
		desklb2.addMouseListener(new MouseAdapter() {
			//�������Ԥ����2������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("2������");		
			}
		});
		
		desklb3 = new JLabel("desk3");
		desklb3.setBounds(397, 56, 101, 91);
		panel.add(desklb3);
		desklb3.addMouseListener(new MouseAdapter() {
			//�������Ԥ����3������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("3������");		
			}
		});
		
		desklb4 = new JLabel("desk4");
		desklb4.setBounds(609, 56, 101, 91);
		panel.add(desklb4);
		desklb4.addMouseListener(new MouseAdapter() {
			//�������Ԥ����4������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("4������");		
			}
		});
		
		desklb5 = new JLabel("desk5");
		desklb5.setBounds(609, 193, 101, 91);
		panel.add(desklb5);
		desklb5.addMouseListener(new MouseAdapter() {
			//�������Ԥ����5������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("5������");		
			}
		});
		
		desklb6 = new JLabel("desk6");
		desklb6.setBounds(397, 193, 101, 91);
		panel.add(desklb6);
		desklb6.addMouseListener(new MouseAdapter() {
			//�������Ԥ����6������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("6������");		
			}
		});
		
		desklb7 = new JLabel("desk7");
		desklb7.setBounds(200, 193, 101, 91);
		panel.add(desklb7);
		desklb7.addMouseListener(new MouseAdapter() {
			//�������Ԥ����7������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("7������");		
			}
		});
		
		desklb8 = new JLabel("desk8");
		desklb8.setBounds(10, 193, 101, 91);
		panel.add(desklb8);
		desklb8.addMouseListener(new MouseAdapter() {
			//�������Ԥ����8������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("8������");		
			}
		});

		lb = new JLabel("lable");
		lb.setBounds(0, 0, 730, 46);
		panel.add(lb);
	
		
		desklb9 = new JLabel("desk9");
		desklb9.setBounds(10, 327, 101, 91);
		panel.add(desklb9);	
		desklb9.addMouseListener(new MouseAdapter() {
			//�������Ԥ����9������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("9������");		
			}
		});	
		
		desklb10 = new JLabel("desk10");
		desklb10.setBounds(200, 327, 101, 91);
		panel.add(desklb10);
		desklb10.addMouseListener(new MouseAdapter() {
			//�������Ԥ����10������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("10������");		
			}
		});
		
		desklb11 = new JLabel("desk11");
		desklb11.setBounds(397, 327, 101, 91);
		panel.add(desklb11);
		desklb11.addMouseListener(new MouseAdapter() {
			//�������Ԥ����11������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("11������");		
			}
		});
		
		desklb12 = new JLabel("desk12");
		desklb12.setBounds(609, 327, 101, 91);
		panel.add(desklb12);
		desklb12.addMouseListener(new MouseAdapter() {
			//�������Ԥ����12������
			public void mouseClicked(MouseEvent e) {
				YuDing.this.dispose();
				new Yudingview("12������");		
			}
		});
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addMouseListener(new MouseAdapter() {
		//������һ��
			public void mouseClicked(MouseEvent e) {
				new AdminMainView();
				YuDing.this.dispose();
			}
		});
		button.setBounds(637, 419, 93, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("��ѯ����");
		button_1.addMouseListener(new MouseAdapter() {
				//����Ԥ����ѯ��ť
			public void mouseClicked(MouseEvent e) {
				new YudingTable();
				YuDing.this.dispose();
			}
		});
		button_1.setBounds(506, 419, 93, 23);
		panel.add(button_1);
		
		file =new File("util_image/desk1.jpg");
		path=file.getAbsolutePath();
		

		new SwingWorker<Void, Void>(){

			protected Void doInBackground() throws Exception {
				setLableIcon(path, desklb1);
				setLableIcon(path, desklb2);
				setLableIcon(path, desklb3);
				setLableIcon(path, desklb4);
				setLableIcon(path, desklb5);
				setLableIcon(path, desklb6);
				setLableIcon(path, desklb7);
				setLableIcon(path, desklb8);
				setLableIcon(path, desklb9);
				setLableIcon(path, desklb10);
				setLableIcon(path, desklb11);
				setLableIcon(path, desklb12);
				setLableIcon(path1, lb);
				return null;
			}

			protected void done() {
	
				
			}
		}.execute();
		
	}
	
	//����Lableͼ���ͼ��
	public void setLableIcon(String file, JLabel iconLable) {  
		ImageIcon icon = new ImageIcon(file);  
		icon.getImage();
		Image temp = icon.getImage().getScaledInstance(iconLable.getWidth(),  
				iconLable.getHeight(), Image.SCALE_DEFAULT);  
		icon = new ImageIcon(temp);  
		iconLable.setIcon(icon);  
	}
}
