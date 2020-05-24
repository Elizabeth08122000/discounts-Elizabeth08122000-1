import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        double summ=0;
        double price = in.nextDouble();
        while(price>0){
            summ +=price;
            price = in.nextDouble();
        }
        double sum1=summ;
        if(summ>=1000){
            sum1= Math.floor((summ-summ*0.05)*100)/100;
        }
        summ = Math.floor(summ*100)/100;
        System.out.println(summ+" "+sum1+" "+Math.floor((summ-sum1)*100)/100);
        in.close();
    }
}
