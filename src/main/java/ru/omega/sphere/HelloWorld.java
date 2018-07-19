package ru.omega.sphere;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinRequest;

@Route("")
//@UIScope
public class HelloWorld extends Div {
    public HelloWorld() {
        VerticalLayout layout = new VerticalLayout();
        Label hello = new Label();
        Button button = new Button();

        hello.setText("Hello world!!! in label");
        button.setText("Кнопка 1");
        layout.add(hello);
        layout.add(button);

        setText("Hello world!!! in div");
        add(layout);
    }
}
