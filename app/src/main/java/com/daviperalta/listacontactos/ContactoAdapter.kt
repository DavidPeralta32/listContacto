package com.daviperalta.listacontactos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daviperalta.listacontactos.databinding.ItemContactoBinding

class ContactoAdapter(private var contacto:List<Contacto> = listOf()) :
    RecyclerView.Adapter<ContactoAdapter.ViewHolder>() {

    private lateinit var context:Context

    fun updateListContacto(contactos:List<Contacto>){
        this.contacto = contactos
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_contacto,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacto.get(position)

    }

    override fun getItemCount(): Int {
        return contacto.size
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val binding: ItemContactoBinding = ItemContactoBinding.bind(itemView)

        fun bind(contacto:Contacto) = with(binding){
            binding.tvNombre.text = contacto.name
            binding.tvPhone.text = contacto.phone
        }

    }

}