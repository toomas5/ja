/*
 Toomas
 IT-22
 Ülesanne8.2.1
 */

public class h821 {
    public String nimi;
    public int vanus;
    public String tüüp;
    public String riik;

    public h821(String nimi, int vanus, String tüüp, String riik) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.tüüp = tüüp;
        this.riik = riik;
    }

    public void nimi() {
        System.out.println("nimi on  " + nimi);
    }

    public void vanus() {
        System.out.println("vanust on " + vanus);
    }

    public void tüüp() {
        System.out.println("olen hetkel " + tüüp);
    }

    public void riik() {
        System.out.println("elan " + riik + " kulul");
    }

    public void auto() {
        System.out.println("tere olen " + nimi + "olen" + vanus + olen + tüüp + "ja elan" + riik + "s");
    }

}