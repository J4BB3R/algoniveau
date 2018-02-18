package niveau;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		
		super("Algo des niveaux");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(true);
		this.setLayout(new BorderLayout());
		
		/* TODO */
		JPanel rightpanel = new JPanel();
		rightpanel.setPreferredSize(new Dimension(300,300));
		rightpanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
		rightpanel.setLayout(new BoxLayout(rightpanel, BoxLayout.Y_AXIS));
		
		JPanel sizeEntry = new JPanel();
		
		JTextField matrixSize = new JTextField();
		matrixSize.setPreferredSize(new Dimension(100,20));
		
		sizeEntry.add(new JLabel("Entrez la taille :"), BorderLayout.WEST);
		sizeEntry.add(matrixSize, BorderLayout.EAST);
		
		rightpanel.add(sizeEntry);
		
		JPanel leftpanel = new JPanel();
		leftpanel.setPreferredSize(new Dimension(300,300));
		leftpanel.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		
		this.add(new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,rightpanel,leftpanel));
		
		this.pack();
		this.setLocationRelativeTo(null);
		
		
		this.setVisible(true);
		
	}

}
