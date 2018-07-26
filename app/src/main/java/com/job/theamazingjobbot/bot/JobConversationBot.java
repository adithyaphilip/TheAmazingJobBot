package com.job.theamazingjobbot.bot;

import android.os.AsyncTask;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import javax.net.ssl.HttpsURLConnection;

public class JobConversationBot implements ConversationBot {

    private UUID mIdentifier = UUID.randomUUID();

    @Override
    public BotResponse GetMessage(String userMessage) {
        BotResponseImpl responseObj = null;
        String responseString = null;
        try {
            URL url = new URL("http://localhost:18000");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            if (conn.getResponseCode() == HttpsURLConnection.HTTP_OK) {
                String response = new Scanner((InputStream) conn.getContent()).nextLine();
                responseObj = new BotResponseImpl(response);
            } else {
                throw new IOException("Request error");
            }
        } catch (IOException e) {
            Log.e("REQUEST", "IOERROR");
        }
        return responseObj.;
    }
}
