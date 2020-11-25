package com.findbestdeal.frontend.view;

import com.findbestdeal.frontend.games.domian.Game;
import com.findbestdeal.frontend.games.service.GameService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("main")
public class MainView extends VerticalLayout {
    @Autowired
    private GameService gameService;
    private Grid grid = new Grid<>(Game.class);

    public MainView() {
//        Button search = new Button("CARTS", e -> new CartView());
//        add(search);
        grid.setColumns("id", "name");
        add(grid);
        setSizeFull();
        refresh();
    }

    public void refresh() {
        grid.setItems(gameService.addGame());
    }
}
