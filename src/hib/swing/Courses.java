package hib.swing;

public class Courses {
    private int serialNo;
    private String courseName;
    private String duration;
    private String batchTime;
    private String courseFees;
    private String totalStudent;
    
    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    
    public Courses() {
    }

    public Courses( String courseName, String duration, String batchTime, String courseFees, String totalStudent) {
        
        this.courseName = courseName;
        this.duration = duration;
        this.batchTime = batchTime;
        this.courseFees = courseFees;
        this.totalStudent = totalStudent;
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
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the batchTime
     */
    public String getBatchTime() {
        return batchTime;
    }

    /**
     * @param batchTime the batchTime to set
     */
    public void setBatchTime(String batchTime) {
        this.batchTime = batchTime;
    }

    /**
     * @return the courseFees
     */
    public String getCourseFees() {
        return courseFees;
    }

    /**
     * @param courseFees the courseFees to set
     */
    public void setCourseFees(String courseFees) {
        this.courseFees = courseFees;
    }

    /**
     * @return the totalStudent
     */
    public String getTotalStudent() {
        return totalStudent;
    }

    /**
     * @param totalStudent the totalStudent to set
     */
    public void setTotalStudent(String totalStudent) {
        this.totalStudent = totalStudent;
    }

    
}