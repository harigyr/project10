package org.hari10.com.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOperation is a Querydsl query type for Operation
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOperation extends EntityPathBase<Operation> {

    private static final long serialVersionUID = -1708223777L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOperation operation = new QOperation("operation");

    public final org.hari10.com.domain.base.QBaseEntity _super = new org.hari10.com.domain.base.QBaseEntity(this);

    public final QAccount account;

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final StringPath comment = createString("comment");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.util.Date> operationDate = createDateTime("operationDate", java.util.Date.class);

    public final StringPath operationName = createString("operationName");

    public final EnumPath<OperationType> operationType = createEnum("operationType", OperationType.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QOperation(String variable) {
        this(Operation.class, forVariable(variable), INITS);
    }

    public QOperation(Path<? extends Operation> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOperation(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOperation(PathMetadata<?> metadata, PathInits inits) {
        this(Operation.class, metadata, inits);
    }

    public QOperation(Class<? extends Operation> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.account = inits.isInitialized("account") ? new QAccount(forProperty("account"), inits.get("account")) : null;
    }

}

