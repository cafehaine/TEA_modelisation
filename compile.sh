#!/bin/bash

set -e

echo "COMPILATION CLASSE OBJECTS"

cd Objects
javac *.java
cd ..
jar cvf  Objects.jar Objects/*.class

echo "COMPILATION BDD"

cd BaseDeDonnees
javac -cp "../Objects.jar:." *.java
cd ..
jar cvf BaseDeDonnees.jar BaseDeDonnees/*.class

echo "COMPILATION SYSTEMEINTERFACE"

cd SystemeInterface
javac *.java
cd ..
jar cvf SystemeInterface.jar SystemeInterface/*.class

echo "COMPILATION SERVEURMAIL"
cd ServeurMail
javac -cp "../SystemeInterface.jar:../BaseDeDonnees.jar:../Objects.jar:." *.java
cd ..
jar cvf Systeme.jar Systeme/*.class

#echo "COMPILATION SYSTEME"
#cd Systeme
#javac -cp "../SystemeInterface.jar:../Objects.jar:." *.java
#cd ..
#jar cvf Systeme.jar Systeme/*.class


