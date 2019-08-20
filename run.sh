#!/bin/bash

java -jar target/bug1-1.0.0-SNAPSHOT-jar-with-dependencies.jar
echo "empty.pdf"
qpdf empty.pdf /dev/null
echo "out.pdf"
qpdf out.pdf /dev/null
