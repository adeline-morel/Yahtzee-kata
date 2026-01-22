import {expect} from "vitest";

//Voici les catégories pour scorer :
//    UNS, DEUX, TROIS, QUATRE, CINQ, SIX,
//    BRELAN, CARRE, FULL,
//    PETITE_SUITE, GRANDE_SUITE,
//    YAHTZEE, CHANCE

// Description d'un tour de jeu :
// 1) J'annonce une catégorie
// 2) Je lance 5 dés
// 3) Je note mon score dans la catégorie annoncée

describe('YahtzeeTest', () => {

  // Description d'un tour de jeu :
  // 1) J'annonce une catégorie
  // 2) Je lance 5 dés
  // 3) Je note mon score dans la catégorie annoncée

  // =====================================================================================
  // ÉTAPE 1 : Catégories de la partie supérieure (somme des dés)
  // =====================================================================================

  // Je veux marquer dans la catégorie des UNS et il y a 2 dés 1, le score est de 2
  it('should my test to rename 1', () => {
     // expect(new Yahtzee([1, 1, 2, 4, 4]).score(Categorie.UNS)).toBe(2);
  });

  // Je veux marquer dans la catégorie des UNS et il y a 5 dés 1, le score est de 5
  it('should my test to rename 2', () => {
    // expect(new Yahtzee([1, 1, 1, 1, 1]).score(Categorie.UNS)).toBe(5);
  });

  // Je veux marquer dans la catégorie des DEUX mais il n'y a pas de dé 2, le score est de 0
  it('should my test to rename 3', () => {
    // expect(new Yahtzee([1, 3, 4, 5, 6]).score(Categorie.DEUX)).toBe(0);
  });

  // Je veux marquer dans la catégorie des DEUX et il y a 2 dés 2, le score est de 4
  it('should my test to rename 4', () => {
    // expect(new Yahtzee([1, 2, 3, 2, 6]).score(Categorie.DEUX)).toBe(4);
  });

  // Je veux marquer dans la catégorie des TROIS et il y a 3 dés 3, le score est de 9
  it('should my test to rename 5', () => {
    // expect(new Yahtzee([1, 2, 3, 3, 3]).score(Categorie.TROIS)).toBe(9);
  });

  // Je veux marquer dans la catégorie des QUATRE et il y a 4 dés 4, le score est de 16
  it('should my test to rename 6', () => {
    // expect(new Yahtzee([4, 4, 4, 4, 5]).score(Categorie.QUATRE)).toBe(16);
  });

  // Je veux marquer dans la catégorie des CINQ et il y a 2 dés 5, le score est de 10
  it('should my test to rename 7', () => {
    // expect(new Yahtzee([4, 4, 4, 5, 5]).score(Categorie.CINQ)).toBe(10);
  });

  // Je veux marquer dans la catégorie des SIX et il y a 3 dés 6, le score est de 18
  it('should my test to rename 8', () => {
    // expect(new Yahtzee([6, 5, 6, 6, 5]).score(Categorie.SIX)).toBe(18);
  });

  // =====================================================================================
  // ÉTAPE 2 : Catégories de la partie inférieure (combinaisons)
  // =====================================================================================

  // La catégorie CHANCE est la somme de tous les dés
  it('should my test to rename 9', () => {
    // expect(new Yahtzee([1, 2, 3, 4, 5]).score(Categorie.CHANCE)).toBe(15);
  });

  it('should my test to rename 10', () => {
    // expect(new Yahtzee([1, 6, 3, 4, 5]).score(Categorie.CHANCE)).toBe(19);
  });

  // Un YAHTZEE (5 dés identiques) vaut 50 points
  it('should my test to rename 11', () => {
    // expect(new Yahtzee([4, 4, 4, 4, 4]).score(Categorie.YAHTZEE)).toBe(50);
  });

  // Une combinaison qui n'est pas un YAHTZEE vaut 0 dans cette catégorie
  it('should my test to rename 12', () => {
    // expect(new Yahtzee([1, 2, 3, 4, 5]).score(Categorie.YAHTZEE)).toBe(0);
  });

  // Un BRELAN (au moins 3 dés identiques) vaut la somme de tous les dés
  it('should my test to rename 13', () => {
    // expect(new Yahtzee([3, 3, 3, 4, 5]).score(Categorie.BRELAN)).toBe(18);
  });

  // Une combinaison sans BRELAN vaut 0 dans cette catégorie
  it('should my test to rename 14', () => {
    // expect(new Yahtzee([1, 2, 3, 4, 5]).score(Categorie.BRELAN)).toBe(0);
  });

  // Un CARRE (au moins 4 dés identiques) vaut la somme de tous les dés
  it('should my test to rename 15', () => {
    // expect(new Yahtzee([2, 2, 2, 2, 5]).score(Categorie.CARRE)).toBe(13);
    // Un Yahtzee est aussi un Carré, donc le score est la somme des dés.
    // expect(new Yahtzee([5, 5, 5, 5, 5]).score(Categorie.CARRE)).toBe(25);
  });

  // Un FULL (un Brelan et une Paire) vaut 25 points
  it('should my test to rename 16', () => {
    // expect(new Yahtzee([2, 2, 3, 3, 3]).score(Categorie.FULL)).toBe(25);
  });

  // Une combinaison qui n'est pas un FULL vaut 0 dans cette catégorie
  it('should my test to rename 17', () => {
    // expect(new Yahtzee([2, 3, 4, 5, 6]).score(Categorie.FULL)).toBe(0);
  });

  // Une PETITE SUITE (4 dés qui se suivent) vaut 30 points
  it('should my test to rename 18', () => {
    // expect(new Yahtzee([3, 4, 2, 5, 1]).score(Categorie.PETITE_SUITE)).toBe(30);
  });

  // Une combinaison qui n'est pas une PETITE SUITE vaut 0
  it('should my test to rename 20', () => {
    // expect(new Yahtzee([1, 2, 3, 5, 6]).score(Categorie.PETITE_SUITE)).toBe(0);
  });

  it('should my test to rename 19', () => {
    // les doublons sont ok (test non obligatoire, le laisser commenté s'il passe direct au vert)
    // expect(new Yahtzee([1, 2, 2, 3, 4]).score(Categorie.PETITE_SUITE)).toBe(30);
  });

  // Une GRANDE SUITE (5 dés qui se suivent) vaut 40 points
  it('should my test to rename 21', () => {
    // expect(new Yahtzee([6, 2, 3, 4, 5]).score(Categorie.GRANDE_SUITE)).toBe(40);
  });

  // Une combinaison qui n'est pas une GRANDE SUITE vaut 0
  it('should my test to rename 22', () => {
    // Une petite suite n'est pas une grande suite
    // expect(new Yahtzee([1, 1, 2, 3, 4]).score(Categorie.GRANDE_SUITE)).toBe(0);
  });

  // =====================================================================================
  // ÉTAPE BONUS : Validation des entrées (cas limites)
  // =====================================================================================

  // 1. Vérifier qu'il n'y a bien que 5 dés
  // 2. Vérifier que mes dés vont de 1 à 6
});
