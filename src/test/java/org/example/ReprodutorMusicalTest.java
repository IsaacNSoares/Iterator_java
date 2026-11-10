package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReprodutorMusicalTest {

    @Test
    void deveContarFaixasFavoritasPlaylist() {
        Playlist playlist = new Playlist(
                new FaixaAudio("Tempo Perdido", true),
                new FaixaAudio("Hotel California", true),
                new FaixaAudio("Stairway to Heaven", false),
                new FaixaAudio("Dust in the Wind", true)
        );
        assertEquals(3, ReprodutorMusical.contarFaixasFavoritasPlaylist(playlist));
    }

    @Test
    void deveContarTotalFaixasPlaylist() {
        Playlist playlist = new Playlist(
                new FaixaAudio("Tempo Perdido", true),
                new FaixaAudio("Hotel California", true),
                new FaixaAudio("Stairway to Heaven", false),
                new FaixaAudio("Dust in the Wind", true)
        );
        assertEquals(4, ReprodutorMusical.contarTotalFaixasPlaylist(playlist));
    }

}