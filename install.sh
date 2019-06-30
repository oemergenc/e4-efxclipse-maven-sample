#!/usr/bin/env bash

cd sample.mvn.parent

./mvnw dependency:get -Dartifact=at.bestsolution:tycho-lifecycle-controller:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/
./mvnw dependency:get -Dartifact=at.bestsolution:maven-osgi-targetplatform-extension:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/
./mvnw dependency:get -Dartifact=at.bestsolution:maven-osgi-package-plugin:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/

./mvnw clean package
