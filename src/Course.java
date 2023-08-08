public enum Course {
    JAVA("JAVA"){

    },
    ENGLISHLANGUAGE("ENGLISHLANGUAGE"){

    };

    Course() {
    }
    private  String name;

    Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
