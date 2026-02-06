package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: o.pH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8717pH implements InterfaceC4943Zq<Integer> {
    public int X = 0;

    public static int A(Object obj, Object obj2, boolean z) {
        return B(obj, obj2, z, null, new String[0]);
    }

    public static int B(Object obj, Object obj2, boolean z, Class<?> cls, String... strArr) {
        if (obj == obj2) {
            return 0;
        }
        Objects.requireNonNull(obj, "lhs");
        Objects.requireNonNull(obj2, "rhs");
        Class<?> cls2 = obj.getClass();
        if (cls2.isInstance(obj2)) {
            C8717pH c8717pH = new C8717pH();
            boolean z2 = z;
            String[] strArr2 = strArr;
            x(obj, obj2, cls2, c8717pH, z2, strArr2);
            while (cls2.getSuperclass() != null && cls2 != cls) {
                Class<? super Object> superclass = cls2.getSuperclass();
                C8717pH c8717pH2 = c8717pH;
                boolean z3 = z2;
                String[] strArr3 = strArr2;
                x(obj, obj2, superclass, c8717pH2, z3, strArr3);
                cls2 = superclass;
                c8717pH = c8717pH2;
                z2 = z3;
                strArr2 = strArr3;
            }
            return c8717pH.D();
        }
        throw new ClassCastException();
    }

    public static int C(Object obj, Object obj2, String... strArr) {
        return B(obj, obj2, false, null, strArr);
    }

    public static void x(Object obj, Object obj2, Class<?> cls, C8717pH c8717pH, boolean z, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i = 0; i < declaredFields.length && c8717pH.X == 0; i++) {
            Field field = declaredFields[i];
            if (!C4206Se.b0(strArr, field.getName()) && !field.getName().contains("$") && ((z || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    c8717pH.g(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    public static int y(Object obj, Object obj2) {
        return B(obj, obj2, false, null, new String[0]);
    }

    public static int z(Object obj, Object obj2, Collection<String> collection) {
        return C(obj, obj2, C8755pQ1.w0(collection));
    }

    public int D() {
        return this.X;
    }

    public C8717pH a(byte b, byte b2) {
        if (this.X != 0) {
            return this;
        }
        this.X = Byte.compare(b, b2);
        return this;
    }

    public C8717pH b(char c, char c2) {
        if (this.X != 0) {
            return this;
        }
        this.X = Character.compare(c, c2);
        return this;
    }

    public C8717pH c(double d, double d2) {
        if (this.X != 0) {
            return this;
        }
        this.X = Double.compare(d, d2);
        return this;
    }

    public C8717pH d(float f, float f2) {
        if (this.X != 0) {
            return this;
        }
        this.X = Float.compare(f, f2);
        return this;
    }

    public C8717pH e(int i, int i2) {
        if (this.X != 0) {
            return this;
        }
        this.X = Integer.compare(i, i2);
        return this;
    }

    public C8717pH f(long j, long j2) {
        if (this.X != 0) {
            return this;
        }
        this.X = Long.compare(j, j2);
        return this;
    }

    public C8717pH g(Object obj, Object obj2) {
        return h(obj, obj2, null);
    }

    public C8717pH h(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.X != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.X = -1;
            return this;
        } else if (obj2 == null) {
            this.X = 1;
            return this;
        } else if (obj.getClass().isArray()) {
            u(obj, obj2, comparator);
            return this;
        } else if (comparator == null) {
            this.X = ((Comparable) obj).compareTo(obj2);
            return this;
        } else {
            this.X = comparator.compare(obj, obj2);
            return this;
        }
    }

    public C8717pH i(short s, short s2) {
        if (this.X != 0) {
            return this;
        }
        this.X = Short.compare(s, s2);
        return this;
    }

    public C8717pH j(boolean z, boolean z2) {
        if (this.X != 0 || z == z2) {
            return this;
        }
        if (z) {
            this.X = 1;
            return this;
        }
        this.X = -1;
        return this;
    }

    public C8717pH k(byte[] bArr, byte[] bArr2) {
        if (this.X == 0 && bArr != bArr2) {
            int i = -1;
            if (bArr == null) {
                this.X = -1;
                return this;
            } else if (bArr2 == null) {
                this.X = 1;
                return this;
            } else if (bArr.length != bArr2.length) {
                if (bArr.length >= bArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < bArr.length && this.X == 0; i2++) {
                    a(bArr[i2], bArr2[i2]);
                }
            }
        }
        return this;
    }

    public C8717pH l(char[] cArr, char[] cArr2) {
        if (this.X == 0 && cArr != cArr2) {
            int i = -1;
            if (cArr == null) {
                this.X = -1;
                return this;
            } else if (cArr2 == null) {
                this.X = 1;
                return this;
            } else if (cArr.length != cArr2.length) {
                if (cArr.length >= cArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < cArr.length && this.X == 0; i2++) {
                    b(cArr[i2], cArr2[i2]);
                }
            }
        }
        return this;
    }

    public C8717pH m(double[] dArr, double[] dArr2) {
        if (this.X == 0 && dArr != dArr2) {
            int i = -1;
            if (dArr == null) {
                this.X = -1;
                return this;
            } else if (dArr2 == null) {
                this.X = 1;
                return this;
            } else if (dArr.length != dArr2.length) {
                if (dArr.length >= dArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < dArr.length && this.X == 0; i2++) {
                    c(dArr[i2], dArr2[i2]);
                }
            }
        }
        return this;
    }

    public C8717pH n(float[] fArr, float[] fArr2) {
        if (this.X == 0 && fArr != fArr2) {
            int i = -1;
            if (fArr == null) {
                this.X = -1;
                return this;
            } else if (fArr2 == null) {
                this.X = 1;
                return this;
            } else if (fArr.length != fArr2.length) {
                if (fArr.length >= fArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < fArr.length && this.X == 0; i2++) {
                    d(fArr[i2], fArr2[i2]);
                }
            }
        }
        return this;
    }

    public C8717pH o(int[] iArr, int[] iArr2) {
        if (this.X == 0 && iArr != iArr2) {
            int i = -1;
            if (iArr == null) {
                this.X = -1;
                return this;
            } else if (iArr2 == null) {
                this.X = 1;
                return this;
            } else if (iArr.length != iArr2.length) {
                if (iArr.length >= iArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < iArr.length && this.X == 0; i2++) {
                    e(iArr[i2], iArr2[i2]);
                }
            }
        }
        return this;
    }

    public C8717pH p(long[] jArr, long[] jArr2) {
        if (this.X == 0 && jArr != jArr2) {
            int i = -1;
            if (jArr == null) {
                this.X = -1;
                return this;
            } else if (jArr2 == null) {
                this.X = 1;
                return this;
            } else if (jArr.length != jArr2.length) {
                if (jArr.length >= jArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < jArr.length && this.X == 0; i2++) {
                    f(jArr[i2], jArr2[i2]);
                }
            }
        }
        return this;
    }

    public C8717pH q(Object[] objArr, Object[] objArr2) {
        return r(objArr, objArr2, null);
    }

    public C8717pH r(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.X == 0 && objArr != objArr2) {
            int i = -1;
            if (objArr == null) {
                this.X = -1;
                return this;
            } else if (objArr2 == null) {
                this.X = 1;
                return this;
            } else if (objArr.length != objArr2.length) {
                if (objArr.length >= objArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < objArr.length && this.X == 0; i2++) {
                    h(objArr[i2], objArr2[i2], comparator);
                }
            }
        }
        return this;
    }

    public C8717pH s(short[] sArr, short[] sArr2) {
        if (this.X == 0 && sArr != sArr2) {
            int i = -1;
            if (sArr == null) {
                this.X = -1;
                return this;
            } else if (sArr2 == null) {
                this.X = 1;
                return this;
            } else if (sArr.length != sArr2.length) {
                if (sArr.length >= sArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < sArr.length && this.X == 0; i2++) {
                    i(sArr[i2], sArr2[i2]);
                }
            }
        }
        return this;
    }

    public C8717pH t(boolean[] zArr, boolean[] zArr2) {
        if (this.X == 0 && zArr != zArr2) {
            int i = -1;
            if (zArr == null) {
                this.X = -1;
                return this;
            } else if (zArr2 == null) {
                this.X = 1;
                return this;
            } else if (zArr.length != zArr2.length) {
                if (zArr.length >= zArr2.length) {
                    i = 1;
                }
                this.X = i;
                return this;
            } else {
                for (int i2 = 0; i2 < zArr.length && this.X == 0; i2++) {
                    j(zArr[i2], zArr2[i2]);
                }
            }
        }
        return this;
    }

    public final void u(Object obj, Object obj2, Comparator<?> comparator) {
        if (obj instanceof long[]) {
            p((long[]) obj, (long[]) obj2);
        } else if (obj instanceof int[]) {
            o((int[]) obj, (int[]) obj2);
        } else if (obj instanceof short[]) {
            s((short[]) obj, (short[]) obj2);
        } else if (obj instanceof char[]) {
            l((char[]) obj, (char[]) obj2);
        } else if (obj instanceof byte[]) {
            k((byte[]) obj, (byte[]) obj2);
        } else if (obj instanceof double[]) {
            m((double[]) obj, (double[]) obj2);
        } else if (obj instanceof float[]) {
            n((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            t((boolean[]) obj, (boolean[]) obj2);
        } else {
            r((Object[]) obj, (Object[]) obj2, comparator);
        }
    }

    public C8717pH v(int i) {
        if (this.X != 0) {
            return this;
        }
        this.X = i;
        return this;
    }

    @Override // o.InterfaceC4943Zq
    /* renamed from: w */
    public Integer build() {
        return Integer.valueOf(D());
    }
}
