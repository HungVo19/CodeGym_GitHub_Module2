package src.access_modifier_static_method_static_property.accees_modifier;

class Student {

    private String name = "John";
    private String classes = "C02";

    Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    void display(){
        System.out.println("Student name is " + name + ", class " + classes);
    }

}
