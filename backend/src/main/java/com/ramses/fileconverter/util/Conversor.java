package com.ramses.fileconverter.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Base64;

public class Conversor {

	// encode image to base64 string.

	private static String encodeImage(String imgPath, String savePath) throws Exception {

		FileInputStream imageStream = new FileInputStream(imgPath);
		byte[] data = imageStream.readAllBytes();
		String imageString = Base64.getEncoder().encodeToString(data);

		FileWriter fileWriter = new FileWriter(savePath);

		fileWriter.write(imageString);

		fileWriter.close();
		imageStream.close();

		return imageString;
	}

	// decode image from base64 string and create a new image file from it.

	private static void decodeImage(String txtPath, String savePath) throws Exception {
		FileInputStream inputStream = new FileInputStream(txtPath);

		byte[] data = Base64.getDecoder().decode(new String(inputStream.readAllBytes()));
		// Base64.getDecoder().decode(inputStream.readAllBytes());

		FileOutputStream fileOutputStream = new FileOutputStream(savePath);
		fileOutputStream.write(data);
		fileOutputStream.close();
		inputStream.close();

	}

}
