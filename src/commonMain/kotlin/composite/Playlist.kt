package composite

class Playlist(var playlistName: String, val playlist: MutableList<IComponent>) : IComponent {

    constructor(playlistName: String) : this(playlistName, mutableListOf()) {
        this.playlistName = playlistName;
    }

    override fun play() {
        for (song: IComponent in playlist) {
            song.play()
            println("Playing: " + song.getName())
        }
    }


    override fun getName(): String {
        return this.playlistName;
    }

    override fun setPlaybackSpeed(slowSpeed: Float) {
        for (component in playlist) {
            component.setPlaybackSpeed(slowSpeed)
        }
    }

    fun getSong(component: Int): IComponent {
        return playlist[component];
    }

    fun add(component: IComponent) {
        playlist.add(component);
    }

    fun remove(component: IComponent) {
        playlist.remove(component);
    }
}