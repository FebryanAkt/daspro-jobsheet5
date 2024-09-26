import java.util.Scanner;
public class If10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);;
        String dayType;
        byte angkaHari;

        System.out.print("Masukkan angka hari: ");
        angkaHari = sc.nextByte();

        switch (angkaHari) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType ="weekday";
                break;
            case 6:
            case 7:
                dayType ="weekend";
                break;
            default:
                dayType = "invalid day name";
        }
        System.out.println(angkaHari + " is a " + dayType);
    }
}
