package ec.edu.espe.ventas.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "ventas")
public class Venta {

    @Field("id_venta")
    private String idProducto;

    @Field("codigo_unico")
    private String codigoUnico;
}
