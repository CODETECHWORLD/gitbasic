
import java.util.Scanner;

class DefineGetterSetter {
    private String Name;
    private int age;

    public DefineGetterSetter(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }   
}

public class GetterSetter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String Name=sc.nextLine();
        System.out.println("Enter the age");
        int age=sc.nextInt();
        DefineGetterSetter dGS=new DefineGetterSetter(Name, age);
        GetterSetter GS=new GetterSetter();
        System.out.println("Name in Main method : "+ dGS.getName());
        System.out.println("Age in Method Block : "+ dGS.getAge());
        // GS.AccessGS(dGS.getName(),dGS.getAge());
    }

    public void AccessGS(String name,int age){
        System.out.println("Name in Method Block : "+ name);
        System.out.println("Age in Method Block : "+ age);
    }
}

