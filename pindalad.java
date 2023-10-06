public class pindalad {
public pindalad(String alus, String korgus, String kylg);

    public static double roopkylikS(String a, String h) {
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus;
    return s;
    }
    
    public static double ristkylikS(String a, String h) {
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus;
    return s;
    }
    
    public static double kolmnurkS(String a, String h) {
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus/2;
    return s;
    }
    public static double trapetsS(String a, String h, String b) {
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    float kylg = Float.parseFloat(b);
    double s = (alus + kylg)/2*korgus;
    return s;
    }
    }
