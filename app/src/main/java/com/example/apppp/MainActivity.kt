package com.example.apppp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import android.widget.RadioButton
import android.widget.RadioGroup
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //aceita vazio
        var radioGrupo: RadioGroup? = null
        //iniciará em tempo de execucao
        lateinit var radioBotao: RadioButton

        lateinit var button: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Variável nativa  Jaava
        title = "RadioGroup in Kotlin"
        // assinala o id do RadioGrupo
        radioGrupo = findViewById(R.id.radioGrupo1)
        // assinala o id do botão enviar
        button = findViewById(R.id.botaoEnviar)
        // ao clicar ocorre um send
        button.setOnClickListener {
            // pega o radio com check
            // do radioGrupo
            // checkedRadioButtonId é funcao nativa que pega o id de cada caixa
            // !!retornará um valor não nulo radioGrupo ou lançará NullPointerException
            val opcaoEscolhida: Int = radioGrupo!!.checkedRadioButtonId

            // assinala o id do checked radio button
            radioBotao = findViewById(opcaoEscolhida)

            // Displaying text of the checked radio button in the form of toast
            Toast.makeText(baseContext, radioBotao.text, Toast.LENGTH_SHORT).show()
        }
    }
}

