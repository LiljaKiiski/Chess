import java.awt.GridLayout;
import javax.swing.JFrame;

//MyFrame Class
public class MyFrame extends JFrame {
	//Screen width and heights
	public final int WIDTH = 640;
	public final int HEIGHT = 640 + 36; 

	//Constructor 1
	public MyFrame(String title){
		super(title);
		setLayout(new GridLayout(1, 1));
                setSize(WIDTH, HEIGHT);
                setLocationRelativeTo(null);
                setResizable(false);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
	}

	//SEt up Painter and MyMouseListener
	public void setUp(Main main){
                add(main.painter);
                addMouseListener(main.mouseListener);
	}
}