package com.debyam.exercice121;

import java.util.ArrayList;

public class Banque {
    private ArrayList<CompteBanque> lesComptes;

    public Banque() {
        lesComptes = new ArrayList<CompteBanque>();
    }

    public void addCompte(CompteBanque compte) {
        lesComptes.add(compte);
    }
}
