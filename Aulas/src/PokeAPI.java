package Aulas.src;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PokeAPI {
    public static void main(String[] args) {
        try {
            // Abertura do Scanner
            Scanner sc = new Scanner(System.in);
            //Escolher o Pokemon
            String nomePokemon = JOptionPane.showInputDialog("Escreva o nome do Pokemón desejado: ");
            // URL da API do PokeAPI
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + nomePokemon);
            // Abrir conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Obter a resposta da API
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Exibir a resposta
                System.out.println(response.toString());
            } else {
                System.out.println("Erro na conexão: " + responseCode);
            }

            // Fechar a conexão
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
