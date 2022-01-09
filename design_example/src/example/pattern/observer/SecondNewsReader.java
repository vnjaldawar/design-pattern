package example.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class SecondNewsReader implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Second new reader got the news, " +  String.valueOf(arg));
	}

}
