package o;

/* renamed from: o.oe2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8563oe2 extends AbstractC9141r0 {
    public C8563oe2() {
    }

    @Override // o.AbstractC9141r0
    public <T> T g(Class<T> cls, Object obj) throws Throwable {
        if (!String.class.equals(cls) && !Object.class.equals(cls)) {
            throw c(cls, obj);
        }
        return cls.cast(obj.toString());
    }

    @Override // o.AbstractC9141r0
    public Class<?> i() {
        return String.class;
    }

    public C8563oe2(Object obj) {
        super(obj);
    }
}
