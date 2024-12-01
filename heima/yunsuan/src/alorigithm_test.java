import java.util.Random;
import java.util.Scanner;

public class alorigithm_test {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
////        int n = 11311;  //// 其实这里要求的给定一个整数，假设是12345
//        int n = input.nextInt();
//        int num = 0;
//        int x =n;                /// 判断回文数的重点知识；判断一个数是不是回文数
//        while (x!=0){
//            int ge = x %10;
//            x = x / 10;
//            num = num *10 +ge;
//        }
//        if (num == n){
//            System.out.println("The number is the same");
//        }
//

/// 要求 给定两个整数，分别为被除数和除数；将两数相除，要求不使用乘法，除法，%运算符；得到商和余数
///  被除数 / 除数 = 商 ...... 余数
///  需要明白除法中商的本质： 即是能够相减的次数；余数的本质就是： 一直减去不能在减的数
//        int a = 100;
//        int b = 3;
//        int count = 0;
//        while (a>=b)
//        {
//            a= a -b;
//            count++;
//        }
//        System.out.println("这就是商"+ count);
//        System.out.println("这就是余数： "+a);

        /// 逢7过 包含7或者是7的倍数都要说过；使用程序打印出1-100之间满足逢7必过的数据
//        for(int i = 1;i<=100;i++){
//            int ge = i%10;
//            int shi = i/10%10;
//            int bai = i/100%10;
//            if (i%7==0||ge==7||shi==7||bai==7){
//                System.out.print(" 过 ");
//            }
//            System.out.print(" "+ i);
//        }

        ///  键盘录入一个大于2的整数x，计算并返回x的平方根
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number ");
//        int n = sc.nextInt();
//        square(n);
//    }
//    public static void square(int n){
//        int i = 1;
//        for( i=1;i<=n;i++){
//            if(i*i<=n&&(i+1)*(i+1)>=n){        ///可以换一种思路，即当i*i>n时，i-1其实就是n的平方根的整数部分
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//        for (int i = 1; i <= n; i++) {
//            if (i * i  == n) {
//                System.out.println("这个数的平方根就是 "+ i);
//                break;
//            }
//            else if (i*i >= n){
//                System.out.println("这个数的平方根整数部分为 "+ (i-1));
//                break;
//            }
//        }

        /// 程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？

        Random rand = new Random();
        int number = rand.nextInt(100)+1;

        boolean flag = true;
        while (flag) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number ");
            int guess = input.nextInt();
            if (number > guess) {
                System.out.println("你猜的比较小");
            }
            else if (number < guess) {
                System.out.println("你猜的比较大");
            }
            else {
                flag = false;
                break;
            }
        }
        if (flag = false) {
            System.out.println("猜对了");
        }
        else {
            ;
        }

    }
}

