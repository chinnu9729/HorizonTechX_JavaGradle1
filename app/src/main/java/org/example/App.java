
package org.example;

public class App {

    public String getGreeting() {
        return "Hello from Gradle!";
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("====================================");
        System.out.println(" Horizon TechX DevOps Internship ");
        System.out.println(" Java Application using Gradle ");
        System.out.println("====================================");
        System.out.println(app.getGreeting());
        System.out.println("CI/CD Ready Java Application");
    }
}
