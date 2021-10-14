public class MulArrayTest {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3};
        // 静态初始化
        int [][] arr1 = new int[][]{{1, 2, 3}, {4, 5},{6, 7, 8}};

        // 动态初始化
        String [][] arr2 = new String[3][5];
        String [][] arr3 = new String[3][]; // 没有指定第二维


        System.out.println(arr1[0][1]);
        System.out.println(arr2[2][1]);

        // 使用时需要指定第二维
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);

        // 获取长度
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);

        // 数组的初始化

    }
}
