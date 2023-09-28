package org.launchcode.techjobs.oo;
import java.util.Objects;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;


    @Override
    public String toString() {
        return value;
    }

}
