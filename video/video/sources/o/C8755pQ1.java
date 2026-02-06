package o;

import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: o.pQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8755pQ1 extends C4056Qp2 {
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public String[] c1;
    public Class<?> d1;

    public C8755pQ1(Object obj) {
        super(j0(obj));
    }

    public static String A0(Object obj, AbstractC4253Sp2 abstractC4253Sp2, boolean z) {
        return C0(obj, abstractC4253Sp2, z, false, null);
    }

    public static String B0(Object obj, AbstractC4253Sp2 abstractC4253Sp2, boolean z, boolean z2) {
        return C0(obj, abstractC4253Sp2, z, z2, null);
    }

    public static <T> String C0(T t, AbstractC4253Sp2 abstractC4253Sp2, boolean z, boolean z2, Class<? super T> cls) {
        return new C8755pQ1(t, abstractC4253Sp2, null, cls, z, z2).toString();
    }

    public static <T> String D0(T t, AbstractC4253Sp2 abstractC4253Sp2, boolean z, boolean z2, boolean z3, Class<? super T> cls) {
        return new C8755pQ1(t, abstractC4253Sp2, null, cls, z, z2, z3).toString();
    }

    public static String E0(Object obj, Collection<String> collection) {
        return F0(obj, w0(collection));
    }

    public static String F0(Object obj, String... strArr) {
        return new C8755pQ1(obj).t0(strArr).toString();
    }

    public static Object j0(Object obj) {
        return C11147zE2.V(obj, IconCompat.A, new Object[0]);
    }

    public static String[] w0(Collection<String> collection) {
        if (collection == null) {
            return C4206Se.u;
        }
        return x0(collection.toArray());
    }

    public static String[] x0(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return (String[]) arrayList.toArray(C4206Se.u);
    }

    public static String y0(Object obj) {
        return C0(obj, null, false, false, null);
    }

    public static String z0(Object obj, AbstractC4253Sp2 abstractC4253Sp2) {
        return C0(obj, abstractC4253Sp2, false, false, null);
    }

    public boolean h0(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !o0()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !n0()) {
            return false;
        }
        String[] strArr = this.c1;
        if (strArr != null && Arrays.binarySearch(strArr, field.getName()) >= 0) {
            return false;
        }
        return !field.isAnnotationPresent(InterfaceC4153Rp2.class);
    }

    public void i0(Class<?> cls) {
        if (cls.isArray()) {
            q0(Z());
            return;
        }
        Field[] fieldArr = (Field[]) C3619Me.h(cls.getDeclaredFields(), Comparator.comparing(new C6883ho0()));
        AccessibleObject.setAccessible(fieldArr, true);
        for (Field field : fieldArr) {
            String name = field.getName();
            if (h0(field)) {
                try {
                    Object m0 = m0(field);
                    if (!this.b1 || m0 != null) {
                        o(name, m0, !field.isAnnotationPresent(InterfaceC4350Tp2.class));
                    }
                } catch (IllegalAccessException e) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e.getMessage());
                }
            }
        }
    }

    public String[] k0() {
        return (String[]) this.c1.clone();
    }

    public Class<?> l0() {
        return this.d1;
    }

    public Object m0(Field field) throws IllegalAccessException {
        return field.get(Z());
    }

    public boolean n0() {
        return this.Z0;
    }

    public boolean o0() {
        return this.a1;
    }

    public boolean p0() {
        return this.b1;
    }

    public C8755pQ1 q0(Object obj) {
        b0().K0(a0(), null, obj);
        return this;
    }

    public void r0(boolean z) {
        this.Z0 = z;
    }

    public void s0(boolean z) {
        this.a1 = z;
    }

    public C8755pQ1 t0(String... strArr) {
        if (strArr == null) {
            this.c1 = null;
            return this;
        }
        this.c1 = (String[]) C3619Me.g(x0(strArr));
        return this;
    }

    @Override // o.C4056Qp2
    public String toString() {
        if (Z() == null) {
            return b0().t0();
        }
        Class<?> cls = Z().getClass();
        i0(cls);
        while (cls.getSuperclass() != null && cls != l0()) {
            cls = cls.getSuperclass();
            i0(cls);
        }
        return super.toString();
    }

    public void u0(boolean z) {
        this.b1 = z;
    }

    public void v0(Class<?> cls) {
        Object Z;
        if (cls != null && (Z = Z()) != null && !cls.isInstance(Z)) {
            throw new IllegalArgumentException("Specified class is not a superclass of the object");
        }
        this.d1 = cls;
    }

    public C8755pQ1(Object obj, AbstractC4253Sp2 abstractC4253Sp2) {
        super(j0(obj), abstractC4253Sp2);
    }

    public C8755pQ1(Object obj, AbstractC4253Sp2 abstractC4253Sp2, StringBuffer stringBuffer) {
        super(j0(obj), abstractC4253Sp2, stringBuffer);
    }

    public <T> C8755pQ1(T t, AbstractC4253Sp2 abstractC4253Sp2, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2) {
        super(j0(t), abstractC4253Sp2, stringBuffer);
        v0(cls);
        s0(z);
        r0(z2);
    }

    public <T> C8755pQ1(T t, AbstractC4253Sp2 abstractC4253Sp2, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2, boolean z3) {
        super(j0(t), abstractC4253Sp2, stringBuffer);
        v0(cls);
        s0(z);
        r0(z2);
        u0(z3);
    }
}
