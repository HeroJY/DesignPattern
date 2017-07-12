package AdapterPattern;

import java.io.*;

/**
 * Created by hjy on 2017/7/10.
 * 适配器模式：主要是把一个类或者对象转化为期望的类或者对象
 * 例如InputStreamReader对象适配器体现(这里是JDK中的例子，自己编写的测试在Client类中)
 */
public class mainTest {
    public static void main(String[] args) {
        //比如JDK中的例子
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/AdapterPattern/test.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            int a ;
            while((a = inputStreamReader.read()) != -1){
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
