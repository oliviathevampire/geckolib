#!/bin/sh
set -e
set -x
./gradlew --info userRemapYarn --mappings net.fabricmc:yarn:1.15.2+build.17 --mc-version 1.15.2 --no-daemon
