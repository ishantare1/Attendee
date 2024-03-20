package hib.swing;

public class Notice{
    
    private String serialNo;
    private String batch;
    private String time;
    private String otherInfo;
     
    public Notice() {
    }

    public Notice(String serialNo, String batch, String time, String otherInfo) {
        this. serialNo = serialNo;
        this.batch = batch;
        this.time=time;
        this.otherInfo= otherInfo;    
    }

    /**
     * @return the serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo the serialNo to set
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * @return the batch
     */
    public String getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the otherInfo
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * @param otherInfo the otherInfo to set
     */
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
}