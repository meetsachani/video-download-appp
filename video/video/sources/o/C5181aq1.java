package o;

/* renamed from: o.aq1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5181aq1 {
    public static final InterfaceC4834Yp1 a = c();
    public static final InterfaceC4834Yp1 b = new C4941Zp1();

    public static InterfaceC4834Yp1 a() {
        return a;
    }

    public static InterfaceC4834Yp1 b() {
        return b;
    }

    public static InterfaceC4834Yp1 c() {
        try {
            return (InterfaceC4834Yp1) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
