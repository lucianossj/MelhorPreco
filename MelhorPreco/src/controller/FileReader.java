package controller;

import datastructures.LinkedList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.Establishment;

public class FileReader {

    public static LinkedList<Establishment> getEstsData() {

        Path path = Paths.get(System.getProperty("user.dir") + "\\others\\datapoa-comercios.txt");

        try {

            byte[] text = Files.readAllBytes(path);

            String estsData = new String(text);

            String[] estsDataArray = estsData.split(";");

            LinkedList<Establishment> establishments = new LinkedList();

            String[] allData;

            for (int i = 0; i < estsDataArray.length; i++) {

                Establishment establishment = new Establishment();

                allData = estsDataArray[i].split(",");

                establishment.setEstablishment(allData[0]);
                establishment.setAdress(allData[1]);

                establishments.append(establishment);

            }

            return establishments;

        } catch (IOException | NumberFormatException error) {

            System.out.print(error);

            return null;

        }

    }

}
