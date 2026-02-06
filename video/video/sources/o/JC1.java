package o;

import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class JC1 {
    public static final JC1 a = new JC1();

    @InterfaceC9511sW0
    public static final PersistableBundle a(int i) {
        return new PersistableBundle(i);
    }

    @InterfaceC9511sW0
    public static final void b(PersistableBundle persistableBundle, String str, Object obj) {
        if (obj == null) {
            persistableBundle.putString(str, null);
        } else if (obj instanceof Boolean) {
            KC1.a(persistableBundle, str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
        } else if (obj instanceof PersistableBundle) {
            persistableBundle.putPersistableBundle(str, (PersistableBundle) obj);
        } else if (obj instanceof boolean[]) {
            KC1.b(persistableBundle, str, (boolean[]) obj);
        } else if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof Object[]) {
            Class<?> componentType = obj.getClass().getComponentType();
            C6562gT0.m(componentType);
            if (String.class.isAssignableFrom(componentType)) {
                C6562gT0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                persistableBundle.putStringArray(str, (String[]) obj);
                return;
            }
            String canonicalName = componentType.getCanonicalName();
            throw new IllegalArgumentException("Unsupported value array type " + canonicalName + " for key \"" + str + '\"');
        } else {
            String canonicalName2 = obj.getClass().getCanonicalName();
            throw new IllegalArgumentException("Unsupported value type " + canonicalName2 + " for key \"" + str + '\"');
        }
    }
}
