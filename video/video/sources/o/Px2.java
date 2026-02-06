package o;

import java.net.URL;

/* loaded from: classes4.dex */
public final class Px2 extends AbstractC9141r0 {
    public Px2() {
    }

    @Override // o.AbstractC9141r0
    public <T> T g(Class<T> cls, Object obj) throws Throwable {
        if (URL.class.equals(cls)) {
            return cls.cast(new URL(obj.toString()));
        }
        throw c(cls, obj);
    }

    @Override // o.AbstractC9141r0
    public Class<?> i() {
        return URL.class;
    }

    public Px2(Object obj) {
        super(obj);
    }
}
