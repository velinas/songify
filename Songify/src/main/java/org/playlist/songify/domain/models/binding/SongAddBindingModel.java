package org.playlist.songify.domain.models.binding;

import javax.validation.constraints.NotNull;

public class SongAddBindingModel {

    private String songName;
    private String songArtist;
    private String songAlbum;
    private String songYear;
    private String songLyrics;
    private String songGenre;

    public SongAddBindingModel(){
    }

    @NotNull
    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }

    @NotNull
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @NotNull
    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    @NotNull
    public String getSongAlbum() {
        return songAlbum;
    }

    public void setSongAlbum(String songAlbum) {
        this.songAlbum = songAlbum;
    }

    @NotNull
    public String getSongYear() {
        return songYear;
    }

    public void setSongYear(String songYear) {
        this.songYear = songYear;
    }

    @NotNull
    public String getSongLyrics() {
        return songLyrics;
    }

    public void setSongLyrics(String songLyrics) {
        this.songLyrics = songLyrics;
    }
}
