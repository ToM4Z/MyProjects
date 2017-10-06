package FM_Pattern;

class MyCreator extends Creator{
	
	public MyCreator() {
		super();
	}
	
	@Override
	void addFigure() {
		Figure f1 = new Casa(),f1_1 = new Casa();
		Figure f2 = new Albero();
		Figure f2_1 = new Cane();
		Figure f3 = new Fiore();
		Figure f4 = new Cane();
		
		window.addFigure(f1);
		window.addFigure(f2);
		window.addFigure(f3);
		window.addFigure(f4);
		window.addFigure(f1_1);
		window.addFigure(f2_1);
		
		window.getContentPane().revalidate();
		window.repaint();		
	}

	public static void main(String[] args) {
		new MyCreator();
	}	
}
