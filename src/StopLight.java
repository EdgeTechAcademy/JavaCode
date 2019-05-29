	import java.util.Timer;
	import java.util.TimerTask;

	public class StopLight {
		int secs;			//	how long before the light changes
		LIGHT light;		//	what is the current color of the stop light

		public enum LIGHT {		//	This enum object will standardize the features of our light
								//	we have three colors and each has its own delay time
			RED("Red", 20), YELLOW("Yellow", 2), GREEN("Green", 20);
			private String value;		//		light color
			private int delay;			//		duration of light

			LIGHT(String value, int delay) {	//	our constructor
				this.value = value;				//	set the text description of the light
				this.delay = delay;				//	how long do we stay this color
			}
		}

		public int getSecs() {
			return secs;
		}

		/**
		 * 		decSecs
		 * 			keep track of the time on the clock
		 * 			every time this method is called dec the delay time
		 * 			if we have hit zero then advance to the next color
		 * 			and reset the delay time
		 */
		public void decSecs() {
			secs--;
			if ( secs == 0) {			//	has the time run out?
				switch (light) {		//	yes - advance to the next color
					case RED:		light = LIGHT.GREEN; 	break;
					case YELLOW: 	light = LIGHT.RED; 		break;
					case GREEN: 	light = LIGHT.YELLOW; 	break;
				}
				secs = light.delay;		//	the LIGHT enum knows how long to stay this color
			}
		}

		public StopLight(LIGHT light) {
			this.light = light;
			secs = light.delay;
		}

		public static void main(String[] args) {
			StopLight stopLight = new StopLight(LIGHT.RED);

			Timer timer = new Timer();			//	create a timer to run our stop light
			timer.schedule(new TimerTask() {	//	schedule the timer
				@Override
				public void run() {
					stopLight.decSecs();		//	dec our time remaining - advance is necessary
					System.out.println(stopLight.light + " Time remaining: " + stopLight.getSecs());
				}
			}, 1000, 1000);						//	wait 1 sec and then call every sec
		}
	}
