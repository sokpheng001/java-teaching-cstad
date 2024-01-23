package test;

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println("                     DATA                    ");
        System.out.println(" ------------------[Select]----------------- ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("    Array: " + arr[i][j] + "[" + i + "]["+ j +"]");
            }
        }
        System.out.println(" ------------------[Input]------------------ ");
        System.out.print(" => Enter index [i] to search: ");
        int ni = cin.nextInt();
        System.out.print(" => Enter index [j] to search: ");
        int nj = cin.nextInt();
        System.out.println(" ------------------[Result]----------------- ");
        System.out.println(" - You Selected => I["+ni+"], J["+nj+"]");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(ni == i && nj == j){
                    System.out.println(" - Your Search Result: " + arr[ni][nj]);
                    break;
                }
            }
        }
        System.out.println(" -----------------[Question]---------------- ");
        System.out.println(" - Do you need to update value of this index?");
        System.out.print(" => Enter(yes/no): ");
        String opts = cin.next();
        System.out.println(" ---------------[Information]--------------- ");
        switch (opts){
            case "yes":
                System.out.println(" - Index of I["+ni+"], J["+nj+"]");
                for(int i = 0; i < arr.length; i++){
                    for(int j = 0; j < arr[i].length; j++){
                        if(ni == i && nj == j){
                            System.out.println(" - Value: " + arr[ni][nj]);
                            break;
                        }
                    }
                }
                System.out.println(" ---------------[Enter Value]--------------- ");
                System.out.print(" => Input new value to update: ");
                int uval = cin.nextInt();
                arr[ni][nj] = uval;
                System.out.println(" ------------------------------------------- ");
                System.out.println(" Messages: 'Update success!'");
                System.out.println(" ---------------[Last Result]--------------- ");
                for(int i = 0; i < arr.length; i++){
                    for(int j = 0; j < arr[i].length; j++){
                        System.out.println("    Array: " + arr[i][j] + "[" + i + "]["+ j +"]");
                    }
                }
                System.out.println(" ------------------------------------------- ");
                System.out.println(" Thank you!");
                break;
            case "no":
                System.out.println("Thank you for using, Bye!\n[Exited]");
                break;
            default:
                System.out.println("N/A!");
                break;
        }
    }
}