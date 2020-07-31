package com.ad.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Create By  @林俊杰
 * 2020/7/31 20:52
 *
 * @version 1.0
 */
@Entity
@Data
public class TagLink {
    @Id
    private String tlinkId;

    /*标签ID*/
    private String tagId;

    /*文档ID*/
    private String docId;

    /*帖子ID*/
    private String postId;
}
