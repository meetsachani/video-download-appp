package o;

/* loaded from: classes.dex */
public final class C71 implements InterfaceC9275rY1 {
    public static final InterfaceC3442Ki1 b = new a();
    public final InterfaceC3442Ki1 a;

    /* loaded from: classes.dex */
    public static class a implements InterfaceC3442Ki1 {
        @Override // o.InterfaceC3442Ki1
        public InterfaceC3344Ji1 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // o.InterfaceC3442Ki1
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements InterfaceC3442Ki1 {
        public InterfaceC3442Ki1[] a;

        public b(InterfaceC3442Ki1... interfaceC3442Ki1Arr) {
            this.a = interfaceC3442Ki1Arr;
        }

        @Override // o.InterfaceC3442Ki1
        public InterfaceC3344Ji1 a(Class<?> cls) {
            InterfaceC3442Ki1[] interfaceC3442Ki1Arr;
            for (InterfaceC3442Ki1 interfaceC3442Ki1 : this.a) {
                if (interfaceC3442Ki1.b(cls)) {
                    return interfaceC3442Ki1.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // o.InterfaceC3442Ki1
        public boolean b(Class<?> cls) {
            for (InterfaceC3442Ki1 interfaceC3442Ki1 : this.a) {
                if (interfaceC3442Ki1.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C71() {
        this(b());
    }

    public static InterfaceC3442Ki1 b() {
        return new b(HC0.c(), c());
    }

    public static InterfaceC3442Ki1 c() {
        try {
            return (InterfaceC3442Ki1) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    public static boolean d(InterfaceC3344Ji1 interfaceC3344Ji1) {
        if (interfaceC3344Ji1.f() == WJ1.PROTO2) {
            return true;
        }
        return false;
    }

    public static <T> InterfaceC9026qY1<T> e(Class<T> cls, InterfaceC3344Ji1 interfaceC3344Ji1) {
        if (IC0.class.isAssignableFrom(cls)) {
            if (d(interfaceC3344Ji1)) {
                return C3833Oi1.S(cls, interfaceC3344Ji1, C5181aq1.b(), Q01.b(), C11222zY1.S(), C3445Kj0.b(), T71.b());
            }
            return C3833Oi1.S(cls, interfaceC3344Ji1, C5181aq1.b(), Q01.b(), C11222zY1.S(), null, T71.b());
        } else if (d(interfaceC3344Ji1)) {
            return C3833Oi1.S(cls, interfaceC3344Ji1, C5181aq1.a(), Q01.a(), C11222zY1.K(), C3445Kj0.a(), T71.a());
        } else {
            return C3833Oi1.S(cls, interfaceC3344Ji1, C5181aq1.a(), Q01.a(), C11222zY1.L(), null, T71.a());
        }
    }

    @Override // o.InterfaceC9275rY1
    public <T> InterfaceC9026qY1<T> a(Class<T> cls) {
        C11222zY1.M(cls);
        InterfaceC3344Ji1 a2 = this.a.a(cls);
        if (a2.a()) {
            if (IC0.class.isAssignableFrom(cls)) {
                return C3930Pi1.m(C11222zY1.S(), C3445Kj0.b(), a2.b());
            }
            return C3930Pi1.m(C11222zY1.K(), C3445Kj0.a(), a2.b());
        }
        return e(cls, a2);
    }

    public C71(InterfaceC3442Ki1 interfaceC3442Ki1) {
        this.a = (InterfaceC3442Ki1) C9740tS0.e(interfaceC3442Ki1, "messageInfoFactory");
    }
}
