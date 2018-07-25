package com.job.theamazingjobbot.bot;

public class JobConversationBot implements ConversationBot {

    private int mMessageCtr = 0;

    @Override
    public BotResponse GetMessage(String userMessage) {
        BotResponseImpl responseObj = null;
        switch (mMessageCtr) {
            case 0:
                responseObj = new BotResponseImpl("Hey, I'm the Amazing Job Bot! You can start by uploading your resume!");
                break;
            case 1:
                responseObj = new BotResponseImpl("Thanks! I just had some things to clarify so we can make sure it shines to recruiters." +
                        " I'm looking at your Mobile Wallet project right now. You mention that you worked on a 'mobile application'. What skills did you use for it? E.g. Android, iOS, Xamarin");
                break;
            case 2:
                responseObj = new BotResponseImpl("Great! You also mention that you worked on a 'database'. What skills did you use for it? E.g. MS SQL Server, MySQL, PostgresSQL");
                break;
            case 3:
                responseObj = new BotResponseImpl("I've also gone ahead and summarised your project. Does this look fine to you: ''");
                break;
            case 4:
                responseObj = new BotResponseImpl("Glad I could help with that.", "Looks like the skills you are proficient in are: Android, MS Sql Server. Are there any more I should know about?");
                break;
            case 5:
                responseObj = new BotResponseImpl("Thank you, I've made a note of that.",
                        "Based on your resume and what you've told me, I think these job openings would be a good fit for you:",
                        "Android Developer at (90% of successful applicants possess the same skills you do):",
                        "");
                break;
            case 6:
                responseObj = new BotResponseImpl("");
                break;
        }
        mMessageCtr += 1;
        return responseObj;
    }
}
