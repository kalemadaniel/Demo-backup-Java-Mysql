
# Demo-backup-Java-Mysql

## La solution

C’est un plan de continuité d'activité ou un plan de reprise d'activité en cas de pannes pour un système d’information mais aussi dans le sens de système de secours.
Il prend en paramètre les informations qui nous permet de faire une sauvegarde directement d’une interface java et faire une sauvegarde de la partie mysql :

### cette méthode (ancienne)
Execute Commond - C:\xampp\mysql\bin\mysqldump -h localhost --port 3306 -u root --password=MQ4k4z22MhB6vD8GvsrY87du75KiNW --add-drop-database -B hopital -r "D:\hospitalBackupFolder\backup1629034169007.sql

### a été personnalisé comme ceci

 ![capture java mysql](https://user-images.githubusercontent.com/51014164/129480657-d91d9042-2d30-48a6-aa6d-91a1f739cc50.JPG)

## Elément à utiliser
- Netbeans (https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html)
- Xampp (https://www.apachefriends.org/fr/download.html)
