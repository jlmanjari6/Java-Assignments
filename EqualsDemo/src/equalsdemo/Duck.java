/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsdemo;

import java.util.Objects;

/**
 *
 * @author S530719
 */
public class Duck {
    private int duckWeight;
    private String duckColor;
    private boolean isDelicious;

    public Duck() {
    }

    public Duck(int duckWeight, String duckColor, boolean isDelicious) {
        this.duckWeight = duckWeight;
        this.duckColor = duckColor;
        this.isDelicious = isDelicious;
    }

    @Override
    public String toString() {
        return "Duck{" + "duckWeight=" + duckWeight + ", duckColor=" + duckColor + ", isDelicious=" + isDelicious + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.duckWeight;
        hash = 79 * hash + Objects.hashCode(this.duckColor);
        hash = 79 * hash + (this.isDelicious ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Duck other = (Duck) obj;
        if (this.duckWeight != other.duckWeight) {
            return false;
        }
        if (this.isDelicious != other.isDelicious) {
            return false;
        }
        if (!Objects.equals(this.duckColor, other.duckColor)) {
            return false;
        }
        return true;
    }

 
   
}
