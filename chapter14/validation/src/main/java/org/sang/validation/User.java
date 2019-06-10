package org.sang.validation;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.time.Year;
import java.util.Date;

public class User {
    @Length
    private Integer id;
    @AssertFalse(groups = ValidationGroup2.class)
    private Boolean enabled;
    @PastOrPresent(groups = ValidationGroup2.class)
    private Year birthday;

    public Year getBirthday() {
        return birthday;
    }

    public void setBirthday(Year birthday) {
        this.birthday = birthday;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Size(min = 5, max = 10, message = "{user.name.size}",
            groups = ValidationGroup1.class)
    private String name;
    @NotEmpty(message = "{user.address.notnull}",groups = ValidationGroup2.class)
    private String address;
    @Min(value = 1, message = "{user.age.size}",groups = ValidationGroup2.class)
//    @DecimalMax(value = "200", message = "{user.age.size}")
//    @Digits(integer = 3,fraction = 3,groups = ValidationGroup2.class)
    @NegativeOrZero(groups = ValidationGroup2.class)
    private Integer age;
    @Email(message = "{user.email.pattern}")
    @NotNull(message = "{user.email.notnull}",
            groups = {ValidationGroup1.class,ValidationGroup2.class})
    private String email;
    //省略getter/setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
