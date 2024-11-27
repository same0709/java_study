public class phone_test {
    public static void main(String[] args) {
        /// 创建一个数组
        phone [] arr = new phone[3];
        /// 创建手机的对象
//        arr[0] = new phone();
//        System.out.println(arr[0]);
        phone p1 = new phone("mL",2000,"RED");
        phone p2 = new phone("vivo",2000,"GREEN");
        phone p3 = new phone("oppo",2000,"BLUE");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();    /// 还可以更直观的写 phone phone = arr[i]; phone.getprice(); 将arr[i]对象赋给phone
        }
        System.out.println(sum/arr.length);
    }
}
