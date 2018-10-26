
import java.util.ArrayList;

public class IpAddress {

    boolean tr = true;

    public void getIpAddresses(ArrayList<String> list, String ip1, String ip2) {
        for (int j = 0; j < list.size(); j++) {
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

}
