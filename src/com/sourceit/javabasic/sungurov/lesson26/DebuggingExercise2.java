package com.sourceit.javabasic.sungurov.lesson26;

class DebuggingExercise2
{ 
    public static void main(String[] args) 
    { 
        Account a = new Account ("deposit"); 
        a.deposit(100); 
        System.out.println(a.getOwner() + " has $" + a.getBalance()); 
    } 
}