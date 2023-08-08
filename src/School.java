public class School {
     private  int id;
     private String name;
     private Lesson lesson;

     public School(int id, String name, Lesson lesson) {
          this.id = id;
          this.name = name;
          this.lesson = lesson;
     }

     @Override
     public String toString() {
          return "School{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", lesson=" + lesson +
                  '}';
     }
}
