import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MathExpressionEvaluator {
    private static final String API_ENDPOINT = "http://api.mathjs.org/v4/";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String expression;
            while (!(expression = reader.readLine()).equals("end")) {
                String result = evaluateExpression(expression);
                System.out.println(expression + " = " + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String evaluateExpression(String expression) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(API_ENDPOINT + "?expr=" + expression))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
            return "Evaluation error";
        }
    }
}












