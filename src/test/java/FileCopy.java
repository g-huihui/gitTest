import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制 通过字节流拷贝文件
 */
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] buf = new byte[10];
        try {
            fis = new FileInputStream("/Users/gongyanhui/Desktop/Test/gitTest/pom.xml");
            fos = new FileOutputStream("/Users/gongyanhui/Desktop/Test/gitTest/test.md");
            while (true) {
                int read = fis.read(buf);
                if (read == -1) {
                    break;
                }
                fos.write(buf,0,read);
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
