/*
 Toomas
 IT-22
 Ülesanne9
 */

class mopeed {
    private String mudel;

    public mopeed(String mudel, int kiirus) {
        this.mudel = mudel;
        System.out.println("tippkiirus " + kiirus);
    }

    public void start() {
        System.out.println(mudel + "i mootor käivitati");
    }

    public String toString() {
        return mudel;
    }
}

class Soitja {
    public String nimi;

    public Soitja(String nimi) {
        this.nimi = nimi;
    }

    public void soida(mopeed moped) {
        System.out.println(nimi + " sõidab " + moped + "iga");
    }

    public String toString() {
        return nimi;
    }
}

class rada {
    private int pikkus;

    public rada(int pikkus) {
        this.pikkus = pikkus;
    }

    public void alustaTreeningut(Soitja soitja) {
        System.out.println(soitja + " alustab treeningut treeningrajal, mis on " + pikkus + " meetrit pikk.");
    }
}

public class h9 {
    public static void main(String[] args) {
        mopeed m1 = new mopeed("Peugeot Jet", 104);
        Soitja s1 = new Soitja("Ott. T");
        mopeed m2 = new mopeed("Yamaha TZR", 45);
        Soitja s2 = new Soitja("Colin. M");

        m1.start();
        s1.soida(m1);
        m2.start();
        s2.soida(m2);
    }
}