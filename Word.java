package Claa;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Word {
public static void main(String[] args) throws Exception{
	File file =new File("D://eee.txt");
	InputStream in=null;
	in=new FileInputStream(file);
	byte[] buff=new byte[(int)file.length()];
	in.read(buff);
	String tempt=new String(buff);
	in.close();	
}


}


}
