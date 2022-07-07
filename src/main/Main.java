package main;

import entities.Personne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Personne> personnes= Arrays.asList(
                new Personne("DIALLO","Abdoul Karim",19),
                new Personne("THIARE","Mohamed",20),
                new Personne("TOURE","Souleyemane",30),
                new Personne("NDIAYE","Amad",30),
                new Personne("DIARRA","Mame",25),
                new Personne("DIATTA","Bouya",27),
                new Personne("CAMARA","Jean Claud",28),
                new Personne("DIALLO","Babacar",35)
        );
        /*Pour verifier si il existe une personne dont l'ages est superieur a 30*/
        boolean existe=personnes.stream().anyMatch(personne->personne.getAge()>=36);
        if (existe) System.out.printf("la personne existe oui");
        else System.out.printf("la personne n'existe pas");
////        /*Je voulais compter le nombre de personne qui ont un age supperieur a 19
////        * et une fois que je recupere la liste des ses personne j'applique le compte des nombres*/
        List<Personne> listePersonneAgeSupperieurA20=personnes.stream().filter(personne->personne.getAge()>=19)
                .collect(Collectors.toList());
        listePersonneAgeSupperieurA20.forEach(personne -> {
            System.out.printf("Nom et prenoms: "+personne.getNom()+" "+personne.getPrenoms()+"\n");
        });
        /*Recuperation des nombres des personnes qui ont un age supperieur a 19*/
        long nombre=listePersonneAgeSupperieurA20.stream().count();
        System.out.printf("le nombre est "+nombre);
////        if ((personnes.stream().anyMatch(personne -> personne.getAge()>=23))){
////            System.out.printf("il existe");
////        }
    }
}
