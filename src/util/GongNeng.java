package util;

import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GongNeng {
		
	
	//�õ��ļ���·��
		public  String getPath(File file){
			
			return file.getAbsolutePath();		
		
		}
			//����Lableͼ���ͼ��
			public void setLableIcon(String path, JLabel iconLable) {  
				ImageIcon icon = new ImageIcon(path);  
				icon.getImage();
				Image temp = icon.getImage().getScaledInstance(iconLable.getWidth(),  
						iconLable.getHeight(), Image.SCALE_DEFAULT);  
				icon = new ImageIcon(temp);  
				iconLable.setIcon(icon);  
			}
			
			
			//����Buttonͼ���ͼ��
			public void setButtonIcon(String path, JButton iconLable) {  
				ImageIcon icon = new ImageIcon(path);  
				try {
					icon.getImage();
					Image temp = icon.getImage().getScaledInstance(iconLable.getWidth(),  
							iconLable.getHeight(), Image.SCALE_DEFAULT);  
					icon = new ImageIcon(temp);  
					iconLable.setIcon(icon);
				} catch (Exception e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}  
			}
			
			public GongNeng() {
				
			}
}
