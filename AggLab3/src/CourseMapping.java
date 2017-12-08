/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Instructor
 */
public class CourseMapping implements Iterable {

    private HashMap<Person, LinkedList<Course>> studentEnrollment;

    public CourseMapping() {
        this.studentEnrollment = new HashMap<>();
    }

   

    /**
     * This method adds a new entry to the studentEnrollment. The first
     * parameter is the key for entry. Second parameter should be appended to
     * the linked list value of the person in hashMap. 
     * Hint: If courses associated to the person is null then add the person with new
     * LinkedList<> to the hashMap.
     *
     * @param person
     * @param course
     */
    public void addEnrollments(Person person, Course course) {
            if(studentEnrollment.get(person)==null)
            {
                LinkedList<Course> l = new LinkedList<>();
                l.add(course);
                studentEnrollment.put(person,l);
            }
            studentEnrollment.get(person).add(course);
    }

    /**
     * This method returns the number of students who have taken the course in
     * given semester with the faculty
     *
     * @param facultyName
     * @param semester
     * @param courseNo
     * @return
     */
    public int findNumberOfStudents(String facultyName, String semester, String courseNo) {
        int count=0;
        for(Person person:studentEnrollment.keySet())
        {
            LinkedList<Course> li=studentEnrollment.get(person);
            for(int i=0; i<li.size();i++)
            {
                Course courses=li.get(i);
                if(courses.getCourseNo().equals(courseNo)&&
                        courses.getFaculty().equals(facultyName)&&
                        courses.getSemester().equals(semester))
                {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * This method returns set of all the courses taught by given faculty.
     *
     * @param facultyName
     * @return
     */
    public Set<String> findCoursesTaught(String facultyName) {
        Set<String> facultyCourse= new HashSet();

                for(Person person:studentEnrollment.keySet())
        {
            LinkedList<Course> li=studentEnrollment.get(person);
            for(int i=0; i<li.size();i++)
            {
                Course courses=li.get(i);
                if( courses.getFaculty().equals(facultyName))
                {                  
                          facultyCourse.add(courses.getCourseNo());  
                }
            }
        }
        
            return facultyCourse;
        
    }

    /**
     * This method returns list of students enrolled for a course in given
     * semester
     *
     * @param course
     * @param semester
     * @return
     */
    public List<Person> findStudentsEnrolled(String course, String semester) {

        List<Person> li= new ArrayList<>();
        Iterator it= iterator();
        while(it.hasNext())
        {
            Map.Entry map= (Map.Entry) it.next();
            LinkedList<Course> linkli=(LinkedList<Course>) map.getValue();
            for(int i=0;i<linkli.size();i++)
            {
                Course courseName =linkli.get(i);
                if(courseName.getCourseNo().equals(course)&&
                        courseName.getSemester().equals(semester))
                {
                    li.add((Person)map.getKey());
                }
            }
        }
        return li;
    }

    /**
     * This is the getter method for instance variable.
     *
     * @return
     */
    public HashMap<Person, LinkedList<Course>> getStudentEnrollment() {
        return studentEnrollment;
    }

    /**
     * This method returns an iterator over studentEnrollment.
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        Iterator iterator = studentEnrollment.entrySet().iterator();
        return iterator;
    }

    /**
     * This methods returns size of the hashMap
     *
     * @return
     */
    public int size() {
        return studentEnrollment.size();
    }

}
