package com.amaurypm.pokemon.model
import com.google.gson.annotations.SerializedName

data class PokemonDetailDto(
    @SerializedName("abilities")
    val abilities: List<Ability>,
    @SerializedName("base_experience")
    val baseExperience: Int,
    @SerializedName("cries")
    val cries: Cries,
    @SerializedName("forms")
    val forms: List<Form>,
    @SerializedName("game_indices")
    val gameIndices: List<GameIndice>,
    @SerializedName("height")
    val height: Int,
    @SerializedName("held_items")
    val heldItems: List<HeldItem>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("is_default")
    val isDefault: Boolean,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String,
    @SerializedName("moves")
    val moves: List<Move>,
    @SerializedName("name")
    val name: String,
    @SerializedName("order")
    val order: Int,
    @SerializedName("past_abilities")
    val pastAbilities: List<PastAbility>,
    @SerializedName("past_stats")
    val pastStats: List<PastStat>,
    @SerializedName("past_types")
    val pastTypes: List<Any?>,
    @SerializedName("species")
    val species: Species,
    @SerializedName("sprites")
    val sprites: Sprites,
    @SerializedName("stats")
    val stats: List<StatXX>,
    @SerializedName("types")
    val types: List<Type>,
    @SerializedName("weight")
    val weight: Int
)

data class Ability(
    @SerializedName("ability")
    val ability: AbilityX,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    @SerializedName("slot")
    val slot: Int
)

data class Cries(
    @SerializedName("latest")
    val latest: String,
    @SerializedName("legacy")
    val legacy: String
)

data class Form(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class GameIndice(
    @SerializedName("game_index")
    val gameIndex: Int,
    @SerializedName("version")
    val version: Version
)

data class HeldItem(
    @SerializedName("item")
    val item: Item,
    @SerializedName("version_details")
    val versionDetails: List<VersionDetail>
)

data class Move(
    @SerializedName("move")
    val move: MoveX,
    @SerializedName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>
)

data class PastAbility(
    @SerializedName("abilities")
    val abilities: List<AbilityXX>,
    @SerializedName("generation")
    val generation: Generation
)

data class PastStat(
    @SerializedName("generation")
    val generation: Generation,
    @SerializedName("stats")
    val stats: List<StatXX>
)

data class Species(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class Sprites(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    @SerializedName("other")
    val other: Other,
    @SerializedName("versions")
    val versions: VersionsX
)

data class StatXX(
    @SerializedName("base_stat")
    val baseStat: Int,
    @SerializedName("effort")
    val effort: Int,
    @SerializedName("stat")
    val stat: StatX
)

data class Type(
    @SerializedName("slot")
    val slot: Int,
    @SerializedName("type")
    val type: TypeX
)

data class AbilityX(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class Version(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class Item(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class VersionDetail(
    @SerializedName("rarity")
    val rarity: Int,
    @SerializedName("version")
    val version: Version
)

data class MoveX(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class VersionGroupDetail(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethod,
    @SerializedName("order")
    val order: Int,
    @SerializedName("version_group")
    val versionGroup: VersionGroup
)

data class MoveLearnMethod(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class VersionGroup(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class AbilityXX(
    @SerializedName("ability")
    val ability: Any,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    @SerializedName("slot")
    val slot: Int
)

data class Generation(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class StatX(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld,
    @SerializedName("home")
    val home: Home,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork,
    @SerializedName("showdown")
    val showdown: Showdown
)

data class VersionsX(
    @SerializedName("generation-i")
    val generationI: GenerationIX,
    @SerializedName("generation-ii")
    val generationIi: GenerationIiX,
    @SerializedName("generation-iii")
    val generationIii: GenerationIii,
    @SerializedName("generation-iv")
    val generationIv: GenerationIv,
    @SerializedName("generation-ix")
    val generationIx: GenerationIxX,
    @SerializedName("generation-v")
    val generationV: GenerationV,
    @SerializedName("generation-vi")
    val generationVi: GenerationVi,
    @SerializedName("generation-vii")
    val generationVii: GenerationVii,
    @SerializedName("generation-viii")
    val generationViii: GenerationViii
)

data class DreamWorld(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any
)

data class Home(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class OfficialArtwork(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("versions")
    val versions: Versions
)

data class Showdown(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class Versions(
    @SerializedName("generation-i")
    val generationI: GenerationI,
    @SerializedName("generation-ii")
    val generationIi: GenerationIi
)

data class GenerationI(
    @SerializedName("red-and-blue")
    val redAndBlue: RedAndBlue,
    @SerializedName("red-and-green")
    val redAndGreen: RedAndGreen
)

data class GenerationIi(
    @SerializedName("gold-and-silver")
    val goldAndSilver: GoldAndSilver
)

data class RedAndBlue(
    @SerializedName("front_default")
    val frontDefault: String
)

data class RedAndGreen(
    @SerializedName("front_default")
    val frontDefault: String
)

data class GoldAndSilver(
    @SerializedName("front_default")
    val frontDefault: Any
)

data class GenerationIX(
    @SerializedName("red-blue")
    val redBlue: RedBlue,
    @SerializedName("red-green-japan")
    val redGreenJapan: RedGreenJapan,
    @SerializedName("yellow")
    val yellow: Yellow
)

data class GenerationIiX(
    @SerializedName("crystal")
    val crystal: Crystal,
    @SerializedName("gold")
    val gold: Gold,
    @SerializedName("silver")
    val silver: Silver
)

data class GenerationIii(
    @SerializedName("emerald")
    val emerald: Emerald,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreen,
    @SerializedName("icons")
    val icons: Icons,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphire
)

data class GenerationIv(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearl,
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilver,
    @SerializedName("icons")
    val icons: Icons,
    @SerializedName("platinum")
    val platinum: Platinum
)

data class GenerationIxX(
    @SerializedName("champions")
    val champions: Champions,
    @SerializedName("legends-za")
    val legendsZa: LegendsZa,
    @SerializedName("scarlet-violet")
    val scarletViolet: ScarletViolet
)

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite,
    @SerializedName("icons")
    val icons: IconsXXXXX
)

data class GenerationVi(
    @SerializedName("icons")
    val icons: IconsXXXX,
    @SerializedName("omega-ruby-alpha-sapphire")
    val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphire,
    @SerializedName("x-y")
    val xY: XY
)

data class GenerationVii(
    @SerializedName("icons")
    val icons: IconsXXXX,
    @SerializedName("lets-go-pikachu-lets-go-eevee")
    val letsGoPikachuLetsGoEevee: LetsGoPikachuLetsGoEevee,
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoon
)

data class GenerationViii(
    @SerializedName("brilliant-diamond-shining-pearl")
    val brilliantDiamondShiningPearl: BrilliantDiamondShiningPearl,
    @SerializedName("legends-arceus")
    val legendsArceus: LegendsArceus,
    @SerializedName("sword-shield")
    val swordShield: SwordShield
)

data class RedBlue(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_gray")
    val backGray: String,
    @SerializedName("back_transparent")
    val backTransparent: String,
    @SerializedName("back_transparent_gray")
    val backTransparentGray: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_gray")
    val frontGray: String,
    @SerializedName("front_transparent")
    val frontTransparent: String,
    @SerializedName("front_transparent_gray")
    val frontTransparentGray: String
)

data class RedGreenJapan(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_gray")
    val backGray: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_gray")
    val frontGray: String
)

data class Yellow(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_gbc")
    val backGbc: String,
    @SerializedName("back_gray")
    val backGray: String,
    @SerializedName("back_transparent")
    val backTransparent: String,
    @SerializedName("back_transparent_gray")
    val backTransparentGray: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_gbc")
    val frontGbc: String,
    @SerializedName("front_gray")
    val frontGray: String,
    @SerializedName("front_transparent")
    val frontTransparent: String,
    @SerializedName("front_transparent_gray")
    val frontTransparentGray: String
)

data class Crystal(
    @SerializedName("animated")
    val animated: Animated,
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_transparent")
    val backShinyTransparent: String,
    @SerializedName("back_transparent")
    val backTransparent: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_transparent")
    val frontShinyTransparent: String,
    @SerializedName("front_transparent")
    val frontTransparent: String
)

data class Gold(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_transparent")
    val backShinyTransparent: String,
    @SerializedName("back_transparent")
    val backTransparent: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_transparent")
    val frontShinyTransparent: String,
    @SerializedName("front_transparent")
    val frontTransparent: String
)

data class Silver(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_transparent")
    val backShinyTransparent: String,
    @SerializedName("back_transparent")
    val backTransparent: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_transparent")
    val frontShinyTransparent: String,
    @SerializedName("front_transparent")
    val frontTransparent: String
)

data class Animated(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)

data class Emerald(
    @SerializedName("animated")
    val animated: AnimatedX,
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)

data class FireredLeafgreen(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)

data class Icons(
    @SerializedName("front_default")
    val frontDefault: String
)

data class RubySapphire(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)

data class AnimatedX(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)

data class DiamondPearl(
    @SerializedName("animated")
    val animated: AnimatedXX,
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class HeartgoldSoulsilver(
    @SerializedName("animated")
    val animated: AnimatedXX,
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class Platinum(
    @SerializedName("animated")
    val animated: AnimatedXX,
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class AnimatedXX(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class Champions(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    @SerializedName("icons")
    val icons: IconsXX
)

data class LegendsZa(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    @SerializedName("icons")
    val icons: IconsXXX
)

data class ScarletViolet(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    @SerializedName("icons")
    val icons: IconsXXXX
)

data class IconsXX(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)

data class IconsXXX(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class IconsXXXX(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any
)

data class BlackWhite(
    @SerializedName("animated")
    val animated: AnimatedXXXXX,
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class IconsXXXXX(
    @SerializedName("animated")
    val animated: AnimatedXXXXXX,
    @SerializedName("front_default")
    val frontDefault: String
)

data class AnimatedXXXXX(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class AnimatedXXXXXX(
    @SerializedName("front_default")
    val frontDefault: String
)

data class OmegaRubyAlphaSapphire(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class XY(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class LetsGoPikachuLetsGoEevee(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    @SerializedName("icons")
    val icons: Icons
)

data class UltraSunUltraMoon(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class BrilliantDiamondShiningPearl(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    @SerializedName("icons")
    val icons: Icons
)

data class LegendsArceus(
    @SerializedName("back_default")
    val backDefault: Any,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: Any,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: Any,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: Any,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    @SerializedName("icons")
    val icons: IconsXXXXXXXXXX
)

data class SwordShield(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    @SerializedName("icons")
    val icons: IconsXXXX
)

data class IconsXXXXXXXXXX(
    @SerializedName("front_default")
    val frontDefault: Any,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: Any,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

data class TypeX(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)


