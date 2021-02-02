package sample.chats;

public class IncomingChat {
    private String userPicSrc = "resources/users/Shabab.jpg";
    private String message = "Lorem ipsum dolor sit amet.";
    private String time;

    public String getUserPicSrc() {
        return userPicSrc;
    }

    public void setUserPicSrc(String userPicSrc) {
        this.userPicSrc = userPicSrc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
