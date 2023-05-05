package IA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.*;

public class ChatGPT {
 public static void main(String[] args) throws Exception {
            String token = "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";
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
            JsonObject responseJson = JsonParser.parseString(content.toString()).getAsJsonObject();
            String answer = responseJson.getAsJsonArray("choices").get(0).getAsJsonObject().get("text").getAsString();
            System.out.println("Answer: " + answer);
        }
    }