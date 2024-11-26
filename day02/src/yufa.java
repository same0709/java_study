import java.util.Scanner;

public class yufa {
    public static void main(String[] args) {
//       int n = 100;
//       int i = 0;
//       int sum = 0;
//       for (i = 0; i <= n; i++) {
//           sum = sum + i;
//       }
//        System.out.println(sum);
        ///模拟解决打印一元二次方程的两个根
//        double a = 1.0;
//        double b = -4.0;
//        double c = 3.0;
//        System.out.println(Math.sqrt(b*b-4*a*c));
//        double g  = Math.sqrt(b*b-4*a*c);
//        double x1 = (-b + g)/(2*a);
//        double x2 = (-b - g)/(2*a);
//        System.out.println(x1);
//        System.out.println(x2);
//        System.out.printf("%.2f %.1f",x1,x2);
///  针对输入的年龄判断是否是一个成年人
//        Scanner input = new Scanner(System.in);
//        System.out.print("please input a number: ");
//        int age = input.nextInt();
//        boolean isprimary = age >=18 ? true : false;
//        if (isprimary) {
//            System.out.println("adult");
//        }
//        else {
//            System.out.println("child");
//        }
        /// 多行字符串以及连接字符
//        String a = "hello";
//        String b = "world";
//        System.out.print(a +" "+b+"\n");
///// 使用换行符进行换行
//        System.out.print("the first line\n"+"the second line\n"+"end"+"\n");
//        /// 使用""" 文本块""" 来进行换行
//        System.out.print("""
//                 i
//                 am
//                 a
//                 good
//                 man""");
        /// 判读栈与堆;引用类型的数据不会变化
//        String s = "hello";
//        String t = s;
//        s = "world";
//        System.out.println(s);
           /// 将多个字符相加形成字符串
//        int a = 72;
//        int b = 105;
//        int c = 65281;
//        char a1 = (char) a;
//        char b1 = (char) b;
//        char c1 = (char) c;
////        System.out.println((char)a + (char)b + (char)c);
////        System.out.println(a1+b1+c1);
////        System.out.println(a1 +""+b1+""+c1);
//        System.out.println(String.valueOf(a1)+String.valueOf(b1)+String.valueOf(c1));

//        String[] name = {"abc","xyz","zoo"}; ///定义数组的一种方式
//        ///  上面一行已经说明了name[1] = "xyz";即name[1]存储的是xyz的地址
//        String s = name[1]; /// 而这一行又来了一个s，也是指向“xyz”的地址；相当于有两把钥匙
//        name[1] = "cat";   /// 将name[1]这把钥匙指向了cat的存储地址
//        System.out.println(s);
//        System.out.println(name[1]);

//        /// 练习各种类型数组的定义方式
//        String[] teacher = new String[]{"he","she"};
//        String[] math = {"dui","cuo"};
//        System.out.println(teacher[teacher.length-1]);
//        System.out.println(math[math.length-1]);

        Scanner input1 = new Scanner(System.in);
        System.out.print("enter your first grade： ");
        double grade1 = input1.nextInt();
        System.out.print("enter your second grade： ");
        double grade2 = input1.nextInt();
        if (grade2 >= grade1) {
            double rate = (grade2 - grade1) / grade1 * 100;
            System.out.printf("提高了百分之%.2f", rate);
        }
        else {
            double rate = (grade1 - grade2) / grade2 * 100;
            System.out.printf("下降了百分之%.2f", rate);
        }
        input1.close();
    }
}
