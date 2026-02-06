package o;

import java.io.File;

/* renamed from: o.Xo0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4732Xo0 extends AbstractC9141r0 {
    public C4732Xo0() {
    }

    @Override // o.AbstractC9141r0
    public <T> T g(Class<T> cls, Object obj) throws Throwable {
        if (File.class.equals(cls)) {
            return cls.cast(new File(obj.toString()));
        }
        throw c(cls, obj);
    }

    @Override // o.AbstractC9141r0
    public Class<?> i() {
        return File.class;
    }

    public C4732Xo0(Object obj) {
        super(obj);
    }
}
