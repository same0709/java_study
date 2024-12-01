//
//public class yunsuan_test {
//    public static void main(String[] args) {
//        System.out.println("请输入一个数字： ");
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        while (!getthree(a)){
//            System.out.println("格式不对，需要三位数,请重新重新输入");
//            a = input.nextInt();
//        }
//        System.out.println("该三位数的个位数为： "+a%10);
//        System.out.println("该三位数的十位数为： "+a/10%10);
//        System.out.println("该三位数的百位数为： "+a/100%10);
//    }
//    ///  需要定义一个方法，来判断输入的数到底是否是三位数，如果不是，需要重新输入
//    /// 需要鉴别的数，及输入的数；需要返回的值类型来判断是否是三位数
//    public static boolean getthree(int a){
//        if(a<=999&&a>=100){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//}
//    public static void restart(){
//        Scanner input = new Scanner(System.in);
//        int b = input.nextInt();
//        System.out.println("该三位数的个位数为： "+b%10);  restart方法并没有正确实现，让用户必须输入正确个数的数字的功能，可以使用循环进行完成
//        System.out.println("该三位数的十位数为： "+b/10%10);
//        System.out.println("该三位数的百位数为： "+b/100%10);
//    }

/// 三元运算符
/// 关系表达式 ？ 表达式1：表达式2   如果关系表达式为true的话，就是表达式1；反之则为表达式2 但必须要赋给某个变量；或者打印输出

//public class yunsuan_test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.printf("请输入第一个整数： ");         判断两个数字是否相同
//        int number1 = input.nextInt();
//        System.out.printf("请输入第二个整数： ");
//        int number2 = input.nextInt();
//        int max_number = number1 != number2 ? 0 : 1;
//        if (max_number == 1) {
//            System.out.println("两个数字相同");
//        }
//        else if (max_number == 0) {
//            System.out.printf("两个数字不相同");
//        }
//
//
//    }
//    }

public class yunsuan_test {
    public static void main(String[] args) {
//        int height1 = 150;
//        int height2 = 170;
//        int height3 = 180;
//        int temp = height1 > height2 ? height1 : height2;
//        int max = temp > height3 ? temp : height3;
//        System.out.println("三者当中最大的数为： "+max);
//          int a = 200;
//          int b = 10;
//          System.out.println(a & b);
//          System.out.println(a | b);
//        Scanner ticket = new Scanner(System.in);
//        System.out.printf("请输入你的票号：");
//        int number1 = ticket.nextInt();
//        while (number1 < 0 || number1 > 100) { /// 要让输入的数符合条件；可以使用while循环，条件即是 符合条件的否定即可以一直重复输入
//            System.out.printf("输入格式不对，重新输入\n");
//            number1 = ticket.nextInt();
//        }
//
//        if (number1 % 2 == 0) {
//        System.out.printf("坐右边");
//    }
//        else
//        {System.out.printf("坐左边");}

//        Scanner input = new Scanner(System.in);
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//        int goal = 0;
//        for (int i = number1; i <= number2; i++) {
//            if (i % 3 == 0&& i%5==0) {
//                goal++;
//                System.out.println(i);
//            }else{}
//        }
//        System.out.println(goal);


        int i = 0;
        double height = 0.10;
        while (height <= 8844430){
            height = height *2;
            i++;
        }
        System.out.println(i);

}
}