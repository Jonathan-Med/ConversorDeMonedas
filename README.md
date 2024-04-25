<h1 align="center"> #!Bienvenidos¡ </h1>  
<h2 align="center"> ## Estes es mi Conversor de Monedas para el challenge de Alura Latam para el programa oracle Next Education(ONE). </h2>  

<p aling="center">El código está completamente desarrollado con Java y para su funcionamiento está conectado a la API "Exchange Rate" para poder  
realizar las conversiones.  

El proyecto se divide en 4 clases y un record:  
Clase Principal: es donde se desarrolla la ejecución del programa y donde se despliega el menú, se hacen las validaciones y se llaman a las demás clases.  
Clase Divisa: esta clase declara al objeto divisa, que almacena el nombre, id y codigo. además del metodo toString para mostrar los datos del menú  
esta clase se creo para poder implementar los datos más fácil y evitar if, ya que esta clase resulta más comoda cuando se manejan más de 5 tipos de monedas.  
Clase AlmacenaDivisa: esta es la clase intermediaria entre la clase principal y la clase divisa, ya que aquí se agregan las nuevas divisas y se tienen  
los metodos de busqueda de divisa por id y del metodo mostrar las divisas.
Clase ConvierteMoneda: Esta clase es la que se comunica con la API para realizar la consulta y obtener respuesta.
Record Moneda: Esta es la encargada de recibir e interpretar los datos enviados desde la API.
</p>
  
<p align="center">
  Como se puede ver el menú costa de 15 opciones a elegir:
  ![Menu de la aplicacion](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/Menu.png)  
  Se puede ver que se comunica de manera correcta con la API y que el formato de salida está adaptado para mostrar el resultado de una
  manera más comoda:
  ![Aplicacion funcionando](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/ItsWorks.png)  
  La forma que implemente para salir del código es seleccionando el 0 en cualquiera de los 2 apartados para seleccionar la divisa: 
  ![Salir de la aplicacion](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/0ToExit.png)  
    ###Errores: El código funcionará correctamente sin importar la entrada, si ocurre un error este comenzará de nuevo el bucle.
  Cuando ingresamos un número que no está en el menú, el programa nos pedirá que seleccionemos números válidos:
  ![Error al usar numeros fuera de rango](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/OutOfRange.png)  
  Tambien soporta la entrada de caracteres especiales o letras, en este caso se le informará al usuario que ocurrió un error porque las
  entradas no son válidas
  ![Error al usar una letra en las opciones](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/LetterInOption.png)
  ![Error al usar una letra en la cantidad](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/letterInAmount.png)  
  En este caso decidí que el programa no pudiera convertir la misma divisa, por lo que lo marca como opciones no válidas:
  ![Error al usar el mismo numero](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/SameNum.png)  
  Por ultimo el código no admite espacios, por lo que se deben de evitar:
  ![Error al usar espacios](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/Space1.png)
  ![Error al usar espacios](https://github.com/Jonathan-Med/ConversorDeMonedas/tree/master/Imagenes/Space2.png)
</p>
