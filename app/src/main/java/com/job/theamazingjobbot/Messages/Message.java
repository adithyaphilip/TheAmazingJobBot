package com.job.theamazingjobbot.Messages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class Message {
  private String text;

  public Message(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public abstract View getAssociatedView(LayoutInflater inflater, ViewGroup group);
}
