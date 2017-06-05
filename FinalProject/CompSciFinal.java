import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CompSciFinal extends JFrame
{
	private JLabel labelPrompt;
	private JButton buttonSelect1;
	private JButton buttonSelect2;
	
	public CompSciFinal()
	{
		createView();
		
		setTitle("Courses or Major");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}
	
	private void createView()
	{
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelPrompt = new JLabel("Would you like to select a major or input your courses?");
		labelPrompt.setVisible(true);
		panel.add(labelPrompt);
		
		buttonSelect1 = new JButton("Major");
		buttonSelect2 = new JButton("Courses");
		
		buttonSelect1.addActionListener(
				new ButtonSelect1ActionListener());
		panel.add(buttonSelect1);
		
		buttonSelect2.addActionListener(
				new ButtonSelect2ActionListener());
		panel.add(buttonSelect2);
	}
	
	private class ButtonSelect1ActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			ChooseMajor.main(new String[0]);
			//System.exit(0);
		}
	}
	
	private class ButtonSelect2ActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			ChooseCourses.main(new String[0]);
			//System.exit(0);
		}
	}
	
	public static void main(String[]args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new CompSciFinal().setVisible(true);
			}
		});
	}
}