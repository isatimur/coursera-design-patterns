package composite

interface IComponent {
    fun play()
    fun getName(): String
    fun setPlaybackSpeed(slowSpeed: Float)
}