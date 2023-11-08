package com.peso.elBuenSabor.services;

import com.peso.elBuenSabor.entities.Pedido;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PedidoService extends BaseService<Pedido, Long> {

    List<Pedido> findBycliente_id(Long cliente_id) throws Exception;


}
