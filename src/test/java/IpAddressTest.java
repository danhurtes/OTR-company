import java.util.ArrayList;

import static org.junit.Assert.*;

public class IpAddressTest {

    @org.junit.Test
    public void main() throws Exception {
        ArrayList<String> list = new ArrayList<String>(256);
        for (int i=1; i<=256; i++) {
            list.add("192.168.0." + i);
        }
        IpAddress ipAd = new IpAddress();

        ipAd.getIpAddresses(list,"192.168.0.1","192.168.0.5");

        assertFalse(ipAd.tr);

    }
}