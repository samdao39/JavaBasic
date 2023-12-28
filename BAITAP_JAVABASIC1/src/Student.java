public class Student {
    public String name ;
    public static String gioiTinh = "nu";
    public void bienLoCal(){
        int age =25;
    System.out.println( "Tuoi:" + age);
}
    public void Variables( String name){
        this.name = name;
            System.out.println("Tên của bạn là:" + name);
}
public static void main(String[]args){
    System.out.println("giới Tính là:"+ Student.gioiTinh);
    Student Bien2 = new Student();
    Bien2.Variables("sam");
    Bien2.bienLoCal();
}
}
