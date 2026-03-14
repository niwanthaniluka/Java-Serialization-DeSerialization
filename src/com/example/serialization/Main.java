package com.example.serialization;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        String fileName = "employee.ser";
        Employee e1 = new Employee("Niwantha", 25);


        //Serialization(Object->File)
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(e1);
            System.out.println("Serialized successfully to:" + fileName);

        } catch (Exception e) {
            e.printStackTrace();
        }


        //Deserialization(File->Object)
        try (FileInputStream fileIn = new FileInputStream(fileName); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Employee e2 = (Employee) in.readObject();
            System.out.println("Deserialized successfully!");
            System.out.println("Value of Name: " + e2.getName());
            System.out.println("Value of Age: " + e2.getAge());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
