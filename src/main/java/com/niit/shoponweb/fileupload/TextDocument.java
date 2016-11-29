package com.niit.shoponweb.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public class TextDocument {
	public static boolean UploadText(String path,MultipartFile file,String file_name){
		 
		
		try {
			InputStream in=file.getInputStream();
			File dir=new File(path);
			 if (!dir.exists()) {
				 dir.mkdirs();
				   }
			File  uploading_text=new File(dir.getAbsolutePath()+File.separator+file_name);

			@SuppressWarnings("resource")
			FileOutputStream  outputStream = new FileOutputStream(uploading_text);
			   int read = 0;
			   byte[] bytes = file.getBytes();

			   while ((read = in.read(bytes)) != -1) {
			    outputStream.write(bytes, 0, read);
			   }
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

}
