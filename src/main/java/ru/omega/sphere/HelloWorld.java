package ru.omega.sphere;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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

import java.awt.*;

@Route("")
//@UIScope
public class HelloWorld extends Div {
    public HelloWorld() {
        VerticalLayout layout = new VerticalLayout();
        Label hello = new Label();
        Button button = new Button();
        Button button2 = new Button();

        hello.setText("Hello world!!! in label");
        button.setText("Кнопка 1");
        button2.setText("Кнопка 2");
        layout.add(hello);
        layout.add(button);
        layout.add(button2);

        HorizontalLayout hlayout = new HorizontalLayout();
        Button button3 = new Button();
        Button button4 = new Button();
        button3.setText("Кнопка 3");
        button4.setText("Кнопка 4");
        hlayout.add(button3);
        hlayout.add(button4);

        setText("Hello world!!! in div");
        add(layout);
        add(hlayout);
    }
}
