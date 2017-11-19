
public class Newsletter extends Publication {

	private String freq;
	private String editor;
	private String owner;

	public Newsletter(String titleInput, String publisherInput, String publicationDateInput, String subjectInput, String freqInput, String editorInput, String ownerInput) {
		super(titleInput, publisherInput, publicationDateInput, subjectInput);
		setFreq(freqInput);
		setEditor(editorInput);
		setOwner(ownerInput);
	}

	public String getFreq() {
		return freq;
	}

	public String getOwner() {
		return owner;
	}

	public String getEditor() {
		return editor;
	}

	public void setFreq(String input) {
		freq = input;
	}

	public void setEditor(String input) {
		editor = input;
	}

	public void setOwner(String input) {
		owner = input;
	}

	
	
	public String toString() {
		// Include the base class toString to display base class variables.
		StringBuffer strBuf = new StringBuffer(super.toString());
		strBuf.append("\nPublication frequency: ");
		strBuf.append(freq);
		strBuf.append("\nEditor               : ");
		strBuf.append(editor);
		strBuf.append("\nOwner                : ");
		strBuf.append(owner);
		strBuf.append("\n");
		
		return strBuf.toString();

	}
}
