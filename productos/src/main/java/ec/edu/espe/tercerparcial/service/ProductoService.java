package ec.edu.espe.tercerparcial.service;

import ec.edu.espe.tercerparcial.dao.ProductoRepository;

public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto buscarPorId(String codigoUnico){
        Producto cliente = this.productoRepository.findByCodigoUnico(codigoUnico);
        if (cliente != null) {

        return;

    }
}
