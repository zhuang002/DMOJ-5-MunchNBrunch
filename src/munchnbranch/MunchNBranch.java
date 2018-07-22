/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munchnbranch;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class MunchNBranch {
    static Scanner sc=new Scanner(System.in);
    static int[] priceOnYear={12,10,7,5};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0;i<10;i++) 
            doTestCase();
    }

    private static void doTestCase() {
        int totalCost=sc.nextInt()*2;
        double[] studentPercentage=new double[4];
        for (int i=0;i<studentPercentage.length;i++)
            studentPercentage[i]=sc.nextDouble();
        int noStudents=sc.nextInt();
        int priceSum=0;
        for (int i=0;i<studentPercentage.length;i++)
            priceSum+=(int)((double)noStudents*studentPercentage[i])*priceOnYear[i];
        if (totalCost>priceSum) 
            System.out.println("YES");
        else System.out.println("NO");
    }
    
}
