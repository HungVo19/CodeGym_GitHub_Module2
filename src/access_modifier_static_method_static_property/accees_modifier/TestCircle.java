package src.access_modifier_static_method_static_property.accees_modifier;

class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        circle1.getRadiusDefault(1,1);
        circle1.getRadiusProtected(1);
        circle1.getRadiusPublic();

    }
}

