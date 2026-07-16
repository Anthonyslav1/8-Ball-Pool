#!/bin/bash
echo "Testing compilation of original"
mkdir -p out/production/Current_project
javac --module-path /usr/share/openjfx/lib --add-modules javafx.controls,javafx.fxml,javafx.media,javafx.graphics,javafx.base -d out/production/Current_project $(find src -name "*.java")
