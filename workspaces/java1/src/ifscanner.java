import  java.util.Scanner;
public class ifscanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num  = scan.nextInt();
        System.out.println(num);

        System.out.println("请输入一个字符串：");
        String s ;
        s = scan.next();
        System.out.println(s);

        System.out.println("请输入一个小数：");
        double d ;
        d = scan.nextDouble();
        System.out.println(d);

        System.out.println("请输入一个布尔：");
        boolean b;
        b = scan.nextBoolean();
        System.out.println(b);
        // 没有提供char的输入，可以使用字符串来获取。
    }
}
