@echo off
cd Codigo || exit /b
javac *.java || exit /b
java Main
