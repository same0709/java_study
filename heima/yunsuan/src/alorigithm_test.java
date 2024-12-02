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

//        Random rand = new Random();
//        int number = rand.nextInt(100)+1;
//
//        boolean flag = true;
//        while (flag) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter number ");
//            int guess = input.nextInt();
//            if (number > guess) {
//                System.out.println("你猜的比较小");
//            }
//            else if (number < guess) {
//                System.out.println("你猜的比较大");
//            }
//            else {
//                flag = false;
//                break;
//            }
//        }
//        if (flag = false) {
//            System.out.println("猜对了");
//        }
//        else {
//            ;
//        }

        /// 复制数组，定义一个方法copyofrange（）；将数组arr中从索引from开始到索引为to的元素，复制到新的数组当中
//        int[] test_arr = {1,2,3,4,5};
//        int[] answer = copyofrange(test_arr,1,4);
//        for (int i = 0; i < answer.length; i++) {
//            System.out.print(answer[i]+" ");
//        }
//
//    }
//    public static int[] copyofrange(int[] arr,int from,int to){
//        int[] newarr = new int[to-from];
//        int index = 0;
//        for(int i=from;i<to;i++){
////            int temp =arr[i];    或者换个思路，重新定义一个新索引
////            newarr[i-from]=temp;
//            newarr[index]=arr[i];
//            index++;
//        }
//        return newarr;

        /// 卖飞机票
        Scanner input = new Scanner(System.in);
        System.out.print("请输入该机票的价格: ");
        int price = input.nextInt();
        input.nextLine();
        System.out.println("请输入购买机票的月份： ");          ///其实这里为了判断输入的月份是否有效，可以定义一个方法即；在循环中，用while循环和break进行完成
        int month = input.nextInt();
        input.nextLine();
        System.out.println("请选择你所乘坐的座位： ");
        String choice = input.nextLine();
        input.close();
        System.out.println("你订的机票价格为： "+price);
        System.out.println("你购买的机票月份： "+month);
        System.out.println("你选择的座位为： "+choice);
        boolean flag_hotmonth = is_hot_day(month);
        boolean flag_seated = is_seat_advance(choice);
        double final_price = 0;
        if (flag_hotmonth && flag_seated) {
            final_price = price * 0.9;
        }else if (flag_hotmonth && !flag_seated) {
            final_price = price * 0.85;
        }
        else if (!flag_hotmonth && flag_seated) {
            final_price = price * 0.7;
        }
        else {
            final_price = price * 0.65;
        }
        System.out.println("根据各种条件所致，你最终所需的费用为： "+final_price);
    }

    public static boolean is_hot_day(int month){
        if(month >=5 && month <=10){
            return true;    ///true则为旺季
        }
        return false;  ///false 则为淡季
    }
    public static boolean is_seat_advance(String seat){
        if (seat.equals("商务座")){
            return true;
        }
        return false;
    }
}

