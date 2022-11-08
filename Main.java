public class Main {
    public static void main(String[] args) {
        dosen a = new dosen();
        a.setNama("anda");
        a.setNip(2100018133);
        a.setAlamat("salatiga");
        a.setTglLahir(20);
        a.setBulanLahir(8);
        a.setTahunLahir(2002);
        a.setJk("laki-laki");
        a.setTahunMasuk(2020);

        System.out.println("Nama\t\t\t: " + a.getNama());
        System.out.println("Nip \t\t\t: " + a.getNip());
        System.out.println("alamat\t\t\t: " + a.getAlamat());
        System.out.println("Ttl\t\t\t\t: " + a.getTglLahir()+"-"+a.getBulanLahir()+"-"+a.getTahunLahir());
        System.out.println("jenis klamin\t: " + a.getJk());
        System.out.println("Tahun masuk\t\t: " + a.getTahunMasuk());
        System.out.println("gaji pokok\t\t: "+a.getGaji());
        System.out.println(" ");

        tendik c = new tendik();
        c.setNama("dia");
        c.setNip(2100018133);
        c.setAlamat("jogja");
        c.setTglLahir(11);
        c.setBulanLahir(2);
        c.setTahunLahir(2004);
        c.setJk("perempuan");
        c.setTahunMasuk(2022);

        System.out.println("Nama\t\t\t: " + c.getNama());
        System.out.println("Nip \t\t\t: " + c.getNip());
        System.out.println("alamat\t\t\t: " + c.getAlamat());
        System.out.println("Ttl\t\t\t\t: " + c.getTglLahir()+"-"+c.getBulanLahir()+"-"+c.getTahunLahir());
        System.out.println("jenis klamin\t: " + c.getJk());
        System.out.println("Tahun masuk\t\t: " + c.getTahunMasuk());
        System.out.println("gaji pokok\t\t: "+c.getGaji());
    }
}