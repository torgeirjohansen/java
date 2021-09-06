package creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        // Often used when creation is expensive
        // Often NOT used the word "new", but more often implements
        // the clone() (Cloneable) or deepCopy() interface methods
        // Deep copy will return a clone with new member objects, NOT
        // just the shallow copy way of using the same object (references)
        //
        // Nice way of getting light way construction (copy) of objects
        // 1. Guarantee a new instance
        // 2. often refactored in later (maybe because of performance, because it makes a lot of objects)
        // 3. dont always do Factory: prototype could be the solution instead.
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");

        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRunTime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRunTime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
    }

}
