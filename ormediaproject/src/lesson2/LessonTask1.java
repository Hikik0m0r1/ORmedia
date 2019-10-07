package lesson2;

public class LessonTask1 {

	public static void main (String[] args){
	    int field[][] = new int[3][3];
	    field[0][0] = 1;
	    field[0][1] = 2;
	    field[1][0] = 3;
	    field[1][1] = 4;
	    for (int i = 1;i<3;i++){
	    while(true){ 
	    int y = random(0, field.length-2);
	    int x = random(0, field[0].length-2);
	    if(isFree(field,x,y)){
	    place(field,x,y, i);
	    break;
	    
	    }
	    }
	    }
	   show(field);
	    

	}
	
	public static void show(int[][]array){
		  for(int row=0;row<array.length;row++){
		    for(int col=0;col<array[row].length;col++){
		      System.out.print(array[row][col]+"  ");
		    }
		    System.out.println();
		  }
	}
		  
	  public static int random(int min,int max){
		    return (int)(Math.random()*(max-min+1)+min);
		  }

	  static boolean isFree(int[][] field,int x,int y){
	    return(field[y][x]==0&&field[y+1][x]==0&&field[y][x+1]==0&&field[y+1][x+1]==0);
	  }
	    static void place(int[][] field,int x, int y, int value){
	      field[y][x] = value;
	      field[y+1][x] = value; 
	      field[y][x+1] = value;
	      field[y+1][x+1] = value;
	    }
	}
