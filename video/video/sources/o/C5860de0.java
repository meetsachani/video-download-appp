package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.de0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5860de0 implements InterfaceC4943Zq<Boolean> {
    public static final ThreadLocal<Set<AbstractC4280Sx1<ZI0, ZI0>>> b1 = new ThreadLocal<>();
    public boolean X = true;
    public boolean Y;
    public List<Class<?>> Y0;
    public boolean Z;
    public Class<?> Z0;
    public String[] a1;

    public C5860de0() {
        ArrayList arrayList = new ArrayList();
        this.Y0 = arrayList;
        arrayList.add(String.class);
    }

    public static boolean B(Object obj, Object obj2, Collection<String> collection) {
        return F(obj, obj2, C8755pQ1.w0(collection));
    }

    public static boolean C(Object obj, Object obj2, boolean z) {
        return E(obj, obj2, z, null, new String[0]);
    }

    public static boolean D(Object obj, Object obj2, boolean z, Class<?> cls, boolean z2, String... strArr) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return new C5860de0().K(strArr).L(cls).N(z).M(z2).z(obj, obj2).x();
        }
        return false;
    }

    public static boolean E(Object obj, Object obj2, boolean z, Class<?> cls, String... strArr) {
        return D(obj, obj2, z, cls, false, strArr);
    }

    public static boolean F(Object obj, Object obj2, String... strArr) {
        return E(obj, obj2, false, null, strArr);
    }

    public static void G(Object obj, Object obj2) {
        Set<AbstractC4280Sx1<ZI0, ZI0>> w = w();
        if (w == null) {
            w = new HashSet<>();
            b1.set(w);
        }
        w.add(v(obj, obj2));
    }

    public static void O(Object obj, Object obj2) {
        Set<AbstractC4280Sx1<ZI0, ZI0>> w = w();
        if (w != null) {
            w.remove(v(obj, obj2));
            if (w.isEmpty()) {
                b1.remove();
            }
        }
    }

    public static AbstractC4280Sx1<ZI0, ZI0> v(Object obj, Object obj2) {
        return AbstractC4280Sx1.j(new ZI0(obj), new ZI0(obj2));
    }

    public static Set<AbstractC4280Sx1<ZI0, ZI0>> w() {
        return b1.get();
    }

    public static boolean y(Object obj, Object obj2) {
        Set<AbstractC4280Sx1<ZI0, ZI0>> w = w();
        AbstractC4280Sx1<ZI0, ZI0> v = v(obj, obj2);
        AbstractC4280Sx1 j = AbstractC4280Sx1.j(v.i(), v.h());
        if (w != null) {
            if (w.contains(v) || w.contains(j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A(Object obj, Object obj2, Class<?> cls) {
        if (y(obj, obj2)) {
            return;
        }
        try {
            G(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i = 0; i < declaredFields.length && this.X; i++) {
                Field field = declaredFields[i];
                if (!C4206Se.b0(this.a1, field.getName())) {
                    if (field.getName().contains("$")) {
                        continue;
                    } else {
                        if (!this.Y && Modifier.isTransient(field.getModifiers())) {
                        }
                        if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(InterfaceC6102ee0.class)) {
                            try {
                                g(field.get(obj), field.get(obj2));
                            } catch (IllegalAccessException unused) {
                                throw new InternalError("Unexpected IllegalAccessException");
                            }
                        }
                    }
                }
            }
            O(obj, obj2);
        } catch (Throwable th) {
            O(obj, obj2);
            throw th;
        }
    }

    public void H() {
        this.X = true;
    }

    public C5860de0 I(List<Class<?>> list) {
        this.Y0 = list;
        return this;
    }

    public void J(boolean z) {
        this.X = z;
    }

    public C5860de0 K(String... strArr) {
        this.a1 = strArr;
        return this;
    }

    public C5860de0 L(Class<?> cls) {
        this.Z0 = cls;
        return this;
    }

    public C5860de0 M(boolean z) {
        this.Z = z;
        return this;
    }

    public C5860de0 N(boolean z) {
        this.Y = z;
        return this;
    }

    public C5860de0 a(byte b, byte b2) {
        boolean z;
        if (!this.X) {
            return this;
        }
        if (b == b2) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        return this;
    }

    public C5860de0 b(char c, char c2) {
        boolean z;
        if (!this.X) {
            return this;
        }
        if (c == c2) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        return this;
    }

    public C5860de0 c(double d, double d2) {
        if (!this.X) {
            return this;
        }
        return f(Double.doubleToLongBits(d), Double.doubleToLongBits(d2));
    }

    public C5860de0 d(float f, float f2) {
        if (!this.X) {
            return this;
        }
        return e(Float.floatToIntBits(f), Float.floatToIntBits(f2));
    }

    public C5860de0 e(int i, int i2) {
        boolean z;
        if (!this.X) {
            return this;
        }
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        return this;
    }

    public C5860de0 f(long j, long j2) {
        boolean z;
        if (!this.X) {
            return this;
        }
        if (j == j2) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        return this;
    }

    public C5860de0 g(Object obj, Object obj2) {
        if (!this.X || obj == obj2) {
            return this;
        }
        if (obj != null && obj2 != null) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                s(obj, obj2);
                return this;
            } else if (this.Z && !C8457oD.U(cls)) {
                z(obj, obj2);
                return this;
            } else {
                this.X = obj.equals(obj2);
                return this;
            }
        }
        J(false);
        return this;
    }

    public C5860de0 h(short s, short s2) {
        boolean z;
        if (!this.X) {
            return this;
        }
        if (s == s2) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        return this;
    }

    public C5860de0 i(boolean z, boolean z2) {
        boolean z3;
        if (!this.X) {
            return this;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.X = z3;
        return this;
    }

    public C5860de0 j(byte[] bArr, byte[] bArr2) {
        if (this.X && bArr != bArr2) {
            if (bArr != null && bArr2 != null) {
                if (bArr.length != bArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < bArr.length && this.X; i++) {
                    a(bArr[i], bArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public C5860de0 k(char[] cArr, char[] cArr2) {
        if (this.X && cArr != cArr2) {
            if (cArr != null && cArr2 != null) {
                if (cArr.length != cArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < cArr.length && this.X; i++) {
                    b(cArr[i], cArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public C5860de0 l(double[] dArr, double[] dArr2) {
        if (this.X && dArr != dArr2) {
            if (dArr != null && dArr2 != null) {
                if (dArr.length != dArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < dArr.length && this.X; i++) {
                    c(dArr[i], dArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public C5860de0 m(float[] fArr, float[] fArr2) {
        if (this.X && fArr != fArr2) {
            if (fArr != null && fArr2 != null) {
                if (fArr.length != fArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < fArr.length && this.X; i++) {
                    d(fArr[i], fArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public C5860de0 n(int[] iArr, int[] iArr2) {
        if (this.X && iArr != iArr2) {
            if (iArr != null && iArr2 != null) {
                if (iArr.length != iArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < iArr.length && this.X; i++) {
                    e(iArr[i], iArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public C5860de0 o(long[] jArr, long[] jArr2) {
        if (this.X && jArr != jArr2) {
            if (jArr != null && jArr2 != null) {
                if (jArr.length != jArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < jArr.length && this.X; i++) {
                    f(jArr[i], jArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public C5860de0 p(Object[] objArr, Object[] objArr2) {
        if (this.X && objArr != objArr2) {
            if (objArr != null && objArr2 != null) {
                if (objArr.length != objArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < objArr.length && this.X; i++) {
                    g(objArr[i], objArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public C5860de0 q(short[] sArr, short[] sArr2) {
        if (this.X && sArr != sArr2) {
            if (sArr != null && sArr2 != null) {
                if (sArr.length != sArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < sArr.length && this.X; i++) {
                    h(sArr[i], sArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public C5860de0 r(boolean[] zArr, boolean[] zArr2) {
        if (this.X && zArr != zArr2) {
            if (zArr != null && zArr2 != null) {
                if (zArr.length != zArr2.length) {
                    J(false);
                    return this;
                }
                for (int i = 0; i < zArr.length && this.X; i++) {
                    i(zArr[i], zArr2[i]);
                }
            } else {
                J(false);
                return this;
            }
        }
        return this;
    }

    public final void s(Object obj, Object obj2) {
        if (obj.getClass() != obj2.getClass()) {
            J(false);
        } else if (obj instanceof long[]) {
            o((long[]) obj, (long[]) obj2);
        } else if (obj instanceof int[]) {
            n((int[]) obj, (int[]) obj2);
        } else if (obj instanceof short[]) {
            q((short[]) obj, (short[]) obj2);
        } else if (obj instanceof char[]) {
            k((char[]) obj, (char[]) obj2);
        } else if (obj instanceof byte[]) {
            j((byte[]) obj, (byte[]) obj2);
        } else if (obj instanceof double[]) {
            l((double[]) obj, (double[]) obj2);
        } else if (obj instanceof float[]) {
            m((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            r((boolean[]) obj, (boolean[]) obj2);
        } else {
            p((Object[]) obj, (Object[]) obj2);
        }
    }

    public C5860de0 t(boolean z) {
        if (!this.X) {
            return this;
        }
        this.X = z;
        return this;
    }

    @Override // o.InterfaceC4943Zq
    /* renamed from: u */
    public Boolean build() {
        return Boolean.valueOf(x());
    }

    public boolean x() {
        return this.X;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r2.isInstance(r6) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r1.isInstance(r7) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        r3 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5860de0 z(Object obj, Object obj2) {
        Class<?> cls;
        if (this.X && obj != obj2) {
            if (obj != null && obj2 != null) {
                Class<?> cls2 = obj.getClass();
                Class<?> cls3 = obj2.getClass();
                if (!cls2.isInstance(obj2)) {
                    if (!cls3.isInstance(obj)) {
                        this.X = false;
                        return this;
                    }
                }
                try {
                    if (cls.isArray()) {
                        g(obj, obj2);
                        return this;
                    }
                    List<Class<?>> list = this.Y0;
                    if (list != null && (list.contains(cls2) || this.Y0.contains(cls3))) {
                        this.X = obj.equals(obj2);
                        return this;
                    }
                    A(obj, obj2, cls);
                    while (cls.getSuperclass() != null && cls != this.Z0) {
                        cls = cls.getSuperclass();
                        A(obj, obj2, cls);
                    }
                } catch (IllegalArgumentException unused) {
                    this.X = false;
                    return this;
                }
            } else {
                this.X = false;
                return this;
            }
        }
        return this;
    }
}
