/*import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class Fileplay {
	public static void main(String[] args) throws Exception {
		// ����һ�����󣬲�ָ��·��
		File file = new File("D://assignment//F.txt");
		InputStream in = null;
		in = new FileInputStream(file);
		byte[] buff = new byte[(int) file.length()];
		in.read(buff);
		String tempt = new String(buff);
		in.close();
		System.out.print(tempt);
	}
	{
	}
}*/
/*import java.io.File;
public class Fileplay{
	public static void main(String[] args) throws Exception {
		File file = new File ("D:\\ttttt");
		file.createNewFile();
	}
}*/
/*import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Fileplay {
	public static void main(String[] args) throws Exception {
		String s = "Hello world!";
		File file = new File("D:\\ttt");
		OutputStream out = new FileOutputStream(file);
		out.write(s.getBytes());// �ַ���ת��Ϊ�ֽ�����
		out.close();
	}
}*/
import java.io.File;
public class Fileplay {
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\ttt");
		file.delete();
	}
}