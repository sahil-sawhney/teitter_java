package repositories;

import models.Tweet;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sahil on 4/24/16.
 */

public class FetchTweets {


    public List<Tweet> fetch()

    {
        ConfigurationBuilder conf = new ConfigurationBuilder();
        conf.setDebugEnabled(true)
                .setOAuthConsumerKey("U4vRNr1ZCY7jCnDCsEzaOqKgH")
                .setOAuthConsumerSecret("mE0pCdTUcsnATZrResDAb5by79X4tvrZXGJmJbCS48ILSKwsBR")
                .setOAuthAccessToken("723372793270665217-cD2bicHmEKovD0uYk80z3IOEh8TAeOQ")
                .setOAuthAccessTokenSecret("zn8toS7lkOBXDlbIHX3RwdCkZNR1E5EGqvzkEStL8bSW7");
        TwitterFactory tweetterFact = new TwitterFactory(conf.build());
        Twitter tweeterService = tweetterFact.getInstance();
        List<Tweet> tweets = new ArrayList<>();

        try {

            for (Status stat : tweeterService.getHomeTimeline()) {
                tweets.add(new Tweet(stat.getCreatedAt(), stat.getUser().getScreenName() , stat.getText(), stat.getFavoriteCount(), stat.getRetweetCount()));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tweets;
    }
}
