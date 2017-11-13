/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerDemo2;

/**
 *
 * @author S530719
 */
public class ScannerDemo2 {
    private int sId;
    private String sName;

    public ScannerDemo2(int sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "ScannerDemo2{" + "sId=" + sId + ", sName=" + sName + '}';
    }
    
    
    
}
