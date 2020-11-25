package com.findbestdeal.frontend.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class CartView extends VerticalLayout {
    public CartView() {
        Button search = new Button("YO", e -> new CartView());
        add(search);
    }
}
