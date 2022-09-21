package ru.gb.lesson4;

public class Triangle {
    public int TriangleArea(int a, int b, int c) throws SubZeroException {
        if (a <= 0|| b<=0 || c<=0){
            System.out.println("Ваша сторона слишком маленькая");
            throw new SubZeroException();
        }
        int area = a+b+c;

        return area;
    }

}
