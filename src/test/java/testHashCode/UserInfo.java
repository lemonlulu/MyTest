package testHashCode;

/**
 * Created by lemon on 2015/12/28.
 */
public class UserInfo{
    private Integer userId;
    private String userName;
    private Integer uerAge;

    public UserInfo(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUerAge() {
        return uerAge;
    }
    public void setUerAge(Integer uerAge) {
        this.uerAge = uerAge;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public int hashCode() {
        System.out.println("------hashCode----");
        return 1;
    }
    @Override
    public boolean equals(Object obj) {
        System.out.println("------equals----");
        if (obj instanceof UserInfo) {
            UserInfo user = (UserInfo) obj;
            if (this.userId.equals(user.getUserId())
                    && this.userName.equals(user.getUserName())) {
                return true;
            }
        }
        return false;
    }
}
