
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IpAddress {

    public static void main(String[] args) {

        boolean tr = true;

        String ip1, ip2;

        ArrayList<String> list = new ArrayList<String>(256);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=1; i <= 256; i++) {
            list.add("192.168.0." + i);
        }

        try {

            while (tr) {
                System.out.println("Введите ip адреса в формате 192.168.0.? (где '?' > 0 < 256): ");

                ip1 = reader.readLine();
                ip2 = reader.readLine();

                for (int j=0; j<list.size();j++) {
                    if (ip1.equals(list.get(j))) {
                        System.out.println("Диапозон доступных ip адресов: ");
                        while (!(list.get(j + 1).equals(ip2))) {
                            System.out.println(list.get(j + 1));
                            j++;
                        }
                        tr = false;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        } catch (IndexOutOfBoundsException ee) {
            System.out.println("Неправильный формат!");
        }

    }
}
