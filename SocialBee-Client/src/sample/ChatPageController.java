package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import sample.chats.IncomingChat;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ChatPageController implements Initializable {

    @FXML
    public ImageView currChatImage;
    public Label currChatName;
    public Label currChatLastSeen;

    List<IncomingChat> chats;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void showChatsAction(MouseEvent mouseEvent) {
    }
    public void showFriendsAction(MouseEvent mouseEvent) {
    }
    public void settingsAction(MouseEvent mouseEvent) {
    }
    public void checkCharAction(KeyEvent keyEvent) {
    }
    public void sendAction(MouseEvent mouseEvent) {
    }

    private List<IncomingChat> data(){
        IncomingChat chat = new IncomingChat();
        chats.add(chat);

        return chats;
    }


}
