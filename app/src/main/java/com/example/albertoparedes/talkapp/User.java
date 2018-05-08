package com.example.albertoparedes.talkapp;

/**
 * Created by albertoparedes on 07/05/2018.
 */

public class User {

    private String descripcion;
    private int edad;
    private String estudios;
    private String foto_1,foto_2,foto_3,foto_4,foto_5,foto_6;
    private String idioma_1;
    private String idioma_2;
    private String image;
    private String intereses;
    private String nacionalidad;
    private String name;
    private String sexo;
    private String status;
    private String telefono;
    private String thumb_image;

    public User() {
    }

    public User(String descripcion, int edad, String estudios, String foto_1, String foto_2, String foto_3, String foto_4, String foto_5, String foto_6, String idioma_1, String idioma_2, String image, String intereses, String nacionalidad, String name, String sexo, String status, String telefono, String thumb_image) {
        this.descripcion = descripcion;
        this.edad = edad;
        this.estudios = estudios;
        this.foto_1 = foto_1;
        this.foto_2 = foto_2;
        this.foto_3 = foto_3;
        this.foto_4 = foto_4;
        this.foto_5 = foto_5;
        this.foto_6 = foto_6;
        this.idioma_1 = idioma_1;
        this.idioma_2 = idioma_2;
        this.image = image;
        this.intereses = intereses;
        this.nacionalidad = nacionalidad;
        this.name = name;
        this.sexo = sexo;
        this.status = status;
        this.telefono = telefono;
        this.thumb_image = thumb_image;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getFoto_1() {
        return foto_1;
    }

    public void setFoto_1(String foto_1) {
        this.foto_1 = foto_1;
    }

    public String getFoto_2() {
        return foto_2;
    }

    public void setFoto_2(String foto_2) {
        this.foto_2 = foto_2;
    }

    public String getFoto_3() {
        return foto_3;
    }

    public void setFoto_3(String foto_3) {
        this.foto_3 = foto_3;
    }

    public String getFoto_4() {
        return foto_4;
    }

    public void setFoto_4(String foto_4) {
        this.foto_4 = foto_4;
    }

    public String getFoto_5() {
        return foto_5;
    }

    public void setFoto_5(String foto_5) {
        this.foto_5 = foto_5;
    }

    public String getFoto_6() {
        return foto_6;
    }

    public void setFoto_6(String foto_6) {
        this.foto_6 = foto_6;
    }

    public String getIdioma_1() {
        return idioma_1;
    }

    public void setIdioma_1(String idioma_1) {
        this.idioma_1 = idioma_1;
    }

    public String getIdioma_2() {
        return idioma_2;
    }

    public void setIdioma_2(String idioma_2) {
        this.idioma_2 = idioma_2;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getThumb_image() {
        return thumb_image;
    }

    public void setThumb_image(String thumb_image) {
        this.thumb_image = thumb_image;
    }
}
