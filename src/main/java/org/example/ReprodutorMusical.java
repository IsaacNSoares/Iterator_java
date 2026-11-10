package org.example;

import java.util.Iterator;

public class ReprodutorMusical {

    public static Integer contarFaixasFavoritasPlaylist(Playlist playlist) {
        int quantidade = 0;
        // Iteração usando o for-each (que por baixo dos panos usa o Iterator)
        for (FaixaAudio faixa : playlist) {
            if (faixa.isFavorita()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFaixasPlaylist(Playlist playlist) {
        int quantidade = 0;
        // Iteração manual e explícita usando o objeto Iterator
        for (Iterator<FaixaAudio> iterador = playlist.iterator(); iterador.hasNext(); ) {
            quantidade++;
            iterador.next();
        }
        return quantidade;
    }

}