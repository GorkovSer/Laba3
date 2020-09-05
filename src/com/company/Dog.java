package com.company;

public abstract class Dog
{
    protected String speed;
    protected String scale;
    protected String nameOfBreed;
}

class Pug extends Dog
{
    private String randomInsertForChecking;

    public void setInfo(String speed, String scale, String nameOfBreed, String randomInsertForChecking)
    {
        this.speed = speed;
        this.scale = scale;
        this.nameOfBreed = nameOfBreed;
        this.randomInsertForChecking = randomInsertForChecking;
    }

    public String getRandomInsertForChecking() {
        return randomInsertForChecking;
    }

    public void setRandomInsertForChecking(String randomInsertForChecking) {
        this.randomInsertForChecking = randomInsertForChecking;
    }

    @Override
    public String toString() {
        return
                "speed: " + speed +
                "\nscale: " + scale +
                "\nnameOfBreed: " + nameOfBreed +
                "\nrandomInsertForChecking: " +  randomInsertForChecking;
    }
}

class Poodle extends Dog
{
    private String anotherRandomInsertForChecking;
    public void setInfo(String speed, String scale, String nameOfBreed, String anotherRandomInsertForChecking)
    {
        this.speed = speed;
        this.scale = scale;
        this.nameOfBreed = nameOfBreed;
        this.anotherRandomInsertForChecking = anotherRandomInsertForChecking;
    }

    public String getAnotherRandomInsertForChecking() {
        return anotherRandomInsertForChecking;
    }

    public void setAnotherRandomInsertForChecking(String anotherRandomInsertForChecking) {
        this.anotherRandomInsertForChecking = anotherRandomInsertForChecking;
    }

    @Override
    public String toString() {
        return
                "speed: " + speed +
                        "\nscale: " + scale +
                        "\nnameOfBreed: " + nameOfBreed +
                        "\nanotherRandomInsertForChecking: " +  anotherRandomInsertForChecking;
    }
}
