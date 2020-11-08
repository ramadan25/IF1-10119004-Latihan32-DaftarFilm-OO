/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan32.daftarfilm;

/**
 *
 * @author ENDOG
 *  Nama      : Muhamad Ramadan
 *  NIM       : 10119004
 *  Kelas     : IF1
 *  Deskripsi : menampilkan daftar film
 */
public class IF110119004Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film1 = new Film();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horor, Scifi";
        film1.filmRating = 8.5;
        film1.filmDuration = 120;
        
        Film film2 = new Film();
        film2.filmName = "Small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = 9.0;
        film2.filmDuration = 96;
        
        Film film3 = new Film();
        film3.filmName = "Crazy Rich Surabaya";
        film3.filmGenre = "Comedy";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        
        Film film4 = new Film();
        film4.filmName = "Asih";
        film4.filmGenre = "Horror";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        
        System.out.println("===Daftar Film Sedang Tayang===\n");
        film1.nowPlaying();
        film2.nowPlaying();
        film3.nowPlaying();
        film4.nowPlaying();
    }
    
}
