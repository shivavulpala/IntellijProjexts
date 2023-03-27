package com.comparator;

    public class Student implements Comparable<Student> {
        int rollnumber;
        String name;
        int age;

        public Student(int rollnumber, String name, int age) {
            this.rollnumber = rollnumber;
            this.name = name;
            this.age = age;
        }

        public int getRollnumber() {
            return rollnumber;
        }

        public void setRollnumber(int rollnumber) {
            this.rollnumber = rollnumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

//    @Override//same as below code lines 43-46
//    public int compareTo(Student o) {
//        return 0;
//    }

        public int compareTo(Student student) {
            return this.rollnumber - student.rollnumber;
            //if this value>0, current obj takes precedence
            //if this value<0, foreign obj takes precedence
            //if this value=0, either of them can come first
        }

    }