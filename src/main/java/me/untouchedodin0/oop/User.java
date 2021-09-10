package me.untouchedodin0.oop;

import java.util.List;

public class User {

    private String _name;
    private String _membership = "Bronze";

    public static List<User> admins;

    public static void print_admin_names() {
        for (User u : User.admins) {
            System.out.println(u.getName());
        }
    }

    public String toString() {
        return getName() + " " + getMembership();
    }

    public User(String name) {
        setName(name);
    }

    public User(String name, String membership) {
        setName(name);
        setMembership(membership);
    }

    // If the args parameters has the same name as the variable, prefix it with "this"

    void setName(String name) {
        _name = name;
    }

    String getName() {
        return _name;
    }

    void setMembership(String membership) {
        _membership = membership;
    }

    void set_membership(Membership membership) {
        _membership = membership.name();
    }

    public enum Membership {
        Bronze, Silver, Gold;
    }

    String getMembership() {
        return _membership;
    }
}
