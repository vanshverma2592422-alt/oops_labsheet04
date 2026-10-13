package labsheet04;

public class Question12MultipleInheritanceConcept {
    public void explain() {
        System.out.println("Java classes cannot extend two classes at once.");
        System.out.println("If both parents define the same method, Java would not know which version to inherit.");
        System.out.println("This possible ambiguity is often called the diamond problem.");
        System.out.println("For example, this is not valid Java:");
        System.out.println("class Child extends ParentOne, ParentTwo { }");
        System.out.println("A class may extend one parent class. Interfaces are a separate topic.");
    }

    public static void main(String[] args) {
        Question12MultipleInheritanceConcept lesson = new Question12MultipleInheritanceConcept();
        lesson.explain();
    }
}