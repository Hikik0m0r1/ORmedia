package lesson3;

public class LessonTask1 {

	public static void main(String[] args) {
		String line1 = "line";
		String line2 = "line";
		String line3 = new String ("line");
		System.out.println(line1==line2);
		System.out.println(line1==line3);

	}

}
        //Java сравнивает ссылки, ссылки первых двух строчек одинаковы, поэтому Java и выдает тру,
        //а при команде new, Java создает новый обЪект с новой ссылку и при сравнение ссылок выдет фальш.