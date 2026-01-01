class Temps {
    // Attributs
    private int heure, minute, seconde;

    // 1er Constructeur
    Temps(int heure) {
        this.heure = heure;
    }

    // 2ème Constructeur
    Temps(int heure, int minute) {
        this(heure); // Appel du premier constructeur
        this.minute = minute;
    }

    // 3ème constructeur
    Temps(int heure, int minute, int seconde) {
        this(heure, minute); // Appel du second constructeur
        this.seconde = seconde;
    }

    // Méthode affiche
    void affiche() {
        System.out.println("Il est : " + heure + " heures " + minute + " minutes " + seconde + " secondes");
    }

    public static void main(String[] args) {
        // Appel du premier constructeur
        Temps t = new Temps(10);
        /* affiche: Il est : 10 heures 0 minutes 0 secondes */
        t.affiche();

        // Appel du second constructeur
        t = new Temps(10, 12);
        /* affiche: Il est : 10 heures 12 minutes 0 secondes */
        t.affiche();

        // Appel du troisième constructeur
        t = new Temps(10, 12, 45);
        /* affiche: Il est : 10 heures 12 minutes 45 secondes */
        t.affiche();
    }
}
