import java.awt.Color;
//According to what was requested in the homework
public class Editor4 
{
	public static void main (String[] args) {
		String source = args[0];
		Color[][] sourceImage = Runigram.read(source);
		Runigram.setCanvas(sourceImage);
		Color[][] grayedImage = Runigram.grayScaled(sourceImage);
		Runigram.display(grayedImage);
	}
}