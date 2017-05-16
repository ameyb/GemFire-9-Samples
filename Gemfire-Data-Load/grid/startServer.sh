#!/bin/bash

# Issue commands to gfsh to launch a server
echo "Starting cache server..."
gfsh -e "start server --name=${SERVER_NAME} --server-port=0 --locators=${LOCATOR_IP}[10334] --classpath=${JARS} --initial-heap=2g --max-heap=2g --cache-xml-file=config/serverCache.xml"
gfsh -e "start server --name=${SERVER_NAME_2} --server-port=0 --locators=${LOCATOR_IP}[10334] --classpath=${JARS} --initial-heap=2g --max-heap=2g --cache-xml-file=config/serverCache.xml"