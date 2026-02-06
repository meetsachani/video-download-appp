package o;

/* renamed from: o.Kj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3445Kj0 {
    public static final AbstractC3249Ij0<?> a = new C3347Jj0();
    public static final AbstractC3249Ij0<?> b = c();

    public static AbstractC3249Ij0<?> a() {
        AbstractC3249Ij0<?> abstractC3249Ij0 = b;
        if (abstractC3249Ij0 != null) {
            return abstractC3249Ij0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC3249Ij0<?> b() {
        return a;
    }

    public static AbstractC3249Ij0<?> c() {
        try {
            return (AbstractC3249Ij0) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
