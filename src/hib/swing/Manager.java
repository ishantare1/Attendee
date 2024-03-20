package hib.swing;

public class Manager {
    private String managerId;
    private String managerName;
    private String password;
    
    public Manager(){
    }
    
    public Manager(String managerId, String managerName, String password) {
        this.managerId = managerId;
        this.managerName= managerName;
        this.password = password;
        
    }

    /**
     * @return the managerId
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * @param managerId the managerId to set
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    /**
     * @return the managerName
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * @param managerName the managerName to set
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}