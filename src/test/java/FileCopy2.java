import java.io.*;

/**
 * 文件拷贝 通过字节流输入 通过字符流输出
 */
public class FileCopy2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileWriter fos = null;
        byte[] buf = new byte[10];
        try {
            fis = new FileInputStream("/Users/gongyanhui/Desktop/Test/gitTest/pom.xml");
            fos = new FileWriter("/Users/gongyanhui/Desktop/Test/gitTest/test.md");
            while (true) {
                int read = fis.read(buf);
                if (read == -1) {
                    break;
                }
                String str = new String(buf);
                fos.write(str,0,read);
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
