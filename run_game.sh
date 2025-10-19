#!/bin/bash

echo "Kalle Hallbäck"

mkdir Kalle_Hallback_labb

cp Guesser.java Kalle_Hallback_labb
cp GuessingGame.java Kalle_Hallback_labb

cd Kalle_Hallback_labb

pwd

echo "Compiling..."
javac GuessingGame.java

echo "Running game..."
java GuessingGame

echo "Done"

rm *.class

ls
