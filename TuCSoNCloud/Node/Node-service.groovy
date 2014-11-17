/*****************************
* Node service
****************************/

service{
	name="Node"
	icon="icon.png"
	// Grazie all'attributo elastic rendiamo il servizio capace di avere più istanze di se stesso
	elastic = true
	// Numero massimo di istanze permesse
	maxAllowedInstances = 100
	lifecycle{
		start "Node_start.groovy"
	}
}
