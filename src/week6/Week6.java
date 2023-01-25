/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author henry
 */
public class Week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student("Henry", "C109", 30.0);
        s.getAgeInt();
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.sid);
        People p;
        p = (People)s;
        System.out.println(p.age); //people's
        System.out.println(p.name);
        p.run(); //Student's run. cause by dynamic binding.
        s.run();
    }
    
}
