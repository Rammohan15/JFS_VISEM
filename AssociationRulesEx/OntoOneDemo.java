
// class Passport{
//     int passportNo;
//     String nationality;

//     public Passport(int passportNo,String nationality) {
//         this.passportNo=passportNo;
//         this.nationality=nationality;
//     }
// }
// class Person{
//     int id;
//     String name;
//     Passport pass;

//     public Person(int id,String name,Passport p) {
//         this.id=id;
//         this.name=name;
//         this.pass=p;
//     }
// }
// public class OnetoOneDemo {
//     public static void main(String[] args) {
//         Passport p=new Passport(987654,"Indian");
//         Person m=new Person(1,"krishna",p);
//         System.out.println(m.pass.passportNo);
//     }
// }

import java.util.Scanner;

class Passport {
    int passportNo;
    String nationality;

    public Passport(int passportNo, String nationality) {
        this.passportNo = passportNo;
        this.nationality = nationality;
    }
}

class Person {
    int id;
    String name;
    Passport pass;

    public Person(int id, String name, Passport p) {
        this.id = id;
        this.name = name;
        this.pass = p;
    }
}

public class OntoOneDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Passport p;
        Person m[];
        int n;
        n = 3;
        m = new Person[n];
        for (int i = 0; i < n; i++) {
            p = new Passport(1000 + i, "Indian");
            System.out.println("Enter id of a person: ");
            int id = sc.nextInt();
            System.out.println("Enter name of the Person: ");
            String name = sc.next();
            m[i] = new Person(id, name, p);
        }
        System.out.println("Enter ID(0 to " + (n - 1) + ")");
        int k;
        k = sc.nextInt();
        System.out.println("Name : " + m[k].name);
        System.out.println("passportno : " + m[k].pass.passportNo);
        System.out.println("nationality : " + m[k].pass.nationality);

    }
}
