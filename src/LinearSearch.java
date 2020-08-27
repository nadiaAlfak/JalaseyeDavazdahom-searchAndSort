import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    private int[] array;

    public LinearSearch(){
        array=new int[100];
        Random random=new Random();
        for (int index=0; index<100;index++){
            array[index]=random.nextInt(100);
        }

    }
    private int search(int number){
       for (int index=0;index< array.length;index++){
           if(array[index]==number){
               return index;
           }
       }
        return -1;
    }
    public void adad(int number) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println("\nadd khod ra entekhab konid");
        Scanner scanner=new Scanner(System.in);
        int entekhb=scanner.nextInt();
        int natijeh=search(entekhb);
        if(natijeh!=-1){
            natijeh=natijeh+1;
            System.out.println("jayi k add hast"+natijeh);
        }
        else if(natijeh==-1){
            System.out.println("add vojod nadarad");
        }


    }
}
