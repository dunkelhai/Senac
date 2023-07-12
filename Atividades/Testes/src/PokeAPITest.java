import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class PokeAPITest {

    @Test
    public void testPokeAPIConnection() {
        try {
            // URL da API do PokeAPI
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/1");

            // Abrir conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Obter a resposta da API
            int responseCode = connection.getResponseCode();
            Assertions.assertEquals(HttpURLConnection.HTTP_OK, responseCode, "Status code is not 200");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Verificar se a resposta contém os dados esperados
            Assertions.assertTrue(response.toString().contains("bulbasaur"), "Response does not contain expected data");

            // Fechar a conexão
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
            Assertions.fail("Exception occurred");
        }
    }
}
