import javax.swing.JOptionPane;

public class LinearSearch {

	public static int search(String[] arr, String key) {

		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (key.equalsIgnoreCase(arr[i])) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String a[]) {

		do {
			String[] input = new String[10];
			for (int i = 0; i < 10; i++) {
				input[i] = JOptionPane.showInputDialog("Enter the letter "
						+ (i + 1) + ": ");
			}
			String searchKey = JOptionPane
					.showInputDialog("Enter the letter you would like to search for: ");
			int pos = search(input, searchKey);
			if (pos == -1) {
				JOptionPane.showMessageDialog(null, "Letter not found");
			} else {
				JOptionPane.showMessageDialog(null, "Key " + searchKey
						+ " found at index: " + pos);
			}
			String s = JOptionPane
					.showInputDialog("Press E to exit the program: ");
			if ("E".equalsIgnoreCase(s)) {
				break;
			}
		} while (true);
	}

}