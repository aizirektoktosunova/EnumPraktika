public class Main {
    public static void main(String[] args) {
School  s=new School(1,"PEAKSOFT",Lesson.ENGLISHLESSON);
School school=new School(1,"PEAKSOFT",Lesson.JAVALESSON);
School[]schools={s,school};
        for (int i = 0; i <schools.length ; i++) {
        System.out.println(schools[i]);
    }

        Student student=new Student(12,"AIZIREK","TOKTOSUNOVA",18,Course.JAVA);
        Student student1=new Student(12,"AIZIREK","TOKTOSUNOVA",18,Course.ENGLISHLANGUAGE);
        Student[]students={student1,student};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

        }
}}