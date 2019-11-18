package br.com.rms.androidlibrarysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.rms.servicelocatorsample.servicelocator.ServiceLocator.getServiceInstance
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = getServiceInstance<User>()

        text.text = user.name
    }
}
