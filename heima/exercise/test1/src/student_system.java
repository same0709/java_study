import org.w3c.dom.Element;
import org.w3c.dom.ls.LSException;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Scanner;

public class student_system {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
     loop:  while (true) {

            System.out.println("--------------------欢迎来到我的学生管理系统--------------------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");
            System.out.println("请输入您的选择： ");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1": {
                    add_student(list);
                    break;
                }
                case "2": {
                    delete_student(list);
                    break;
                }
                case "3": {
                    update_student(list);
                    break;
                }
                case "4": {
                    query_student(list);
                    break;
                }
                case "5": {
                    System.out.println("退出成功");
                    break loop; /// 或者写system.exit(0); 表示停止虚拟机运行 都可以直接跳出循环
                }
                default: {
                    System.out.println("没有这个选项");

                }
            }
        }
    }
    /// 定义多个方法，对应不同的操作
    /// 定义的添加学生方法
    public static void add_student(ArrayList<student> list) {
        student s1 = new student();  ///利用空参先创建一个学生对象
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("学号已存在，请重新输入");
            }
            else {
                s1.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s1.setName(name);
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s1.setAge(age);
        System.out.println("请输入学生的地址");
        String address = sc.next();
        s1.setAddress(address);
        list.add(s1);
    }
    public static void delete_student(ArrayList<student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = sc.next();
        /// 查询id在集合中的索引
        int index = getindex(list, id);
        /// 对index进行判断，如果-1，就表示不存在，结束方法，回到初始菜单
        if (index >=0){
            list.remove(index);
            System.out.println("id为：" + id +"的学生删除成功");
        }else {
            System.out.println("id不存在，删除失败");
        }



    }
    public static void update_student(ArrayList<student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        int index = getindex(list, id);
        if (index == -1){
            System.out.println("要修改的id"+ id + "不存在，请重新输入");
            return;
        }
        ///  当代码执行到这里，表示当前id是存在的，即可以获取要修改的学生对象
        else {
            student stu = list.get(index);
            System.out.println("请输入要修改的学生姓名");
            String newName = sc.next();
            stu.setName(newName);
            System.out.println("请输入要修改的学生年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);
            System.out.println("请输入要修改的学生家庭住址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);
            System.out.println("学生消息修改成功");




        }

    }
    public static void query_student(ArrayList<student> list) {
        if (list.size() ==0) {
            System.out.println("请添加了学生之后，在进行查询");
            return;
        }
        else {
            System.out.println("stu_id\tname\tage\taddress");
            for (int i = 0; i < list.size(); i++) {
                student stu = list.get(i);
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
            }
        }
    }

    ///定义一个方法，判断学生的id是否唯一，如果存在则重新输入，不存在，则不输入
    public static boolean contains(ArrayList<student> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId().equals(id)) {
//                return true;
//            }
//        }
        return getindex(list, id) >=0;
    }

    /// 定义一个方法，可以根据id来获取索引；
    public  static int getindex(ArrayList<student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
