public class ruumalad {
public ruumalad(String alus, String korgus, String kylg);


    public static double trapetsS(String a, String h, String b) {
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    float kylg = Float.parseFloat(b);
    double s = (alus + kylg)/2*korgus;
    return s;
    }
    }
