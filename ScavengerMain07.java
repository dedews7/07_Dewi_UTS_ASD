import java.util.Scanner;

public class ScavengerMain07 {
    public static void main(String[] args) {
        ScavengerHunt07 game = new ScavengerHunt07();

        game.addPoint("Apa nama ibukota Australia?", "Canberra");
        game.addPoint("Berapakah hasil 3 x 3?", "9");
        game.addPoint("Ayam punya berapa kaki?", "2");
        game.addPoint("Siapa nama main character anime Jujutsu Kaisen ?", "Yuji");

        game.displayPoints();

        Scanner sc = new Scanner(System.in);
        while (game.head != null) {
            System.out.print("Jawab: ");
            String answer = sc.nextLine();
            if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc.close();
    }
}

