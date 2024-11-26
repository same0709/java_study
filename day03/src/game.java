import java.util.Random;

public class game {
    /// 定义变量
    private String name;
    private int blood;
    private char gender;
    private String face;  ///长相是随机的

    String[] boyfaces = {"帅气逼人","气宇轩昂","相貌平平","面目狰狞"};
    String[] girlfaces = {"美丽","漂亮"};

    /// 攻击描述
    String[] attack_desc = {
            "%s使出了一招【翔龙有悔】,重重打在了%s上",
            "%s使出了一招【爱的抱抱】,重重打在了%s上",
            "%s使出了一招【肉蛋冲击】,重重打在了%s上",
    };
    /// 受伤描述
    String[] injure_desc = {
            "%s没事",
            "%s流血了",
            "%s腿短了",
            "%s头没了",
            "%s要死了",
    };

    ///  空参构造方法
    public game() {
    }
    /// 带全部参数的构造方法
    public game(String name, int blood, char gender, String face) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }
    /// 对每个成员变量都要有相对应的setxxx和getxxx
    /// 插件 PIG
    public void  setName(String name) {
        this.name = name;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男'){
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if (gender == '女'){
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "无";
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public int getBlood() {
        return blood;
    }

    /// 定义一个方法用于攻击别人
    public void attack(game role){
        /// this表示方法的调用者 思路是 attack r1 =  new attack（r2）方法的调用者去攻击参数


        Random r = new Random(); ///
        int index = r.nextInt(attack_desc.length);
        String kongfu = attack_desc[index];
        System.out.printf(kongfu, this.getName(), role.getName());
        int hurt = r.nextInt(20) +1;  /// 这两行定义随机的伤害
        int remainblood = role.getBlood() - hurt;   ///定义被攻击后的血量
        remainblood = remainblood < 0 ? 0: remainblood; ///判断血量不能为负数
        role.setBlood(remainblood);
        /// 90以上 0索引描述
        /// 70-90 1索引描述
        /// 60-70 2索引描述
        /// 20-60 3索引描述
        /// 0-20 4索引描述
        if(remainblood >90){
            System.out.printf(injure_desc[0], role.getName());
        }else if (remainblood >70){
            System.out.printf(injure_desc[1], role.getName());
        }else if (remainblood >60){
            System.out.printf(injure_desc[2], role.getName());
        }else if (remainblood >20){
            System.out.printf(injure_desc[3], role.getName());
        }else if (remainblood >0){
            System.out.printf(injure_desc[4], role.getName());
        }
        System.out.println();

//        System.out.println(this.getName()+"打了"+role.getName()+"一下，"+"造成了"+hurt+"点伤害，"+role.getName()+"还剩下"+
//                remainblood+"点血");
    }
    public void informationshow(){
        System.out.print("姓名为: " +getName() );
        System.out.println();
        System.out.print("血量为: " +getBlood() );
        System.out.println();
        System.out.print("性别为: " +getGender() );
        System.out.println();
        System.out.print("长相为: " +getFace() );
        System.out.println();
    }
}

