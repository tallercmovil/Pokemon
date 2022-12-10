package com.amaurypm.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.amaurypm.pokemon.databinding.ActivityMainBinding
import com.amaurypm.pokemon.model.PokemonApi
import com.amaurypm.pokemon.model.PokemonDetail
import com.bumptech.glide.Glide
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://pokeapi.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val call = retrofit.create(PokemonApi::class.java).getPokemonDetail("564")

            call.enqueue(object: Callback<PokemonDetail>{
                override fun onResponse(
                    call: Call<PokemonDetail>,
                    response: Response<PokemonDetail>
                ) {
                    Glide.with(this@MainActivity)
                        .load(response.body()?.sprites?.other?.officialArtwork?.frontDefault)
                        .into(binding.ivPokemon)
                }

                override fun onFailure(call: Call<PokemonDetail>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "Error de conexión: ${t.message}", Toast.LENGTH_SHORT).show()
                }

            })
        }

    }
}