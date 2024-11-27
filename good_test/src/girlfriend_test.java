public class girlfriend_test {
    public static void main(String[] args) {
        girlfriend[] arr = new girlfriend[4];
        ///  创建对象实例，并传入参数，将其放到数组里
        girlfriend g1 = new girlfriend("alice",18,"女","basketball");
        girlfriend g2 = new girlfriend("honglian",28,"女","tenis");
        girlfriend g3 = new girlfriend("xiaoyue",26,"女","run");
        girlfriend g4 = new girlfriend("tuzi",22,"女","sing");
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;
        /// 通过循环获得每个女孩的年龄；
        double sum_age = 0;
        int low_ave = 0;
        for (int i = 0; i < arr.length; i++) {

            sum_age =sum_age + arr[i].getAge();
//            if (arr[i].getAge() > g.getAge()) {
//                low_ave++;
//                System.out.println("年龄比平均值低的女孩个数有" + low_ave);
//                System.out.println("这个女孩的名字是"+ g.getName()+"年龄是："+g.getAge()+"性别是："+g.getGender()+"爱好是： "+g.getHobby());
//            }
        }
        double avearge_age = sum_age/arr.length;
        for (int i = 0; i < arr.length; i++) {
            girlfriend g = arr[i];
            if (arr[i].getAge() < avearge_age) {
                low_ave++;

                System.out.println("这个女孩的名字是 " + arr[i].getName() + "  年龄是：" + arr[i].getAge() + "   性别是：" + arr[i].getGender() + "  爱好是： " + arr[i].getHobby());
            }


        }
        System.out.println("年龄比平均值低的女孩个数有" + low_ave+"个");
        System.out.println(avearge_age);
    }
}
