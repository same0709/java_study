import java.util.Random;
import java.util.Scanner;

public class arr_max {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,9,8};
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("最大值为： "+max);
        /// 随机的给每个数组放一个元素
//        Random rand = new Random();
//        int[] arr = new int[10];
//        int sum = 0;
//        int average = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rand.nextInt(100)+1;
//            sum += arr[i];
//            average += arr[i]/arr.length;
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > average) {
//                count++;
//            }
//            System.out.println(arr[i]);
//        }
//        System.out.println("大于平均数的个数： "+count);
//        System.out.println("平均数为： "+average);
//        System.out.println("总数为： "+sum);
//
//        int[] arr = {1,2,3,4,5};
//        for (int i=0,j=arr.length-1;i<j;i++,j--){   ///  利用这两种形式 交换索引顺序；比如1与5；2与4
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        for(int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }


        ///打印出101到200之间的素数；并判断有多少个素数
//        int count = 0;
//        for (int i =101;i<=200;i++){
//            if (is_prime(i)){
//                System.out.print(i+" ");
//                count++;
//            }
//        }
//        System.out.println("素数的总个数为： "+count);
//    }
//    public static boolean is_prime(int n){
//        for (int j=2;j*j<n;j++){
//            if (n%j==0) {
//                return false;
//            }
//        }
//        return true;

        /// 定义方法随机产生一个5位的验证码；验证码格式：长度为5，前四位为大小写字母，最后一位是数字
        /// 1.大小写字母放入到数组中，随机产生索引
//        char[] arr = new char[52];
//        for (int i = 0; i <arr.length; i++) {
//            if (i<=25){
//                arr[i]=(char)('A'+i);
//            }
//            else if (i>25 && i<=51){
//                arr[i]=(char)('a'+i-26);
//            }
////            System.out.print(arr[i]);
//        }
//        /// 2.随机抽取四次，模拟索引
//        String result ="";
//        Random random =  new Random();
//        for (int i=0;i<4;i++){
//            int randindex = random.nextInt(52);   ///这个必须放在循环里面；否则会导致生成四个相同的字母
//            result = result + arr[randindex];
////            System.out.println(randindex);
//        }
//        /// 3.随机产生一个数字，添加到字母当中
//        int number = random.nextInt(10);
//        result = result + number;
//        System.out.println(result);

        /// 唱歌比赛中，六个评委给选手打分；范围为0-100之间的整数，选手的最后得分为去掉最高分，去掉最低分后的四个评委的平均分；

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            while (flag) {
                if (arr[i]<0||arr[i]>=100) {
                    System.out.println("格式不对，重新输入");
                    arr[i] = sc.nextInt();
                }
                else break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == getmax(arr)){
                arr[i] = 0;
            }else if(arr[i]==getmin(arr)){
                arr[i] = 0;
            }
        }
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum/(arr.length-2);
        }
        System.out.println(average);

//        while (flag) {
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = sc.nextInt();
//                if (arr[i] <= 100 && arr[i] >= 0) {
//                    flag = false;
//                } else {
//                    System.out.println("输入的数字应该在0-100之间，请重新输入");
//                }
//            }
//
//        }
    }
    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getmin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
}
