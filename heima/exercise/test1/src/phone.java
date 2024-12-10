public class phone {
    /// 定义私有变量；空参构造，实参构造，get和set方法
    private String brand;
    private int price;

    public phone(){

    }
    public phone(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
