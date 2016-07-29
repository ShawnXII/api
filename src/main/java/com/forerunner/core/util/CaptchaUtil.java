package com.forerunner.core.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.math.RandomUtils;

/**
 * 验证码生成工具类
 * 
 * @author Administrator
 *
 */
public class CaptchaUtil {
	/**
	 * 验证码 去掉了有歧义的字符
	 */
	private static final char[] RAND = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	/**
	 * 生成随机字体
	 * 
	 * @return
	 */
	public static Font getFont(int fontHeight) {
		/*Font baseFont;
		try {
			baseFont = Font.createFont(Font.TRUETYPE_FONT, new ByteArrayInputStream(hex2byte(xx)));
			 return baseFont.deriveFont(Font.PLAIN, fontHeight); 
		} catch (FontFormatException | IOException e) {
			
		}*/
		return new Font("Times New Roman", Font.ROMAN_BASELINE, 18);
	}
	
	private static byte[] hex2byte(String str){
		if (str == null)  
            return null;  
        str = str.trim();  
        int len = str.length();  
        if (len == 0 || len % 2 == 1)  
            return null;  
  
        byte[] b = new byte[len / 2];  
        try {  
            for (int i = 0; i < str.length(); i += 2) {  
                b[i / 2] = (byte) Integer  
                        .decode("0x" + str.substring(i, i + 2)).intValue();  
            }  
            return b;  
        } catch (Exception e) {  
            return null;  
        }  
	}

	/**
	 * 生成手机字符串 4位
	 * 
	 * @return
	 */
	public static String getRandomStr() {
		return getRandomStr(4);
	}

	/**
	 * 生成随机字符串
	 * 
	 * @param len
	 * @return
	 */
	public static String getRandomStr(int len) {
		if (len < 1) {
			len = 1;
		}
		String randStr = "";
		while (randStr.length() < len) {
			char ch = RAND[RandomUtils.nextInt(RAND.length)];
			randStr += ch;
		}
		return randStr;
	}

	private static int[] getRandomRgb() {
		int[] rgb = new int[3];
		for (int i = 0; i < 3; i++) {
			rgb[i] = RandomUtils.nextInt(255);
		}
		return rgb;
	}

	public static Color getRandomColor() {
		return getRandomColor(110, 133);
	}

	/**
	 * 随机生成颜色
	 * 
	 * @return
	 */
	public static Color getRandomColor(int fc, int bc) {
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + RandomUtils.nextInt(bc - fc);
		int g = fc + RandomUtils.nextInt(bc - fc);
		int b = fc + RandomUtils.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	/**
	 * 随机绘制干扰线
	 * 
	 * @param minNum
	 * @param maxNum
	 */
	public static void drawLine(Graphics g, int width, int height, int minNum, int maxNum) {

	}

	public static void main(String[] args) {
		// 创建一个定长线程池，支持定时及周期性任务执行。延迟执行示例代码如下：
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		/*
		 * scheduledThreadPool.scheduleAtFixedRate(new Runnable(){ int index=0;
		 * 
		 * @Override public void run() { index++; for(int i=0;i<100;i++){
		 * System.out.println(index+":"+i); try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { e.printStackTrace(); } } } },
		 * 1,3,TimeUnit.SECONDS);
		 */
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();  
		for (int j = 0; j < 100; j++) {
			final int index1=j;
			singleThreadExecutor  .execute(new Runnable() {
				int index = 0;
				@Override
				public void run() {
					index++;
					for (int i = 0; i < 10; i++) {
						System.out.println(index1+":"+index + ":" + i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
		}
	}
}
