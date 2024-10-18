package Prototype;

import java.util.Map;

public class Character implements CharacterInterface {
    private String name;
    private String classType;
    private String story;
    private Map<String, Integer> attributes;

    public Character(String name, String classType, String story, Map<String, Integer> attributes) {
        this.name = name;
        this.classType = classType;
        this.story = story;
        this.attributes = attributes;
    }

    private Character(Character character) {
        this.name = character.name;
        this.classType = character.classType;
        this.story = character.story;
        this.attributes = character.attributes;
    }

    @Override
    public Character clone() {
        return new Character(this);
    }

    @Override
    public void print() {
        System.out.println("--- Character ---");
        System.out.println("Name: " + name);
        System.out.println("Class: " + classType);
        System.out.println("Story: " + story);
        System.out.println("Attributes: ");
        for (Map.Entry<String, Integer> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------");
    }

    public void setAttributes(Map<String, Integer> attributes) {
        this.attributes = attributes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public String getClassType() {
        return classType;
    }

    public String getStory() {
        return story;
    }

    public Map<String, Integer> getAttributes() {
        return attributes;
    }
}
