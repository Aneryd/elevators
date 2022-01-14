import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите этаж: ");
        Scanner scanner = new Scanner(System.in);
        Integer floor = scanner.nextInt();

        Integer[] elev = Elevator.elev(floor);
        for(int i = 0; i<elev.length; i++){
            System.out.println(elev[i]);
        }
    }
}
