package day5;

public class DoWhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i<5; i++){
            System.out.println(i);
        }
        int j = 1;
//        while(j<5){
//            System.out.println(j);
//            j++;
//        }
        while(true){
            if (j>5){
                break;
            }
            System.out.println(j);
            j++;
        }
        int k= 1;
        boolean isReady = false;
        do{
            if(k > 5){
                break;
            }
            System.out.println(k);
            k++;
            isReady  = (k>0);
        }while (isReady);

        int number = 0;
        while(number < 50){
            number+=5;
            if(number % 25 == 0){
                continue;
            }
            System.out.print(number+  "_");
        }
    }
}

