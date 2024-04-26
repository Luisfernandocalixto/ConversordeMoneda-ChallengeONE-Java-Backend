import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarConversion {

    public Conversion realizaConversion(double cantidadConversion, String conversionCode, String conversionResult) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/38b695bd40b86b3ec20b3ea6/pair/" + conversionCode + "/" + conversionResult + "/" + cantidadConversion);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("No pude realizar la conversion " + e.getMessage());
        }

    }

}
