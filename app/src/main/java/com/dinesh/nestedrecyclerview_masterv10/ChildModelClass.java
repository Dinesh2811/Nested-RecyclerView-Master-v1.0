package com.dinesh.nestedrecyclerview_masterv10;

public class ChildModelClass {

    String imgUrl;

    public ChildModelClass(String ImgUrl) {
        this.imgUrl = ImgUrl;
    }

    public ChildModelClass() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "ChildModelClass{" +
                "getImgUrl='" + imgUrl + '\'' +
                '}';
    }
}
