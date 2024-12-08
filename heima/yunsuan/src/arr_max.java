//import java.util.Random;
//import java.util.Scanner;
//
//public class arr_max {
//    public static void main(String[] args) {
/// /        int[] arr = {1,2,3,4,5,9,8};
/// /        int max = arr[0];
/// /        for (int i = 0; i < arr.length; i++) {
/// /            if (arr[i] > max) {
/// /                max = arr[i];
/// /            }
/// /        }
/// /        System.out.println("最大值为： "+max);
//        /// 随机的给每个数组放一个元素
/// /        Random rand = new Random();
/// /        int[] arr = new int[10];
/// /        int sum = 0;
/// /        int average = 0;
/// /        for (int i = 0; i < arr.length; i++) {
/// /            arr[i] = rand.nextInt(100)+1;
/// /            sum += arr[i];
/// /            average += arr[i]/arr.length;
/// /        }
/// /        int count = 0;
/// /        for (int i = 0; i < arr.length; i++) {
/// /            if (arr[i] > average) {
/// /                count++;
/// /            }
/// /            System.out.println(arr[i]);
/// /        }
/// /        System.out.println("大于平均数的个数： "+count);
/// /        System.out.println("平均数为： "+average);
/// /        System.out.println("总数为： "+sum);
/// /
/// /        int[] arr = {1,2,3,4,5};
/// /        for (int i=0,j=arr.length-1;i<j;i++,j--){   ///  利用这两种形式 交换索引顺序；比如1与5；2与4
/// /            int temp = arr[i];
/// /            arr[i] = arr[j];
/// /            arr[j] = temp;
/// /        }
/// /        for(int i =0;i<arr.length;i++){
/// /            System.out.print(arr[i]+" ");
/// /        }
//
//
//        ///打印出101到200之间的素数；并判断有多少个素数
/// /        int count = 0;
/// /        for (int i =101;i<=200;i++){
/// /            if (is_prime(i)){
/// /                System.out.print(i+" ");
/// /                count++;
/// /            }
/// /        }
/// /        System.out.println("素数的总个数为： "+count);
/// /    }
/// /    public static boolean is_prime(int n){
/// /        for (int j=2;j*j<n;j++){
/// /            if (n%j==0) {
/// /                return false;
/// /            }
/// /        }
/// /        return true;
//
//        /// 定义方法随机产生一个5位的验证码；验证码格式：长度为5，前四位为大小写字母，最后一位是数字
//        /// 1.大小写字母放入到数组中，随机产生索引
////        char[] arr = new char[52];
////        for (int i = 0; i <arr.length; i++) {
////            if (i<=25){
////                arr[i]=(char)('A'+i);
////            }
////            else if (i>25 && i<=51){
////                arr[i]=(char)('a'+i-26);
////            }
//////            System.out.print(arr[i]);
////        }
////        /// 2.随机抽取四次，模拟索引
////        String result ="";
////        Random random =  new Random();
////        for (int i=0;i<4;i++){
////            int randindex = random.nextInt(52);   ///这个必须放在循环里面；否则会导致生成四个相同的字母
////            result = result + arr[randindex];
//////            System.out.println(randindex);
////        }
////        /// 3.随机产生一个数字，添加到字母当中
////        int number = random.nextInt(10);
////        result = result + number;
////        System.out.println(result);
//
//        /// 唱歌比赛中，六个评委给选手打分；范围为0-100之间的整数，选手的最后得分为去掉最高分，去掉最低分后的四个评委的平均分；
//
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//            while (flag) {
//                if (arr[i]<0||arr[i]>=100) {
//                    System.out.println("格式不对，重新输入");
//                    arr[i] = sc.nextInt();
//                }
//                else break;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == getmax(arr)){
//                arr[i] = 0;
//            }else if(arr[i]==getmin(arr)){
//                arr[i] = 0;
//            }
//        }
//        int sum = 0;
//        int average = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            average = sum/(arr.length-2);
//        }
//        System.out.println(average);
//
//
//import java.lang.classfile.constantpool.ModuleEntry;
//import java.time.temporal.Temporal;
//import java.util.Random;

////        while (flag) {
////            for (int i = 0; i < arr.length; i++) {
////                arr[i] = sc.nextInt();
////                if (arr[i] <= 100 && arr[i] >= 0) {
////                    flag = false;
////                } else {
////                    System.out.println("输入的数字应该在0-100之间，请重新输入");
////                }
////            }
////
////        }
//    }
//    public static int getmax(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//    public static int getmin(int[] arr) {
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//}
//
//public class arr_max {
//    public static void main(String[] args) {
//        int[] price = {2,588,888,1000,10000};
//        Random random = new Random();
//        for (int i = 0; i < price.length; i++) {
//            int r = random.nextInt(price.length);
//            System.out.println(price[r]+"元现金已经被抽出");
//
//        }
//    }
//    public static int[] remove(int[] arr, int target) {
//        int[] newArr = new int[arr.length-1];
//
//    }
//}

import com.sun.source.tree.ReturnTree;

import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.StringJoiner;

//public class arr_max {
//    public static void main(String[] args) {
//        int[] prizes = {2, 588, 888, 1000, 10000};
//        Random random = new Random();
//        int n = prizes.length;
//
//        for (int i = 0; i < n; i++) {
//            // Select a random index from i to n-1. 非常厉害的精髓，即前面加一个i；起到往后便宜的一个作用
//            int r = i + random.nextInt(n - i);
//
//            // Swap the randomly selected prize with the current element.
//            int temp = prizes[i];
//            prizes[i] = prizes[r];
//            prizes[r] = temp;
//
//            // Print the newly swapped (drawn) prize.
//            System.out.println(prizes[i] + "元现金已经被抽出");
//        }
//    }
//}
//public class arr_max {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串");
//        String str = sc.next();   /// 通过键盘输入的字符串；实际是new出的对象，存储在堆中
//        String str2 = "abc";
//        System.out.println(str2==str);
//    }
//}

/// 已知正确的用户名和密码，请用程序实现模拟用户登陆，总共给三次机会；登陆之后，给出相应的提示
//public class arr_max {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String user = "20020709";
//        String password = "huangtao";
//        for (int i= 0;i<3;i++){
//            System.out.println("请输入账号： ");
//            String try1 = sc.next();
//            System.out.println("请输入密码：");
//            String try2 = sc.next();
//            if (try1.equals(user) && try2.equals(password)){
//                System.out.println("登陆成功");
//                break;
//            }
//            else {
//                if (i==2)
//                {
//                    System.out.println("账号已经被锁定");
//                }
//                else
//                {
//                    System.out.println("你还有"+(2-i)+"次机会");
//                }
//            }
//        }
//    }
//}

///键盘录入一个字符串，使用程序实现遍历字符串的每一个元素
//public class arr_max {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串: ");
//        String str = sc.next();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);    /// 重点在这里的charAt方法，可以将字符串中对应索引的字符返回
//            System.out.println(ch);
//        }
//    }
//}

/// 键盘录入一个字符串，统计该字符串中大小写字母出现次数，和数字字符的出现次数
//public class arr_max {
//    public static void main(String[] args) {
//        int number_count = 0;
//        int min_char_count = 0;
//        int max_char_count = 0;
//        System.out.println("请输入一个字符串： ");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch >= 'A' && ch <= 'Z') {
//                max_char_count++;
//            }
//            else if (ch >= 'a' && ch <= 'z') {
//                min_char_count++;
//            }
//            else if (ch >= '0' && ch <= '9') {
//                number_count++;
//            }
//        }
//        System.out.println("大写字母个数为："+max_char_count +"  小写字母个数为： "+ min_char_count+ " 数字字符个数为："+number_count);
//    }
//}
/// 将int中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
//public class arr_max {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        String result = arrtoString(arr);
//        System.out.println(result);
//
//    }
//    public static String arrtoString(int[] arr) {
//        if (arr == null) {
//            return "";
//        }
//            return "[]";
//        }
//        String result = "[";
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                result += arr[i];
//            }
//            else {
//                result += arr[i] + ",";
//            }
//        }
//        result += "]";
//        return result;
//    }
//}
///  定义一个方法，实现字符串反转；比如键盘录入abc，输出结果为cba
//public class arr_max {
//    public static void main(String[] args) {
//        System.out.println("请输入一个字符串");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String result = reverse(str);
//        System.out.println(result);
//    }
//    public static String reverse(String str) {
//        String result = "";
//        int len = str.length();
//        for (int i = len-1; i >=0 ; i--) {
//            char temp = str.charAt(i);
//            result += temp; /// 字符串拼接的套路
//        }
//        return result;
//    }
//}

///  金额转换  2135 -》  零百零拾零萬貳仟壹佰叁十伍元  限制在七位数内 查表法 一一对应
//public class arr_max {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int money;
//        while (true) {
//            System.out.println("请录入一个金额： ");
//            money = sc.nextInt();
//            if (money >= 0 && money <= 9999999) {
//                break;
//            } else {
//                System.out.println("金额无效，请重新输入");
//            }
//        }
//        String monetstr = "";
//        while (money != 0) {
//            int ge = money % 10;
//            String capitalnumber = getcapitalnumber(ge);///依次获得数字的每一位
//            monetstr = capitalnumber + monetstr; ///不仅需要打印每一位，而是需要将每一位给拼接起来;拼接到moneystr中；这里的顺序很重要
//            money = money / 10;
//        }
//        /// 在前面补0，补齐七位；
//        int count = 7 - monetstr.length();
//        for (int i = 0; i < count; i++) {
//            monetstr = "零" + monetstr;
//        }
//        System.out.println(monetstr);
//
//
//        /// 4.插入单位，定义一个数组表示单位
//         String [] arr = {"佰","拾","万","仟","佰","拾","元"};
//         ///  遍历moneystr，在把单位插入其中
//        String result = "";
//        for (int i = 0; i<monetstr.length(); i++) {
//            char ch = monetstr.charAt(i);
////            System.out.print(ch);            ///这是打印出来的方式，还可以使用拼接起来
////            System.out.print(arr[i]);
//            result = result + ch + arr[i];            ///遍历打印的时候，需要小心处理
//        }
//        System.out.println(result);
//        }
//    /// 定义一个方法把数字变成大写的中文  1->壹 形参为一个number 如果为0；那就返回数组中索引0的中文
//    public static String getcapitalnumber ( int number){
//        String arr[] = {"零", "壹", "貳", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
//        return arr[number];
//    }
//}
//
///         手机号屏蔽；string substring(beginindex.finalindex) 包头不包尾，包左不包右；如131 1234 2222 截取前面三位 则需要(0,3)有返回值的 如果只给一个实参 即给7，则一直截取到最后一位，包括尾
//public class arr_max {
//    public static void main(String[] args) {
//        String phonenumber = "13112345678";
//        String begin_hide = phonenumber.substring(0,3);
//        String end_hide = phonenumber.substring(7);
//        String result = begin_hide + "****" + end_hide;
//        System.out.println(result);
//    }
//}

//// 根据身份证号获取人物的身份信息 51132420020709381X  重点还是学习substring的使用
//public class arr_max {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("请输入你的身份证号码:  ");
//            String id_Card = sc.nextLine();
//            String title = "出生年月日: ";
//            String gendertitle = "性别为： ";
//            if (id_Card.length() == 18) {
//                String year = id_Card.substring(6, 10);
//                String month = id_Card.substring(10, 12);
//                String day = id_Card.substring(12, 14);
//                String gender = id_Card.substring(17, 18);
//                System.out.println("人物信息为： ");
//                String result = title + year+"年" + month+"月" + day+"日";
//                String genderresult = gendertitle + judge_gender(gender);
//                System.out.println(result);
//                System.out.println(genderresult);
//                break;
//            } else {
//                System.out.println("格式不对，请重新输入");
//            }
//        }
//        sc.close();
//    }
//    /// 定义一个方法，来判断到底是男还是女，返回字符串男还是女
//    public static String judge_gender(String gender) {
//        if (gender.equals(2)||gender.equals(4)||gender.equals(6)||gender.equals(8)){
//            return "女";
//        }
//        else {
//            return "男";
//        }
//    }
//}

/// 敏感词替换 string replace(旧值，新值)；返回值是替换后的结果
//public class arr_max {
//    public static void main(String[] args) {
//        String[] arr = {"TMD","CNM","MLGB","SB"};  ///定义一个脏话语料库
//        String talk = "你玩的真好，SB,CNM";
//        for (int i = 0; i < arr.length; i++) {
//            talk = talk.replace(arr[i],"*****");  ///将骂人的话 给替换为****
//        }
//        System.out.println(talk); ///打印结果
//    }
//}

///开始学习StringBuilder 类 只是我们操作字符串的工具
//public class arr_max {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("abc");
//        /// 添加元素
//        sb.append(1);
//        sb.append(2.5);
//        sb.append(true);
//        sb.reverse();  ///反转
//        int len = sb.length();
//        System.out.println(len); ///打印的是对象的属性值，但其不是字符串，需要通过tostring转化为字符串
//        String str = sb.toString();   ///这个str才是字符串
//        System.out.println(str);
//
//    }
//}
/// 对称字符串，键盘接受一个字符串，程序判断该字符串是否是对称字符串 ，并在控制台打印是还是不是  对称字符串123321，111
/// 对称字符串其正着和反着都是一样的
//public class arr_max {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串： ");
//        StringBuilder str_builder = new StringBuilder();
//        str_builder.append(sc.nextLine());
//        String zhengzhe = str_builder.toString();
//        String fanzhe = str_builder.reverse().toString();
//        if (zhengzhe.equals(fanzhe)) {
//            System.out.println("该字符串是对称字符串");
//        }else{
//            System.out.println("不是对称字符串");
//        }
//    }
//}

/// 学习stringjoiner stringjoiner(间隔符号)；或者（间隔符号，开始符号，结束符号）
//public class arr_max {
//    public static void main(String[] args) {
//        StringJoiner sj = new StringJoiner(",","[","]"); ///分别对应间隔，开始，结束
//        sj.add("aaa").add("bbb").add("ccc").add("ddd");
//        System.out.println(sj.toString());
//        System.out.println("--------------");
//        System.out.println(sj);
//        int len = sj.length();  ///[aaa,bbb,ccc,ddd]是指这里面包括符号的所有长度
//    }
//}

/// 转换成大写数字字符 键盘录入一个字符串， 长度小于等于9，将1转换为壹等
//public class arr_max {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串： : ");
////        int n = 1;
////        String retrun = return_letter(n);  测试是否可以返回大写数字
////        System.out.println(retrun);
////        boolean flag = is_number(str);   测试方法的测试代码
////        System.out.println(flag);
//        while (true) {
//            String str = sc.nextLine();
//            StringBuilder sb = new StringBuilder();
//            if (str.length()<=9&&is_number(str))
//            {
//                for (int i = 0; i < str.length(); i++) {
//                    char ch = str.charAt(i);
//                    int number = chartoint(ch);
//                    String st = return_letter_table(number);
//                    sb.append(st);
//                }
//                System.out.println(sb);
//                break;
//            }
//            else {
//                System.out.println("请重新输入");
//            }
//
//        }
//    }
//    /// 定义一个方法，判断字符串中是否全是数字，如果不是数字需要重新进行输入
//    public static boolean is_number(String str){
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch < 49 || ch > 57) {
//                return false;
//            }
//        }
//        return true;
//    }
//    /// 定义一个方法，传入的数字，返回一个大写数字  //其实这里可以使用查表法 定义一个数组
//    public static String return_letter(int number) {
//        String str = null;
//        switch (number) {
//            case 1:
//                str = "壹";
//                break;
//            case 2:
//                str = "貳";
//                break;
//            case 3:
//                str = "叁";
//                break;
//            case 4:
//                str = "肆";
//                break;
//            case 5:
//                str = "伍";
//                break;
//            case 6:
//                str = "陆";
//                break;
//            case 7:
//                str = "柒";
//                break;
//            case 8:
//                str = "捌";
//                break;
//            case 9:
//                str = "玖";
//                break;
//            default:
//                break;
//        }
//        return str;
//    }
//    /// 定义一个方法，可以将字符1-9转化为数字
//    public static int chartoint(char ch) {
//        int num = 0;
//        if (ch>='0' && ch<='9') {
//            num =  ch-'0';
//        }
//        else {
//            ;
//        }
//        return num;
//    }
//    public static String return_letter_table (int number) {
//        String[] arr ={"零","一","貳","三","四","五","六","七","八","九"};   ///这是查表法
//        return arr[number];
//    }
//}


/// 调整字符串 给定字符串A,B；A的旋转操作就是将A最左边的字符移动到右边；例如A='abcde',移动后变为‘bcdea'若干次之后成功了，则返回true，否则返回false

public class arr_max {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "de";
        for (int i = 0; i < str1.length(); i++) {
            String test = reverse(str1);
            if (test.equals(str2)) {
                System.out.println("true");
            }

        }

        System.out.println("false");

    }

    /// 定义一个方法，能够获取到字符的最后一位和第一位，然后进行调换，在把调换后的字符串给返回
    public static String reverse(String str) {
        String first = str.substring(0, 1);
        String end = str.substring(str.length() - 1);
        String temp;
        temp = first;
        first = end;
        end = temp;
        StringBuilder sb = new StringBuilder();
        String second = str.substring(1, str.length() - 1).toString();
        sb.append(first).append(second).append(end);
        return sb.toString();
    }
}