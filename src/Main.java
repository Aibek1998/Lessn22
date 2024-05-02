import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        FileWriter fileWriter = new FileWriter("Алфавит.txt");
        fileWriter.write("1-Aa"+"\n"+
                "2-Bb" +"\n"+
                "3-Cc" +"\n"+
                "4-Dd" +"\n"+
                "5-Ee" +"\n"+
                "6-Ff" +"\n"+
                "7-Gg" +"\n"+
                "8-Hh" +"\n"+
                "9-Ii" +"\n"+
                "10-Jj" +"\n"+
                "11-Kk" +"\n"+
                "12-Ll" +"\n"+
                "13-Mm" +"\n"+
                "14-Nn" +"\n"+
                "15-Oo" +"\n"+
                "16-Pp" +"\n"+
                "17-Qq" +"\n"+
                "18-Rr" +"\n"+
                "19-Ss" +"\n"+
                "20-Tt" +"\n"+
                "21-Uu" +"\n"+
                "22-Vv" +"\n"+
                "23-Ww" +"\n"+
                "24-Xx" +"\n"+
                "25-Yy" +"\n"+
                "26-Zz" +"\n"+
                "27- 0" +"\n"+
                "28-1" +"\n"+
                "29-2" +"\n"+
                "30-3" +"\n"+
                "31-4" +"\n"+
                "32-5" +"\n"+
                "33-6" +"\n"+
                "34-7" +"\n"+
                "35-8" +"\n"+
                "36-9"+"\n"+
                "37-0");
        fileWriter.close();
        FileReader fileReader = new FileReader("Алфавит.txt");
        Scanner scanner = new Scanner(new FileReader("Алфавит.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}