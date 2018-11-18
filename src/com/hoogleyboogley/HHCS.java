package com.hoogleyboogley;

import java.util.Scanner;
import java.lang.Math;

public class HHCS {
    private String id;
    private char gender;
    private int generation;
    private String[] traits = new String[100];

    protected int strCount = 0;

    Scanner input = new Scanner(System.in);

    public HHCS() {
        strCount++;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String[] getTraits() {
        return traits;
    }

    public void setTraits(String[] traits) {
        this.traits = traits;
    }
}
