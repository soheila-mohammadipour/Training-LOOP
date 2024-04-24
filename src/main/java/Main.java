import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int erfahrungSystem = 4;
        int wunchGehaltSystem = 20;
        String zertifikatSystem = "b";
        boolean istNäheHausSystem;
        istNäheHausSystem = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("geben ihr Alt ein :");
        int alt = scanner.nextInt();
        System.out.println("geben ihr JahrErfahrung ein :");
        int erfahrung = scanner.nextInt();
        System.out.println("geben ihr wunschgehalt ein : ");
        int wunchGehalt = scanner.nextInt();
        System.out.println("geben ihr Zertifikat ein:");
        String zertifikat = scanner.next();
        System.out.println("ist ihr Haus nähe der Firmer :");
        boolean istNäheHaus = scanner.nextBoolean();


        if (zertifikat.equals(zertifikatSystem) && (alt > 22 && alt < 35 )&& erfahrung >= erfahrungSystem && wunchGehalt <= wunchGehaltSystem && istNäheHaus ==istNäheHausSystem ) {
                System.out.println("Sie können mit uns arbeiten");

            } else {
                System.out.println("Leider");
            }


    }
}