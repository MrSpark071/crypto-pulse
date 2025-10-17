package ir.spark_financ.crypto.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "✅ CryptoPulse\nمحیط توسعه آماده است!\nحالا می‌توانی کد را ویرایش کنی."
        tv.textSize = 18f
        setContentView(tv)
    }
}
