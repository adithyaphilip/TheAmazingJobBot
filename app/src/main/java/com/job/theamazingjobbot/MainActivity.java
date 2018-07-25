package com.job.theamazingjobbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import com.job.theamazingjobbot.Messages.UserMessage;

public class MainActivity extends AppCompatActivity {

    private ListView messagesView;
    private EditText editText;
    private MessageViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messagesView = findViewById(R.id.message_list);
        mAdapter = new MessageViewAdapter(getLayoutInflater());
        messagesView.setAdapter(mAdapter);

        editText = findViewById(R.id.edittext_chatbox);
        Button send = findViewById(R.id.button_chatbox_send);
        Button fileAttach = findViewById(R.id.file_attach);

        send.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });

        fileAttach.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                askForFile();
            }
        });
    }

    private void sendMessage() {
        mAdapter.addMessage(new UserMessage(this.editText.getText().toString()));
    }

    private void askForFile() {
        //TODO: ask for file and then show toast in the callback
    }


}
