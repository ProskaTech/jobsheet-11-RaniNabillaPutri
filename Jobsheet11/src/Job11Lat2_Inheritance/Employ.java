//created by 21343034_Rani Nabilla Putri

package Job11Lat2_Inheritance;

public class Employ extends Person{
    private String noKaryawan;

    //konstruktor
    public Employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }

    //metode
    public void info(){
        System.out.println("No. karyawan: " + this.noKaryawan);
        super.info();
    }
}
