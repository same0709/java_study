public class bmi_test {
    public static void main(String[] args) {
//        double bmi;
//        double weight;
//        double height;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the weight of the bmi: ");
//        weight = input.nextDouble();
//        System.out.print("Enter the height of the bmi: ");
//        height = input.nextDouble();
//        bmi = weight / (height * height);
//        if (bmi < 18.5) {
//            System.out.println("BMI is more lower");
//        }
//        else if (bmi >= 18.5 && bmi <= 24.9) {
//            System.out.println("BMI is normal");
//        }
//        else if (bmi >= 25 && bmi <= 28) {
//            System.out.println("BMI is upper");
//        }
//        else if (bmi > 28 && bmi <= 32) {
//            System.out.println("BMI is more upper");
//        }
//        else {
//            System.out.println("BMI is best upper");
//        }
//        input.close();
        /// 计算从m加到n
//        System.out.println("请输入m \n");
//        Scanner input = new Scanner(System.in);
//        int m = input.nextInt();
//        System.out.print("请输入n \n");
//        int n = input.nextInt();
//        int sum = 0;
//        if (m > n)
//            System.out.print("try again");
//        while (m <= n){
//            sum = sum + m;
//            m++;
//        }
//        System.out.print(sum);
//        int[] ns = { 1, 4, 9, 16, 25 };
//        int sum = 0;
//        for (int i=0; i<ns.length; i++) {
//            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
//            sum = sum + ns[i];
//        }
//        System.out.println("sum = " + sum);
//        int sum = 0;
//        for (int n : ns) {
//            sum += n;
//        }
//        System.out.println(sum);
        double pi = 0;
        int iteration = 100;
        for (int i = 0; i < iteration; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                pi = pi + term;
            }
            else  {
                pi = pi - term;
            }
        }
        pi = pi * 4;
        System.out.println(pi);

    }
}
