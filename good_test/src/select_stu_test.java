public class select_stu_test {
    public static void main(String[] args) {
        select_stu[] students = new select_stu[3];
        select_stu s1 = new select_stu("ht", 24, 111);
        select_stu s2 = new select_stu("sc", 23, 222);
        select_stu s3 = new select_stu("ww", 23, 333);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        ///  添加一个新的学生s4
        select_stu s4 = new select_stu("dy", 26, 444);

        boolean flag = only(students, s4.getStu_id()); ///来进行判断添加的学生 是否是重复的学生
        if (flag) {
            /// 已经存在 --不用进行添加
        System.out.println("当前id重复不需要进行添加");
        }
        /// 不存在，需要进行添加，需要进行判断，添加在新数组中；还是旧数组中；
        /// 把s4添加到数组中，数组已经存满，只能创建一个新的数组，新数组的长度=老数组+1
        /// 数组没有存满直接进行添加； 因此可以定义一个方法判断数组中存在了几个元素
        else {
            int count = getcount(students); ///判断是添加到新数组中，还是老数组中
            if(count == students.length) {
                select_stu[] newarr =creatnewarr(students);
                newarr[count] = s4;
                print_stu(newarr);    ///定义打印输出信息的
            }
            else {
                students[count] =s4;/// 没有存满，直接插入到原数组中
                print_stu(students);
            }
        }
        /// 再次添加学生对象，添加到哪里； 1.原数组（没存满） 2.新数组（存满了） 新数组的长度 = 老数组 + 1
        /// 添加的时候进行学号唯一判断； 若有相同学号，则不添加；若无。则添加
        /// 因此先进行一个对学号的唯一性判断；定义一个方法;
        /// 干这件事情 需要什么才能完成呢； 首先肯定需要原数组的id，和新添加学生的id
        /// 调用处是否需要使用方法的结果？ 需要的，因为若id重复的话，不用添加；不重复，则添加；
    }
    ///  创建新的数组，为老数组＋1；
    public static select_stu[] creatnewarr(select_stu[] students) {
        select_stu[] newarr = new select_stu[students.length+1];

        ///  将老数组元素写入到新数组中
        for (int i = 0; i < students.length; i++) {
            newarr[i] = students[i];
        }
        return newarr;
    }
    public static Boolean only(select_stu[] students,int id){
        for (int i = 0; i < students.length; i++) {
            select_stu stu = students[i];
            if(stu!=null){
                int sid = stu.getStu_id();
                if (id == sid ) {
                    return true;
                }
            }
            ///获取数组中学生对象的id
            /// 当循环把每个现有学生id判断完后，没有找到一样的，那么就表示数组中要查找的id是不存在的
        }
        return false;
    }
    public static int getcount(select_stu[] students){
        int count = 0;  ///定义一个计数器，用来统计students数组中已经有多少个元素了;其实也是该添加数据的索引值
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null) {
                count++;
            }
        }
        return count;
    }
    /// 在定义一个方法，将所有学生信息给输出；需要判断是输出老数组还是新数组
    public static void print_stu(select_stu[] students){
        for (int i = 0; i < students.length; i++) {
            select_stu stu = students[i];
            if (stu!=null) {
                System.out.println(stu.getStu_id() + ", " + stu.getStu_name() + ", " + stu.getStu_age());
            }
            else {}

        }
    }
}

