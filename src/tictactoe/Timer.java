package tictactoe;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Florian Naef
 *
 *         This class will track the time of the takes the player takes.
 */
public class Timer {
	// Attributes
	private LocalDateTime dt1;
	private LocalDateTime dt2;

	// Methods
	/**
	 * This methods starts the timer.
	 */
	public void startTime() {
		dt1 = LocalDateTime.now();
	}

	/**
	 * @param mode
	 * 
	 *             This method stops the time of the stop watch.
	 */
	public void stopTime(boolean mode) {
		int minutes;
		int seconds;

		dt2 = LocalDateTime.now();
		Duration duration = Duration.between(dt1, dt2);

		minutes = (int) ((duration.getSeconds() % 3600) / 60);
		seconds = (int) (duration.getSeconds() % 60);

		if (mode) {
			System.out.printf("Total duration: Minutes: %s, Seconds: %s %n", minutes, seconds);
		} else {
			System.out.printf("Move duration: Minutes: %s, Seconds: %s %n", minutes, seconds);
		}

	}
}