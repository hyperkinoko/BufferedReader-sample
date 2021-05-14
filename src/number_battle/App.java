package number_battle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    // throws Exception でtry-catchから逃れることは可能
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();

        int n = Integer.parseInt(line1.split(" ")[0]);
        int k = Integer.parseInt(line1.split(" ")[1]);

        // for文よりかっこいい
        int[] a = Arrays.stream(line2.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 上記を普通にやるならこう
//        String[] line2Array = line2.split(" ");
//        int[] a = new int[line2Array.length];
//        for(int i = 0; i < line2Array.length; i++) {
//            a[i] = Integer.parseInt(line2Array[i]);
//        }

        int count = 0;
        for(int i = 0; i < a.length; i++) {
            while(a[i] % k == 0) {
                a[i] = a[i] / k;
                count++;
            }
        }
        System.out.println(count);
    }
}
