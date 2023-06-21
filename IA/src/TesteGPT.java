package IA;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class TesteGPT {
    private final static String API_KEY = "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";

    public static void main(String[] args) {
        OpenAiService service = new OpenAiService(API_KEY);

        CompletionRequest request = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("Vale a pena comprar um MacBook?")
                .maxTokens(10)
                .temperature(0.0)
                .build();

        System.out.println(service.createCompletion(request).getChoices());

    }
}
