package com.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para manejar las solicitudes relacionadas con las categorías.
 * 
 */
@RestController
@RequestMapping("/category")
public class CtrlCategory {

    @GetMapping
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        // Categorias de ejemplo:
        categories.add(new Category("Ropa", "RP", null, 1, 1));
        categories.add(new Category("Calzado", "CLZD", null, 1, 2));
        categories.add(new Category("Accesorios", "ACCS", null, 1, 3));
        return categories;
    }
}
