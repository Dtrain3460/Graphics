import javax.swing.JFrame;

public class MyFrame extends JFrame
{

	private MyPanel panel;
	private final int WIDTH = 300;
	
	public MyFrame(String title) 
	{
		setTitle(title);
		setSize(WIDTH, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paintLine()
	{
		panel = new LineDemoPanel();
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame frame = new MyFrame("Line");
		frame.paintLine();
		
		MyFrame frame2 = new MyFrame("Rectangle");
		frame2.paintRectangle();
		
		MyFrame frame3 = new MyFrame("Oval");
		frame3.paintOval();
	}

	public void paintRectangle()
	{
		panel = new RectangleDemoPanel();
		add(panel);
		setVisible(true);
	}
	
	public void paintOval()
	{
		panel = new OvalDemoPanel();
		add(panel);
		setVisible(true);
	}
}
