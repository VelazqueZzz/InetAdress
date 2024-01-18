
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressMain {
    public static void main(String[] args) {
        InetAddress currentIp;
        InetAddress yaIp;
        InetAddress ramblerIp;
        InetAddress googleIp;
        try{
            currentIp = InetAddress.getLocalHost();
            System.out.println("current IP-> "+currentIp.getHostAddress());
            System.out.println();
            yaIp = InetAddress.getByName("ya.ru");
            System.out.println("ya IP adress -> " + yaIp.getHostAddress());

            ramblerIp = InetAddress.getByName("rambler.ru");
            System.out.println("rambler IP adress -> " + ramblerIp.getHostAddress());

            googleIp = InetAddress.getByName("google.com");
            System.out.println("google IP adress -> " + googleIp.getHostAddress());
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
