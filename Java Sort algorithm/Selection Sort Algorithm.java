import javax.swing.JOptionPane;

public class SelectionSortGUI {

	public static int[] performSort(int[] input) {

		for (int i = 0; i < input.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < input.length; j++)
				if (input[j] > input[index])
					index = j;

			int smallerNumber = input[index];
			input[index] = input[i];
			input[i] = smallerNumber;
		}
		return input;
	}

	public static void main(String a[]) {

		do {
			int[] input = new int[10];
			for (int i = 0; i < 10; i++) {
				input[i] = Integer.valueOf(JOptionPane
						.showInputDialog("Enter the number " + (i + 1) + ": "));
			}
			int[] output = performSort(input);
			String delimiter = "";
			String result = "The sorted result is: \n";
			for (int i : output) {
				result += delimiter + i + " ";
				delimiter = ",";
			}
			JOptionPane.showMessageDialog(null, result);
			String s = JOptionPane
					.showInputDialog("Press E to exit the program or anything to continue: ");
			if ("E".equalsIgnoreCase(s)) {
				break;
			}

		} while (true);
	}
}
