#!/bin/bash

# Issue commands to gfsh to start locator
echo "Starting locator..."
gfsh -e "start locator --name=${LOCATOR_NAME} --port=10334 --properties-file=config/locator.properties --initial-heap=512m --max-heap=512m --enable-cluster-configuration=false"