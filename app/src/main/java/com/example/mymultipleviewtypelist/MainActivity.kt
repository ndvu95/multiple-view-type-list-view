package com.example.mymultipleviewtypelist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mymultipleviewtypelist.adapters.PharmacyAdapter
import com.example.mymultipleviewtypelist.data.Medicine
import com.example.mymultipleviewtypelist.data.PharmacyData
import com.example.mymultipleviewtypelist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val pharmacyAdapter by lazy {
        PharmacyAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.executePendingBindings()
        binding.lifecycleOwner = this

        binding.recyclerPharmacy.adapter = pharmacyAdapter

        val data =
            listOf(
                PharmacyData.MedicineCategory("Popular Product"),
                PharmacyData.MedicineList(
                    listOf(
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                    ),
                ),
                PharmacyData.MedicineCategory("Popular Product"),
                PharmacyData.MedicineList(
                    listOf(
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                    ),
                ),
                PharmacyData.MedicineCategory("Popular Product"),
                PharmacyData.MedicineList(
                    listOf(
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                    ),
                ),
                PharmacyData.MedicineCategory("Popular Product"),
                PharmacyData.MedicineList(
                    listOf(
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                    ),
                ),
                PharmacyData.MedicineCategory("Popular Product"),
                PharmacyData.MedicineList(
                    listOf(
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                        Medicine(
                            name = "Panadol",
                            stock = 20,
                            price = 15.99,
                        ),
                    ),
                ),
            )

        pharmacyAdapter.submitList(data)
    }
}
