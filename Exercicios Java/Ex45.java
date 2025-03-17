import java.io.File;

public class Ex45 {
    public static void main(String[] args) {
        System.out.println("/home/student/abc.txt : " + new File("abc.txt").length() + "bytes");
        System.out.println("/home/student/test.txt : " + new File("test.txt").length() + "bytes");
    }
}
