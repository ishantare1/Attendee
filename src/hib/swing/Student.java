package hib.swing;

public class Student{
    private String studentId;
    private String studentName;
    private String gender;
    private String contact;
    private String email;
    private String parentsNo;
 private String batchTiming;
    private String address;
    
    private String collegeName;
//    private String attendence ;
//    private String documents;

    public Student() {
    }
   

    public Student(String studentId, String studentName, String gender, String contact, String email, String parentsNo, String batchTiming, String address, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.contact = contact;
        this.email = email;
        this.parentsNo = parentsNo;
        this.batchTiming = batchTiming;
        this.address = address;
        this.collegeName = collegeName;
    }
    

  

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the parentsNo
     */
    public String getParentsNo() {
        return parentsNo;
    }

    /**
     * @param parentsNo the parentsNo to set
     */
    public void setParentsNo(String parentsNo) {
        this.parentsNo = parentsNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the collegeName
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * @param collegeName the collegeName to set
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the batchTiming
     */
    public String getBatchTiming() {
        return batchTiming;
    }

    /**
     * @param batchTiming the batchTiming to set
     */
    public void setBatchTiming(String batchTiming) {
        this.batchTiming = batchTiming;
    }

}