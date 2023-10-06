/*
 Toomas
 IT-22
 Ülesanne2
 */


class h2{
public static void main(String[] args){
double toll = 15.0;
double s = tollid(toll);
int m = minutid(343);
int[] l = {15,14};
double[] sp = {1, 0.1, 3, 0.2}; // 1 distants (km) 1 kiirus (h)  ja  2 distants (km) 2 kiirus (h)
double k1 = sp[0]/sp[1];
double k2 = sp[2]/sp[3];
System.out.println("Esimese sportlase kiirus on: "+ k1 + " km/h teise sportalse kiirus on " + k2 + " km/h kiiruste vahe on " + (k2 % k1)+" km/h");
double ellips = Math.round(Math.PI*l[0]*l[1]);
System.out.println("Ellipsi pindala on "+ellips);
System.out.println(toll + " tolli on " + s +" meetrit");

}
static double tollid(double a){
double meetrid = a * 0.0254;
return meetrid;
}
static int minutid(int a){
int tunnid = a / 60;
int minutid = a % 60;
System.out.println(a + " minutit on "+ tunnid + " tundi ja " + minutid + " minutit");
return a;
}
}