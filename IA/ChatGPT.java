package IA;
import java.net.*;
import java.io.*;
import org.json.*;

public class ChatGPT {
    public static void main(String[] args) throws Exception {
        String token = "seu_token_de_acesso_aqui";
        URL url = new URL("https://api.openai.com/v1/engines/davinci-codex/completions");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);
        String inputJson = "{\"prompt\": \"Qual é a capital do Brasil?\", \"max_tokens\": 1}";
        OutputStream os = con.getOutputStream();
        os.write(inputJson.getBytes());
        os.flush();
        os.close();
        int responseCode = con.getResponseCode();
        System.out.println("Response code: " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        JSONObject responseJson = new JSONObject(content.toString());
        String answer = responseJson.getJSONArray("choices").getJSONObject(0).getString("text");
        System.out.println("Answer: " + answer);
    }
}

