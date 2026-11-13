package com.amaurypm.pokemon

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.amaurypm.pokemon.databinding.ActivityMainBinding
import com.bumptech.glide.Glide
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lifecycleScope.launch {
            val pokemonDetail = Retrofit.Builder()
                .baseUrl("https://pokeapi.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PokemonApi::class.java)
                .getPokemonDetail("433")

            Log.d("APPLOGS", pokemonDetail.toString())

            binding.apply {
                tvPokemon.text = pokemonDetail.name.replaceFirstChar {
                    it.uppercase()
                }

                Glide.with(this@MainActivity)
                    .load(pokemonDetail.sprites.other.officialArtwork.frontDefault)
                    .into(ivPokemon)
            }
        }

    }
}