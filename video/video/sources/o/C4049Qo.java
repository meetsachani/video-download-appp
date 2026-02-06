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
@InterfaceC10420wF0
/* renamed from: o.Qo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4049Qo {

    @InterfaceC10420wF0
    /* renamed from: o.Qo$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final boolean[] X;
        public final int Y;
        public final int Z;

        public a(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if ((obj instanceof Boolean) && C4049Qo.l(this.X, ((Boolean) obj).booleanValue(), this.Y, this.Z) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Boolean get(int i) {
            C10664xF1.C(i, size());
            return Boolean.valueOf(this.X[this.Y + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Boolean set(int i, Boolean bool) {
            C10664xF1.C(i, size());
            boolean[] zArr = this.X;
            int i2 = this.Y;
            boolean z = zArr[i2 + i];
            zArr[i2 + i] = ((Boolean) C10664xF1.E(bool)).booleanValue();
            return Boolean.valueOf(z);
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

        public boolean[] f() {
            return Arrays.copyOfRange(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.Y; i2 < this.Z; i2++) {
                i = (i * 31) + C4049Qo.j(this.X[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            int l;
            if ((obj instanceof Boolean) && (l = C4049Qo.l(this.X, ((Boolean) obj).booleanValue(), this.Y, this.Z)) >= 0) {
                return l - this.Y;
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
            if ((obj instanceof Boolean) && (p = C4049Qo.p(this.X, ((Boolean) obj).booleanValue(), this.Y, this.Z)) >= 0) {
                return p - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z - this.Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.X;
            int i3 = this.Y;
            return new a(zArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder(size() * 7);
            if (this.X[this.Y]) {
                str = "[true";
            } else {
                str = "[false";
            }
            sb.append(str);
            int i = this.Y;
            while (true) {
                i++;
                if (i < this.Z) {
                    if (this.X[i]) {
                        str2 = ", true";
                    } else {
                        str2 = ", false";
                    }
                    sb.append(str2);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        public a(boolean[] zArr, int i, int i2) {
            this.X = zArr;
            this.Y = i;
            this.Z = i2;
        }
    }

    /* renamed from: o.Qo$b */
    /* loaded from: classes3.dex */
    public enum b implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");
        
        public final int X;
        public final String Y;

        b(int i, String str) {
            this.X = i;
            this.Y = str;
        }

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(Boolean bool, Boolean bool2) {
            int i;
            int i2 = 0;
            if (bool.booleanValue()) {
                i = this.X;
            } else {
                i = 0;
            }
            if (bool2.booleanValue()) {
                i2 = this.X;
            }
            return i2 - i;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.Y;
        }
    }

    /* renamed from: o.Qo$c */
    /* loaded from: classes3.dex */
    public enum c implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int min = Math.min(zArr.length, zArr2.length);
            for (int i = 0; i < min; i++) {
                int d = C4049Qo.d(zArr[i], zArr2[i]);
                if (d != 0) {
                    return d;
                }
            }
            return zArr.length - zArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    public static List<Boolean> c(boolean... zArr) {
        if (zArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new a(zArr);
    }

    public static int d(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    public static boolean[] e(boolean[]... zArr) {
        int i = 0;
        for (boolean[] zArr2 : zArr) {
            i += zArr2.length;
        }
        boolean[] zArr3 = new boolean[i];
        int i2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, i2, zArr4.length);
            i2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean f(boolean[] zArr, boolean z) {
        for (boolean z2 : zArr) {
            if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC4238Sm
    public static int g(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public static boolean[] h(boolean[] zArr, int i, int i2) {
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
        if (zArr.length < i) {
            return Arrays.copyOf(zArr, i + i2);
        }
        return zArr;
    }

    @InterfaceC4238Sm
    public static Comparator<Boolean> i() {
        return b.FALSE_FIRST;
    }

    public static int j(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static int k(boolean[] zArr, boolean z) {
        return l(zArr, z, 0, zArr.length);
    }

    public static int l(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m(boolean[] zArr, boolean[] zArr2) {
        C10664xF1.F(zArr, "array");
        C10664xF1.F(zArr2, "target");
        if (zArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (zArr.length - zArr2.length) + 1) {
            for (int i2 = 0; i2 < zArr2.length; i2++) {
                if (zArr[i + i2] != zArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static String n(String str, boolean... zArr) {
        C10664xF1.E(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zArr.length * 7);
        sb.append(zArr[0]);
        for (int i = 1; i < zArr.length; i++) {
            sb.append(str);
            sb.append(zArr[i]);
        }
        return sb.toString();
    }

    public static int o(boolean[] zArr, boolean z) {
        return p(zArr, z, 0, zArr.length);
    }

    public static int p(boolean[] zArr, boolean z, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (zArr[i3] == z) {
                return i3;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> q() {
        return c.INSTANCE;
    }

    public static void r(boolean[] zArr) {
        C10664xF1.E(zArr);
        s(zArr, 0, zArr.length);
    }

    public static void s(boolean[] zArr, int i, int i2) {
        C10664xF1.E(zArr);
        C10664xF1.f0(i, i2, zArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            boolean z = zArr[i];
            zArr[i] = zArr[i3];
            zArr[i3] = z;
            i++;
        }
    }

    public static boolean[] t(Collection<Boolean> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((Boolean) C10664xF1.E(array[i])).booleanValue();
        }
        return zArr;
    }

    @InterfaceC4238Sm
    public static Comparator<Boolean> u() {
        return b.TRUE_FIRST;
    }
}
