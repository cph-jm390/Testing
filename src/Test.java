import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public void fileReaderChance() throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/test.txt"));

        String line = "";
        while (s.hasNext()) {

            line=s.nextLine();
            line.split("-");


            Main.chanceCard.add(line);
        }
        s.close();
        /*for (int i = 0; i < Main.chanceCard.size() - 1; i++) {
            System.out.println(Main.chanceCard.get(i));*/
        ) {
                for(String str : arr){
                System.out.println(str);
            }
        }
        }


    }

