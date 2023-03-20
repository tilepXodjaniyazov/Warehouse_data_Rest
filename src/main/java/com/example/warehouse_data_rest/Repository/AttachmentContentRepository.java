package com.example.warehouse_data_rest.Repository;


import com.example.warehouse_data_rest.Entity.AttachmentContent;
import com.example.warehouse_data_rest.Projection.CustomerAttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentContent",excerptProjection = CustomerAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

    AttachmentContent findAttachmentContentByAttachmentId(Integer id);
}
