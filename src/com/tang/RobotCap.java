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
 * 运用了robot类（自动化类）的createScreenCaptrue方法来抓取指定的矩形类(Rectangle)对象.
 * 然后输出抓取的缓存图像到指定文件
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Robot robot = new Robot();
			BufferedImage bi=robot.createScreenCapture(new Rectangle(0,0,1366,768)); 
			// 根据指定的区域(900,800)抓取屏幕的指定区域
			ImageIO.write(bi, "jpg", new File("D:/imageTest.jpg")); //把抓取到的内容写入到指定文件
		}catch(AWTException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
