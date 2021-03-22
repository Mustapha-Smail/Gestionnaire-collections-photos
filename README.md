# Gestionnaire-collections-photos

## Class Photo
#### la classe contient: 
- deux attributs finals: 
  - File image (fichier image) 
  - Icon imageIcon (l'image redimensionnée aux dimensions du label) // getSclaedInstance

- deux accesseurs en lecture: 
  - getImage -> retourner le fichier image (l'original) 
  - getImageResized -> retourner l'objet image redimensionnée 

## Class Collections 
#### la classe contient : 
- un attribut final : 
  - File rep (le repertoire collections, là où il y'a tout!)
- Le constructeur: 
  - il vérifie si le répertoire collections existe déja dans le projet, sinon le créer.
- accesseur en lecture: 
  - retourne l'attribut rep
- #### Les méthodes de la classe : 
  - getCollections : 
    - retourne tous les répertoires (les collections) listés dans le répertoire "collections" 
  - addCollection : 
    - elle prend en argument un String nom de la collection 
    - elle ajoute une nouvelle collection au répertoire "collections" 
  - getPhotos : 
    - elle prend en argument une (File) collection
    - elle retourne toutes les images "jpg", "png", "gif", "bmp" listées dans la collection <strong> (converties en objet Photo) </strong>

## L'interface (classe Window)
