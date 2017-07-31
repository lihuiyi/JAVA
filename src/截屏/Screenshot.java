package 截屏;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.image.codec.jpeg.ImageFormatException;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class Screenshot {
	
	/*
	 1、截屏
	 2、把图片保存在byte[]数组中
	 3、自定义图片的保存目录、文件名、路径
	 4、再从byte[]数组中转换为图片，并保存到本地
	 */
	public void screenshot(String Dir) {
		byte[] imageData = null;
		BufferedImage image = null;
		//截屏开始
       try {
       	int width = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(); //要截取的宽度
			int height = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight(); //要截取的高度
			Robot robot = new Robot();
			//截屏，获得 image图像
			image = robot.createScreenCapture(new Rectangle(width,height));
       } catch (AWTException e) {
			e.printStackTrace();
		}
       //把image图像保存在byte[]数组中
       try {
       	ByteArrayOutputStream baos = new ByteArrayOutputStream();
           JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(baos);
			encoder.encode(image);
			imageData = baos.toByteArray();
		} catch (ImageFormatException | IOException e1) {
			e1.printStackTrace();
		}
       
       //自定义图片的保存目录、文件名、路径（Dir参数是我们自定义的目录）
       File f = new File(Dir) ;
       if(!f.exists()){
       	f.mkdirs() ;	//如果Dir目录不存在，就创建创建Dir目录
       }
       //获取包名、类名、方法名、第几行、时间   来创建文件名
       StackTraceElement[] stackTrace = new Throwable().getStackTrace();
       String className = this.getClass().getName();
       String MethodName = stackTrace[1].getMethodName();
       int LineNumber = stackTrace[1].getLineNumber();
       //这里格式化当前时间，例如20120406-165210，后面用于构建文件名
       SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS");
       String time = sdf.format(new Date()); 
       String fileName = time + className + "." + MethodName + ".第" +LineNumber + "行." +  ".png"; //自定义文件名
       String filePath = Dir + "\\" + fileName; //本地图片的路径
		File file = new File(filePath);
		//byte数组转换为图片，并保存在本地
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write(imageData ,0,imageData.length);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
   }
	
	
}
