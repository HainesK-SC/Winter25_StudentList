/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentexample;

/**
 *
 * @author Kyle Haines
 */
public class Student {
    private String name;
    private int sid;
    private int semesterNum;
    private String progName;
    
    /**
     * @return the progName
     */
    public String getProgName() {
        return progName;
    }

    /**
     * @param progName the progName to set
     */
    public void setProgName(String progName) {
        this.progName = progName;
    }
    
    /**
     * @return the semesterNum
     */
    public int getSemesterNum() {
        return semesterNum;
    }

    /**
     * @param semesterNum the semesterNum to set
     */
    public void setSemesterNum(int semesterNum) {
        this.semesterNum = semesterNum;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
   
}
