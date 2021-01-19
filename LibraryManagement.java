import java.util.Scanner;
 class Student {
    int RollNo, StudentClass;
    String Name;

    void accept_Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        Name = sc.nextLine();
        System.out.println("Enter Roll no: ");
        RollNo = sc.nextInt();
        System.out.println("Enter Class: ");
        StudentClass = sc.nextInt();
        sc.close();
    }

    void display_Student() {
        System.out.println("Name: "+Name);
        System.out.println("Roll no: "+RollNo);
        System.out.println("Class: "+StudentClass);
    }
}

class Library extends Student {
    int no_of_books;

    void accept_library() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of books: ");
        no_of_books = sc.nextInt();
        accept_Student();
        sc.close();
    }

    void display_library(){
        System.out.println("No of books :"+no_of_books);
    }
}

class Exam extends Student{
    int total;

    void accept_exam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Marks");
        total = sc.nextInt();
        accept_Student();
        sc.close();
    }

    void display_exam() {
        System.out.println("Name: "+Name);
        System.out.println("Roll no: "+RollNo);
        System.out.println("Total Marks: "+total);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Student Details");
        System.out.println("2.Library Details");
        System.out.println("3.Exam Details");

        int opt = sc.nextInt();
        switch(opt){
            case 1:
            Student std = new Student();
                std.accept_Student();
                std.display_Student();
                break;
            case 2:
                Library lib = new Library();
                lib.accept_library();
                lib.display_library();
                break;
            case 3:
                Exam ex = new Exam();
                ex.accept_exam();
                ex.display_exam();
                break;
            default:
                break;
        }
        sc.close();
    }
}
