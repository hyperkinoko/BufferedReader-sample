package custom_sandwich;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        // br.readLine()は例外を投げるので、try-catchしないとだめ
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str1 = br.readLine();
            String[] stringArray = str1.split(" ");
            int ham = Integer.parseInt(stringArray[0]);
            int lettuce = Integer.parseInt(stringArray[1]);

            String size = ham + lettuce >= 100 ? "Large" : "Regular";
            String vegi = ham < lettuce ? "Vegi" : "Ham";

            // printfを使うとスムーズ
            System.out.printf("%s-%s-Sand", size, vegi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
