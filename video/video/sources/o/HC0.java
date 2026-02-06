package o;

/* loaded from: classes.dex */
public class HC0 implements InterfaceC3442Ki1 {
    public static final HC0 a = new HC0();

    public static HC0 c() {
        return a;
    }

    @Override // o.InterfaceC3442Ki1
    public InterfaceC3344Ji1 a(Class<?> cls) {
        if (IC0.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC3344Ji1) IC0.I1(cls.asSubclass(IC0.class)).s1();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // o.InterfaceC3442Ki1
    public boolean b(Class<?> cls) {
        return IC0.class.isAssignableFrom(cls);
    }
}
