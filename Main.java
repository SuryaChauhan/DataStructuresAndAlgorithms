package com.company;

import java.sql.SQLOutput;

class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("id " + id);
        System.out.println("name " + name);
    }
}
    class circle{
        private int radius;
        private int area;
        private int perimeter;


        public void setRadius(int radius){
            this.radius=radius;

        }
        public int getRadius(){
            return radius;
        }

        public void setArea(int area){

            if(area!=(22/7)*this.radius*this.radius){
                System.out.println("wrong area");
            }
            else{
                this.area=area;
            }
    }
    public int getArea(){
            return this.area;
    }

}
public class Main {

    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.id = 12;
        harry.name = "CodeWithHarry";
        harry.printDetails();
        circle a=new circle();
        a.setRadius(2);
        a.setArea(14);
        System.out.println(a.getArea());
    }
}
