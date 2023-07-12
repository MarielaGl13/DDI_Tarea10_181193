package mx.edu.utxj.tidgs.ddi.practica_8_200327.presentation

data class WeatherResponse(
    val main: Main
)

data class Main(
    val temp: Float
)
