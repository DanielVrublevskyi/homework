import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class ApiHelper {
    public static boolean isBrandObjectPresent(Response response, int id, String title) {
        boolean result = false;
        List<Map<String, Object>> carsList = response.jsonPath().getList("data");
        for (Map<String, Object> carsProperties : carsList) {
            if (carsProperties.get("id").toString().equals(String.valueOf(id))
                    && carsProperties.get("title").toString().equals(title)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
