/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nested;

import static java.lang.Double.max;

/**
 *
 * @author jerem
 */
public class Nested {
    public static void main(String[] args) {
        String[] Months = {"January", "February", "March"};
        String[] Cities = {"Johannesburg", "Durban", "CapeTown", "PortElizabeth"};

        // Each row = city, each column = month
        int[][] Speed = {
                {128, 135, 139}, // Johannesburg
                {155, 129, 175}, // Durban
                {129, 130, 185}, // CapeTown
                {195, 155, 221}  // PortElizabeth
        };

        System.out.println("*************************************************************************************************************");
        System.out.println("SPEED_REPORT_FOR_DIFFERENT_CITIES");
        System.out.println("*************************************************************************************************************");

        // Print header
        System.out.printf("%-18s", "");
        for (int i = 0; i < Months.length; i++) {
            System.out.printf("%-18s", Months[i]);
        }
        System.out.println();

        // Print rows
        for (int i = 0; i < Cities.length; i++) {
            System.out.printf("%-18s", Cities[i]);
            for (int j = 0; j < Months.length; j++) {
                System.out.printf("%-18d", Speed[i][j]);
            }
            System.out.println();
            
        }
        int max = Speed[0][0];
        int min = Speed[0][0];
        
        for(int i = 0;i<Cities.length;i++){
            for (int j = 0;j<Months.length;j++){
                if(Speed[i][j]>max){
                    max = Speed[i][j];
                }
                if(Speed[i][j]<min){
                    min = Speed[i][j];
                }
            }
            
        }
        System.out.println("********************************************************************************");
        System.out.println("SPEEDING_FINE_STATISTICS");
        System.out.println("**********************************************************************************");
        
        System.out.println("Maximum speed captured:" + max );
        System.out.println("Minimun speed captured:" + min );
        
        System.out.println("********************************************************************************");
       
    }
}