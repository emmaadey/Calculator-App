
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Calc.wholeThing();
//        int i =1;
//        while( i <= 100 ) {
//            System.out.println(i);
//            i++;
//        }
//        for(int i = 0; i <= 100; i++){
//            if(i % 2 != 0 ){
//                continue;
//            }
//            System.out.println(i);

//        }
Scanner obj1 = new Scanner(System.in);
        while(true){
            System.out.println("Hello World");
         String command = obj1.nextLine();
         if(command.equalsIgnoreCase("Exit")) {
             System.out.println("Program Ended Successful");
             break;

         }
        }
        }


}