package com.job.theamazingjobbot.bot;


import android.view.View;

import java.util.Arrays;
import java.util.List;

public class BotResponseImpl implements BotResponse {
    private List<String> mResponseText;
    private View mResponseView;

    public BotResponseImpl(String... responseTxt) {
        mResponseText = Arrays.asList(responseTxt);
    }

    public BotResponseImpl(List<String> responseTxt, View responseView) {
        mResponseText = responseTxt;
        mResponseView = responseView;
    }

    @Override
    public View GetView() {
        return mResponseView;
    }

    @Override
    public List<String> GetText() {
        return mResponseText;
    }
}
