class Playlist {
    String[] songs;
    int count;

    Playlist(int size) {
        songs = new String[size];
        count = 0;
    }

    void addSong(String song) {
        songs[count] = song;
        count++;
    }

    String[] getSongs() {
        String[] copy = new String[count];
        for (int i = 0; i < count; i++) {
            copy[i] = songs[i];
        }
        return copy;
    }

    int getSongCount() {
        return count;
    }
}

class PlaylistMain {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        System.out.println("Songs in playlist:");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

        copy[0] = "Hacked";

        System.out.println("First song in actual playlist: " + p.getSongs()[0]);
        System.out.println("Total songs: " + p.getSongCount());
    }
}