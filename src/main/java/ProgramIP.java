import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProgramIP {
    public static void main(String[] args) {

        IpAddress ipAd = new IpAddress();

        String ip1, ip2;

        ArrayList<String> list = new ArrayList<String>(256);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=1; i <= 256; i++) {
            list.add("192.168.0." + i);
        }

        try {

            while (ipAd.tr) {
                System.out.println("Введите ip адреса в формате 192.168.0.? (где '?' > 0 < 256): ");

                ip1 = reader.readLine();
                ip2 = reader.readLine();

                ipAd.getIpAddresses(list,ip1,ip2);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } catch (IndexOutOfBoundsException ee) {
            System.out.println("Неправильный формат!");
        }
    }
}
