package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
