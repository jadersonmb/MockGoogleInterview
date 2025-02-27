package org.patters.creational.prototype.deepCopy;

public class Person implements Cloneable {

    private String name;
    private String nickname;
    private Address address;

    public Person(String name, String nickname, Address address) {
        this.name = name;
        this.nickname = nickname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * When there is an object that is mutable, we need to make a deep copy
     * @return
     */
    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            clone.setAddress(this.address.clone());
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", address=" + address +
                '}';
    }
}
