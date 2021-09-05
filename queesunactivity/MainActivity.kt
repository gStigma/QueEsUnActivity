package com.cursoandroid.queesunactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/*introduccion a las activity
* Este texto a sido extraido de https://developer.android.com/guide/components/activities/intro-activities
* para más informacion enviar correo a gSStigma@gmail.com
* 1.0
*/

/*La clase Activity es un componente clave de una app para Android, y la forma en que se inician y se crean las actividades
es una parte fundamental del modelo de aplicación de la plataforma. A diferencia de los paradigmas de programación en los que
las apps se inician con un método main(), el sistema Android inicia el código en una instancia de Activity invocando métodos
de devolución de llamada específicos que corresponden a etapas específicas de su ciclo de vida.
 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//aclarados distintos puntos las activitys son la parte fundamental si queremos invocar diferentes actividades independientemente del lenguaje como se muestra en "SecundarioActivity que su base es java"