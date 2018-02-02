package javaNotesForPorfessonals;

public class Student {

  private String name;
  private int id;
   private SUBJECT subject;


  public Student(int id, String name) {
    this.name = name;
    this.id = id;
  }

  public Student(int id, String name, SUBJECT subject) {
    this.name = name;
    this.id = id;
    this.subject = subject;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public SUBJECT getSubject() {
    return subject;
  }
}
