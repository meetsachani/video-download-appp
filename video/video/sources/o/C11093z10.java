package o;

@InterfaceC11149zF0
@InterfaceC8301na0
/* renamed from: o.z10  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11093z10 {
    public static final Double a = Double.valueOf(0.0d);
    public static final Float b = Float.valueOf(0.0f);

    @MB
    public static <T> T a(Class<T> cls) {
        C10664xF1.E(cls);
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return (T) Boolean.FALSE;
            }
            if (cls == Character.TYPE) {
                return (T) (char) 0;
            }
            if (cls == Byte.TYPE) {
                return (T) (byte) 0;
            }
            if (cls == Short.TYPE) {
                return (T) (short) 0;
            }
            if (cls == Integer.TYPE) {
                return (T) 0;
            }
            if (cls == Long.TYPE) {
                return (T) 0L;
            }
            if (cls == Float.TYPE) {
                return (T) b;
            }
            if (cls == Double.TYPE) {
                return (T) a;
            }
            return null;
        }
        return null;
    }
}
