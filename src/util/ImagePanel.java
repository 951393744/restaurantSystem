package util;

import javax.swing.JPanel;
import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
//��̬����һ��ͼƬ������
public class ImagePanel  extends JPanel{
			
		Image im;
		public ImagePanel( Image  im){
			this.im= im;
			int w=170,h=170;
			this.setSize(w,h);
		}	
		
		//�����jpanel
		public void paintComponent(Graphics g){
			//����
			super.paintComponent(g);		
			g.drawImage(im, 0,0 ,170,170 ,this );

		}
}
