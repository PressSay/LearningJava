# Java package, static, final

<br/>

**Slide**: https://github.com/PressSay/LearningJava/blob/master/Java%20package%2C%20static%2C%20final.pdf

**Youtube**: https://youtu.be/OrLiQd9fkYo

## Package

*Định nghĩa*: package được sử dụng để nhóm các lớp có liên quan lại với nhau, giúp tổ chức mã nguồn và tránh xung đột tên lớp.

*ví dụ*:
```java
// Tên package thì viết_thường
package com.example.myapp;
```

*Lợi ích*:
- Dễ dàng quản lý và tổ chức mã nguồn.
- Hỗ trợ tính năng kiểm soát truy cập.
- Tránh xung đột tên giữa các lớp.

<br />

*Tạo và Sử dụng Package*

Tạo package:
- Tạo **thư_mục** *trùng_tên* với **package**.
- Thêm dòng package vào đầu mỗi tệp **.java**.


Sử dụng package:
- Import package bằng cách sử dụng từ khóa **import**.

*Ví dụ*:
```java
import com.example.myapp.MyClass;
```

<br />

## Static

*Định nghĩa*: static được sử dụng để khai báo các thành viên (biến, phương thức) chung cho tất cả các đối tượng của lớp.

Đặc điểm:
- **static biến**: Chỉ tồn tại một bản sao trong bộ nhớ cho tất cả các đối tượng.
- **static method**: Có thể được gọi mà không cần tạo đối tượng của lớp.

<br />

## Final

*Định nghĩa*: final được sử dụng để khai báo **hằng số**, phương thức **không thể ghi đè**, hoặc class **không thể kế thừa**.

Ứng dụng:
- *Biến final*: Không thể thay đổi giá trị sau khi đã khởi tạo.
- *Method final*: Không thể bị ghi đè bởi lớp con.
- *Class final*: Không thể bị kế thừa.

<br />

## Tổng kết

| Package    | Static | Final |
| --- | --- | --- |
| Giúp tổ chức mã nguồn. | Cho phép chia sẻ tài nguyên chung. | Cung cấp tính bất biến và bảo vệ class/method. |


## Ví dụ

<br />

**Point.java**
```java
package models;

public class Point {
    public static final int xO = 0;
    public static final int yO = 0;

    public static void displayOrigin() {
        System.out.println("xO, yO of class_Point: " + xO + ","  + yO );
    }

    public int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final void Display() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public float distanceFromOrigin() {
        return (float) Math.sqrt(x*x + y*y);
    }

    public float distanceFrom(Point d) {
        if (d == null)
            return 0;
        return (float) Math.sqrt((x - d.x)*(x - d.x) + (y - d.y)*(y - d.y));
    }
}
```

**Circle.java**
```java
package models;

public class Circle extends Point{

    public int R;

    public Circle(int x, int y, int R) {
        super(x, y);
        this.R = R;
    }


}
```

**Utils.java**
```java
package utils;

import models.Circle;

public final class Utils {
    private int iou = 0; // khong the truy cap tu method static, vi no khong thuoc bien static

    public static double calcCOfCircle(Circle circle) {
        return circle.R * 2 * Math.PI;
    }

    public static double calcDOfCircle(Circle circle) {
        return circle.R * 2;
    }

}
```

**Main.java**
```java
import jdk.jshell.execution.Util;
import models.Circle;
import models.Point;
import utils.Utils;

import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 4);
        Circle circle2 = new Circle(17, 20, 4);

        Point p1 = new Point(-1, -2);
        Point p2 = new Point(-8, -10);

        circle.Display();

        System.out.println("C of Circle: " + Utils.calcCOfCircle(circle));
        System.out.println("D of Circle: " + Utils.calcDOfCircle(circle));

//        Point.xO = 1; // Bien xO trong point la final nen khong the gan gia tri
//        Point.yO = 2; // Bien yO trong point la final nen khong the gan gia tri

        p1.displayOrigin();
        p2.displayOrigin();

        circle.displayOrigin();
        circle2.displayOrigin();

    }
}
```
