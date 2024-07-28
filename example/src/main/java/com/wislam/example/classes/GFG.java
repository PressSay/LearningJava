package com.wislam.example.classes;

public class GFG implements Cloneable {
    // Khai_báo và khởi_tạo string
    public String name = "Wislam";

    // Method 1
    @Override
    public Object clone()
        throws CloneNotSupportedException
    {
        // Super() keyword để_cập đến class_cha
        return super.clone();
    }
}
