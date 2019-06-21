//Name : Nur Fajryani (D1041171045)
//file name : Product.java
//date time create : 23rd of May 2019. 8.45 p.m.
//description : make atributs of product

package VMAIO;
//Superclass
class Product {
    //method default
    void setNama() {
        String product = "Tidak Bernama";
    }

    void setHarga() {
        String harga = "Tidak Ada Harga";
    }
}

//subclass pertama
class bottle1 extends Product {
    @Override
    void setNama() {
        String bottle = "Coca-Cola";
        System.out.print("1. "+bottle);
    }

    @Override
    void setHarga() {
        String harga = "Rp 5.000";
        System.out.println("\t"+harga);
        
    }
}

    class bottle2 extends Product{
        @Override
        void setNama() {
            String bottle = "Minute Maid";
            System.out.print("2. "+bottle);
        }

        @Override
        void setHarga() {
            String harga = "Rp 5.000";
            System.out.println("\t"+harga);
        }
    }

    class bottle3 extends Product {
        @Override
        void setNama() {
            String bottle = "TaB";
            System.out.print("3. "+bottle);
        }

        @Override
        void setHarga() {
            String harga = "Rp 10.000";
            System.out.println("\t\t"+harga);
        }
    }

    class bottle4 extends Product {
        @Override
        void setNama() {
            String bottle = "Fanta";
            System.out.print("4. "+bottle);
        }

        @Override
        void setHarga() {
            String harga = "Rp 5.000";
            System.out.println("\t"+harga);
        }
    }

    class bottle5 extends Product {
        @Override
        void setNama() {
            String bottle = "Aquarius";
            System.out.print("5. "+bottle);
        }

        @Override
        void setHarga() {
            String harga = "Rp 10.000";
            System.out.println("\t"+harga);
        }
    }
//subclass kedua
class cans1 extends Product {
    @Override
    void setNama() {
        String cans = "AW";
        System.out.print("6. "+cans);
    }

    @Override
    void setHarga() {
        String harga = "Rp 5.000";
        System.out.println("\t\t"+harga);
    }
}

    class cans2 extends Product {
        @Override
        void setNama() {
            String cans = "Ciel";
            System.out.print("7. "+cans);
        }

        @Override
        void setHarga() {
            String harga = "Rp 5.000";
            System.out.println("\t\t"+harga);
        }
}

class cans3 extends Product {
    @Override
    void setNama() {
        String cans = "Sprite";
        System.out.print("8. "+cans);
    }

    @Override
    void setHarga() {
        String harga = "Rp 5.000";
        System.out.println("\t"+harga);
    }
}

class cans4 extends Product{
    @Override
    void setNama() {
        String cans = "Burn";
        System.out.print("9. "+cans);
    }

    @Override
    void setHarga() {
        String harga = "Rp 10.000";
        System.out.println("\t\t"+harga);
    }
}

class cans5 extends Product {
    @Override
    void setNama() {
        String cans = "Fresca";
        System.out.print("10. "+cans);
    }

    @Override
    void setHarga() {
        String harga = "Rp 10.000";
        System.out.println("\t"+harga);
    }
}
