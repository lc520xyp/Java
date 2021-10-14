public class ArrayTest {
    public static void main(String[] args) {
        int num;
        num = 10;

        int[] ids; // 声明
        // 静态初始化 数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001, 1002, 1003};
        // 动态初始化 数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];
        // 一旦初始化完成，长度就确定了
        names[0] = "lcp";
        names[1] = "pb";
        names[3] = "pb";
        names[4] = "pb";
        names[2] = "pb";

        // 获取数组的长度 length
        int size = names.length;
        System.out.println(size);
        // 遍历数组
        for (int i=0; i<size; i++){
            System.out.println(names[i]);
        }
        for(String s : names){
            System.out.println(s);
        }

        // 默认初始化值
//        >数组元素是整型:0
//        >数组元素是浮点型: 0.0
//        >数组元素是char型:0或' \u0000',而非'0'
//        >数组元素是boolean型: false
//        >数组元素是引用数据类型: nu11
    }
}
