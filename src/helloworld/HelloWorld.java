/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author lynnh
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        	System.out.println("Current Time is: ");
		String str = null;
		System.out.print(CurrentDateTime(str));

	}

	public static LocalDateTime CurrentDateTime(String str) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
                
		return now;
	}
		
}
