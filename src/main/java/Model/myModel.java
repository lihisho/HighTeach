package Model;

import java.util.LinkedList;
import java.util.List;
import  com.google.gson.*;

public class myModel {

    /**
     * Gets username and password and tries to login to the system.
     * @param userName  represents the username of the user to check.
     * @param password  represents the password of the user to check.
     * @return          returns true if succeeded, false otherwise.
     */
    public boolean login(String userName, String password){
        List<List<>>
        Gson x= {"userName: userName", "password: password"};

        return output;
    }

    public List<Teacher> searchTeacher(String courseName, String firstName, String lastName, int price){
        List<Teacher> output = new LinkedList<>();


        return output;
    }

    JSONObject json = new JSONObject();
json.put("someKey", "someValue");

    CloseableHttpClient httpClient = HttpClientBuilder.create().build();

try {
        HttpPost request = new HttpPost("http://yoururl");
        StringEntity params = new StringEntity(json.toString());
        request.addHeader("content-type", "application/json");
        request.setEntity(params);
        httpClient.execute(request);
// handle response here...
    } catch (Exception ex) {
        // handle exception here
    } finally {
        httpClient.close();
    }
}
