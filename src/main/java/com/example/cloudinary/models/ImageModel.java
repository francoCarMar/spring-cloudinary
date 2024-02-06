package com.example.cloudinary.models;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ImageModel {
    private String name;
    private MultipartFile file;

}
