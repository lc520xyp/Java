import java.lang.Math;
public class randint {
    public static void main(String[] args) {
        // 随机获取一个10-99的整数
        int value = (int)(Math.random() * 90 + 10);
        System.out.println(value);
    }
}
