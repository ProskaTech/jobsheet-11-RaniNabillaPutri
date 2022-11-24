//created by 21343034_Rani Nabilla Putri
package Job11Lat4_Inheritence;

public class B extends A{
    private int b;

    public void setB(int nilai){
        b = nilai;
    }

    public int getB(){
        return b;
    }
    //melakukan override terhadap method tampilkanNilai()
    //yang terhadap pada kelas A
    public void tampilkanNilai(){
        super.tampilkanNilai(); //memanggil method dalam kelas A
        System.out.println("Nilai b = " + getB());
    }
}