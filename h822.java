/*
 Toomas
 IT-22
 Ülesanne8.2.1
 */

public class h822 {
    public String mis;
    public String kus;
    public String millel;
    public String kellega;

    public h822(String mis, String kus, String millel, String kellega) {
        this.mis = mis;
        this.kus = kus;
        this.millel = millel;
        this.kellega = kellega;

    }

    public void mis() {
        System.out.println("olen " + mis);
    }

    public void kus() {
        System.out.println(mis + " olla " + kus + "l on raske");
    }

    public void millel() {
        System.out.println(millel + " on tore");
    }

    public void kellega() {
        System.out.println("praegu " + mis + " siin " + kus + " " + millel + " koos " + kellega);
    }
}