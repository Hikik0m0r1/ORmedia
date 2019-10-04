package HiLo;

import java.util.Scanner;

public class Hilo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min=0;
		int max=0;
		System.out.println("Введите минимальное число.");
		min = scan.nextInt();
		System.out.println("Число "+ min + " принято.");
		System.out.println();
		System.out.println("Введите максимальное число.");
		max = scan.nextInt();
		System.out.println("Число "+ max + " принято.");
		int number=random(min, max);
		System.out.println(number);
		int guess = 0;
		while (guess != number) {
		System.out.println("А теперь угадай какое число я выбрал от " + min +  " до " + max +  " :");
		guess = scan.nextInt();
		System.out.println("Вы ввели " + guess + ".");
		if (guess < number)
	    System.out.println("Мое число больше. Попробуйте еще раз.");
		if (guess > number)
		System.out.println("Мое число меньше. Попробуйте еще раз.");
		}
	System.out.println("Поздравляю!!! Вы угадали число!!! ");
	

	}

	public static int random(int min,int max){
		return (int)(Math.random()*(max-min+1)+min);
	}
	
}
