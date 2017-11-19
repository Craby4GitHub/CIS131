package Lab8;
public class Publication {

	private String title;
	private String publisher;
	private String publicationDate;
	private String subject;

	public Publication() {
		setTitle("");
		setPublisher("");
		setPublicationDate("");
		setSubject("");
	}

	public Publication(String titleInput, String publisherInput, String publicationDateInput, String subjectInput) {
		setTitle(titleInput);
		setPublisher(publisherInput);
		setPublicationDate(publicationDateInput);
		setSubject(subjectInput);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String input) {
		title = input;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String input) {
		publisher = input;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String input) {
		publicationDate = input;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String input) {
		subject = input;
	}
	
	 public String toString()
	 {
	      StringBuffer strBuf = new StringBuffer("\nPublication data: \n") ;
	  strBuf.append("\nTitle              : " ); 
	  strBuf.append(title );
	  strBuf.append("\nPublisher          : " );
	  strBuf.append(publisher); 
	  strBuf.append("\nPublication Date   : "); 
	  strBuf.append(publicationDate);
	  strBuf.append("\nSubject            : ");
	  strBuf.append(subject); 
	  //strBuf.append("\n");

	      return strBuf.toString();
	 }

}
