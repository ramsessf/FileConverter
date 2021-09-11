package com.ramses.fileconverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileconverterApplication {

	// encodeImage("C:\\Users\\usuario\\Desktop\\imagens\\foto.jpg",
	// "C:\\workspaces\\ws-fileconverter\\File);

	// decodeImage("C:\\workspaces\\ws-fileconverter\\File
	// Converter\\src\\files_base64\\file2.txt",
	// "C:\\Users\\usuario\\Desktop\\imagens\\foto2.jpg");

	public static void main(String[] args) throws Exception {
		SpringApplication.run(FileconverterApplication.class, args);

	}

}
