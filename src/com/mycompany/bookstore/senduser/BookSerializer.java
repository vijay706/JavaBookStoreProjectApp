package com.mycompany.bookstore.senduser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mycompany.bookstore.entity.BookEntity;
public class BookSerializer{
public static void serializeBook(BookEntity bookEntity) {
	
	FileOutputStream fs =null;
	ObjectOutputStream os =null;

	
	try {
          fs = new FileOutputStream(bookEntity.getBookID()+ ".ses");
        		 os =new ObjectOutputStream(fs);
        		 os.writeObject(bookEntity);
	}
	catch(IOException ex) {
		
		ex.printStackTrace();;
		
	}
	finally{
		try{
			os.close();
			fs.close();
		}
		catch(IOException e) {
			
			e.printStackTrace();;
			
		}
	}
		
	}



	public static BookEntity deserializeBook(Long bookId) {
		
		FileInputStream fis =null;
		ObjectInputStream ois =null;
	 BookEntity be =null;
		
		try {
              fis = new FileInputStream (bookId+ ".ses");
            		 ois =new ObjectInputStream (fis);
            		be = (BookEntity) ois.readObject();
		}
		catch( ClassNotFoundException ex) {
			
			ex.printStackTrace();
			
			
		}
catch( FileNotFoundException ex) {
			
			ex.printStackTrace();}
catch( IOException ex) {
			
			ex.printStackTrace();}
		finally{
			try{
				ois.close();
				fis.close();
			}
			catch(IOException e) {
				
				e.printStackTrace();;
				
			}
		}
		return be;

		}
	

}
