package FM_Pattern;

import java.awt.GridLayout;

import javax.swing.JFrame;

class Window extends JFrame{
	private static final long serialVersionUID = 1L;
	int col = 0, row = 0;
	int maxCol = 5, maxRow = 5;

	Window() {
		getContentPane().setLayout(new GridLayout(maxRow, maxCol));
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	void addFigure(final Figure fig){
		if(row<5){
			if(col<5){
				getContentPane().add(fig.figure);
				++col;
			}else{
				col = 1;
				++row;
				if(row<5)
					getContentPane().add(fig.figure);
				else
					System.out.println("Cannot add other images!");
			}
		}else
			System.out.println("Cannot add other images!");
	}
	
}
