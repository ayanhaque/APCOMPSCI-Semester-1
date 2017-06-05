import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MajorSortPanelTest extends JFrame
{
	private JLabel output;
	
	public MajorSortPanelTest()
	{
		createView();
		
		setTitle("Your results are:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}
	
	private void createView()
	{
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		output = new JLabel(MajorSort());
		output.setVisible(true);
		panel.add(output);
	}
	
	public static void main(String[]args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new MajorSortPanelTest().setVisible(true);
			}
		});
	}
}