package HiLo;

import java.util.Scanner;

public class Hilo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min=0;
		int max=0;
		System.out.println("������� ����������� �����.");
		min = scan.nextInt();
		System.out.println("����� "+ min + " �������.");
		System.out.println();
		System.out.println("������� ������������ �����.");
		max = scan.nextInt();
		System.out.println("����� "+ max + " �������.");
		int number=random(min, max);
		System.out.println(number);
		int guess = 0;
		while (guess != number) {
		System.out.println("� ������ ������ ����� ����� � ������ �� " + min +  " �� " + max +  " :");
		guess = scan.nextInt();
		System.out.println("�� ����� " + guess + ".");
		if (guess < number)
	    System.out.println("��� ����� ������. ���������� ��� ���.");
		if (guess > number)
		System.out.println("��� ����� ������. ���������� ��� ���.");
		}
	System.out.println("����������!!! �� ������� �����!!! ");
	

	}

	public static int random(int min,int max){
		return (int)(Math.random()*(max-min+1)+min);
	}
	
}
