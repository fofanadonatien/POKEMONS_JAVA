### Hiérarchie de Pokémons – Classes abstraites et interfaces (Java)

Ce projet pédagogique, issu de la Licence 3 Informatique de l’Université de Montpellier II (énoncé rédigé par Marie-Laure Mugnier), a pour objectif de mettre en pratique les classes abstraites, le polymorphisme et les collections en Java à travers la modélisation d’une hiérarchie de Pokémons.

### Présentation générale

Les Pokémons sont modélisés selon leurs capacités de déplacement et leurs caractéristiques physiques. Quatre grandes catégories sont définies, chacune possédant sa propre formule de calcul de vitesse et des attributs spécifiques.

### Catégories de Pokémons

Pokémons sportifs
Se déplacent sur terre.
Attributs : nom, poids, nombre de pattes, taille, fréquence cardiaque.
Vitesse : nombreDePattes × taille × 3

Pokémons casaniers
Se déplacent sur terre.
Attributs : nom, poids, nombre de pattes, taille, heures de télévision par jour.
Vitesse : nombreDePattes × taille × 3

Pokémons des mers
Se déplacent uniquement en mer.
Attributs : nom, poids, nombre de nageoires.
Vitesse : (poids / 25) × nombreDeNageoires

Pokémons de croisière
Se déplacent en mer plus lentement.
Attributs : nom, poids, nombre de nageoires.
Vitesse : ((poids / 25) × nombreDeNageoires) / 2

### Conception et programmation

Création d’un diagramme de classes UML

Implémentation d’une classe abstraite Pokémon

Spécialisation via héritage pour chaque catégorie

Redéfinition de la méthode toString() pour afficher les caractéristiques complètes du Pokémon

Utilisation du polymorphisme pour manipuler différents types de Pokémons de manière uniforme

### Gestion d’une collection de Pokémons

Une classe CollectionPokemons est développée pour :

stocker des Pokémons de catégories différentes via une ArrayList

insérer de nouveaux Pokémons dans la collection

calculer la vitesse moyenne de l’ensemble des Pokémons

### Objectifs pédagogiques

Ce projet permet de :

comprendre et utiliser les classes abstraites

appliquer le polymorphisme

manipuler les collections Java

renforcer la modélisation UML

structurer un projet Java orienté objet
