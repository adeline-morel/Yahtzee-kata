import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class YahtzeeTest {

  //Voici les catégories pour scorer :
  //  public enum Categorie {
  //    UNS, DEUX, TROIS, QUATRE, CINQ, SIX,
  //    BRELAN, CARRE, FULL,
  //    PETITE_SUITE, GRANDE_SUITE,
  //    YAHTZEE, CHANCE
  //  }

  // Description d'un tour de jeu :
  // 1) J'annonce une catégorie
  // 2) Je lance 5 dés
  // 3) Je note mon score dans la catégorie annoncée

  // =====================================================================================
  // ÉTAPE 1 : Catégories de la partie supérieure (somme des dés)
  // =====================================================================================

  // Je veux marquer dans la catégorie des UNS et il y a 2 dés 1, le score est de 2
  @Test
  void shouldMyTestToRename1() {
    //     assertThat(new Yahtzee(List.of(1, 1, 2, 4, 4)).score(Categorie.UNS)).isEqualTo(2);
  }

  // Je veux marquer dans la catégorie des UNS et il y a 5 dés 1, le score est de 5
  @Test
  void shouldMyTestToRename2() {
    //     assertThat(new Yahtzee(List.of(1, 1, 1, 1, 1)).score(Categorie.UNS)).isEqualTo(5);
  }

  // Je veux marquer dans la catégorie des DEUX mais il n'y a pas de dé 2, le score est de 0
  @Test
  void shouldMyTestToRename3() {
    //     assertThat(new Yahtzee(List.of(1, 3, 4, 5, 6)).score(Categorie.DEUX)).isEqualTo(0);
  }

  // Je veux marquer dans la catégorie des DEUX et il y a 2 dés 2, le score est de 4
  @Test
  void shouldMyTestToRename4() {
    //     assertThat(new Yahtzee(List.of(1, 2, 3, 2, 6)).score(Categorie.DEUX)).isEqualTo(4);
  }

  // Je veux marquer dans la catégorie des TROIS et il y a 3 dés 3, le score est de 9
  @Test
  void shouldMyTestToRename5() {
    //     assertThat(new Yahtzee(List.of(1, 2, 3, 3, 3)).score(Categorie.TROIS)).isEqualTo(9);
  }

  // Je veux marquer dans la catégorie des QUATRE et il y a 4 dés 4, le score est de 16
  @Test
  void shouldMyTestToRename6() {
    //     assertThat(new Yahtzee(List.of(4, 4, 4, 4, 5)).score(Categorie.QUATRE)).isEqualTo(16);
  }

  // Je veux marquer dans la catégorie des CINQ et il y a 2 dés 5, le score est de 10
  @Test
  void shouldMyTestToRename7() {
    //     assertThat(new Yahtzee(List.of(4, 4, 4, 5, 5)).score(Categorie.CINQ)).isEqualTo(10);
  }

  // Je veux marquer dans la catégorie des SIX et il y a 3 dés 6, le score est de 18
  @Test
  void shouldMyTestToRename8() {
    //     assertThat(new Yahtzee(List.of(6, 5, 6, 6, 5)).score(Categorie.SIX)).isEqualTo(18);
  }

  // =====================================================================================
  // ÉTAPE 2 : Catégories de la partie inférieure (combinaisons)
  // =====================================================================================

  // La catégorie CHANCE est la somme de tous les dés
  @Test
  void shouldMyTestToRename9() {
    //     assertThat(new Yahtzee(List.of(1, 2, 3, 4, 5)).score(Categorie.CHANCE)).isEqualTo(15);
  }

  @Test
  void shouldMyTestToRename10() {
    //    assertThat(new Yahtzee(List.of(1, 6, 3, 4, 5)).score(Categorie.CHANCE)).isEqualTo(19);
  }

  // Un YAHTZEE (5 dés identiques) vaut 50 points
  @Test
  void shouldMyTestToRename11() {
    //     assertThat(new Yahtzee(List.of(4, 4, 4, 4, 4)).score(Categorie.YAHTZEE)).isEqualTo(50);
  }

  // Une combinaison qui n'est pas un YAHTZEE vaut 0 dans cette catégorie
  @Test
  void shouldMyTestToRename12() {
    //     assertThat(new Yahtzee(List.of(1, 2, 3, 4, 5)).score(Categorie.YAHTZEE)).isEqualTo(0);
  }

  // Un BRELAN (au moins 3 dés identiques) vaut la somme de tous les dés
  @Test
  void shouldMyTestToRename13() {
    //     assertThat(new Yahtzee(List.of(3, 3, 3, 4, 5)).score(Categorie.BRELAN)).isEqualTo(18);
  }

  // Une combinaison sans BRELAN vaut 0 dans cette catégorie
  @Test
  void shouldMyTestToRename14() {
    //     assertThat(new Yahtzee(List.of(1, 2, 3, 4, 5)).score(Categorie.BRELAN)).isEqualTo(0);
  }

  // Un CARRE (au moins 4 dés identiques) vaut la somme de tous les dés
  @Test
  void shouldMyTestToRename15() {
    //     assertThat(new Yahtzee(List.of(2, 2, 2, 2, 5)).score(Categorie.CARRE)).isEqualTo(13);
    // Un Yahtzee est aussi un Carré, donc le score est la somme des dés.
    //     assertThat(new Yahtzee(List.of(5, 5, 5, 5, 5)).score(Categorie.CARRE)).isEqualTo(25);
  }

  // Un FULL (un Brelan et une Paire) vaut 25 points
  @Test
  void shouldMyTestToRename16() {
    //     assertThat(new Yahtzee(List.of(2, 2, 3, 3, 3)).score(Categorie.FULL)).isEqualTo(25);
  }

  // Une combinaison qui n'est pas un FULL vaut 0 dans cette catégorie
  @Test
  void shouldMyTestToRename17() {
    //     assertThat(new Yahtzee(List.of(2, 3, 4, 5, 6)).score(Categorie.FULL)).isEqualTo(0);
  }

  // Une PETITE SUITE (4 dés qui se suivent) vaut 30 points
  @Test
  void shouldMyTestToRename18() {
    //     assertThat(new Yahtzee(List.of(3, 4, 2, 5, 1)).score(Categorie.PETITE_SUITE)).isEqualTo(30);
  }

  // Une combinaison qui n'est pas une PETITE SUITE vaut 0
  @Test
  void shouldMyTestToRename20() {
    //     assertThat(new Yahtzee(List.of(1, 2, 3, 5, 6)).score(Categorie.PETITE_SUITE)).isEqualTo(0);
  }

  @Test
  void shouldMyTestToRename19() {
    // les doublons sont ok (test non obligatoire, le laisser commenté s'il passe direct au vert)
    //     assertThat(new Yahtzee(List.of(1, 2, 2, 3, 4)).score(Categorie.PETITE_SUITE)).isEqualTo(30);
  }

  // Une GRANDE SUITE (5 dés qui se suivent) vaut 40 points
  @Test
  void shouldMyTestToRename21() {
    //     assertThat(new Yahtzee(List.of(6, 2, 3, 4, 5)).score(Categorie.GRANDE_SUITE)).isEqualTo(40);
  }

  // Une combinaison qui n'est pas une GRANDE SUITE vaut 0
  @Test
  void shouldMyTestToRename22() {
    // Une petite suite n'est pas une grande suite
    //     assertThat(new Yahtzee(List.of(1, 1, 2, 3, 4)).score(Categorie.GRANDE_SUITE)).isEqualTo(0);
  }

  // =====================================================================================
  // ÉTAPE BONUS : Validation des entrées (cas limites)
  // =====================================================================================

  // 1. Vérifier qu'il n'y a bien que 5 dés
  // 2. Vérifier que mes dés vont de 1 à 6
}
