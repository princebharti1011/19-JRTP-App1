package com.wipro._loginApp;

import com.wipro.PasswordDecorder.service.PasswordService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PasswordService objService = new PasswordService();
        String encrypt = objService.encrypt("I love u purnima");
        System.out.println(encrypt);
        String decrypted = objService.decrypted(encrypt);
        System.out.println(decrypted);
    }
}
