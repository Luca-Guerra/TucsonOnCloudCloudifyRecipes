#! /bin/sh

echo "Creazione nodo alla porta : $1"
##sed -i '1d' /home/project/gigaspaces-cloudify-2.6.1-ga/recipes/apps/TuCSoNCloud/Node/Registry.txt
##echo "$1">>/home/project/gigaspaces-cloudify-2.6.1-ga/recipes/apps/TuCSoNCloud/Node/Registry.txt
java -cp SendPortToWS.jar base.Client $1

## Istanzio il nodo alla porta prefissata
java -cp TuCSoN.jar alice.tucson.service.TucsonNodeService -portno $1
