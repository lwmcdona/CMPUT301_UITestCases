package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
    private static TweetList instance;
    private ArrayList<Tweet> tweets;

    private TweetList() {
        this.tweets = new ArrayList<Tweet>();
    }

    public static TweetList getInstance() {
        if (instance == null) {
            return new TweetList();
        }
        return instance;
    }


    public void addTweet(Tweet tweet){

        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void clearTweets() {
        tweets.clear();
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }
}
