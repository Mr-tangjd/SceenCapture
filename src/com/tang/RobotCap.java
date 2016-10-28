package com.tang;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class RobotCap {
/**
 * 
 * @param tang
 * ������robot�ࣨ�Զ����ࣩ��createScreenCaptrue������ץȡָ���ľ�����(Rectangle)����.
 * Ȼ�����ץȡ�Ļ���ͼ��ָ���ļ�
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Robot robot = new Robot();
			BufferedImage bi=robot.createScreenCapture(new Rectangle(0,0,1366,768)); 
			// ����ָ��������(900,800)ץȡ��Ļ��ָ������
			ImageIO.write(bi, "jpg", new File("D:/imageTest.jpg")); //��ץȡ��������д�뵽ָ���ļ�
		}catch(AWTException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
