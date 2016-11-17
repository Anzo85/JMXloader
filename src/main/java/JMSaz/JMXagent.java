package JMSaz;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by anzo0316 on 11/17/2016.
 */
public class JMXagent {
    public static void main(String[] args) throws Exception {


        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        URLloaderMBean urLloader = new URLloader("C:/Users/anzo0316/Documents/azTrancferTest.html", "http://anzo-org-ua.1gb.ua/Login-calculator/index.jsp");
        platformMBeanServer.registerMBean(urLloader, new ObjectName("test:name=ANZO"));

        Thread.sleep(50000);

        urLloader.download();


    }
}
