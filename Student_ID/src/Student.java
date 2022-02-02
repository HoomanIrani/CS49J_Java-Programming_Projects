public class Student implements Comparable<Student> {
    String first;

    String last;

    int id;

    public Student(String first, String last, int id) {

        this.first = first;

        this.last = last;

        this.id = id;

    }

    public String getFirst() {

        return first;

    }

    public String getLast() {

        return last;

    }

    public void setLast(String lastName) {

        last = lastName;

    }

    public int getID() {

        return id;

    }

    public void setFirst(String firstName) {

        first = firstName;

    }


    public void setID(int idNum) {

        id = idNum;

    }

    public String toString() {

        return first + " " + last + " " + id;

    }

    public boolean equals(Student s) {

        if (first.equals(s.first) && last.equals(s.last) && id == s.id) {

            return true;

        }

        return false;

    }

    public int compareTo(Student s) {


        if (last.compareTo(s.last) == 0) {

            if (first.compareTo(s.first) == 0) {

                return this.id - s.id;

            }

            return first.compareTo(s.first);

        }

        return this.last.compareTo(s.last);

    }


    public int hashCode() {

        final int HASH_MULTIPLIER = 29;

        int h = HASH_MULTIPLIER * first.hashCode() + last.hashCode();

        h = HASH_MULTIPLIER * h + ((Integer) id).hashCode();

        return h;

    }

}
