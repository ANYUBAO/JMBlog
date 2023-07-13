-- blog.blog_article

CREATE TABLE `blog_article`
(
    `id`            bigint       NOT NULL COMMENT '主键',
    `create_by`     datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1)   NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `title`         varchar(50)  NOT NULL COMMENT '文章标题',
    `summary`       varchar(100) NOT NULL COMMENT '文章简介，默认100个汉字以内',
    `top`           tinyint(1)   NOT NULL DEFAULT '0' COMMENT '文章是否置顶，0为否，1为是',
    `traffic`       int          NOT NULL DEFAULT '0' COMMENT '文章访问量',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='文章信息表';


-- blog.blog_article_content

CREATE TABLE `blog_article_content`
(
    `id`            bigint     NOT NULL COMMENT '主键',
    `create_by`     datetime   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `content`       text       NOT NULL COMMENT '文章内容',
    `article_id`    bigint     NOT NULL COMMENT '对应文章ID',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='文章内容表';


-- blog.blog_article_message

CREATE TABLE `blog_article_message`
(
    `id`            bigint     NOT NULL COMMENT '主键',
    `create_by`     datetime   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `article_id`    bigint     NOT NULL COMMENT '文章ID',
    `message_id`    bigint     NOT NULL COMMENT '对应的留言ID',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='文章评论关联表';


-- blog.blog_article_picture

CREATE TABLE `blog_article_picture`
(
    `id`            bigint       NOT NULL COMMENT '主键',
    `create_by`     datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1)   NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `article_id`    bigint       NOT NULL COMMENT '文章id',
    `picture_url`   varchar(200) NOT NULL COMMENT '图片url',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='文章题图表';


-- blog.blog_article_sort

CREATE TABLE `blog_article_sort`
(
    `id`            bigint     NOT NULL COMMENT '主键',
    `create_by`     datetime   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `sort_id`       bigint     NOT NULL COMMENT '分类id',
    `article_id`    bigint     NOT NULL COMMENT '文章id',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='文章分类关联表';


-- blog.blog_log

CREATE TABLE `blog_log`
(
    `id`            bigint       NOT NULL COMMENT '主键',
    `create_by`     datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1)   NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `ip`            varchar(20)  NOT NULL COMMENT '操作地址的IP',
    `remark`        varchar(255) NOT NULL COMMENT '操作内容',
    `operate_url`   varchar(50)  NOT NULL COMMENT '操作的访问地址',
    `operate_by`    varchar(50)           DEFAULT NULL COMMENT '操作的浏览器',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='操作日志表';


-- blog.blog_message

CREATE TABLE `blog_message`
(
    `id`            bigint       NOT NULL COMMENT '主键',
    `create_by`     datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1)   NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `content`       varchar(200) NOT NULL COMMENT '留言/评论内容',
    `email`         varchar(100) NOT NULL COMMENT '邮箱，用于回复消息',
    `name`          varchar(20)  NOT NULL COMMENT '用户自己定义的名称',
    `ip`            varchar(20)  NOT NULL COMMENT '留言/评论IP',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='评论/留言表';


-- blog.blog_sort

CREATE TABLE `blog_sort`
(
    `id`            bigint      NOT NULL COMMENT '主键',
    `create_by`     datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1)  NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `name`          varchar(20) NOT NULL COMMENT '分类名称',
    `number`        int         NOT NULL DEFAULT '0' COMMENT '该分类下的文章数量',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='分类表';


-- blog.blog_view

CREATE TABLE `blog_view`
(
    `id`            bigint      NOT NULL COMMENT '主键',
    `create_by`     datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `status`        tinyint(1)  NOT NULL DEFAULT '0' COMMENT '是否有效，默认为0为有效，1为无效',
    `ip`            varchar(20) NOT NULL COMMENT '访问IP',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='浏览量表';