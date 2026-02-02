# Yahtzee-kata
Base pour coder les règles du jeu du Yahtzee (configuré pour une résolution en Java ou TypeScript, avec des idées de tests pour se lancer et mieux comprendre les règles du jeu)

## Pour une résolution en TDD, avec l'aide des tests :
- décommenter le 1er test
- faire compiler en créant les classes, objets, méthodes,...
- ne pas tout de suite implémenter la solution : vérifier d'abord que le test fail
- implémenter la solution la plus simple et rapide pour faire passer le test
- si le test passe, possibilité à ce stade de refactorer le code (refactorings autorisés pour les tests = encapsulation pour séparer les responsabilités, nommage des tests)
- décommenter le second test et... ainsi de suite. La seule chose qui change est qu'il faudra maintenant relancer TOUS les tests, et seul le nouveau test doit suivre le cycle décrit précédemment (si un test précédent repasse au rouge = j'ai introduit une régression).
- Si le nouveau test décommenté passe directement au vert : je suis allé trop loin dans mon step précédent. Dans ce cas, revenir en arrière pour essayer de faire un plus petit step.

## Pour une résolution en TDD, sans l'aide des tests :
- copier coller le prompt ci-dessous + les tests et les donner à manger à une IA pour obtenir les règles du jeu (on peut aussi les trouver sur Internet, mais là vous aurez la variante du jeu sur laquelle je me suis basée, avec les règles dans un ordre intéressant pour être suivies en TDD)

### Prompt :
"Rôle : Tu es une IA experte en déduction fonctionnelle.
Objectif : Déduire et reformuler les règles complètes de scoring du Yahtzee à partir du code de tests ci-dessous.
⚠️ Source d’autorité unique : les tests fournis.
Tu dois uniquement utiliser ces tests pour inférer les règles.
N’ajoute aucune règle issue du jeu réel si elle n’est pas présente dans les tests.

Attendu :

Fournis les règles claires, complètes et structurées pour chaque catégorie.
Explique le mode de calcul du score.
Fournis des exemples concrets issus des tests (reformulés si besoin).
Explique les cas qui donnent 0 point.
Décris les contraintes de validation (5 dés, valeurs 1–6).
Déduis et signale explicitement les hypothèses (si un test est ambigu).
N’écris PAS de tests. Tu ne fais qu’extraire les règles.

Format attendu :

\# Règles du Yahtzee (dérivées des tests)

\## 1. Contraintes générales
- ...

\## 2. Catégories de la partie supérieure

\### UNS
- Règle :
- Score :
- Exemples :
...

\## 3. Catégories de la partie inférieure
(BRELAN, CARRE, …)

\## 4. Cas limites / validations
- ...

\## 5. Hypothèses formulées
- ...


Voici les tests (source unique) :

[ COLLER ICI LES TESTS ]"
