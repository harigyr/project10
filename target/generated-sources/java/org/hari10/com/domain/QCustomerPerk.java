package org.hari10.com.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCustomerPerk is a Querydsl query type for CustomerPerk
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomerPerk extends EntityPathBase<CustomerPerk> {

    private static final long serialVersionUID = -1747585164L;

    public static final QCustomerPerk customerPerk = new QCustomerPerk("customerPerk");

    public final org.hari10.com.domain.base.QBaseEntity _super = new org.hari10.com.domain.base.QBaseEntity(this);

    public final StringPath description = createString("description");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QCustomerPerk(String variable) {
        super(CustomerPerk.class, forVariable(variable));
    }

    public QCustomerPerk(Path<? extends CustomerPerk> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomerPerk(PathMetadata<?> metadata) {
        super(CustomerPerk.class, metadata);
    }

}

