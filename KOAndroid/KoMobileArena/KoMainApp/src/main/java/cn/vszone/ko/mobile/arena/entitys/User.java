package cn.vszone.ko.mobile.arena.entitys;

import android.databinding.BaseObservable;

/**
 * Created by Astroboy on 2017/3/3.
 */

public class User extends BaseObservable {

    private String firstName;
    private String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String pName){
        this.firstName=pName;
    }

    public void setLastName(String pName){
        this.lastName=pName;
    }
}
