package ufv.dis.final2020.WvVSP1;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

import com.google.zxing.WriterException;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        Inventario inventario = new Inventario();
        
        final TextField Nombre = new TextField();
        Nombre.setCaption("Type your nombre here:");
        
        final TextField Categoria = new TextField();
        Categoria.setCaption("Type your categoria here:");
        
        final TextField Precio = new TextField();
        Precio.setCaption("Type your precio here:");
        
        final TextField EAN13 = new TextField();
        EAN13.setCaption("Type your ean13 here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {

        	Producto u = new Producto(Nombre.getValue(),Categoria.getValue(),Float.parseFloat(Precio.getValue()),EAN13.getValue());
        	
        	inventario.addPro(u);
        	
        	
        });
        
        layout.addComponents(Nombre, Categoria, Precio, EAN13, button);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
