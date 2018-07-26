package com.job.theamazingjobbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.job.theamazingjobbot.Messages.BotMessage;
import com.job.theamazingjobbot.Messages.UserMessage;
import com.job.theamazingjobbot.bot.BotResponseImpl;
import com.job.theamazingjobbot.bot.ConversationBot;
import com.job.theamazingjobbot.bot.JobConversationBot;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView messagesView;
    private EditText editText;
    private MessageViewAdapter mAdapter;
    private ConversationBot mBot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBot = new JobConversationBot();

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

        mAdapter.addMessage(new BotMessage(mBot.GetMessage("").GetText().get(0)));
    }

    private void sendMessage() {
        mAdapter.addMessage(new UserMessage(this.editText.getText().toString()));
        this.editText.setText("");
        List<String> responses = mBot.GetMessage("").GetText();
        for(String e: responses) {
            mAdapter.addMessage(new BotMessage(e));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(this, "Resume uploaded", Toast.LENGTH_SHORT).show();
        mAdapter.addMessage(new UserMessage("Sent: Resume"));
        List<String> responses = mBot.GetMessage("").GetText();
        for(String e: responses) {
            mAdapter.addMessage(new BotMessage(e));
        }
    }

    private void askForFile() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        startActivityForResult(intent, 100);
    }


}
