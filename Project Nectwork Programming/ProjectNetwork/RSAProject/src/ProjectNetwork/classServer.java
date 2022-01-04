
package ProjectNetwork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import static ProjectNetwork.Server.txtAreaServer;

/**
 *
 * @author Emad
 */
public class classServer {
    private static ServerSocket serverSocket;
    private static final int port =1234;
    private static FileWriter fw;
    static  ClassClient1 c1;
    static  ClassClient2 c2;


    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(port);
            c1 = new ClassClient1();
            c2 = new ClassClient2();
            
            
            do {
                Socket client =serverSocket.accept();
                System.out.println("New Client Accept");
                //Server.txtAreaServer.append("New Client Accept\n");
                ClientHander h = new  ClientHander(client);
                h.start();
            }
            while (true);

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            System.exit(1);
        }

    }
    public static void openfile()
    {
        try{
            //fw=new FileWriter("C:\\Users\\A\\Desktop\\Server.txt",true);
        }
        catch(Exception ex)
        {
            System.out.println("unable to open file");
        }
    }
    
    public static void write_msg(String msg)
    {
        try{
            openfile();
            fw.append(msg);
            fw.append("\n");
            fw.close();
        }
        catch(Exception ex)
        {
            System.out.println("unable to write a msg");
        }
    }
    
    public static String getall()
    {
        String s="";
        int ch;
  
        // check if File exists or not
        FileReader fr=null;
        try
        {
            fr = new FileReader("E:\\output1.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
  try{
        // read from FileReader till the end of file
        while ((ch=fr.read())!=-1)
            s+=(char)ch;
  
        // close the file
        fr.close();
  }
  catch(Exception ex)
  {
      
    }
  return s;
    }
    
    
}
