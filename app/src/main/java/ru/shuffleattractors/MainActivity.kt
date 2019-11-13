package ru.shuffleattractors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.shuffleattractors.ui.main.OutputFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, OutputFragment.newInstance())
                    .commitNow()
        }
        (application as App).realm
    }

}
