import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.Timer;

//Main Class
public class Main implements ActionListener{
	Grid grid;
	Painter painter;
	MyFrame frame;
	MyMouseListener mouseListener;

	//Run game
	public static void main (String[] args) {
		new Main();
	}

	public void actionPerformed(ActionEvent e){	
		painter.repaint();
	}

	//Constructor
	public Main(){
		grid = new Grid();
		painter = new Painter(grid);
		frame = new MyFrame("Chess");
		mouseListener = new MyMouseListener(this);
		frame.setUp(this);
	
		Timer timer = new Timer(10, this);
		timer.start();
	}
}