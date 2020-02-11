import java.awt.BorderLayout;
import java.awt.Font;
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
        frame.setSize(1280, 800);

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
        JPanel panel = new JPanel(); 
        panel.setLayout(new GridLayout(2,0));
        JTextArea label = new JTextArea();
        JButton run = new JButton(new AbstractAction("RUN") {
            public void actionPerformed(ActionEvent e) {
            	 label.setText(CommonCharacters.swing());
            }
        });
        panel.add(run);
        panel.add(label);


        // Text Area at the Center
        JPanel center = new JPanel();
		center.setLayout(new BorderLayout());  //give your JPanel a BorderLayout
		JTextArea code = new JTextArea(); 
		JTextArea question = new JTextArea();
		code.setFont(new Font("Ariel", Font.PLAIN, 14));
		JScrollPane scroll = new JScrollPane(code); //place the JTextArea in a scroll pane
		center.add(scroll, BorderLayout.CENTER); 
        
        
        //Left; List of Programs
        JPanel list = new JPanel();
        list.setLayout(new GridLayout(20,0));
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
        JButton DivisorGame = new JButton(new AbstractAction("Divisor Game") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/DivisorGame.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton DuplicateZeros = new JButton(new AbstractAction("DuplicateZeros") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/DuplicateZeros.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton FizzBuzz = new JButton(new AbstractAction("FizzBuzz") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/FizzBuzz.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton jewelsAndStones = new JButton(new AbstractAction("Jewels and Stones") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/jewelsAndStones.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton KeyboardRow = new JButton(new AbstractAction("KeyboardRow") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/KeyboardRow.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton LongestCommonPrefix = new JButton(new AbstractAction("Longest Common Prefix") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/LongestCommonPrefix.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton LongestSubstring = new JButton(new AbstractAction("Longest Substring") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/LongestSubstring.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton removeOutermostParantheses = new JButton(new AbstractAction("Remove Outermost Parantheses") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/removeOutermostParantheses.java");
                try {
					code.setText(getString(a));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        JButton ReverseString = new JButton(new AbstractAction("Reverse String") {
            public void actionPerformed(ActionEvent e) {
            	 File a = new File("/Users/Matthew/workspace/LeetCode/src/ReverseString.java");
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
        list.add(DivisorGame);
        list.add(DuplicateZeros);
        list.add(FizzBuzz);        
        list.add(jewelsAndStones);
        list.add(KeyboardRow);
        list.add(LongestCommonPrefix);
        list.add(LongestSubstring);
        list.add(removeOutermostParantheses);
        list.add(ReverseString);

        
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
