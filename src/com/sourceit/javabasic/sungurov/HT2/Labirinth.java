package com.sourceit.javabasic.sungurov.HT2;

import java.util.Scanner;

//import com.sourceit.javabasic.sungurov.HT7.Directions;

public class Labirinth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Victim Vic1 = new Victim ();	
		Victim Vic2 = new Victim ();
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("�������� ������: 1 - ����, 2 - ����� -");
		
		byte choice = in.nextByte();
		
		switch (choice) {
		case 1:	
			Vic1.DoInPlayer("����", 45, "�������");	
			break;

		case 2:	
			Vic2.DoInPlayer("�����", 78, "�������");
				break;	
			
		default:
			break;
		
		}
				
		Directions Direc = new Directions ();
		
		int i=1;
		int exit = 0;
	
		do {
		System.out.println("�������� �����������: 1 - ������, 2 - ������, 3 - ������, 4 - �����");
		choice = in.nextByte();
		
		switch (choice) {
		case 1:	
		Direc.ToRight();	
			break;

		case 2:	
			Direc.ToLeft();	
				break;	
			
		case 3:	
			Direc.Towards();	
				break;	
			
		case 4:	
			Direc.Back();	
			exit ++;
			break;	
				
		}
		
		i++;
		
		if (exit==1) 
			{break;}
		else exit ++;
		
		exit++;
		} while (i!=5 && exit !=0);
		
		System.out.println("�����������!!! �� ����� �� ���������!!!");
	}

}
