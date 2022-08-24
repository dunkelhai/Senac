package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Porgram2 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        String path = "/Users/Alysson/Texto/in2.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: " + x);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
