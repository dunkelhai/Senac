import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.io.*;
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
                // Ler a resposta da API
                StringBuilder response = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                }

                // Tratar o JSON utilizando o Jackson
                ObjectMapper mapper = new ObjectMapper();
                JsonNode jsonNode = mapper.readTree(response.toString());

                // Salvar o JSON em um arquivo de texto
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("pokemon.json"))) {
                    writer.write(jsonNode.toString());
                }

                System.out.println("JSON salvo com sucesso!");
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