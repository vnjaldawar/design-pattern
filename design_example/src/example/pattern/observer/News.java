package example.pattern.observer;

import java.util.Arrays;
import java.util.List;
import java.util.Observable;

public class News extends Observable {

	public void publishNews() {
		List<String> newsList = Arrays.asList("mumbai news", "delhi news", "pune news");
		
		for (String aNews : newsList) {
			setChanged();
			notifyObservers(aNews);
			
		}
	}
	
	public static void main(String args[]) {
        News observedNews = new News();
        FirstNewsReader reader1 = new FirstNewsReader();
        SecondNewsReader reader2 = new SecondNewsReader();
        observedNews.addObserver(reader1);
        observedNews.addObserver(reader2);
        observedNews.publishNews();
        
    }
}
