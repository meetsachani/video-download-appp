package o;

import java.lang.reflect.Array;

/* renamed from: o.Je  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3326Je {
    public static <T> T[] a(T[] tArr, int i) {
        if (tArr.length < i) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
