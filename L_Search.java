/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algopractice;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class L_Search {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many number you want to input= ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter your " + n + " Value= ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Which Item you Want to search? ");
        int Search_data = input.nextInt();
        int position=-1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Search_data) {
                position=1;
                break;
            }

        }
        if (position!=-1){
            System.out.println(Search_data+" Data found At position "+(position+1));
        }
        else 
            System.out.println(Search_data+" Data not found in Arrray List");

    }

}
