
# Demo-backup-Java-Mysql

  >*C’est un plan de continuité d'activité ou un plan de reprise d'activité en cas de pannes pour un système d’information mais aussi dans le sens de système de secours que vous pouvez instaurez dans votre programme java utilisant mysql comme SGBD.* 

## Pour commencer

Il prend en paramètre les informations qui nous permet de faire une sauvegarde directement d’une interface java et faire une sauvegarde de la partie mysql :

### Pré-requis

Ce qui est important pour contribuer au dévéloppement de ce projet :

- Netbeans (https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html)
- Xampp (https://www.apachefriends.org/fr/download.html)

### Installation

Les étapes pour installer le programme sont :

- Télécharger le dossier
- Importer le projet
- Changer les paramètres de connexion 
- Executer le projet

ET si vous souhaitez constituer un executable par la suite il faut faire le ``clean and build ``

## Mode ligne de commande

La commande ``Execute Commond `` est une  commande du système d'exploitation que vous spécifiez comme argument de la commande, puis affiche la sortie de la commande dans MySQL Shell.

``Execute Commond - C:\xampp\mysql\bin\mysqldump -h localhost --port 3306 -u root --password=MQ4k4z22MhB6vD8GvsrY87du75KiNW --add-drop-database -B hopital -r "D:\hospitalBackupFolder\backup1629034169007.sql``

## GUI Solution

En cliquant sur le bouton Sauvergarger

 ![capture java mysql](https://user-images.githubusercontent.com/51014164/129480657-d91d9042-2d30-48a6-aa6d-91a1f739cc50.JPG)

Il creer un dossier sur le disque ``D:\hospitalBackupFolder``

![dossier](https://user-images.githubusercontent.com/51014164/130316035-34838e06-5161-4ba9-bfa5-554966bbfb95.JPG)

Il creer dans ce dossier ci haut le fichier sql de la sauvegarde

![ba](https://user-images.githubusercontent.com/51014164/130316110-26c27896-0723-4760-bb1f-01a00426032c.JPG)

_les composants de construction :_
* [java.swing](https://www.javatpoint.com/java-swing) - Palette (front-end)

## Contributions

Si vous souhaitez contribuer, vous pouvez le faire facilement car le projet est documenter pour savoir comment le faire.

## Versions
Listez les versions ici 
_exemple :_
**Dernière version stable :** 1.0

## Auteurs
le(s) auteur(s) du projet est(sont) :
* **Kalema daniel jonathan** _alias_ [@kalemadaniel](https://github.com/kalemadaniel)

## License

Ce projet est sous licence ``open source`` 
