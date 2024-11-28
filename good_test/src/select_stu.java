public class select_stu {
    private String stu_name;
    private int stu_age;
    private int stu_id;

    public select_stu(){}
    public select_stu(String stu_name, int stu_age, int stu_id) {
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_age() {
        return stu_age;
    }

    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
}
