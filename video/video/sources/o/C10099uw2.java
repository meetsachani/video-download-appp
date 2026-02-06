package o;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.uw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10099uw2 extends C9856tw2 {
    public static final String B = "createFromFamiliesWithDefault";
    public static final int C = -1;
    public static final String D = "sans-serif";

    @Override // o.C9856tw2
    public Method C(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // o.C9856tw2, o.C9370rw2, o.C10588ww2
    public Typeface h(Context context, Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // o.C9856tw2
    public Typeface q(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.s.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
