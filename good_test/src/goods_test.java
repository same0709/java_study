import java.util.Scanner;

public class goods_test {
    public static void main(String[] args) {
        goods[] arr = new goods[3];
        for (int i = 0; i < arr.length; i++) {
            goods car = new goods();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of goods ");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("Enter the price of goods ");
            double price = sc.nextDouble();
            car.setPrice(price);
            System.out.println("Enter the color of goods ");
            String color = sc.next();
            car.setColor(color);
            arr[i] = car;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("汽车品牌为： "+arr[i].getBrand() + " 价格为： " + arr[i].getPrice() + " 颜色为： " + arr[i].getColor());
        }


    }
}
