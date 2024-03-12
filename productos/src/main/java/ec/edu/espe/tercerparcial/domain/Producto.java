package ec.edu.espe.tercerparcial.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "productos")
public class Producto {

    @Field("id_producto")
    private String idProducto;

    @Field("codigo_unico")
    private String codigoUnico;

    private Date nombre;

    private Date descripcion;

    private BigDecimal precio;

    private String existencia;

    public Producto(String idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(idProducto, producto.idProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto);
    }

    @Override
    public String toString() {
        return "producto{" +
                "idProducto='" + idProducto + '\'' +
                ", codigoUnico='" + codigoUnico + '\'' +
                ", nombre=" + nombre +
                ", descripcion=" + descripcion +
                ", precio=" + precio +
                ", existencia='" + existencia + '\'' +
                '}';
    }
}
