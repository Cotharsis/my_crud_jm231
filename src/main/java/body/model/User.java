package body.model;

import javax.persistence.*;

    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        // @Column(name = "title")
        private String name;

      //    @Column(name = "year")
        private int year;

      //   @Column(name = "genre")
        private String address;

        public User() { }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String title) {
            this.name = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String genre) {
            this.address = genre;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", year=" + year +
                    ", genre='" + address + '\'' +
                    '}';
        }

    }

