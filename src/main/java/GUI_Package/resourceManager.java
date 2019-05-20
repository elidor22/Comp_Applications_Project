package GUI_Package;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class resourceManager {

public static void save(Serializable data, String filename) throws Exception{

    try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(filename)))){
    oos.writeObject(data);

    }

}


public static Object load(String filename) throws Exception{
    try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(filename)))){
        return ois.readObject();

    }



    }

}