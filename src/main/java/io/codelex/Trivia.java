package io.codelex;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class Trivia {

    public static void main(String[] args) throws Exception {
        try {
@Deprecated
            URL url = new URL("http://numbersapi.com/10..30/math?json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Something went wrong: " + connection.getResponseCode());
            }

            ArrayList<Object> list = new ArrayList<>();
            Scanner scan = new Scanner(url.openStream());
            while (scan.hasNext()) {
                list.add(scan.nextLine());
            }
            scan.close();

            TriviaQuestions.questions(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



