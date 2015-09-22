package arm_sertif.forms.dataimport;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

import arm_sertif.forms.mainform.MainForm;
import arm_sertif.utils.DataFileFilter;
import arm_sertif.utils.Display;

public class DataImportDialog extends JDialog {

    private static final long serialVersionUID = 1L;
    private JTextField tfdPath;
    private static final int WIDTH = 329;
    private static final int HEIGHT = 116;
    private JFileChooser fc;

    /**
     * Create the dialog.
     */
    public DataImportDialog(MainForm parent) {
	super(parent);
	fc = new JFileChooser();
	Dimension center = Display.windowCenter(WIDTH, HEIGHT);
	setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
	setSize(WIDTH, HEIGHT);
	setLocation(center.width, center.height);
	setVisible(false);
	getContentPane().setLayout(null);

	tfdPath = new JTextField();
	tfdPath.setBackground(Color.WHITE);
	tfdPath.setEditable(false);
	tfdPath.setBounds(10, 12, 247, 20);
	getContentPane().add(tfdPath);
	tfdPath.setColumns(10);
	addWindowListener(new WindowListener() {

	    public void windowOpened(WindowEvent e) {
	    }

	    public void windowIconified(WindowEvent e) {
	    }

	    public void windowDeiconified(WindowEvent e) {
	    }

	    public void windowDeactivated(WindowEvent e) {
	    }

	    public void windowClosing(WindowEvent e) {
		tfdPath.setText("");
	    }

	    public void windowClosed(WindowEvent e) {
	    }

	    public void windowActivated(WindowEvent e) {
	    }
	});

	final JButton btnOpenFileDialog = new JButton("...");
	btnOpenFileDialog.setBounds(267, 11, 38, 23);
	getContentPane().add(btnOpenFileDialog);
	btnOpenFileDialog.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

		fc.addChoosableFileFilter(new DataFileFilter());
		fc.setAcceptAllFileFilterUsed(false);

		// Handle open button action.
		int returnVal = fc.showOpenDialog(DataImportDialog.this);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
		    File file = fc.getSelectedFile();
		    tfdPath.setText(file.getPath());

		}
	    }
	});

	JButton btnNewButton_1 = new JButton("Принять");
	btnNewButton_1.setBounds(117, 43, 89, 23);
	getContentPane().add(btnNewButton_1);

	JButton btnExit = new JButton("Закрыть");
	btnExit.setBounds(216, 43, 89, 23);
	getContentPane().add(btnExit);
	btnExit.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		tfdPath.setText("");
		setVisible(false);
	    }
	});

    }
}
