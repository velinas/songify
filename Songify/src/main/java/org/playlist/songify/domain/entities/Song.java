package org.playlist.songify.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Songs")
public class Song extends BaseEntity {
    private String songName;
    private String songArtist;
    private String songAlbum;
    private String songYear;
    private String songLyrics;
    private String songGenre;

    public Song(){
    }

    @Column(name = "songName")
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Column(name = "songArtist")
    public String getSongArtist() {
        return songArtist;
    }


    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    @Column(name = "songAlbum")
    public String getSongAlbum() {
        return songAlbum;
    }

    public void setSongAlbum(String songAlbum) {
        this.songAlbum = songAlbum;
    }

    @Column(name = "songYear")
    public String getSongYear() {
        return songYear;
    }

    public void setSongYear(String songYear) {
        this.songYear = songYear;
    }

    @Column(name = "songLyrics", columnDefinition = "TEXT")
    public String getSongLyrics() {
        return songLyrics;
    }

    public void setSongLyrics(String songLyrics) {
        this.songLyrics = songLyrics;
    }

    @Column(name = "songGenre")
    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }
}

