package com.sourceit.javabasic.sungurov.lesson26;

class DebuggingExercise2
{ 
    public static void main(String[] args) 
    { 
        Account a = new Account ("Vasya"); 
        a.deposit(100); 
        System.out.println(a.getOwner() + " has $" + a.getBalance()); 
        
        a.withdraw(150); 
        System.out.println(a.getOwner() + " has $" + a.getBalance());
        
        Person D = new Person ("dfsdf", 15);
        System.out.println(D.getName());
        System.out.println(D.getAge());
        
    } 
}