package co.lujun.shuzhi.bean;

import java.io.Serializable;

/**
 * Created by lujun on 2015/5/23.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 8L; // Serializable ID

    private String id;

    private String name;

    private String uid;

    private String alt;

    private String avatar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
