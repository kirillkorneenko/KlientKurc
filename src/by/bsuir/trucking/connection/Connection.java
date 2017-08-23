package by.bsuir.trucking.connection;

import by.bsuir.trucking.entity.Batch;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by ASUS on 17.04.2017.
 */
public class Connection extends Thread {

    public static Batch connection(Batch batch){
        Batch b= null;
        try{
        Socket socket= new Socket("localhost",9000);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

        outputStream.writeObject(batch);

        b = (Batch) inputStream.readObject();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return b;
    }
}
