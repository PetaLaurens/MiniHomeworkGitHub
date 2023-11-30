/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomeworkgithub;

/**
 *
 * @author peta
 */
public class MiniHomeworkGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // I will print odd numbers from 1 to 50.
        System.out.println("See below odd numbers from 1 to 50: ");
        
        for (int num = 1; num <= 50; num++) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    
}
