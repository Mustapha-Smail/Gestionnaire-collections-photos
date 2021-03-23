# Gestionnaire-collections-photos

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
