/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjectNetwork;

/**
 *
 * @author Emad
 */
public class ProjrectMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Server server = new Server();
        Client1 client1 = new Client1();
            server.setVisible(true);
            client1.setVisible(true);
             Client2 client2 = new Client2();
            client2.setVisible(true);
            
            client1.setLocation(10, 110);
            server.setLocation(520, 110);
            client2.setLocation(930, 110);
            
    }
    
}
