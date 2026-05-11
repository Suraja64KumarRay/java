interface camera {
    void takephoto();
}
interface musicplayer {
    void playmusic();
}
class  smartphone implements camera,musicplayer {
    public void takephoto() {
        System.out.println("Take my photo");
    }
    public void playmusic() {
        System.out.println("Play the music");
    }
}

public class interface2 {
    public static void main(String[] args) {
        smartphone s = new smartphone();
        s.takephoto();
        s.playmusic();
    }
}
