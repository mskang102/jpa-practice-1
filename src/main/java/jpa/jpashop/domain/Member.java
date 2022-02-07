package jpa.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

        @Id @GeneratedValue(strategy = GenerationType.AUTO) /* auto 기본*/
        @Column(name = "MEMBER_ID")
        private long id;
        private String name;
        private String city;
        private String street;
        private String zipcode;
        private String adress;

        @OneToMany(mappedBy = "member")
        private List<Order> orders = new ArrayList<>();

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getStreet() {
                return street;
        }

        public void setStreet(String street) {
                this.street = street;
        }

        public String getZipcode() {
                return zipcode;
        }

        public void setZipcode(String zipcode) {
                this.zipcode = zipcode;
        }
}
