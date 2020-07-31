package com.ad.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Create By  @林俊杰
 * 2020/7/31 21:01
 *
 * @version 1.0
 */
@Entity
@Data
public class LinkInfo {
    @Id
    private String linkId;

    private String docId;

    private String userId;
}
