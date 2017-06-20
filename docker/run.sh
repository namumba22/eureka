#!/usr/bin/env bash

#mvn clean install

mvn dependency:get \
    -DrepoUrl=http://.../ \
        -Dartifact=com.myproj:plus-minus:0.5-SNAPSHOT:jar \
        -Dtransitive=false \
        -Ddest=./app/plus-minus.jar

mvn dependency:get \
    -DrepoUrl=http://.../ \
        -Dartifact=com.myproj:aggregator:0.5-SNAPSHOT:jar \
        -Dtransitive=false \
        -Ddest=./app/aggregator.jar

mvn dependency:get \
    -DrepoUrl=http://.../ \
        -Dartifact=com.myproj:discount:0.5-SNAPSHOT:jar \
        -Dtransitive=false \
        -Ddest=./app/discount.jar

mvn dependency:get \
    -DrepoUrl=http://.../ \
        -Dartifact=com.myproj:multiple-devide:0.5-SNAPSHOT:jar \
        -Dtransitive=false \
        -Ddest=./app/multiple-devide.jar

mvn dependency:get \
    -DrepoUrl=http://.../ \
        -Dartifact=com.myproj:rounder:0.5-SNAPSHOT:jar \
        -Dtransitive=false \
        -Ddest=./app/rounder.jar

mvn dependency:get \
    -DrepoUrl=http://.../ \
        -Dartifact=com.myproj:tax:0.5-SNAPSHOT:jar \
        -Dtransitive=false \
        -Ddest=./app/tax.jar


docker-compose up