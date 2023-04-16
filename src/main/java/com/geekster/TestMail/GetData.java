package com.geekster.TestMail;

import com.geekster.TestMail.Controller.StudentController;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetData {

    StudentController std = new StudentController();

    public String sendData() throws Exception {
        URL getUrl = new URL("http://localhost:8080/student");
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        connection.setRequestMethod("GET");
        int respondCode = connection.getResponseCode();
        if (respondCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder responseData = new StringBuilder();
            String readLine = null;
            while ((readLine = in.readLine()) != null) {
                responseData.append(readLine);
            }
            in.close();
            return responseData.toString();
        }
        return "This is not valid url "+respondCode;
    }
}
