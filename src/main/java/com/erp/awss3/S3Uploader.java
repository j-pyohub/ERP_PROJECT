package com.erp.awss3;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class S3Uploader {

    private final S3Client s3Client;

    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    public String uploadItemImage(MultipartFile file) throws Exception {

        String folder = "items/";
        String key = folder + UUID.randomUUID() + "_" + file.getOriginalFilename();

        PutObjectRequest putReq = PutObjectRequest.builder()
                .bucket(bucket)
                .key(key)
                .contentType(file.getContentType())
                .acl("public-read") // URL로 바로 접근 가능
                .build();

        s3Client.putObject(putReq, RequestBody.fromBytes(file.getBytes()));

        return "https://" + bucket + ".s3.ap-northeast-2.amazonaws.com/" + key;
    }
}
