package io.codelex.classesandobjects.practice;

public class Dog {
        private String name;
        private String sex;
        private String mother;
        private String father;

        public Dog(String name, String sex) {
            this.name = name;
            this.sex = sex;

        }

        public Dog(String name, String sex, String mother, String father) {
            this.name = name;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            return this.name + " " + this.sex + " " + this.mother + " " + this.father;
        }


        public String fathersName() {
            if (father == null) {
                System.out.println("Unknown");
            } else {
                System.out.print(father);
            }
            return "";
        }

        public boolean hasSameMother(Dog dog8) {
            return mother == dog8.mother;
        }
    }

