package arm_sertif;

import java.awt.EventQueue;

import arm_sertif.forms.mainform.MainForm;

public class App {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
