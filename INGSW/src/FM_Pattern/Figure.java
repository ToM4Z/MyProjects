package FM_Pattern;

import java.awt.Toolkit;
import java.io.File;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


abstract class Figure{
	final static int width = 100, height = 100;
	JLabel figure = new JLabel();
	
	Figure(String path){
		String directory="";
		try {
			directory=(new File(Figure.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParent())
					+ File.separator+"src/FM_Pattern/Images/";
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		figure.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(directory + path)));
	}
}
