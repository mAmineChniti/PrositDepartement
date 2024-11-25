public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Ressources Humaines", 5);
        Departement d3 = new Departement(3, "Finance", 8);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        System.out.println("\nRecherche par nom 'Informatique': " + gestion.rechercherDepartement("Informatique"));
        System.out.println("Recherche par objet 'd1': " + gestion.rechercherDepartement(d1));

        System.out.println("\nAffichage des départements :");
        gestion.displayDepartement();

        System.out.println("\nSuppression du département 'd2':");
        gestion.supprimerDepartement(d2);

        System.out.println("\nAffichage après suppression :");
        gestion.displayDepartement();

        System.out.println("\nDépartements triés par ID :");
        for (Departement dep : gestion.trierDepartementById()) {
            System.out.println(dep);
        }
    }
}