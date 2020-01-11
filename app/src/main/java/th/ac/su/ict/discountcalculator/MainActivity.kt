package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtOriginal = findViewById<EditText>(R.id.edtOriginal)
        var edtPercent = findViewById<EditText>(R.id.edtPercent)
        var btnCalculate = findViewById<Button>(R.id.btnCalculate)
        var cbVat = findViewById<CheckBox>(R.id.cbVat)
        var tvPrice = findViewById<TextView>(R.id.tvPrice)

        btnCalculate.setOnClickListener{
            var edtOriginal2:Double = edtOriginal.text.toString().toDouble()
            var edtPercent2:Double = edtPercent.text.toString().toDouble()

            var total= edtOriginal2-((edtOriginal2/100 ) * edtPercent2)


            if (cbVat.isChecked) {
                total += (total/100)*7
            }

            tvPrice.setText(total.toString())
        }
    }


}
