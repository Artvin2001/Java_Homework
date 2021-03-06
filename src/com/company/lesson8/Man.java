package com.company.lesson8;

public class Man implements Member{
    private int maxDistance;
    private int maxHeight;

    public Man(int maxDistance, int maxHeight)
    {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public void run()
    {
        System.out.println("Человек бежит.");
    }

    public void jump()
    {
        System.out.println("Человек прыгает.");
    }

    public int getMaxDistance()
    {
        return maxDistance;
    }

    public int getMaxHeight(){
        return maxHeight;
    }
}
