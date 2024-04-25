<h1 align="center"> !Bienvenidos¡ </h1>  
<h2 align="center"> Estes es mi Conversor de Monedas para el challenge de Alura Latam para el programa oracle Next Education(ONE). </h2>  

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
  ![Menu](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/85526491-4724-4e1b-a6b2-3ae3ccab8a48)  
  

  Se puede ver que se comunica de manera correcta con la API y que el formato de salida está adaptado para mostrar el resultado de una
  manera más comoda:  
  ![ItsWorks](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/f34455b3-3713-419b-b614-dffb941414c8)  
  
  La forma que implemente para salir del código es seleccionando el 0 en cualquiera de los 2 apartados para seleccionar la divisa:   
  ![0ToExit](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/1c30a037-c88d-4639-8a70-7fa2b27c5fd6)  
    Errores: El código funcionará correctamente sin importar la entrada, si ocurre un error este comenzará de nuevo el bucle.
  Cuando ingresamos un número que no está en el menú, el programa nos pedirá que seleccionemos números válidos:  
  ![OutOfRange](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/b01e3391-fdf0-405f-9857-d13dae6a29b7)  
  
  Tambien soporta la entrada de caracteres especiales o letras, en este caso se le informará al usuario que ocurrió un error porque las
  entradas no son válidas: 
  ![LetterInOption](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/2c099a71-4551-46e1-92a7-53493c989693)

  ![letterInAmount](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/b14edd3f-beac-4fd4-8229-f9cbe7ff37b1)  

  En este caso decidí que el programa no pudiera convertir la misma divisa, por lo que lo marca como opciones no válidas:  
  ![SameNum](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/6ac204d8-d2b6-41d4-90d8-f81e8270d8f9)  
  
  Por ultimo el código no admite espacios, por lo que se deben de evitar:  
  ![Space1](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/2910e1b7-47e7-47dc-96f2-13921f278d20)
  ![Space2](https://github.com/Jonathan-Med/ConversorDeMonedas/assets/111925532/98093695-ed74-4a28-9abc-cda690ee7030)

</p>
