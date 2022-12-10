package com.amaurypm.pokemon.model

import com.google.gson.annotations.SerializedName

/**
 * Creado por Amaury Perea Matsumura el 09/12/22
 */
data class PokemonDetail(

    @SerializedName("sprites")
    var sprites: Sprites? = null

)

class Sprites {
    @SerializedName("other")
    var other: Other? = null
}

class Other{
    @SerializedName("official-artwork")
    var officialArtwork: OfficialArtwork? = null
}

class OfficialArtwork {
    @SerializedName("front_default")
    var frontDefault: String? = null
}

