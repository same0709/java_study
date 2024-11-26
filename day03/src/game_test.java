public class game_test {
    public static void main(String[] args) {
        game ht = new game("黄涛",100,'男',"无");
        game yi = new game("阿姨",100,'女',"无");
        ht.informationshow();
        yi.informationshow();
        while (true){
            ht.attack(yi);
            if (yi.getBlood()==0){
                System.out.println(ht.getName()+"KO了"+yi.getName());
                break;
            }
            yi.attack(ht);
            if (ht.getBlood()==0){
                System.out.print(yi.getName()+"ko了"+ht.getName());
                break;
            }
        }

        /// 可以通过javabean类的get和set方法，对JavaBean类的私有变量进行查看与修改
//        ht.setName("hh");
//        System.out.println(ht.getName());


    }
}
