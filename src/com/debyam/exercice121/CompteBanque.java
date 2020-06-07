package com.debyam.exercice121;

import java.util.ArrayList;

abstract class CompteBanque {
    private int solde;
    abstract public void retrait(int montant);
    abstract public void depot(int montant);
    abstract public void calculInteret();
}
