package o;

import android.text.Editable;

/* renamed from: o.Ca0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2614Ca0 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile Editable.Factory b;
    public static Class<?> c;

    public C2614Ca0() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2614Ca0.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new C2614Ca0();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        if (cls != null) {
            return C9033qa2.d(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
