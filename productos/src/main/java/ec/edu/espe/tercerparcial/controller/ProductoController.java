package ec.edu.espe.tercerparcial.controller;

import ec.edu.espe.tercerparcial.domain.Producto;
import ec.edu.espe.tercerparcial.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/v1/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarPorCodigoUnico(@PathVariable(name = "codigoUnico") String codigoUnico) {
        log.info("Obteniendo producto con ID: {}", codigoUnico);
        try {
            return ResponseEntity.ok(this.productoService.buscarPorId(codigoUnico));
        } catch(RuntimeException rte) {
            log.error("Error al obtener producto por codigoUnico", rte);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Void> crear(@RequestBody Producto producto) {
        log.info("Se va a crear el producto: {}", producto);
        try {
            this.productoService.crearProducto(producto);
            return ResponseEntity.noContent().build();
        } catch(RuntimeException rte) {
            log.error("Error al crear el cliente", rte);
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping
    public ResponseEntity<Void> actualizar(@RequestBody Producto producto) {
        log.info("Se va a actualizar el producto: {}", producto);
        try {
            this.productoService.modificarProducto(producto);
            return ResponseEntity.noContent().build();
        } catch(RuntimeException rte) {
            log.error("Error al actualizar el producto", rte);
            return ResponseEntity.badRequest().build();
        }
    }


}
