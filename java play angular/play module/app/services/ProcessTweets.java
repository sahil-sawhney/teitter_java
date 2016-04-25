package services;

import com.google.gson.Gson;
import models.Tweet;
import play.api.libs.json.JsObject;
import repositories.FetchTweets;

import java.util.Comparator;
import java.util.List;

/**
 * Created by sahil on 4/24/16.
 */
public class ProcessTweets {

    private List<Tweet> fetchAllTweets() {

        return (new FetchTweets()).fetch();
    }

    private String serializeTweets(List<Tweet> twets) {

        Gson gson = new Gson();
        return gson.toJson(twets);
    }

    public String sortTweetByDate() {

        List<Tweet> tweetsByDate = fetchAllTweets();
        tweetsByDate.sort(Comparator.comparing(Tweet::getDate).reversed());
        return serializeTweets(tweetsByDate);
    }

    public String sortTweetByRetweet() {

        List<Tweet> tweetsByRetweet = fetchAllTweets();
        tweetsByRetweet.sort(Comparator.comparing(Tweet::getRetweetCount).reversed());
        return serializeTweets(tweetsByRetweet);
    }

    public String sortTweetByLikes() {

        List<Tweet> tweetsByReLikes = fetchAllTweets();
        tweetsByReLikes.sort(Comparator.comparing(Tweet::getLikesCount).reversed());
        return serializeTweets(tweetsByReLikes);
    }

}
