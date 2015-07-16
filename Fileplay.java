import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class Fileplay {
	public static void main(String[] args) throws Exception {
		// 创建一个对象，并指定路径
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
}