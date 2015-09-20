package arm_sertif.forms.mainform;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arm_sertif.utils.Display;

public class MainForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final static int WIDTH = 291;
	private final static int HEIGHT = 333;

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension center = Display.windowCenter(WIDTH, HEIGHT);
		setSize(WIDTH, HEIGHT);
		setLocation(center.width, center.height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		JButton btnNewButton = new JButton("Прием данных");

		btnNewButton.setBounds(10, 11, 261, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Дополнительна информация");
		btnNewButton_1.setBounds(10, 45, 261, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Печать сертификатов");
		btnNewButton_2.setBounds(10, 79, 261, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Журнал регистрации");
		btnNewButton_3.setBounds(10, 113, 261, 23);
		contentPane.add(btnNewButton_3);

		JButton button = new JButton("Список для сверки сертификатов");
		button.setBounds(10, 147, 261, 23);
		contentPane.add(button);

		JButton btnNewButton_4 = new JButton("Отправка сведений");
		btnNewButton_4.setBounds(10, 181, 261, 23);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Резервное копирование");
		btnNewButton_5.setBounds(10, 215, 261, 23);
		contentPane.add(btnNewButton_5);

		JButton btnExit = new JButton("Выход");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 260, 261, 23);
		contentPane.add(btnExit);
	}
}
