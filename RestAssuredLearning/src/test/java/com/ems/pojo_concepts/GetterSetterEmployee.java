package com.ems.pojo_concepts;

public class GetterSetterEmployee {

    private String name;
    private String age;
    private String description;
    private String email;

    public void setName(String name) {
        System.out.println("Setter: setName -" + name);
        this.name = name;
    }

    public String getName() {
        System.out.println("Getter: getName -" + name);
        return name;
    }



    public void setAge(String age) {
        System.out.println("Setter: setAge -" + age);
        this.age = age;
    }

    public String getAge() {
        System.out.println("Getter: getAge -" + age);
        return age;
    }

    public void setDescription(String description) {
        System.out.println("Setter: setDescription" + description);
        this.description = description;
    }

    public String getDescription() {
        System.out.println("Getter: getDescription -" + description);
        return description;
    }


    public void setEmail(String email) {
        System.out.println("Setter: setEmail -" + email);
        this.email = email;
    }

    public String getEmail() {
        System.out.println("Getter: getEmail -" + email);
        return email;
    }

}
