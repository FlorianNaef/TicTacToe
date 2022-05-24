package tictactoe;

import java.time.Duration;
import java.time.LocalDateTime;

public class Timer {

	private LocalDateTime dt1;
	private LocalDateTime dt2;
	
	
	public void startTime() {
		// time1 = new Date().getTime();
		dt1 = LocalDateTime.now();
	}
	
	public void stopTime(boolean mode) {
		int minutes;
		int seconds;
		/*
		time2 = new Date().getTime();
		time = time2 - time1;
		minutes = (int) ((time / 1000)  / 60);
		seconds = (int)((time / 1000) % 60);
		*/
		
        dt2 = LocalDateTime.now();
        Duration duration = Duration.between(dt1, dt2);
        
        minutes = (int) ((duration.getSeconds() % 3600) / 60);
		seconds = (int) (duration.getSeconds() % 60);
        
		if(mode) {
			System.out.printf("Total duration: Minutes: %s ,Seconds: %s %n", minutes, seconds);
		}else {
			System.out.printf("Move duration: Minutes: %s ,Seconds: %s %n", minutes, seconds);
		}
        
        
        
		// return ("Minutes: " + minutes + ", Seconds: " + seconds);
	}
}
