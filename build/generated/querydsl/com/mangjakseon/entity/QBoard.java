package com.mangjakseon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -789790178L;

    public static final QBoard board = new QBoard("board");

    public final com.mangjakseon.utils.QBaseEntity _super = new com.mangjakseon.utils.QBaseEntity(this);

    public final StringPath b_content = createString("b_content");

    public final NumberPath<Integer> b_count = createNumber("b_count", Integer.class);

    public final StringPath b_title = createString("b_title");

    public final NumberPath<Integer> bno = createNumber("bno", Integer.class);

    public final StringPath iframe = createString("iframe");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final StringPath s_img = createString("s_img");

    public final StringPath writer = createString("writer");

    public QBoard(String variable) {
        super(Board.class, forVariable(variable));
    }

    public QBoard(Path<? extends Board> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoard(PathMetadata metadata) {
        super(Board.class, metadata);
    }

}

