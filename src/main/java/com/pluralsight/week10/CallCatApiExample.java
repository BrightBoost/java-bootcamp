package com.pluralsight.week10;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.*;

public class CallCatApiExample {
    public static void main(String[] args) throws IOException {
        String statuscode = "303";
        URL url = new URL("https://http.cat/" + statuscode);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            BufferedImage image = ImageIO.read(connection.getInputStream());
            ImageIO.write(image, "jpeg", new File("cat" + statuscode + ".jpg"));

        }

    }
}
