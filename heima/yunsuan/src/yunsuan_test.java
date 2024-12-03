import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class yunsuan_test {
    public static void main(String[] args) {
        System.out.println("请输入一个数字： ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while (!getthree(a)){
            System.out.println("格式不对，需要三位数,请重新重新输入");
            a = input.nextInt();
        }
        System.out.println("该三位数的个位数为： "+a%10);
        System.out.println("该三位数的十位数为： "+a/10%10);
        System.out.println("该三位数的百位数为： "+a/100%10);
    }
    ///  需要定义一个方法，来判断输入的数到底是否是三位数，如果不是，需要重新输入
    /// 需要鉴别的数，及输入的数；需要返回的值类型来判断是否是三位数
    public static boolean getthree(int a){
        if(a<=999&&a>=100){
            return true;
        }
        else{
            return false;
        }
    }
//    public static void restart(){
//        Scanner input = new Scanner(System.in);
//        int b = input.nextInt();
//        System.out.println("该三位数的个位数为： "+b%10);  restart方法并没有正确实现，让用户必须输入正确个数的数字的功能，可以使用循环进行完成
//        System.out.println("该三位数的十位数为： "+b/10%10);
//        System.out.println("该三位数的百位数为： "+b/100%10);
//    }
}


