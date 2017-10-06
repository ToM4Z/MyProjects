package FM_Pattern;

abstract class Creator {
	Window window = new Window();

	public Creator() {
		addFigure();
	}
	
	abstract void addFigure();
}
