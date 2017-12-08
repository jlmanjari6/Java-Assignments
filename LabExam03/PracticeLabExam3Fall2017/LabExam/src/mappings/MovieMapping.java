/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Instructor
 */
public class MovieMapping implements Iterable {

    private HashMap<Person, LinkedList<Movie>> actorsActed;

    public MovieMapping() {
        actorsActed = new HashMap<>();
    }

    public void addMovie(Person person, Movie movie) {
        if (actorsActed.get(person) == null) {
            actorsActed.put(person, new LinkedList<Movie>() {
                {
                    add(movie);
                }
            });
        } else {
            actorsActed.get(person).add(movie);
        }
    }

    //Assume a director only directs one movie in a given year.
    public int findNumberOfActors(String directorName, String releasedYear, String revenue) {
        Person p = new Person(directorName);
        Movie movie = new Movie(revenue, p, releasedYear);
        if (actorsActed.containsKey(movie)) {
            return actorsActed.size();
        }
        return 0;
    }

    public Set<String> findRevenuesMadeByDirector(String directorName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Person> findActorsActed(String genre, String releasedYear) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public HashMap<Person, LinkedList<Movie>> getActorsActed() {
        return actorsActed;
    }

    @Override
    public Iterator iterator() {
        return actorsActed.entrySet().iterator();
    }

    public int size() {
        return actorsActed.size();
    }

}
