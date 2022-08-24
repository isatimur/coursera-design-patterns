package composite

class Song : IComponent {
    private var songName: String
    private var artist: String
    private var speed: Float = 1.0f
    constructor(songName: String, artist: String)  {
        this.songName = songName
        this.artist = artist
    }

    override fun play() {
        println("Playing song!")
    }

    override fun getName(): String {
        return this.songName
    }

    override fun setPlaybackSpeed(slowSpeed: Float) {
        this.speed = slowSpeed;

    }

    fun getArtist(): String? {
        return this.artist;
    }
}