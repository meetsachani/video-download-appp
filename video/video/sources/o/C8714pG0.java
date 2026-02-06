package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.pG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8714pG0 implements InterfaceC4943Zq<Integer> {
    public static final int Y0 = 37;
    public static final int Z = 17;
    public static final ThreadLocal<Set<ZI0>> Z0 = new ThreadLocal<>();
    public final int X;
    public int Y;

    public C8714pG0() {
        this.X = 37;
        this.Y = 17;
    }

    public static <T> int A(int i, int i2, T t, boolean z, Class<? super T> cls, String... strArr) {
        C11147zE2.V(t, "object", new Object[0]);
        C8714pG0 c8714pG0 = new C8714pG0(i, i2);
        Class<?> cls2 = t.getClass();
        x(t, cls2, c8714pG0, z, strArr);
        while (cls2.getSuperclass() != null && cls2 != cls) {
            cls2 = cls2.getSuperclass();
            x(t, cls2, c8714pG0, z, strArr);
        }
        return c8714pG0.F();
    }

    public static int B(Object obj, Collection<String> collection) {
        return D(obj, C8755pQ1.w0(collection));
    }

    public static int C(Object obj, boolean z) {
        return A(17, 37, obj, z, null, new String[0]);
    }

    public static int D(Object obj, String... strArr) {
        return A(17, 37, obj, false, null, strArr);
    }

    public static void E(Object obj) {
        Set<ZI0> v = v();
        if (v == null) {
            v = new HashSet<>();
            Z0.set(v);
        }
        v.add(new ZI0(obj));
    }

    public static void G(Object obj) {
        Set<ZI0> v = v();
        if (v != null) {
            v.remove(new ZI0(obj));
            if (v.isEmpty()) {
                Z0.remove();
            }
        }
    }

    public static Set<ZI0> v() {
        return Z0.get();
    }

    public static boolean w(Object obj) {
        Set<ZI0> v = v();
        if (v != null && v.contains(new ZI0(obj))) {
            return true;
        }
        return false;
    }

    public static void x(Object obj, Class<?> cls, C8714pG0 c8714pG0, boolean z, String[] strArr) {
        if (w(obj)) {
            return;
        }
        try {
            E(obj);
            Field[] fieldArr = (Field[]) C3619Me.h(cls.getDeclaredFields(), Comparator.comparing(new C6883ho0()));
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field : fieldArr) {
                if (!C4206Se.b0(strArr, field.getName())) {
                    if (field.getName().contains("$")) {
                        continue;
                    } else {
                        if (!z && Modifier.isTransient(field.getModifiers())) {
                        }
                        if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(InterfaceC8957qG0.class)) {
                            try {
                                c8714pG0.g(field.get(obj));
                            } catch (IllegalAccessException unused) {
                                throw new InternalError("Unexpected IllegalAccessException");
                            }
                        }
                    }
                }
            }
            G(obj);
        } catch (Throwable th) {
            G(obj);
            throw th;
        }
    }

    public static int y(int i, int i2, Object obj) {
        return A(i, i2, obj, false, null, new String[0]);
    }

    public static int z(int i, int i2, Object obj, boolean z) {
        return A(i, i2, obj, z, null, new String[0]);
    }

    public int F() {
        return this.Y;
    }

    public C8714pG0 a(byte b) {
        this.Y = (this.Y * this.X) + b;
        return this;
    }

    public C8714pG0 b(char c) {
        this.Y = (this.Y * this.X) + c;
        return this;
    }

    public C8714pG0 c(double d) {
        return f(Double.doubleToLongBits(d));
    }

    public C8714pG0 d(float f) {
        this.Y = (this.Y * this.X) + Float.floatToIntBits(f);
        return this;
    }

    public C8714pG0 e(int i) {
        this.Y = (this.Y * this.X) + i;
        return this;
    }

    public C8714pG0 f(long j) {
        this.Y = (this.Y * this.X) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public C8714pG0 g(Object obj) {
        if (obj == null) {
            this.Y *= this.X;
            return this;
        } else if (obj.getClass().isArray()) {
            s(obj);
            return this;
        } else {
            this.Y = (this.Y * this.X) + obj.hashCode();
            return this;
        }
    }

    public C8714pG0 h(short s) {
        this.Y = (this.Y * this.X) + s;
        return this;
    }

    public int hashCode() {
        return F();
    }

    public C8714pG0 i(boolean z) {
        this.Y = (this.Y * this.X) + (!z ? 1 : 0);
        return this;
    }

    public C8714pG0 j(byte[] bArr) {
        if (bArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (byte b : bArr) {
            a(b);
        }
        return this;
    }

    public C8714pG0 k(char[] cArr) {
        if (cArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (char c : cArr) {
            b(c);
        }
        return this;
    }

    public C8714pG0 l(double[] dArr) {
        if (dArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (double d : dArr) {
            c(d);
        }
        return this;
    }

    public C8714pG0 m(float[] fArr) {
        if (fArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (float f : fArr) {
            d(f);
        }
        return this;
    }

    public C8714pG0 n(int[] iArr) {
        if (iArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (int i : iArr) {
            e(i);
        }
        return this;
    }

    public C8714pG0 o(long[] jArr) {
        if (jArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (long j : jArr) {
            f(j);
        }
        return this;
    }

    public C8714pG0 p(Object[] objArr) {
        if (objArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (Object obj : objArr) {
            g(obj);
        }
        return this;
    }

    public C8714pG0 q(short[] sArr) {
        if (sArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (short s : sArr) {
            h(s);
        }
        return this;
    }

    public C8714pG0 r(boolean[] zArr) {
        if (zArr == null) {
            this.Y *= this.X;
            return this;
        }
        for (boolean z : zArr) {
            i(z);
        }
        return this;
    }

    public final void s(Object obj) {
        if (obj instanceof long[]) {
            o((long[]) obj);
        } else if (obj instanceof int[]) {
            n((int[]) obj);
        } else if (obj instanceof short[]) {
            q((short[]) obj);
        } else if (obj instanceof char[]) {
            k((char[]) obj);
        } else if (obj instanceof byte[]) {
            j((byte[]) obj);
        } else if (obj instanceof double[]) {
            l((double[]) obj);
        } else if (obj instanceof float[]) {
            m((float[]) obj);
        } else if (obj instanceof boolean[]) {
            r((boolean[]) obj);
        } else {
            p((Object[]) obj);
        }
    }

    public C8714pG0 t(int i) {
        this.Y = (this.Y * this.X) + i;
        return this;
    }

    @Override // o.InterfaceC4943Zq
    /* renamed from: u */
    public Integer build() {
        return Integer.valueOf(F());
    }

    public C8714pG0(int i, int i2) {
        C11147zE2.B(i % 2 != 0, "HashCodeBuilder requires an odd initial value", new Object[0]);
        C11147zE2.B(i2 % 2 != 0, "HashCodeBuilder requires an odd multiplier", new Object[0]);
        this.X = i2;
        this.Y = i;
    }
}
