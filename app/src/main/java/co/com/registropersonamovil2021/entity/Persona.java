package co.com.registropersonamovil2021.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import co.com.registropersonamovil2021.persistencia.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(tableName = RoomConfig.Tabla.PERSONA)
@NoArgsConstructor
public class Persona {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name="idPersona")
    private Integer idPersona;
    @ColumnInfo(name="numeroDocumentoIdentidad")
    private String numeroDocumentoIdentidad;
    @ColumnInfo(name="nombrePersona")
    private String nombrePersona;
    @ColumnInfo(name="apellidoPersona")
    private String apellidoPersona;

    @NonNull
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(@NonNull Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
}
