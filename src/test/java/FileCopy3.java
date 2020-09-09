import java.io.*;

/**
 * 文件拷贝 通过字符流输入 通过字节流输出  --- 出现乱码
 */
public class FileCopy3 {
    public static void main(String[] args) {
        FileReader fis = null;
        FileOutputStream fos = null;
        char[] buf = new char[10];
        try {
            fis = new FileReader("/Users/gongyanhui/Desktop/Test/gitTest/pom.xml");
            fos = new FileOutputStream("/Users/gongyanhui/Desktop/Test/gitTest/test.md");
            while (true) {
                int read = fis.read(buf);
                if (read == -1) {
                    break;
                }
                fos.write(buf.toString().getBytes(),0,read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
