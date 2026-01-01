class Point {
    // Attributs
    private double x, y;

    // Constructeur
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* Méthode distance : retourne la distance entre deux points */
    static double distance(Point p1, Point p2) {
        double d;
        d = Math.sqrt(Math.pow((p1.x - p2.x), 2.0) + Math.pow((p1.y - p2.y), 2.0));
        return (d);
    }

    // Méthode affiche : affiche les coordonnés d'un point
    void affiche(int n) {
        System.out.println("p" + n + "=" + "(" + x + "," + y + ")");
    }
}
