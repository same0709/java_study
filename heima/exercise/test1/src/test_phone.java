import java.util.ArrayList;

public class test_phone {
    public static void main(String[] args) {
        ArrayList<phone> list = new ArrayList<>();
        phone p1 = new phone("小米",1000);
        phone p2 = new phone("苹果",8000);
        phone p3 = new phone("锤子",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        String s = return_messge(list);
        System.out.println(s);
    }
    /// 定义一个方法将低于3000的手机信息返回
    public static String return_messge(ArrayList<phone> list) {
        StringBuilder mess = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            int price = list.get(i).getPrice();
            if (price <=3000) {
                flag = true;
               mess.append("手机品牌为：").append(list.get(i).getBrand()).append("\n").append("价格为： ").append(list.get(i).getPrice()).append("\n");
            }
        }
        if (!flag) {
            mess.append("都高于3000");
        }
        return mess.toString();
    }
}
