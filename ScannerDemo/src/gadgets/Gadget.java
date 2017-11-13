/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgets;

/**
 *
 * @author S530719
 */
public class Gadget {
    
    private int gadgetId;
    private String gadgetName;
    private double gadgetPrice;

    public Gadget(int gadgetId, String gadgetName, double gadgetPrice) {
        this.gadgetId = gadgetId;
        this.gadgetName = gadgetName;
        this.gadgetPrice = gadgetPrice;
    }

    public int getGadgetId() {
        return gadgetId;
    }

    public void setGadgetId(int gadgetId) {
        this.gadgetId = gadgetId;
    }

    public String getGadgetName() {
        return gadgetName;
    }

    public void setGadgetName(String gadgetName) {
        this.gadgetName = gadgetName;
    }

    public double getGadgetPrice() {
        return gadgetPrice;
    }

    public void setGadgetPrice(int gadgetPrice) {
        this.gadgetPrice = gadgetPrice;
    }

    @Override
    public String toString() {
        return "Gadget{" + "gadgetId=" + gadgetId + ", gadgetName=" + gadgetName + ", gadgetPrice=" + gadgetPrice + '}';
    }
    
    
}
