package ����;

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
	 1������
	 2����ͼƬ������byte[]������
	 3���Զ���ͼƬ�ı���Ŀ¼���ļ�����·��
	 4���ٴ�byte[]������ת��ΪͼƬ�������浽����
	 */
	public void screenshot(String Dir) {
		byte[] imageData = null;
		BufferedImage image = null;
		//������ʼ
       try {
       	int width = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(); //Ҫ��ȡ�Ŀ��
			int height = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight(); //Ҫ��ȡ�ĸ߶�
			Robot robot = new Robot();
			//��������� imageͼ��
			image = robot.createScreenCapture(new Rectangle(width,height));
       } catch (AWTException e) {
			e.printStackTrace();
		}
       //��imageͼ�񱣴���byte[]������
       try {
       	ByteArrayOutputStream baos = new ByteArrayOutputStream();
           JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(baos);
			encoder.encode(image);
			imageData = baos.toByteArray();
		} catch (ImageFormatException | IOException e1) {
			e1.printStackTrace();
		}
       
       //�Զ���ͼƬ�ı���Ŀ¼���ļ�����·����Dir�����������Զ����Ŀ¼��
       File f = new File(Dir) ;
       if(!f.exists()){
       	f.mkdirs() ;	//���DirĿ¼�����ڣ��ʹ�������DirĿ¼
       }
       //��ȡ���������������������ڼ��С�ʱ��   �������ļ���
       StackTraceElement[] stackTrace = new Throwable().getStackTrace();
       String className = this.getClass().getName();
       String MethodName = stackTrace[1].getMethodName();
       int LineNumber = stackTrace[1].getLineNumber();
       //�����ʽ����ǰʱ�䣬����20120406-165210���������ڹ����ļ���
       SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS");
       String time = sdf.format(new Date()); 
       String fileName = time + className + "." + MethodName + ".��" +LineNumber + "��." +  ".png"; //�Զ����ļ���
       String filePath = Dir + "\\" + fileName; //����ͼƬ��·��
		File file = new File(filePath);
		//byte����ת��ΪͼƬ���������ڱ���
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
