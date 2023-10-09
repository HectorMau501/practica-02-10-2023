package com.example.practica_02_10_2023.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practica_02_10_2023.AccesorioActivity
import com.example.practica_02_10_2023.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Parrafo de detalle
        val detalle: String = "Lorem ipsum dolor sit amet, consectur"
        var costo: String = "$175.00"
        var intent: Intent
        binding.imgAccesorio01.setOnClickListener{
            Toast.makeText(activity, "Gafas $600.00",Toast.LENGTH_SHORT).show()
            costo = "$600.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",1)
            startActivity(intent)
        }
        binding.imgAccesorio02.setOnClickListener{
            Toast.makeText(activity, "Guantes $175.00",Toast.LENGTH_SHORT).show()
            costo = "$175.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",2)
            startActivity(intent)
        }

        binding.imgAccesorio03.setOnClickListener{
            Toast.makeText(activity, "Gafas $315.00",Toast.LENGTH_SHORT).show()
            costo = "$315.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",3)
            startActivity(intent)
        }

        binding.imgAccesorio04.setOnClickListener{
            Toast.makeText(activity, "Casco $2600.80",Toast.LENGTH_SHORT).show()
            costo = "$2600.80"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",4)
            startActivity(intent)
        }

        binding.imgAccesorio05.setOnClickListener{
            Toast.makeText(activity, "Casco y Chamarra $6300.00",Toast.LENGTH_SHORT).show()
            costo = "$6300.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",5)
            startActivity(intent)
        }

        binding.imgAccesorio06.setOnClickListener{
            Toast.makeText(activity, "Bloqueo de freno $430.00",Toast.LENGTH_SHORT).show()
            costo = "$430.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",6)
            startActivity(intent)
        }

        binding.imgAccesorio07.setOnClickListener{
            Toast.makeText(activity, "Chaqueta y pantalon $4300.00",Toast.LENGTH_SHORT).show()
            costo = "$4300.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",7)
            startActivity(intent)
        }

        binding.imgAccesorio08.setOnClickListener{
            Toast.makeText(activity, "Llavero $250.00",Toast.LENGTH_SHORT).show()
            costo = "$250.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",8)
            startActivity(intent)
        }

        binding.imgAccesorio09.setOnClickListener{
            Toast.makeText(activity, "Retrovisores $800.00",Toast.LENGTH_SHORT).show()
            costo = "$800.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",9)
            startActivity(intent)
        }

        binding.imgAccesorio10.setOnClickListener{
            Toast.makeText(activity, "Candado cadena $500.00",Toast.LENGTH_SHORT).show()
            costo = "$500.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle",detalle)
            intent.putExtra("costo",costo)
            intent.putExtra("numAccesorio",10)
            startActivity(intent)
        }

    }
}