package com.job.theamazingjobbot;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.job.theamazingjobbot.Messages.Message;
import com.job.theamazingjobbot.Messages.UserMessage;
import java.util.ArrayList;
import java.util.List;

public class MessageViewAdapter extends BaseAdapter {

  private LayoutInflater inflater;
  private List<Message> messages;
  private static final String TAG = "Adapter";

  public MessageViewAdapter(LayoutInflater inflater) {
    this.inflater = inflater;
    this.messages = new ArrayList<>();
  }

  @Override
  public int getCount() {
    return this.messages.size();
  }

  @Override
  public Object getItem(int i) {
    return this.messages.get(i);
  }

  @Override
  public long getItemId(int i) {
    return (long)i;
  }

  @Override
  public View getView(int i, View view, ViewGroup viewGroup) {
    return this.messages.get(i).getAssociatedView(this.inflater, viewGroup);
  }

  public void addMessage(Message message) {
    this.messages.add(message);
    this.notifyDataSetChanged();
    Log.v(TAG, "Added message");
  }
}
