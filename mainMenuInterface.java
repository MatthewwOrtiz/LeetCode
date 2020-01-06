import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class mainMenuInterface {

	public static void main(String args[]){
		//Creating the Frame
        JFrame frame = new JFrame("LeetCode Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem(new AbstractAction("Common Characters") {
            public void actionPerformed(ActionEvent e) {
                // Button pressed logic goes here
            }
        });
        JMenuItem m22 = new JMenuItem(new AbstractAction("FizzBuzz") {
            public void actionPerformed(ActionEvent e) {
                // Button pressed logic goes here
            }
        });
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Console goes here");
        JButton run = new JButton(new AbstractAction("RUN") {
            public void actionPerformed(ActionEvent e) {
            	 CommonCharacters.main(args);
            }
        });
        panel.add(run);
        panel.add(label); // Components Added using Flow Layout


        // Text Area at the Center
        JPanel center = new JPanel();
       
		center.setLayout(new BorderLayout());  //give your JPanel a BorderLayout
		
		JTextArea code = new JTextArea(); 
		JScrollPane scroll = new JScrollPane(code); //place the JTextArea in a scroll pane
		center.add(scroll, BorderLayout.CENTER); 
        
        
        //Left; List of Programs
        JPanel list = new JPanel();
        list.setLayout(new GridLayout(3,0));
        JButton CommonCharacters = new JButton(new AbstractAction("Common Charaters") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/CommonCharacters.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton CommonCharactersDA = new JButton(new AbstractAction("Common Charaters W/ Double Array") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/CommonCharactersDoubleArray.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton DefangIP = new JButton(new AbstractAction("Defang IP Addresses") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/defangingIPAddress.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        list.add(CommonCharacters);
        list.add(CommonCharactersDA);
        list.add(DefangIP);

        
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, center);
        frame.getContentPane().add(BorderLayout.WEST,list);
        frame.setVisible(true);

	}
	static String getString(File f) throws IOException{
		String everything;
		BufferedReader br = new BufferedReader(new FileReader(f));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		     everything = sb.toString();
		} finally {
		    br.close();
		}
		return everything;
	}
}
