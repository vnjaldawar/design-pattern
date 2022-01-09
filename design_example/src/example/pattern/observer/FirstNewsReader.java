package example.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class FirstNewsReader implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("First new reader got the news, " +  String.valueOf(arg));
	}
}
