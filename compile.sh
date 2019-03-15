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
