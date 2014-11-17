ECHO "Creazione nodo alla porta : %1"
REM Registry.txt
REM @ECHO/|set /p=%1 >> C:\cloudify\gigaspaces-cloudify-2.7.0-ga\recipes\apps\TuCSoNCloud\Node\Registry.txt
REM Istanzio il nodo alla porta prefissata
java -cp SendPortToWS.jar base.Client %1

java -cp TuCSoN-old.jar alice.tucson.service.TucsonNodeService -portno %1
