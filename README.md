# Gestionnaire-collections-photos

![Capture](https://user-images.githubusercontent.com/74098445/112218367-e80f6880-8c23-11eb-999d-aa33bb12f22f.PNG)


## Class Photo
### la classe contient: 
- deux attributs finals: 
  - File image (fichier image) 
  - Icon imageIcon (l'image redimensionnée aux dimensions du label) // getSclaedInstance

- deux accesseurs en lecture: 
  - getImage -> retourner le fichier image (l'original) 
  - getImageResized -> retourner l'objet image redimensionnée 

## Class Collections 
### la classe contient : 
- un attribut final : 
  - File rep (le repertoire collections, là où il y'a tout!)
- Le constructeur: 
  - il vérifie si le répertoire collections existe déja dans le projet, sinon le créer.
- accesseur en lecture: 
  - retourne l'attribut rep
### Les méthodes de la classe : 
  - getCollections : 
    - retourne tous les répertoires (les collections) listés dans le répertoire "collections" 
  - addCollection : 
    - elle prend en argument un String nom de la collection 
    - elle ajoute une nouvelle collection au répertoire "collections" 
  - getPhotos : 
    - elle prend en argument une (File) collection
    - elle retourne toutes les images "jpg", "png", "gif", "bmp" listées dans la collection <strong> (converties en objet Photo) </strong>

## L'interface (classe Window)
### la classe contient : 
- trois attributs : 
  - une instance de la classe Collections
  - un tableau de File (collectionsList) pour stocker la liste des collections 
  - un tableau de Photo (currentPhotos) pour stocker les photos de la collection en cours d'utilisation
- Le constructeur: 
  - il initialise les composantes de l'interface 
  - il fait appel à la methode generate (generer la liste des collections) 
### Les méthodes de la classe: 
- generate: 
  - elle initialise l'attribut 'c' (collections)
  - elle stock la liste des collections dans l'attribut collectionsList en faisant appel à la méthode <strong>getCollections</strong> de la classe Collections
  - si ce n'est pas la première fosi qu'on fait appel à cette méthode elle garde la dernière collection utilisée
  - on enleve tous les elements de la comboBox 
  - si la liste des collections n'est pas vide, on ajoute les noms de celles ci dans la comboBox, en mettant le selected item sur la dernière utilisée si elle existe toujours 

## Les fonctionnalités de l'interface 
- ### selectionner un item dans la comboBox (collectionsComboItemStateChanged) : 
  - la méthode récupère l'item selectionnée (collectionName)
  - elle le recherche dans la liste des collections (si elle n'est pas vide) 
  - si la collection est dans la liste on projète sur le jLabel la première image de la collection 
  - sinon on affiche le texte "Empty collection!"
- ### Suivant & Précédent (suivantActionPerformed & precedentActionPerformed): 
  - si le tableau currentPhotos n'est pas nul 
  - la méthode récupère l'icon dans le jLabel 
  - elle recherche son index dans le tableau grâce à la méthode <strong>indexOf</strong>
  - on projète l'image suivante (ou précédente) dans le jLabel 
- ### Ajouter une collection :
  - avec JOptionPane, l'utilisateur saisit le nom de la collection qu'il va ajouter. <br>
![Capture](https://user-images.githubusercontent.com/74098445/112220816-f6ab4f00-8c26-11eb-8548-589c199e6550.PNG) 
  - la méthode récupère le nom de la nouvelle collection 
  - on recherche d'abord si la collection existe déjà, on afficher une alert
  - sinon on fait appel à la méthode <strong>addCollection</strong> de la classe Collections
  - on fait ensuite appel à la methode <strong>generate</strong> pour regenérer la comboBox 
  - on afficher ensuie une alerte pour informer l'utilisateur de son ajout
- ### Supprimer une collection :
  - 
