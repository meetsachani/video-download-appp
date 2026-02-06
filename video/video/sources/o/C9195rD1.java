package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.rD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9195rD1 {
    @InterfaceC7058iW0
    @NotNull
    public static final C8946qD1 a = new C9013qU0();

    @HK1
    @InterfaceC6480g82(version = "1.2")
    public static final boolean a(int i, int i2, int i3) {
        return WX0.b1.l(i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final /* synthetic */ <T> T b(Object obj) {
        try {
            C6562gT0.y(1, "T");
            return obj;
        } catch (ClassCastException e) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            C6562gT0.y(4, "T");
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (!C6562gT0.g(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
            throw e;
        }
    }
}
