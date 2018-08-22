

import java.util.Date;

/**
 * Created by jinweih on 2018/6/3.
 */
public class User {
    private int id;
    private String userName;
    private Date birthDay;
    private String sex;
    private String address;

    public User() {
    }

    public int getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public Date getBirthDay() {
        return this.birthDay;
    }

    public String getSex() {
        return this.sex;
    }

    public String getAddress() {
        return this.address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$userName = this.getUserName();
        final Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final Object this$birthDay = this.getBirthDay();
        final Object other$birthDay = other.getBirthDay();
        if (this$birthDay == null ? other$birthDay != null : !this$birthDay.equals(other$birthDay)) return false;
        final Object this$sex = this.getSex();
        final Object other$sex = other.getSex();
        if (this$sex == null ? other$sex != null : !this$sex.equals(other$sex)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final Object $birthDay = this.getBirthDay();
        result = result * PRIME + ($birthDay == null ? 43 : $birthDay.hashCode());
        final Object $sex = this.getSex();
        result = result * PRIME + ($sex == null ? 43 : $sex.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

    public String toString() {
        return "User(id=" + this.getId() + ", userName=" + this.getUserName() + ", birthDay=" + this.getBirthDay() + ", sex=" + this.getSex() + ", address=" + this.getAddress() + ")";
    }
}
