package com.job.theamazingjobbot.Messages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.job.theamazingjobbot.R;

public class UserMessage extends Message{

  public UserMessage(String text) {
    super(text);
  }

  @Override
  public View getAssociatedView(LayoutInflater inflater, ViewGroup group) {
    View userMessage = inflater.inflate(R.layout.user_message, null);
    TextView textView = userMessage.findViewById(R.id.user_message_view);
    textView.setText(this.getText());
    return userMessage;
  }
}
