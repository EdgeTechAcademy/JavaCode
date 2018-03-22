import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.text.*;

public class AppClock extends Applet implements Runnable {

	int width, height;
	Thread t = null;
	boolean threadSuspended;
	int hours=0, minutes=0, seconds=0, milli=0;
	String timeString = "";
	int  currColor = 2;
	Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, Color.pink, Color.gray, Color.lightGray, Color.white};

	public void init() {
		width = getSize().width;
		height = getSize().height;
		setBackground( Color.black );
		this.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent ke) {
				currColor++;
				currColor %= colors.length;
			}
			public void keyReleased(KeyEvent ke) {}
			public void keyTyped(KeyEvent e) {}
		});
	}

	public void start() {
		if ( t == null ) {
			t = new Thread( this );
			t.setPriority( Thread.MIN_PRIORITY );
			threadSuspended = false;
			t.start();
		}
		else {
			if ( threadSuspended ) {
				threadSuspended = false;
				synchronized( this ) {
					notify();
				}
			}
		}
	}

	public void stop() {
		threadSuspended = true;
	}

	public void run() {
		try {
			while (true) {

				// Here's where the thread does some work
				Calendar cal = Calendar.getInstance();
				hours = cal.get( Calendar.HOUR_OF_DAY );
				if ( hours > 12 ) hours -= 12;
				minutes = cal.get( Calendar.MINUTE );
				seconds = cal.get( Calendar.SECOND );
				milli   = cal.get(Calendar.MILLISECOND );

				SimpleDateFormat formatter
						= new SimpleDateFormat( "hh:mm:ss", Locale.getDefault() );
				Date date = cal.getTime();
				timeString = formatter.format( date );

				// Now the thread checks to see if it should suspend itself
				if ( threadSuspended ) {
					synchronized( this ) {
						while ( threadSuspended ) {
							wait();
						}
					}
				}
				repaint();
				//		TODO:		#7 the clock wakes up every second (1000 milliseconds). Change it to 50. Wake every 1/20 of a second
				Thread.sleep( 1000 );  // interval given in milliseconds
			}
		}
		catch (InterruptedException e) { }
	}

	void drawHand( double angle, double radius, Graphics g, Color color ) {
		angle -= 0.5 * Math.PI;
		int x = (int)( radius*Math.cos(angle) );
		int y = (int)( radius*Math.sin(angle) );
		g.setColor( color );
		g.drawLine( width/2, height/2, width/2 + x, height/2 + y );
	}

	void drawWedge( double angle, int radius, Graphics g, Color color ) {
		int[] xPolly = new int[3];
		int[] yPolly = new int[3];
		angle -= 0.5 * Math.PI;
		int x = (int)( radius*Math.cos(angle) );
		int y = (int)( radius*Math.sin(angle) );
		angle += 2*Math.PI/3;
		int x2 = (int)( 5*Math.cos(angle) );
		int y2 = (int)( 5*Math.sin(angle) );
		angle += 2*Math.PI/3;
		int x3 = (int)( 5*Math.cos(angle) );
		int y3 = (int)( 5*Math.sin(angle) );
		xPolly[0] = width/2+x2;
		yPolly[0] = height/2+y2;
		xPolly[1] = width/2+x;
		yPolly[1] = height/2+y;
		xPolly[2] = width/2+x3;
		yPolly[2] = height/2+y3;
		g.setColor( color );
		g.fillPolygon(xPolly, yPolly,3);
	}


	/**
	 * 	paint
	 * 		this is where it all happens in a Java Applet
	 * 			We are creating an analog clock applet
	 * 			Every time period (currently .2 seconds) the app wakes up and repaints the hands of the clock
	 *
	 * @param g		this is the parameter that gives us access to painting on the screen
	 */
	public void paint( Graphics g ) {

		//	make the lines we draw a little fatter
		Graphics2D g2 = (Graphics2D) g;
		//		TODO:	#1 the lines in our clock are too small try a fatter line size
		g2.setStroke(new BasicStroke(4));		//	4

		//	get the size of the window and find the smallest dimension.
		//	resize the window to keep our clock nice and round
		height = width = Math.min(getSize().width, getSize().height);
		resize(width, height);

		//	draw an outer white ring and a dark gray inner ring
		//		TODO:	#2 what do you think of the colors for the outer ring of the clock? try something jazzier than gray
		//				delete the word lightGray and type the letter B and wait, 'intellisense' will help you find the color blue,
		//				don't type blue just do a down arrow to 'blue' and hit tab!
		g.setColor( Color.gray);
		g.drawArc(0, 0, width, height,     0, 360);
		g.setColor( Color.white);
		g.drawArc(3, 3, width-6, height-6, 0, 360);

		//		TODO:	#3 let's color in the area between 12 and the minute hand with a color
		//				This code will color the area swept out by the minute hand with the color of your choosing
		g.setColor( Color.black );
		int handRadius = width/3;
		int handInset = width/2 - handRadius;
		g.fillArc(handInset, handInset, width-2*handInset, width-2*handInset, 90, -minutes*6);

		//		TODO:	#4 let's color in the area between 12 and the hour hand with another color
		//				This code will color the area swept out by the hour hand with the color of your choosing
		g.setColor( Color.black );
		handRadius = width/5;
		handInset = width/2 - handRadius;
		g.fillArc(handInset, handInset, width-2*handInset, width-2*handInset, 90, -(hours%12)*30);

		//	draw the hour, minute and second hands
		//	this uses painting methods to draw a wedge shaped clock hand for th hour and minute
		//		TODO:	#5 The clock hands are not very attractive. Change their colors
		drawWedge( 2*Math.PI * hours   / 12, 						width/5, 	g, Color.yellow);
		drawWedge( 2*Math.PI * minutes / 60, 						width/3, 	g, Color.blue );
		drawHand ( 2*Math.PI * (seconds / 60.0),				 	width/2.25,	g, Color.lightGray );
		//		TODO:	#6 The clock hand jerks along once per second. If we want a smoother second hand
		//				comment out the line of code above (add // to the front of the line)
		//				and uncomment out the line below (remove the // from the front of the line)
		//				now go up to TODO: #7 and change it
		//drawHand ( 2*Math.PI * (seconds / 60.0 + milli/60000.0 ), 	width/2,	g, Color.lightGray );

		//	let's put the hours on the clock
		//	Here we will put some of the Trigonometry we 'learned' in high school to good use.
		//	we will spread the numbers 1-12 around the face of the clock. One number every 30 degrees
		//		TODO:	#8 the clock numbers are too small and unattractive. See if you can come up with something more interesting
		g.setColor( colors[currColor] );
		g.setFont(new Font("TimesRoman", Font.ITALIC|Font.BOLD, 25));
		for ( int hr = 1; hr <= 12; hr++) {
			double angle = (2*Math.PI*hr/12) - 0.5*Math.PI;
			int radius = Math.min(height, width)/2-20;
			int xhr = (int)( radius*Math.cos(angle) ) + width/2;
			int yhr = (int)( radius*Math.sin(angle) ) + height/2;
			int xOffset = g.getFontMetrics().stringWidth(""+hr)/2;
			int yOffset = g.getFontMetrics().getAscent()/2;
			g.drawString( ""+hr, xhr-xOffset, yhr+yOffset);
		}
		g.setFont(new Font("TimesRoman", Font.BOLD, 16));
		g.setColor( Color.blue);
		g.drawString( timeString, 10, height-10 );
	}
}