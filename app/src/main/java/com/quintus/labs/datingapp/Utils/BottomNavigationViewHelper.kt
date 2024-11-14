import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.quintus.labs.datingapp.Utils.TopNavigationViewHelper
import com.yourpackage.name.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationViewEx = findViewById<BottomNavigationViewEx>(R.id.nav_host_fragment_activity_bottom_navigation_view_helper)


        // Set up navigation
        TopNavigationViewHelper.setupTopNavigationView(bottomNavigationViewEx)
        TopNavigationViewHelper.enableNavigation(this, bottomNavigationViewEx)
    }
}