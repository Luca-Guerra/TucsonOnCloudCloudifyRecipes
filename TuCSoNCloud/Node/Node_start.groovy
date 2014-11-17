/********************
* Node_start
* questo groovy si occupa di far partire il nodo Tucson ad una porta libera,
* e salvare l'informazione nel file Registry.txt
*************************/

import org.cloudifysource.dsl.utils.ServiceUtils
import org.cloudifysource.dsl.context.ServiceContextFactory

//Ricavo il contesto del nostro servizio
def context = ServiceContextFactory.getServiceContext()
//Ricavo l'ID del servizio
def port = context.getInstanceId() + 20504 as int

while(ServiceUtils.isPortOccupied(port))
{
	println "The port ${port} is not free!"
	port+=1
}

//Eseguo il file che lancia il nodo passandogli il numero di porta
def cmdStr = "launch.bat ${port}"
def process = "${cmdStr}".execute()

 /*Itera il processo linea per linea*/ 
process.in.eachLine { line -> println line; }