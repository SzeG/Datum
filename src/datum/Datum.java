/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author gszemere
 */
public class Datum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String str = "1986-04-08 12:30";
    Scanner sc=new Scanner(System.in);
   // str=sc.nextLine();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        System.out.println(dateTime);
    }
    
}
