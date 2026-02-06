package o;

/* renamed from: o.pB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8693pB extends AbstractC9141r0 {
    public C8693pB() {
    }

    @Override // o.AbstractC9141r0
    public String f(Object obj) {
        String obj2 = obj.toString();
        if (obj2.length() == 0) {
            return "";
        }
        return obj2.substring(0, 1);
    }

    @Override // o.AbstractC9141r0
    public <T> T g(Class<T> cls, Object obj) throws Exception {
        if (!Character.class.equals(cls) && !Character.TYPE.equals(cls)) {
            throw c(cls, obj);
        }
        return cls.cast(new Character(obj.toString().charAt(0)));
    }

    @Override // o.AbstractC9141r0
    public Class<?> i() {
        return Character.class;
    }

    public C8693pB(Object obj) {
        super(obj);
    }
}
