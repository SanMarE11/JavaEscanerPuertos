import java.net.*;
import java.util.Scanner;
public class Command{
    public static void main(String[] args) {
        String dirweb="";
        int [] port={80,443,21,990,14147,22,23,53,853,110,995,143,993,25,587,3306,101,111,445,951,1723,3074,3389,4662,4672,6881,6969,51400,4899,5400,5500,5600,5700,5800,5900,25565,53,514,1701,3306,8080,8005,25,79,105,106,110,143,2224};
        Scanner cin=new Scanner(System.in);
        System.out.println("Ingres host");
        dirweb=cin.nextLine();
        for(int i=0;i<port.length;i++){
            try{
                Socket con=new Socket();
                con.connect(new InetSocketAddress(dirweb,port[i]),3000);
                if(con.isConnected()){
                    System.out.println("Puerto Conectado: "+port[i]);
                }
            }catch(Exception e){
            }
        }
    }
}