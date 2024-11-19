
package com.tiendab.tiendab.services;

import com.tiendab.tiendab.model.Producto;


public interface ProductoService {
    Producto newProducto (Producto nowProducto);
    Iterable<Producto> getAll();
    Producto modifyProducto (Producto producto);
    Boolean deleteProducto(Long idProducto);
    
}
