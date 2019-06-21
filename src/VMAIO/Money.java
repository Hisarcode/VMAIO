//Name : Syahfira Mulya
//file name : money.java
//date time create : 23rd of May 2019. 10.00 p.m.
//description : make atributs of money
// superclass
class uang {

    //method default
    void setNama () {
        String uang = "Tidak Terdeteksi";
        System.out.println("Uang anda : "+uang);
    }
    void setWarna () {
        String warna = "Tidak Terdeteksi";
        System.out.println("Uang anda : "+warna);
    }
    void setJumlah(){
        int jumlah = 0;
        System.out.println("Uang anda : "+jumlah);
    }
}

//Subclass pertama
class limapuluh extends uang{

    @Override
    void setNama(){
        String limapuluh  = "Rp. 50.000,- (Lima puluh ribu rupiah)";
        System.out.println("Uang anda : "+limapuluh);
    }

    @Override
    void setWarna(){
        String warna = "Biru";
        System.out.println("Uang anda berwarna : "+warna);
    }
    @Override
    void setJumlah(){
        int jumlah = 50000;
        System.out.println("Uang anda bernilai : "+jumlah+" rupiah");
    }
}

//Subclass Kedua
class duapuluh extends uang{

    @Override
    void setNama(){
        String duapuluh  = "Rp. 20.000,- (Dua puluh ribu rupiah)";
        System.out.println("Uang anda : "+duapuluh);
    }

    @Override
    void setWarna(){
        String warna = "Hijau";
        System.out.println("Uang anda berwarna : "+warna);
    }
    @Override
    void setJumlah(){
        int jumlah = 20000;
        System.out.println("Uang anda bernilai : "+jumlah+" rupiah");
    }
}

//Subclass Ketiga
class sepuluh extends uang{

    @Override
    void setNama(){
        String sepuluh  = "Rp. 10.000,- (Dua puluh ribu rupiah)";
        System.out.println("Uang anda : "+sepuluh);
    }

    @Override
    void setWarna(){
        String warna = "Ungu";
        System.out.println("Uang anda berwarna : "+warna);
    }
    @Override
    void setJumlah(){
        int jumlah = 10000;
        System.out.println("Uang anda bernilai : "+jumlah+" rupiah");
    }
}

//Subclass Keempat
class lima extends uang{

    @Override
    void setNama(){
        String lima  = "Rp. 5.000,- (Lima ribu rupiah)";
        System.out.println("Uang anda : "+lima);
    }

    @Override
    void setWarna(){
        String warna = "Cokelat";
        System.out.println("Uang anda berwarna : "+warna);
    }
    @Override
    void setJumlah(){
        int jumlah = 5000;
        System.out.println("Uang anda bernilai : "+jumlah+" rupiah");
    }
}
//------------------------------------------------------

//Kelas Utama/Main
public class money {
    public static void main(String [] args){
        //Cara Penulisan Objek: (superclass) variable = new (subclass);
        System.out.println("==== UANG DEFAULT ====");
        uang m = new uang();
        m.setNama();
        m.setWarna();
        m.setJumlah();

        System.out.println("==== UANG LIMA PULUH RIBU ====");
        uang o = new limapuluh();
        o.setNama();
        o.setWarna();
        o.setJumlah();

        System.out.println("==== UANG DUA PULUH RIBU ====");
        uang n = new duapuluh();
        n.setNama();
        n.setWarna();
        n.setJumlah();

        System.out.println("==== UANG SEPULUH RIBU ====");
        uang e = new sepuluh();
        e.setNama();
        e.setWarna();
        e.setJumlah();

        System.out.println("==== UANG LIMA RIBU ====");
        uang y = new lima();
        y.setNama();
        y.setWarna();
        y.setJumlah();
    }
}