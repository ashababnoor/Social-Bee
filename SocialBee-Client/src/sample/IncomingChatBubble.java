package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.chats.IncomingChat;

import java.util.Objects;

public class IncomingChatBubble {
    @FXML
    public TextArea inChatBubble;
    @FXML
    public ImageView userPic;

    public void setImage(IncomingChat chat){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(chat.getUserPicSrc())));
        userPic.setImage(image);
    }
    public void setBubbleText(IncomingChat chat){
        inChatBubble.setText(chat.getMessage());
    }
}
