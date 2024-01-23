# Cardview

## Descripción del Programa
<p align="justify">Este programa en Kotlin es una aplicación de Android que demuestra la navegación entre diferentes activities. La clase principal <code>MainActivity</code> extiende <code>AppCompatActivity</code> e implementa la interfaz <code>BaseListener</code>.</p>

## Creación de la actividad
En el método <code>onCreate</code>, se infla el diseño de la activity principal utilizando <code>ActivityMainBinding</code>. Luego, se establece este diseño como la vista de contenido de la activity.

## Navegación entre actividades
El programa define varios OnClickListener para diferentes CardView en el diseño. Cuando se hace clic en un CardView, se inicia una nueva actividad. Por ejemplo, cuando se hace clic en cardView1, se inicia SecondActivity. De manera similar, los clics en cardView2, cardView3, cardView4, cardView5 y cardView6 inician ThirdActivity, FourthActivity, FifthActivity, SixthActivity y SeventhActivity, respectivamente.

## Interfaz BaseListener
La interfaz BaseListener se implementa en MainActivity, pero el método onClick aún no se ha implementado.

Este programa es un excelente recurso para entender cómo navegar entre diferentes actividades en una aplicación de Android. Espero que esta descripción te ayude a entender mejor tu programa. 😊
