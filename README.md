El patrón estrategia permite mantener un conjunto de algoritmos de entre los cuales el objeto cliente puede elegir aquel que le conviene e intercambiarlo dinámicamente según sus necesidades.
Esto permite al objeto adaptarse a las diferentes situaciones que necesite abordar e implementar nuevas posibilidades en el futuro con facilidad con mínima o incluso nula necesidad de revisar y modificar código anterior.

En nuestro ejemplo establecemos el contexto de un camarero que tiene que saludar adecuadamente al cliente que recibe.
Para ello, establecemos una estrategia de conducta que le permita responder a hombres, mujeres o aliens con precisión. Si en el futuro se necesitase añadir 
una nueva conducta como despedirse() u ofrecer bebida() este patrón permitiría adaptar el código rápidamente y con mínimo error. El mismo caso se da para la situación
en la que se tenga que atender a un nuevo individuo como por ejemplo mascotas, niños, etc...