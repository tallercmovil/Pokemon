package com.amaurypm.pokemon

import com.amaurypm.pokemon.model.PokemonDetailDto
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {

    @GET("api/v2/pokemon/{id}")
    suspend fun getPokemonDetail(
        @Path("id") id: String
    ): PokemonDetailDto
}