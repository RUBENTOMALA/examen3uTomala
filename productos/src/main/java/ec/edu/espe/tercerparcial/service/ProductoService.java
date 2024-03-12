package ec.edu.espe.tercerparcial.service;

import ec.edu.espe.tercerparcial.dao.ProductoRepository;
import ec.edu.espe.tercerparcial.domain.Producto;

public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto buscarPorId(String codigoUnico){
        Producto producto = this.productoRepository.findByCodigoUnico(codigoUnico);
        if (cliente != null) {
            return  producto;
        }
        else {
            throw new RuntimeException("No se ha podido encontrar el producto con id: " + codigoUnico);
        }
    }

    public Producto crearProducto(Producto producto){
        return this.productoRepository.save(producto);
    }

    public void modificarProducto(Producto productoActualizado){
        Producto productoAux = this.productoRepository.findByCodigoUnico(productoActualizado.getCodigoUnico());

        if (productoAux!=null){
            productoAux.setPrecio(productoActualizado.getPrecio());
            productoAux.setNombre(productoActualizado.getNombre());
            productoAux.setDescripcion(productoActualizado.getDescripcion());
        }

    }
}
