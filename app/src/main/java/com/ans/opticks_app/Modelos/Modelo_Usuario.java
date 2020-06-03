package com.ans.opticks_app.Modelos;

public class Modelo_Usuario {

    Integer id_usuario,admin_id_admin;
    Long  cedula_usuario,telefono_usuario;
    String nombres_usuario,apellidos_usuario,correo_usuario,contrasena_usuario,estado_usuario,
            foto_usuario,firma_usuario;

    //Constructor
    public Modelo_Usuario(){}

    public Modelo_Usuario(Integer id_usuario, Integer admin_id_admin, Long cedula_usuario,
                          Long telefono_usuario, String nombres_usuario, String apellidos_usuario,
                          String correo_usuario, String contrasena_usuario, String estado_usuario,
                          String foto_usuario, String firma_usuario) {
        this.id_usuario = id_usuario;
        this.admin_id_admin = admin_id_admin;
        this.cedula_usuario = cedula_usuario;
        this.telefono_usuario = telefono_usuario;
        this.nombres_usuario = nombres_usuario;
        this.apellidos_usuario = apellidos_usuario;
        this.correo_usuario = correo_usuario;
        this.contrasena_usuario = contrasena_usuario;
        this.estado_usuario = estado_usuario;
        this.foto_usuario = foto_usuario;
        this.firma_usuario = firma_usuario;
    }

    //Getter

    public Integer getId_usuario() {
        return id_usuario;
    }

    public Integer getAdmin_id_admin() {
        return admin_id_admin;
    }

    public Long getCedula_usuario() {
        return cedula_usuario;
    }

    public Long getTelefono_usuario() {
        return telefono_usuario;
    }

    public String getNombres_usuario() {
        return nombres_usuario;
    }

    public String getApellidos_usuario() {
        return apellidos_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public String getFoto_usuario() {
        return foto_usuario;
    }

    public String getFirma_usuario() {
        return firma_usuario;
    }

    //Setter

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setAdmin_id_admin(Integer admin_id_admin) {
        this.admin_id_admin = admin_id_admin;
    }

    public void setCedula_usuario(Long cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public void setTelefono_usuario(Long telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public void setNombres_usuario(String nombres_usuario) {
        this.nombres_usuario = nombres_usuario;
    }

    public void setApellidos_usuario(String apellidos_usuario) {
        this.apellidos_usuario = apellidos_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    public void setFoto_usuario(String foto_usuario) {
        this.foto_usuario = foto_usuario;
    }

    public void setFirma_usuario(String firma_usuario) {
        this.firma_usuario = firma_usuario;
    }
}
