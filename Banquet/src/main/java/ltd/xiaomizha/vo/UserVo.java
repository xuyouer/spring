package ltd.xiaomizha.vo;

import ltd.xiaomizha.bean.UserDetails;
import ltd.xiaomizha.bean.UserDevices;
import ltd.xiaomizha.bean.UserVerification;
import ltd.xiaomizha.bean.Users;

import java.util.ArrayList;
import java.util.List;

public class UserVo {
    private Users users;
    private UserDetails userDetails;
    private UserRoleVo userRoleVo;
    private UserVerification userVerification;
    private List<UserDevices> userDevicesList = new ArrayList<>();

    public UserVo() {
    }

    public UserVo(Users users) {
        this.users = users;
    }

    public UserVo(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public UserVo(UserRoleVo userRoleVo) {
        this.userRoleVo = userRoleVo;
    }

    public UserVo(Users users, UserDetails userDetails, UserRoleVo userRoleVo) {
        this.users = users;
        this.userDetails = userDetails;
        this.userRoleVo = userRoleVo;
    }

    public UserVo(Users users, UserDetails userDetails, UserRoleVo userRoleVo, UserVerification userVerification) {
        this.users = users;
        this.userDetails = userDetails;
        this.userRoleVo = userRoleVo;
        this.userVerification = userVerification;
    }

    public UserVo(Users users, UserDetails userDetails, UserRoleVo userRoleVo, UserVerification userVerification, List<UserDevices> userDevicesList) {
        this.users = users;
        this.userDetails = userDetails;
        this.userRoleVo = userRoleVo;
        this.userVerification = userVerification;
        this.userDevicesList = userDevicesList;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "users=" + users +
                ", userDetails=" + userDetails +
                ", userRoleVo=" + userRoleVo +
                ", userVerification=" + userVerification +
                ", userDevicesList=" + userDevicesList +
                '}';
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public UserRoleVo getUserRoleVo() {
        return userRoleVo;
    }

    public void setUserRoleVo(UserRoleVo userRoleVo) {
        this.userRoleVo = userRoleVo;
    }

    public UserVerification getUserVerification() {
        return userVerification;
    }

    public void setUserVerification(UserVerification userVerification) {
        this.userVerification = userVerification;
    }

    public List<UserDevices> getUserDevicesList() {
        return userDevicesList;
    }

    public void setUserDevicesList(List<UserDevices> userDevicesList) {
        this.userDevicesList = userDevicesList;
    }
}
