public enum Lesson {
    JAVALESSON("JAVA LESSON"){

    },
    ENGLISHLESSON("ENGLISH LESSON"){

    };

    private String name;

    Lesson(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                '}';
    }
}
