
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared){
        //comparing the positions
        if(this == compared){
            return true;
        }
        //comparing the class type
        if(!(compared instanceof Song)){
            return false;
        }
        //converting the object type
        Song comparedSong = (Song) compared;
        
        //Comparing each oject's variables
        if (this.artist.equals(comparedSong.artist) &&
                this.name.equals(comparedSong.name) &&
                this.durationInSeconds == comparedSong.durationInSeconds){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
