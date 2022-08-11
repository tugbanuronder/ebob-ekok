import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      boolean a = true;
      int n1, n2 , i = 1, j = 1, ebob = 1, ekok = 1;

        do{
          System.out.print("n1 sayısını giriniz:");
          n1 = input.nextInt();
          System.out.print("n2 sayısını giriniz:");
          n2 = input.nextInt();

          if (n1 <= 0 || n2 <= 0) {
              System.out.println("Pozitif sayı giriniz.");
          }
          else {
              a=false;
          }

        }while(a);

        //ebob
        if(n1<n2){
            while(i<=n1){
                if(n1 % i==0 & n2 % i==0){
                    ebob=i;
                }
                i++;
            }
        }
        else{
            while(i<=n2){
                if(n1 % i==0 & n2 % i==0){
                    ebob=i;
                }
                i++;
            }
        }

        //ekok
        while(j<=(n1*n2)){
            if(j % n1 ==0 & j % n2==0){
                ekok=j;
                break;
            }
            j++;
        }
        System.out.println("ebob:" + ebob);
        System.out.println("ekok:" + ekok);
    }
}