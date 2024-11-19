
package com.tiendab.tiendab.controller;

import com.tiendab.tiendab.model.Producto;
import com.tiendab.tiendab.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @PostMapping("/nuevo")
    public Producto newProducto(@RequestBody Producto newProducto){
       return this.productoService.newProducto(newProducto);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Producto> getAll(){
        return productoService.getAll();
    }
    
    @PostMapping("/modificar")
    public Producto updateProducto(@RequestBody Producto Producto){
       return this.productoService.modifyProducto(Producto);
    }
    
    @PostMapping(value="{id}")
    public Boolean deleteProducto(@PathVariable(value="id") Long id){
       return this.productoService.deleteProducto(id);
    }
}
