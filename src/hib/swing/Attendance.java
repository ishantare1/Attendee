package hib.swing;

public class Attendance {
    private String students;
    private String reason;
    private String courseName;
    private String absent;
     private String present;
    private String totalCount;
    private String date;
    private String batchTiming;
    
    
    public Attendance() {
    }

    public Attendance(String students, String duration , String batchTime, String courseFees, String totalStudent ) {
        this.students = students;
        this.reason =reason;
        this.courseName=courseName ;
        this.absent= absent;
        this.present= present;
        this.totalCount= totalCount;
        this.date= date;
        this.batchTiming= batchTiming;
        
    }

    /**
     * @return the students
     */
    public String getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(String students) {
        this.students = students;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
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

    /**
     * @return the absent
     */
    public String getAbsent() {
        return absent;
    }

    /**
     * @param absent the absent to set
     */
    public void setAbsent(String absent) {
        this.absent = absent;
    }

    /**
     * @return the present
     */
    public String getPresent() {
        return present;
    }

    /**
     * @param present the present to set
     */
    public void setPresent(String present) {
        this.present = present;
    }

    /**
     * @return the totalCount
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount the totalCount to set
     */
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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
