package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Attachment;
import com.example.warehouse_data_rest.Entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface CustomerAttachmentContent {
    Integer getId();

    Byte[] getBytes();
    Attachment getAttachment();
}
