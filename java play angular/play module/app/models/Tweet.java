package models;

import java.util.Date;

/**
 * Created by sahil on 4/24/16.
 */
public class Tweet {

    private Date date;
    private String tweetBy;
    private String content;
    private int likesCount;
    private int retweetCount;

    public Tweet(Date td, String tb, String tc, int tl, int tr) {

        this.date = td;
        this.tweetBy = tb;
        this.content = tc;
        this.likesCount = tl;
        this.retweetCount = tr;
    }

    public Date getDate() {

        return date;
    }

    public int getRetweetCount() {

        return retweetCount;
    }

    public int getLikesCount() {

        return likesCount;
    }

}
