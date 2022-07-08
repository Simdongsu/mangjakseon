package com.mangjakseon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QHeart is a Querydsl query type for Heart
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHeart extends EntityPathBase<Heart> {

    private static final long serialVersionUID = -784546946L;

    public static final QHeart heart = new QHeart("heart");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath memberId = createString("memberId");

    public final StringPath reviewNum = createString("reviewNum");

    public QHeart(String variable) {
        super(Heart.class, forVariable(variable));
    }

    public QHeart(Path<? extends Heart> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHeart(PathMetadata metadata) {
        super(Heart.class, metadata);
    }

}

