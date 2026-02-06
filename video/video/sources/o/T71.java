package o;

/* loaded from: classes.dex */
public final class T71 {
    public static final R71 a = c();
    public static final R71 b = new S71();

    public static R71 a() {
        return a;
    }

    public static R71 b() {
        return b;
    }

    public static R71 c() {
        try {
            return (R71) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
