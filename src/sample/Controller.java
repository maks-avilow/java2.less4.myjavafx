package sample;
/*Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна.
Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели.
Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter
При «отсылке» сообщение перекидывается из нижнего поля в центральное.*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField Field;
    @FXML
    private TextArea Area;

    public void buttonMassage(ActionEvent actionEvent) {
        String text = Area.getText()  + Field.getText() + "\n";
        Field.setText("");
        Field.requestFocus();
        Area.setText(text);
        Area.setScrollTop(Double.MAX_VALUE);
    }
}
