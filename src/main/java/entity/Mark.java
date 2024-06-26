package entity;

import java.util.Objects;

public class Mark {
    private int id;
    private Student student;
    private Terms terms;
    private Discipline discipline;
    private int mark;

    public Mark() {
    }

    public Mark(int id, Student student, Terms terms, Discipline discipline, int mark) {
        this.id = id;
        this.student = student;
        this.terms = terms;
        this.discipline = discipline;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Terms getTerms() {
        return terms;
    }

    public void setTerms(Terms terms) {
        this.terms = terms;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark1 = (Mark) o;
        return id == mark1.id && mark == mark1.mark && Objects.equals(student, mark1.student) && Objects.equals(terms, mark1.terms) && Objects.equals(discipline, mark1.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student, terms, discipline, mark);
    }
}
