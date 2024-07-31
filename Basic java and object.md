# Class và object trong java

**Khái niệm**

**Class**:
- Nguyên mẫu để tạo ra đối tượng.
- Danh từ (ex: Scanner, Animal, Person, Dog, AbstractService).

**Object** (Đối tượng): 
- Là sự mô hình hóa cho một đối tượng thực.
- Thông tin, đặc điểm của đối tượng (tên, kích thước, ...).
- Hành vi/thao tác, hành động mà đối tượng đó có thể thực hiện (đi, đứng, nói,...).

## Java Class

Class là một bản thiết kế hoặc Nguyên mẫu do người dùng định nghĩa từ đó object được tạo ra.

Cho phép chia sẻ đặc tính/hành vi và thuộc tính một cách tổng quát.

*Ví dụ*:

"Student" là một class trong khi một Student cụ thể có tên là "Ravi" là một object.

Một **Class** bao gồm:
- Class không phải là một thực thể. Nó chỉ là một bản mẫu hoặc bản thiết kế, từ đó object được tạo ra.
- Class giúp nhóm các thuộc tính và hành vi.
- Cấu trúc của **Class** bao gồm:
  - Các thuộc tính.
  - Các phương thức.
  - Constructor (hàm khởi tạo).

*Ví dụ*

khi ta nói Mèo, đó chỉ là một khái niệm; còn khi ta nói con Mèo Tom, đó mới thực sự là một con Mèo cụ thể

**Định nghĩa *Class* trong *Java***:
```java
Quyền_truy_cập class <tên_class> {
    properties;
    constructors; 
    methods;
}
```

<br />

## Java Object

Object là đơn vị (unit) cơ bản của (OOP) và đại diện cho thực thể trong cuộc sống thực (real-life).

Object được tạo ra từ Class.

Khởi tạo object trong java bằng từ khóa **new**.

<br />

Ví dụ 1:

**Student.java**
```java
import java.util.Date;
import java.util.Random;

public class Student {

    Long id;
    String name;
    Date dateOfBirth;

    public Student(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Random rand = new Random();
        this.id = rand.nextLong();
    }

    public void goToSchool() {
        System.out.println("Student " + this.id + ":" + this.name + " is going to school");
    }

    public int learn(String course) {
        Random rand = new Random();
        System.out.println(this.name + " is learning " + course);
        return rand.nextInt(11);
    }
}
```

**Main.java**
```java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student qui = new Student("Qui Lam", new Date());
        int scoreOfQui = qui.learn("Toan");
        System.out.println(scoreOfQui);
        qui.goToSchool();

        System.out.println();

        Student nhu = new Student("Nhu", new Date());
        int scoreOfNhu = nhu.learn("Tin");
        System.out.println(scoreOfNhu);
        nhu.goToSchool();
    }
}
```

<br />
<br />

## Java example_1

<br />

Ví dụ:
**Point.java**
```java
public class Point {

    private int x;
    private int y;

    // Ham_khoi_tao co_tham_so int x, int y constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Ham_khoi_tao mac_nhien
    Point() {

    }

    public void display() {
        System.out.println(this.x + " " + this.y);
    }

    public void move(int dx, int dy) {
        this.x += dx; // x = x + dx
        this.y += dy; // y = y + dx
    }

    public float distanceFromOrigin() {
        float X = (0 - this.x) * (0 - this.x);
        float Y = (0 - this.y) * (0 - this.y);

        float result = (float) Math.sqrt(X + Y); // 64 -> 32
        return result;
    }

    public float distanceFrom(Point p) {
        if (p == null) {
            return 0;
        }
        float X = (float) Math.pow(p.x - this.x, 2);
        float Y = (float) Math.pow(p.y - this.y, 2);
        float result = (float) Math.sqrt(X + Y);
        return result;
    }

}
```

**Main.java**
```java
public class Main {
    public static void main(String[] args) {
        Point p1 = null;
//                = new Point(1, 2);
//        p1.move(1, 10);
//        p1.display();
//        System.out.println("Khoang cach p1 den toa do O la: " + p1.distanceFromOrigin());

        Point p2 = new Point(-10, - 78);
        System.out.println("Khoang cach p2 den p1 la: " + p2.distanceFrom(p1));

    }
}
```
