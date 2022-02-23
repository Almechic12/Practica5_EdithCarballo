package carballo.jesus.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.coldDrinksButton) as Button
        var btnHot: Button = findViewById(R.id.hotDrinksButton) as Button
        var btnSweets: Button = findViewById(R.id.sweetsButton) as Button
                var btnSalties: Button = findViewById(R.id.saltiesButton) as Button

        btnCold.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "coldDrinks")
            startActivity(intent)
        }
        btnHot.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "hotDrinks")
            startActivity(intent)
        }
        btnSweets.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "sweets")
            startActivity(intent)
        }
        btnSalties.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "salties")
            startActivity(intent)
        }
    }
}