package com.niit.shoponweb.image;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Multiple_Image_Upload {
	




	public static boolean uploadMultipleImage(String path,List<MultipartFile>  file,String file_name){
		
		if(!file.isEmpty())
		{
			int i=1;

				try {
		
		       
			for (MultipartFile multipartFile : file){
				byte[] byte_image=multipartFile.getBytes();
						String filenameappend=file_name+"s"+i+".jpg";
						File dir=new File(path);
						if(!dir.exists()){
						
						dir.mkdirs();
						}
						
						File  uploading_file=new File(dir.getAbsolutePath()+File.separator+filenameappend);
						
						BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(uploading_file));
						bos.write(byte_image);
						bos.close();
						
						i++;
						System.out.println("upload");


						
						
			}
			
			return true;	

			
		}
				
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		}
		else{
			return false;
		}
		
		
		
		
		
	}
	
}
