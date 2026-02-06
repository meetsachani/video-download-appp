package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@InterfaceC5116aa0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.Lv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3589Lv0 extends AbstractC3687Mv0 {
    public static final int a = 4;

    @InterfaceC10420wF0
    /* renamed from: o.Lv0$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final float[] X;
        public final int Y;
        public final int Z;

        public a(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if ((obj instanceof Float) && C3589Lv0.k(this.X, ((Float) obj).floatValue(), this.Y, this.Z) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Float get(int i) {
            C10664xF1.C(i, size());
            return Float.valueOf(this.X[this.Y + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Float set(int i, Float f) {
            C10664xF1.C(i, size());
            float[] fArr = this.X;
            int i2 = this.Y;
            float f2 = fArr[i2 + i];
            fArr[i2 + i] = ((Float) C10664xF1.E(f)).floatValue();
            return Float.valueOf(f2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.X[this.Y + i] != aVar.X[aVar.Y + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        public float[] f() {
            return Arrays.copyOfRange(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.Y; i2 < this.Z; i2++) {
                i = (i * 31) + C3589Lv0.i(this.X[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            int k;
            if ((obj instanceof Float) && (k = C3589Lv0.k(this.X, ((Float) obj).floatValue(), this.Y, this.Z)) >= 0) {
                return k - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@MB Object obj) {
            int p;
            if ((obj instanceof Float) && (p = C3589Lv0.p(this.X, ((Float) obj).floatValue(), this.Y, this.Z)) >= 0) {
                return p - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z - this.Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            float[] fArr = this.X;
            int i3 = this.Y;
            return new a(fArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.X[this.Y]);
            int i = this.Y;
            while (true) {
                i++;
                if (i < this.Z) {
                    sb.append(C6566gU0.h);
                    sb.append(this.X[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        public a(float[] fArr, int i, int i2) {
            this.X = fArr;
            this.Y = i;
            this.Z = i2;
        }
    }

    /* renamed from: o.Lv0$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC7264jN<String, Float> implements Serializable {
        public static final b Z = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return Z;
        }

        @Override // o.AbstractC7264jN
        /* renamed from: o */
        public String g(Float f) {
            return f.toString();
        }

        @Override // o.AbstractC7264jN
        /* renamed from: p */
        public Float h(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    /* renamed from: o.Lv0$c */
    /* loaded from: classes3.dex */
    public enum c implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Float.compare(fArr[i], fArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    public static List<Float> c(float... fArr) {
        if (fArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new a(fArr);
    }

    public static int d(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static float[] e(float[]... fArr) {
        int i = 0;
        for (float[] fArr2 : fArr) {
            i += fArr2.length;
        }
        float[] fArr3 = new float[i];
        int i2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, i2, fArr4.length);
            i2 += fArr4.length;
        }
        return fArr3;
    }

    @InterfaceC4238Sm
    public static float f(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(C6108ef2.e("min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static boolean g(float[] fArr, float f) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (fArr[i] == f) {
                return true;
            }
        }
        return false;
    }

    public static float[] h(float[] fArr, int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Invalid minLength: %s", i);
        if (i2 >= 0) {
            z2 = true;
        }
        C10664xF1.k(z2, "Invalid padding: %s", i2);
        if (fArr.length < i) {
            return Arrays.copyOf(fArr, i + i2);
        }
        return fArr;
    }

    public static int i(float f) {
        return Float.valueOf(f).hashCode();
    }

    public static int j(float[] fArr, float f) {
        return k(fArr, f, 0, fArr.length);
    }

    public static int k(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int l(float[] fArr, float[] fArr2) {
        C10664xF1.F(fArr, "array");
        C10664xF1.F(fArr2, "target");
        if (fArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (fArr.length - fArr2.length) + 1) {
            for (int i2 = 0; i2 < fArr2.length; i2++) {
                if (fArr[i + i2] != fArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static boolean m(float f) {
        if (Float.NEGATIVE_INFINITY < f && f < Float.POSITIVE_INFINITY) {
            return true;
        }
        return false;
    }

    public static String n(String str, float... fArr) {
        C10664xF1.E(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(fArr.length * 12);
        sb.append(fArr[0]);
        for (int i = 1; i < fArr.length; i++) {
            sb.append(str);
            sb.append(fArr[i]);
        }
        return sb.toString();
    }

    public static int o(float[] fArr, float f) {
        return p(fArr, f, 0, fArr.length);
    }

    public static int p(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }

    public static Comparator<float[]> q() {
        return c.INSTANCE;
    }

    @InterfaceC11149zF0("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float r(float... fArr) {
        boolean z;
        if (fArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.max(f, fArr[i]);
        }
        return f;
    }

    @InterfaceC11149zF0("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float s(float... fArr) {
        boolean z;
        if (fArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.min(f, fArr[i]);
        }
        return f;
    }

    public static void t(float[] fArr) {
        C10664xF1.E(fArr);
        u(fArr, 0, fArr.length);
    }

    public static void u(float[] fArr, int i, int i2) {
        C10664xF1.E(fArr);
        C10664xF1.f0(i, i2, fArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            float f = fArr[i];
            fArr[i] = fArr[i3];
            fArr[i3] = f;
            i++;
        }
    }

    public static void v(float[] fArr) {
        C10664xF1.E(fArr);
        w(fArr, 0, fArr.length);
    }

    public static void w(float[] fArr, int i, int i2) {
        C10664xF1.E(fArr);
        C10664xF1.f0(i, i2, fArr.length);
        Arrays.sort(fArr, i, i2);
        u(fArr, i, i2);
    }

    @InterfaceC4238Sm
    public static AbstractC7264jN<String, Float> x() {
        return b.Z;
    }

    public static float[] y(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Number) C10664xF1.E(array[i])).floatValue();
        }
        return fArr;
    }

    @MB
    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static Float z(String str) {
        if (D50.b.matcher(str).matches()) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }
}
