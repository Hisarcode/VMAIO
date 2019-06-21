//Name : Nur Fajryani (D1041171045)
//file name : Product.java
//date time create : 23rd of May 2019. 8.45 p.m.
//description : make atributs of product
//Superclass
class softdrink {
    //method default
    void setNama() {
        String product = "Tidak Bernama";
        System.out.println("Nama Product : " + product);
    }

    void setHarga() {
        String harga = "Tidak Ada Harga";
        System.out.println("Harga Product : " + harga);
    }
}

//subclass pertama
class bottle1 extends softdrink {
    @Override
    void setNama() {
        String bottle = "Coca-Cola";
        System.out.print("Product : " + bottle);
    }

    @Override
    void setHarga() {
        String harga = "Rp 5.000";
        System.out.println("\t\t Price : " + harga);
    }
}

    class bottle2 extends softdrink {
        @Override
        void setNama() {
            String bottle = "Minute Maid";
            System.out.print("Product : " + bottle);
        }

        @Override
        void setHarga() {
            String harga = "Rp 5.000";
            System.out.println("\t Price : " + harga);
        }
    }

    class bottle3 extends softdrink {
        @Override
        void setNama() {
            String bottle = "TaB";
            System.out.print("Product : " + bottle);
        }

        @Override
        void setHarga() {
            String harga = "Rp 10.000";
            System.out.println("\t\t\t Price : " + harga);
        }
    }

    class bottle4 extends softdrink {
        @Override
        void setNama() {
            String bottle = "Fanta";
            System.out.print("Product : " + bottle);
        }

        @Override
        void setHarga() {
            String harga = "Rp 5.000";
            System.out.println("\t\t\t Price : " + harga);
        }
    }

    class bottle5 extends softdrink {
        @Override
        void setNama() {
            String bottle = "Aquarius";
            System.out.print("Product : " + bottle);
        }

        @Override
        void setHarga() {
            String harga = "Rp 10.000";
            System.out.println("\t\t Price : " + harga);
        }
    }
//subclass kedua
class cans1 extends softdrink {
    @Override
    void setNama() {
        String cans = "AW";
        System.out.print("Product : " + cans);
    }

    @Override
    void setHarga() {
        String harga = "Rp 5.000";
        System.out.println("\t\t Price : " + harga);
    }
}

    class cans2 extends softdrink {
        @Override
        void setNama() {
            String cans = "Ciel";
            System.out.print("Product : " + cans);
        }

        @Override
        void setHarga() {
            String harga = "Rp 5.000";
            System.out.println("\t\t Price : " + harga);
        }
}

class cans3 extends softdrink {
    @Override
    void setNama() {
        String cans = "Sprite";
        System.out.print("Product : " + cans);
    }

    @Override
    void setHarga() {
        String harga = "Rp 5.000";
        System.out.println("\t Price : " + harga);
    }
}

class cans4 extends softdrink {
    @Override
    void setNama() {
        String cans = "Burn";
        System.out.print("Product : " + cans);
    }

    @Override
    void setHarga() {
        String harga = "Rp 10.000";
        System.out.println("\t\t Price : " + harga);
    }
}

class cans5 extends softdrink {
    @Override
    void setNama() {
        String cans = "Fresca";
        System.out.print("Product : " + cans);
    }

    @Override
    void setHarga() {
        String harga = "Rp 10.000";
        System.out.println("\t Price : " + harga);
    }
}


//kelas utama/main
public class Product {
    public static void main(String[] args) {
        //Cara penulisan objek: (superclass)variable = new (subclass);
        System.out.println("======Softdrink Default======");
        softdrink s = new softdrink();
        s.setNama();
        s.setHarga();

        System.out.println("=====Minuman Botol=====");
        softdrink CocaCola = new bottle1();
        CocaCola.setNama();
        CocaCola.setHarga();

        softdrink MinuteMaid = new bottle2 ();
        MinuteMaid.setNama();
        MinuteMaid.setHarga();

        softdrink TaB = new bottle3 ();
        TaB.setNama();
        TaB.setHarga();

        softdrink Fanta = new bottle4 ();
        Fanta.setNama();
        Fanta.setHarga();

        softdrink Aquarius = new bottle5 ();
        Aquarius.setNama();
        Aquarius.setHarga();


        System.out.println("=====Minuman Kaleng=====");
        softdrink AW = new cans1();
        AW.setNama();
        AW.setHarga();

        softdrink pepsi = new cans2();
        pepsi.setNama();
        pepsi.setHarga();

        softdrink sprite = new cans3();
        sprite.setNama();
        sprite.setHarga();

        softdrink CocaColaZero = new cans4();
        CocaColaZero.setNama();
        CocaColaZero.setHarga();

        softdrink Fresca = new cans5();
        Fresca.setNama();
        Fresca.setHarga();
    }
}