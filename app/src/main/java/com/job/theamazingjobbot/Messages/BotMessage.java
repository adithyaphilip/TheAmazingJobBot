package com.job.theamazingjobbot.Messages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.job.theamazingjobbot.R;

public class BotMessage extends Message{
  public BotMessage(String text) {
    super(text);
  }

  @Override
  public View getAssociatedView(LayoutInflater inflater, ViewGroup group) {
    View botMessage = inflater.inflate(R.layout.user_message, null);
    TextView textView = botMessage.findViewById(R.id.user_message_view);
    textView.setText(this.getText());
    return botMessage;
  }
}
