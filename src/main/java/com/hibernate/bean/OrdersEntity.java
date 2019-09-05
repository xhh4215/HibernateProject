package com.hibernate.bean;

import javax.persistence.*;

@Entity
@Table(name = "orders", schema = "springtest")
public class OrdersEntity {
    private int idO;
    private int orderNo;
    private int idP;

    @Id
    @Column(name = "Id_O")
    public int getIdO() {
        return idO;
    }

    public void setIdO(int idO) {
        this.idO = idO;
    }

    @Basic
    @Column(name = "OrderNo")
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "Id_P")
    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (idO != that.idO) return false;
        if (orderNo != that.orderNo) return false;
        if (idP != that.idP) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idO;
        result = 31 * result + orderNo;
        result = 31 * result + idP;
        return result;
    }
}
