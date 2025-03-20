import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class ApiHelper {
    public static boolean isAudiObjectPresent(Response response) {
        boolean result = false;
        List<Map<String, Object>> carsList = response.jsonPath().getList("data");
        for (Map<String, Object> carsProperties : carsList) {
            if (carsProperties.get("id").toString().equals("1")
                    && carsProperties.get("title").toString().equals("Audi")) {
                result = true;
                break;
            }
        }
        return result;
    }
}
