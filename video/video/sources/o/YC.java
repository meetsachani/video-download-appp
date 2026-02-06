package o;

/* loaded from: classes4.dex */
public final class YC extends AbstractC9141r0 {
    public YC() {
    }

    @Override // o.AbstractC9141r0
    public String f(Object obj) {
        if (obj instanceof Class) {
            return ((Class) obj).getName();
        }
        return obj.toString();
    }

    @Override // o.AbstractC9141r0
    public <T> T g(Class<T> cls, Object obj) throws Throwable {
        if (Class.class.equals(cls)) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return cls.cast(contextClassLoader.loadClass(obj.toString()));
                } catch (ClassNotFoundException unused) {
                }
            }
            return cls.cast(YC.class.getClassLoader().loadClass(obj.toString()));
        }
        throw c(cls, obj);
    }

    @Override // o.AbstractC9141r0
    public Class<?> i() {
        return Class.class;
    }

    public YC(Object obj) {
        super(obj);
    }
}
