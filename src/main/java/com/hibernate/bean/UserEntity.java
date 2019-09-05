package com.hibernate.bean;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "springtest")
public class UserEntity {
    private int uid;
    private String uname;
    private String usex;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "usex")
    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (uid != that.uid) return false;
        if (uname != null ? !uname.equals(that.uname) : that.uname != null) return false;
        if (usex != null ? !usex.equals(that.usex) : that.usex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (usex != null ? usex.hashCode() : 0);
        return result;
    }
}
