package curso.androidkotlin.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_jogar.setOnClickListener {
            val intent = Intent (applicationContext, SegundaActivity::class.java)

            // Gerar número randômico
            val numero = java.util.Random().nextInt(2)

            // Enviar número para a próxima activity
            intent.putExtra("numero", numero)

            startActivity(intent)
        }
    }
}