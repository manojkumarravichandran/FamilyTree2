package com.webnexus.familytree;

public class Family {
    String name,gender;
    String id;
    int father,mother,nchild;
    int[] child=new int[10];


    public Family(String name, String gender, int father, int mother, int nchild, int[] child) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.nchild = nchild;
        this.child = child;
        id="id" + ++MainActivity.id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public int getFather() {
        return father;
    }

    public int getMother() {
        return mother;
    }
}
