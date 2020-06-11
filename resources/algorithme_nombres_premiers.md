# Crible d'Ératosthène

Les premiers algorithmes pour décider si un nombre est premier (appelés **tests de primalité**) consistent à essayer de le diviser par tous les nombres qui n'excèdent pas sa racine carrée: s'il est divisible par l'un d'entre eux, il est composé, et sinon, il est premier. 
Cependant, l'algorithme déduit de cette formulation peut être rendu plus efficace : il suggère beaucoup de divisions inutiles, par exemple, si un nombre n'est pas divisible par 2, il est inutile de tester s'il est divisible par 4. En fait, il suffit de tester sa divisibilité par tous les nombres premiers n'excédant pas sa **racine carrée**.

**Le crible d'Ératosthène** est une méthode, reposant sur cette idée, qui fournit la liste des nombres premiers inférieurs à une valeur fixée N:

- on forme la liste des entiers de 2 à n;
- on retient comme « nombre premier » le premier nombre de la liste non encore barré (le premier dans ce cas est 2);
- on barre tous les entiers multiples du nombre retenu à l'étape précédente, en commençant par son carré 
  (puisque 2 × i, 3 × i, … ,(i – 1) × i ont déjà été barrés en tant que multiples de 2, 3, ...);
- on répète les deux dernières opérations (c'est-à-dire : on retient le prochain nombre non barré et on barre ses multiples);
- dès qu'on en est à chercher les multiples des nombres excédant la racine carrée de n, on termine l'algorithme.

Ainsi les nombres premiers inférieurs à n sont les nombres qui restent non barrés à la fin du processus. Cet algorithme est de complexité algorithmique exponentielle.

Le crible d'Ératosthène fournit donc plus d'information que la seule primalité de n. Si seule cette information est souhaitée, une variante parfois plus efficace consiste à ne tester la divisibilité de n que par des petits nombres premiers dans une liste fixée au préalable (par exemple 2, 3 et 5), puis par tous les nombres entiers inférieurs à la racine carrée de n qui ne sont divisibles par aucun des petits nombres premiers choisis ; cela amène à tester la divisibilité par des nombres non premiers (par exemple 49 si les petits premiers sont 2, 3 et 5 et que n excède 2500), mais un choix d'un nombre suffisant de petits nombres premiers doit permettre de contrôler le nombre de tests inutiles effectués.
