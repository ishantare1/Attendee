package hib.swing;

public class Notes{
    
    private String sNo;
    private String documents;
    private String courseName;
    
    public Notes() {
    }

    public Notes(String sNo, String documents, String courseName) {
        this. sNo = sNo;
        this.documents = documents;
        this.courseName=courseName ;   
    }
   
    /**
     * @return the sNo
     */
    public String getsNo() {
        return sNo;
    }

    /**
     * @param sNo the sNo to set
     */
    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    /**
     * @return the documents
     */
    public String getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(String documents) {
        this.documents = documents;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
}