package controllers;

import play.mvc.*;

import services.ProcessTweets;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("This application sort the tweets."));
    }

    public Result tweetByDate() {
        return ok((new ProcessTweets()).sortTweetByDate()).withHeaders("Access-Control-Allow-Origin","*");
    }

    public Result tweetByRetweet() {
        return ok((new ProcessTweets()).sortTweetByRetweet()).withHeaders("Access-Control-Allow-Origin","*");
    }

    public Result tweetByLikes() {
        return ok((new ProcessTweets()).sortTweetByLikes()).withHeaders("Access-Control-Allow-Origin","*");
    }

}
