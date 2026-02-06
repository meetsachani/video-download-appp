package o;

/* renamed from: o.Te  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4303Te {
    public static final int a = -1;

    public static boolean a(Object[] objArr, Object obj) {
        if (b(objArr, obj) != -1) {
            return true;
        }
        return false;
    }

    public static <T> int b(T[] tArr, Object obj) {
        return c(tArr, obj, 0);
    }

    public static int c(Object[] objArr, Object obj, int i) {
        if (objArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
