package com.wanjiayun.bean;

public class Department {
    private Integer id;
    private String deptname;
    private Integer ceo;
    private String address;

    public Department(Integer id, String deptname, Integer ceo, String address) {
        this.id = id;
        this.deptname = deptname;
        this.ceo = ceo;
        this.address = address;
    }

    public Department() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Integer getCeo() {
        return ceo;
    }

    public void setCeo(Integer ceo) {
        this.ceo = ceo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                ", ceo=" + ceo +
                ", address='" + address + '\'' +
                '}';
    }
}
