package Model;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class myModel {

    /**
     * Gets username and password and tries to login to the system.
     * @param userName  represents the username of the user to check.
     * @param password  represents the password of the user to check.
     * @return          returns true if succeeded, false otherwise.
     */
    public boolean login(String userName, String password){
        String function = "/login";
        JSONObject jsonToServer = new JSONObject();
        try {
            jsonToServer.put("user_name", userName);
            jsonToServer.put("password", password  );
        }catch(Exception e) {

        }
        jsonToServer = sendingToServer(jsonToServer, function);
        try {
            String answerUserName = jsonToServer.getString("user_name");
            String answerUserFirstName = jsonToServer.getString("first_name");
            String answerUserLastName = jsonToServer.getString("last_name");
            if (answerUserName == "" || answerUserFirstName == "" || answerUserLastName == "" ){
                return false;
            }
        }catch (Exception e){

        }
        return false;
    }

//    public List<Teacher> searchTeacher(String courseName, String firstName, String lastName, int price){
//        List<Teacher> output = new LinkedList<>();
//
//
//        return output;
//    }
    public JSONObject sendingToServer(JSONObject jsonToDB, String function) {
        JSONObject output = new JSONObject();
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        try {
            try {
                HttpPost request = new HttpPost("http://132.73.206.196"+function);
                StringEntity params = new StringEntity(jsonToDB.toString());
                request.addHeader("content-type", "application/json");
                request.setEntity(params);
                httpClient.execute(request);

            } catch (Exception e) {
                // handle exception here
            } finally {
                httpClient.close();
            }
        }catch (IOException e){

        }

        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost("http://132.73.206.196"+function);

            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add(new BasicNameValuePair("action", "getjson"));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            HttpResponse response = httpclient.execute(httppost);
            String json_string = EntityUtils.toString(response.getEntity());
             output = new JSONObject(json_string);
        }catch(IOException e){

        } catch (JSONException e) {

        }
        return output;
    }

    public static void main(String[] args){
        myModel hi = new myModel();
        boolean flag = false;
        flag = hi.login("nimrod", "nimrod");
        System.out.println(flag);
    }
}
