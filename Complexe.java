class Complexe {
    // Attributs
    private double re;
    private double im;

    // Constructeur
    Complexe(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // méthode info
    String info() {
        return ("<re:" + re + ",im:" + im + ">");
    }

    // méthode produit
    Complexe produit(Complexe z1) {
        Complexe z = new Complexe(0, 0);
        z.re = re * z1.re - im * z1.im;
        z.im = re * z1.im + im * z1.re;
        return (z);
    }

    // méthode produit surchargée
    static Complexe produit(Complexe z1, Complexe z2) {
        Complexe z = new Complexe(0, 0);
        z.re = z1.re * z2.re - z1.im * z2.im;
        z.im = z1.re * z2.im + z1.im * z2.re;
        return (z);
    }
}
