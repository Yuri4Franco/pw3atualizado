package com.example.projeto.models;

import java.io.Serializable;

import com.example.projeto.enums.TipoOferta;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ofertas")
public class OfertaModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer tipoOferta;

    private double valor;

    @ManyToOne
    @JoinColumn(name="imovel_id")
    @JsonIgnore
    private ImovelModel imovelModel;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UserModel userModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "desconto_id")
    private DescontoModel desconto;


    public TipoOferta getTipoOferta() {
        return TipoOferta.toEnum(tipoOferta);
    }

    public void setTipoUsuario(TipoOferta tipoOferta) {
        this.tipoOferta = tipoOferta.getCodigo();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Outros getters e setters

    public DescontoModel getDesconto() {
        return desconto;
    }

    public void setDesconto(DescontoModel desconto) {
        this.desconto = desconto;
    }

       
    
}
