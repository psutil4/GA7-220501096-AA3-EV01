
package com.tiendab.tiendab.repository;

import com.tiendab.tiendab.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
