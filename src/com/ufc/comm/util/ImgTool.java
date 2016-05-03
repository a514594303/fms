package com.ufc.comm.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgTool {
	private BufferedImage subImg;
	static {
		/* java.awt.GraphicsEnvironment.isHeadless() returns false */
		System.setProperty("java.awt.headless", "true");
	}

	/**
	 * 截图
	 * 
	 * @param srcPath
	 * @param startX
	 * @param startY
	 * @param width
	 * @param height
	 */
	public boolean cut(String srcPath, int startX, int startY, int width, int height) {
		try {
			BufferedImage bufImg = ImageIO.read(new File(srcPath));
			subImg = bufImg.getSubimage(startX, startY, width, height);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 保存截图。
	 * 
	 * @param bufImg
	 * @param imgType
	 * @param tarPath
	 */
	public boolean save(String imgType, String tarPath, int width, int height) {
		try {
			/** 压缩图片为指定尺寸 */
			if (subImg.getWidth() != width || subImg.getHeight() != height) {
				BufferedImage tempImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				tempImg.getGraphics().drawImage(subImg.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
				ImageIO.write(tempImg, imgType, new File(tarPath));
			} else {
				ImageIO.write(subImg, imgType, new File(tarPath));
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
