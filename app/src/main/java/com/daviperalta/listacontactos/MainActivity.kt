package com.daviperalta.listacontactos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.daviperalta.listacontactos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var Adapter: ContactoAdapter
    private lateinit var GridLayout: GridLayoutManager
    private var listaContacto:List<Contacto> = listOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configAdaptador()
        listadoContactos()

    }

    private fun listadoContactos() {
        listaContacto = listOf(
            Contacto("David Peralta","2881318138"),
            Contacto("Daniel Sanchez","2881318138"),
            Contacto("Jesus Arenal","2881318138")
        )
        Adapter.updateListContacto(listaContacto)
    }

    private fun configAdaptador(){
        Adapter = ContactoAdapter()
        binding.rvContactos.adapter = Adapter
    }
}