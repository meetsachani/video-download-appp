package o;

/* loaded from: classes4.dex */
public class BP0 {
    public static int a(Class<?> cls, Class<?> cls2) {
        if (cls != null && cls2 != null) {
            if (cls.equals(cls2)) {
                return 0;
            }
            Class<? super Object> superclass = cls.getSuperclass();
            int A = C3855Oo.A(cls2.equals(superclass));
            if (A == 1) {
                return A;
            }
            int a = A + a(superclass, cls2);
            if (a > 0) {
                return a + 1;
            }
        }
        return -1;
    }
}
