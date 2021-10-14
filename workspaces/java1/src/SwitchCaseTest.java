public class SwitchCaseTest {

    public static void main(String[] args) {
        int n = 2;
        switch (n){ // 不允许放bool类型，只能byte、short、char、int、枚举类型、String
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }
    }
}
