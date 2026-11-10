package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<FaixaAudio>{

    private List<FaixaAudio> faixas = new ArrayList<FaixaAudio>();

    public Playlist(FaixaAudio... faixas) {
        this.faixas = Arrays.asList(faixas);
    }

    @Override
    public Iterator<FaixaAudio> iterator() {
        return faixas.iterator();
    }

}