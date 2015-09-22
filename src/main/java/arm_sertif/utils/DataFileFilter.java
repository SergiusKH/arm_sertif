package arm_sertif.utils;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class DataFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
	if (f.isDirectory()) {
	    return true;
	}

	String extension = Utils.getExtension(f);
	if (extension != null) {
	    if (extension.equals(Utils.mht) || extension.equals(Utils.xsl)) {
		return true;
	    } else {
		return false;
	    }
	}

	return false;
    }

    @Override
    public String getDescription() {
	return "MHT and XSL";
    }

}
