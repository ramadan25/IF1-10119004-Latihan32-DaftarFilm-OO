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
class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("");
        System.out.println("Judul Film ". concat(filmName));
        System.out.println("Genre Film ". concat(filmGenre));
        System.out.println("Rating Film " + filmRating);
        System.out.println("Durasi Film " + filmDuration + "Menit\n");
  }
    
}
