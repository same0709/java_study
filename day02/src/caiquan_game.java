import java.util.Scanner;

public class caiquan_game {
    public static void main(String[] args) {
        int playerwin = 0;
        int computerwin = 0;
        while(playerwin <2 && computerwin <2) {
            System.out.print("请选择你要出的方式:  " );
            System.out.print("1.布");
            System.out.print("2.石头");
            System.out.print("3.剪刀\n");
            Scanner input = new Scanner(System.in);
            int choice  = input.nextInt();
            int random = (int)(Math.random()*3)+1;
            switch (choice){
                case 1 ->{
                    switch (random){
                        case 1 ->System.out.print("平局");
                        case 2 ->{
                            System.out.print("你赢了");
                            playerwin++;
                        }
                        case 3 ->{
                            System.out.print("你输了");
                            computerwin++;
                        }
                        default ->System.out.print("刷新重试");
                    }
                }
                case 2 ->{
                    switch (random){
                        case 1 ->{
                            System.out.print("你输了");
                            computerwin++;
                        }
                        case 2 ->System.out.print("平局");
                        case 3 ->{
                            System.out.print("你赢了");
                            playerwin++;
                        }
                        default -> System.out.print("刷新重试");
                    }
                }
                case 3 ->{
                    switch (random){
                        case 1 ->{
                            System.out.print("你赢了");
                            playerwin++;
                        }
                        case 2 ->{
                            System.out.print("你输了");
                            computerwin++;
                        }
                        case 3 ->System.out.print("平局");
                    }
                }
                default ->System.out.print("try again");
            }
        }
    System.out.println("当前比分：你"+playerwin +"他"+computerwin);
    if (playerwin == 2 ) {
        System.out.print("congraulation");
    }
    else{
        System.out.print("lose");
    }
    }
}
