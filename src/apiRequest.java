import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class apiRequest {

    private static final String API_KEY = "f0bb8b2bdc650f9144b7e415";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public conversor convesorMoeda(String baseCode, String targetCode) throws IOException, InterruptedException {
        URI endereco = URI.create(API_URL + baseCode + "/" + targetCode);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        JsonObject jsonObject = new Gson().fromJson(json, JsonObject.class);
        double conversionRate = jsonObject.get("conversion_rate").getAsDouble();

        return new conversor(baseCode, targetCode, conversionRate);
    }
}