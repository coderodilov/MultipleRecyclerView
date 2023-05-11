package uz.coderodilov.multiplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import uz.coderodilov.multiplerecyclerview.adapter.ContactAdapter
import uz.coderodilov.multiplerecyclerview.databinding.ActivityMainBinding
import uz.coderodilov.multiplerecyclerview.model.ItemsTypes

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contactAdapter = ContactAdapter()

        binding.rvContact.apply {
            adapter = contactAdapter
        }
        contactAdapter.setItems(loadDataToList())

        val decorator = DividerItemDecoration(applicationContext, LinearLayoutManager.VERTICAL)
        decorator.setDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.divider_line)!!)
        binding.rvContact.addItemDecoration(decorator)

    }


    private fun loadDataToList():List<ItemsTypes> = listOf(

        ItemsTypes.ItemHeader("9 may, 2023"),

        ItemsTypes.ItemContact("Abdulaziz Ahmedov"),
        ItemsTypes.ItemContact("Buranov Abdulla"),
        ItemsTypes.ItemContact("Salim Polatov"),
        ItemsTypes.ItemContact("Shaxzod Toshboyev"),
        ItemsTypes.ItemContact("Malika Yunusova"),

        ItemsTypes.ItemHeader("8 may, 2023"),

        ItemsTypes.ItemContact("Karim Berdiyev"),
        ItemsTypes.ItemContact("Alisher Uzoqov"),
        ItemsTypes.ItemContact("Botir Kadiorv"),
        ItemsTypes.ItemContact("Teacher Azam"),
        ItemsTypes.ItemContact("Subyektiv Blog"),

        ItemsTypes.ItemHeader("7 may, 2023"),

        ItemsTypes.ItemContact("Begzod aka bl..."),
        ItemsTypes.ItemContact("Payzulla manergacha.."),
        ItemsTypes.ItemContact("Hikmatillo Qurbanov"),
        ItemsTypes.ItemContact("Ahmadillo Jalaldinov"),
        ItemsTypes.ItemContact("Ozodbek Karimov"),

    )

}