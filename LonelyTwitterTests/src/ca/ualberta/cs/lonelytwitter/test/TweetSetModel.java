package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.NormalTweetModel;



public class TweetSetModel {

	private int count = 0;

	public int countTweets(){
		return count;
	}

	public  void addTweet(NormalTweetModel normalTweetModel) {
		count++;
	}
}
