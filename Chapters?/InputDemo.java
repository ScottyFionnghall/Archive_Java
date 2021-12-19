import javax.swing.JOptionPane;
	class InputDemo{
		public static void main(String[] args) {
			String title = "Error";
			String error ="It's not yes";
			String text;
			String yes = "Yes";

			text =JOptionPane.showInputDialog("Enter Yes");
			Boolean off = text.contentEquals(yes);
			if (off == false){
				JOptionPane.showMessageDialog(null,error,title,JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,"It's indeed yes");

			}
		}
	}
