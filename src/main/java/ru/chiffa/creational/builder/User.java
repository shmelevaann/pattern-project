package ru.chiffa.creational.builder;

import java.util.Objects;

public class User {
    private final String name;
    private final Integer age;

    private User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static class UserBuilder {
        private String name;
        private Integer age;

        public UserBuilder withName(String name) {
            Objects.requireNonNull(name, "Field name can't be empty");

            this.name = name;
            return this;
        }

        public UserBuilder withAge(Integer age) {
            Objects.requireNonNull(age, "Field age can't be empty");

            this.age = age;
            return this;
        }

        public User built() {
            Objects.requireNonNull(this.name, "Field name can't be empty");
            Objects.requireNonNull(this.age, "Field age can't be empty");

            return new User(this.name, this.age);
        }
    }
}
