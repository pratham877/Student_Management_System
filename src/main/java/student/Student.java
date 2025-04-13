package student;

// Importing necessary JPA annotations
import jakarta.persistence.*;
import java.util.Objects;

/**
 * The Student class represents a JPA entity mapped to the "StudentTable" in the database.
 * Each instance corresponds to a row in the table.
 */
@Entity
@Table(name = "StudentTable")
public class Student {

    /**
     * Primary key for the Student entity.
     * The value is auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Full name of the student.
     * This field is mandatory (cannot be null).
     */

    @Column(nullable = false)
    private String fullName;

    /**
     * Age of the student.
     * This field is mandatory.
     */
    @Column(nullable = false)
    private int age;

    /**
     * Contact phone number of the student.
     * This field is mandatory.
     */
    @Column(nullable = false)
    private String phone;

    /**
     * Default no-argument constructor required by JPA.
     */
    public Student() {
    }

    /**
     * Parameterized constructor to create a Student instance with specified details.
     *
     * @param fullName Full name of the student.
     * @param age      Age of the student.
     * @param phone    Contact phone number of the student.
     */
    public Student(String fullName, int age, String phone) {
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
    }

    // Getter and setter methods for each field

    /**
     * Gets the ID of the student.
     *
     * @return The student's ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the ID of the student.
     *
     * @param id The ID to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the full name of the student.
     *
     * @return The student's full name.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name of the student.
     *
     * @param fullName The full name to set.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the age of the student.
     *
     * @return The student's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the student.
     *
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the phone number of the student.
     *
     * @return The student's phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the student.
     *
     * @param phone The phone number to set.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Overrides the equals method to compare Student objects based on their fields.
     *
     * @param o The object to compare with.
     * @return True if the objects are equal; otherwise, false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                Objects.equals(fullName, student.fullName) &&
                Objects.equals(phone, student.phone);
    }

    /**
     * Overrides the hashCode method to generate a hash based on the student's fields.
     *
     * @return The hash code of the student.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, age, phone);
    }

    /**
     * Overrides the toString method to provide a string representation of the student.
     *
     * @return String representation of the student.
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
