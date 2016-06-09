/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms;

import java.util.Scanner;

/**
 *
 * @author onesoft
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String[] names = new String[10];
        //int counter = 0;
        Scanner input = new Scanner(System.in);
        
        StudentDAOImpl std = new StudentDAOImpl(input);

         std.controller();
    }
}