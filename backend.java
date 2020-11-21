
//import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class backend {
    int floor = 0;
    int roof = 0;

    public int genNumber() {
        int range = (this.roof - this.floor) + 1;
        return (int) (Math.random() * range) + this.floor;
    }

    public int askQuestion(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.print(question);
        int answer = sc.nextInt();
        return answer;
    }

    public void setBoundaries(int floor, int roof) {
        this.floor = floor;
        this.roof = roof;
    }

}
