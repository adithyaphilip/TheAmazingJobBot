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
                        "1. Android Developer (92% of successful applicants possess the same skills you do):",
                        "MindTree: https://www.linkedin.com/jobs/view/772694151/",
                        "InTech: https://www.linkedin.com/jobs/view/772694159/",
                        "2. Java Developer (you posses the same skills as 90% of successful applicants):",
                        "NeinLeap: https://www.linkedin.com/jobs/view/133279039/",
                        "AlterTech: https://www.linkedin.com/jobs/view/133279039/",
                        "See more: https://www.linkedin.com/jobs/....");
                break;
            case 6:
                responseObj = new BotResponseImpl("Great! Your Android and MS Sql Server skills are highly valued at this organization, so be sure to brush up on those.",
                        "You should also talk about these projects since they involved using both Android and MS SQL Server:",
                        "1. Mobile Wallet",
                        "2. Note Keeper",
                        "Also, your close connections Soumya Mandal (she's your classmate from St. Paul's High School) and Saurabh Sharma (your colleague at your earlier job at InnovationTech) both work at FalconApps, so they could refer you.",
                        "Best of luck!");
                break;
            case 7:
                // GROWTH ENABLEMENT - I'd like to learn new skills
                responseObj = new BotResponseImpl("Learning the following skills would open up more opportunities:",
                        "Xamarin: Cross-Platform Developer positions. There are currently 354 open positions near you, with a salary range of 80,000 USD to 150,000 USD. This role has seen a growth of 34% new positions over the last year.",
                        "If you would like a larger role shift:",
                        "Machine Learning: Data Scientist, Research SDE positions. There are currently 86 open positions near you, with a salary range of 110,000 USD to 200,000 USD. This role has seen a growth of 52% new positions over the last year.");
                break;
            case 8:
                // I'd like to learn more about Xamarin
                responseObj = new BotResponseImpl("Learning Xamarin would make you a great fit for 354 open positions, like:",
                        "SuperApps: https://www.linkedin.com/jobs/view/7726941519/",
                        "MegaTech: https://www.linkedin.com/jobs/view/8726941538/",
                        "You can learn Xamarin right here on LinkedIn: https://www.linkedin.com/learning/xamarin-essential-training-create-your-first-app");
                break;
        }
        mMessageCtr += 1;
        return responseObj;
    }
}
