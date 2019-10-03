package lesson1;

import java.util.Arrays;

public class Lesson1Task3 {
	

	public static void main(String[] args) {
		int array[] = randomArray(20,2,15);
		int array2[] = randomArray(10,4,10);
		int number = 2;
		int index = indexOfMaxDifference(array);
		show(array);
		System.out.println("Первый массив");
		replace(array,1,5);
		show2(array2);
		sort(array,true);	
		show(array);
		System.out.println("Первый массив отсортированный");
		
		show1(cutAndMerge(array,array2,false));
		System.out.println("Сумма четных элементов первого массива : "+oddEvenSum(array,true));
		System.out.println("Сумма нечетных элементов первого массива : "+oddEvenSum(array,false));
		System.out.println("Число в первом массиве "+number+ " встречалось максимум "+maxSequence(array,number)+" раз подряд");
		System.out.print("Максимальная разница между элементами первого массива " + (index+1) + "-м и " + (index + 2) + "-м элементами");
		}
	public static int random(int min,int max){
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static int[] randomArray(int length, int min,int max){
		int[] array = new int[length];
		for (int i=0;i<array.length;i++)array[i]=random(min,max);
		return array;
	}

	public static void show(int[] array){
		for(int i=0;i<array.length;i++){
			
			System.out.print(array[i]+" ");
		}
		
	}

	public static void show2(int[] array2){
		for(int i=0;i<array2.length;i++){
			
			System.out.print(array2[i]+" ");
		}
		System.out.println("Третий массив");
	}
	
	public static void show1(int[] array){
		for(int i=0;i<array.length;i++){
			
			System.out.print(array[i]+" ");
		}
		System.out.println("Новый массив из первого и третьего массива");
	}
	
	
	
	public static int oddEvenSum(int[]array, boolean odds){
		int oddEvenSum = 0;
		if ( odds == true) {
			for(int i=0;i<array.length;i++){
				   if (array[i] % 2 == 0) 
		                oddEvenSum +=array[i];
        }
		}
		if (odds == false) {
        for(int i=0;i<array.length;i++){
				   if (array[i] % 2 == 0){
					   
				   }
					   else {
						   oddEvenSum +=array[i];;
			            }
		                
        }
			                
		}
			   
		return oddEvenSum;
	}
	public static int maxSequence(int[] array,int number){
		int maxSequence = 0;
		for(int i=0;i<array.length;i++){
			if (array[i] == number)
				maxSequence += +1;{
					
				}
		}
	
		return maxSequence;
		
	}
	
	public static int indexOfMaxDifference(int[] array) {
		int diff = 0;
		int index = 0;
		for (int i = 0; i < array.length - 1; i++) {
			int temp = Math.abs(array[i + 1]) - Math.abs(array[i]);
			if (Math.abs(temp) > diff) {
				diff = temp;
				index = i;
			}
		}
		return index;
	}
	/*
	 Нашел этот метод у вас на гитхабе, но его пришлось переделать, так как при появлении
	 элементов с отрицательными значениями джава выдавала неправильный ответ.
	 Решилось все добавлением модуля к переменным которые в процессе обработки могли быть отрицательными.
	 Но почему то когда джава модуль числа отнимает от модуля ноля, то происходит что то типо того.
	 Например массив -9,0,-8. То он покажет что наибольшая разница между 2 и 3 элементом.
	 */
	
	public static void replace(int[]array, int toReplace, int replaceTo){
		int[] array1 = Arrays.copyOf(array, array.length);
		for(int i=0;i<array1.length;i++){
			if(array1[i]==toReplace)
				array1[i]=replaceTo;
			}
        for(int i=0;i<array1.length;i++){
			
			System.out.print(array1[i]+" ");
		}
        System.out.println("Второй массив");
	}	
	/*
	 Решил сделать поинтереснее. Идея была такой что бы первый массив оставался неизмееный,
	 но в консоль выводился массив с замененными числами.
	 */
	public static void sort(int[] array, boolean fromMinToMax){
		Arrays.sort(array);
		if(!fromMinToMax){
			int[]temp = new int[array.length];
			for(int i=0;i<array.length;i++)
			temp[i]=array[array.length-1-i];
			for(int i=0;i<array.length;i++)
			array[i]=temp[i];
		}
		
	}	
	
	public static int[] cutAndMerge(int[]array, int[]array2, boolean max){
		int length = array.length>array2.length?array2.length:array.length;
		int result[] = new int[length];
		for(int i=0;i<length;i++){
			if(max){
				if(array[i]>array2[i]){
					result[i] = array[i];
				}else result[i] = array2[i];
			}else{
				if(array[i]<array2[i]){
					result[i] = array[i];
				}else result[i] = array2[i];
			}
		}
		return result;
	}
		}
			




