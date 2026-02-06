package o;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import o.InterfaceC8368nr;
import o.J6;

@Deprecated
/* loaded from: classes2.dex */
public final class J6 implements InterfaceC8368nr {
    public static final int b1 = 0;
    public static final int c1 = 1;
    public static final int d1 = 2;
    public static final int e1 = 3;
    public static final int f1 = 4;
    public static final J6 g1 = new J6(null, new b[0], 0, C10323vs.b, 0);
    public static final b h1 = new b(0).l(0);
    public static final String i1 = TD2.R0(1);
    public static final String j1 = TD2.R0(2);
    public static final String k1 = TD2.R0(3);
    public static final String l1 = TD2.R0(4);
    public static final InterfaceC8368nr.a<J6> m1 = new InterfaceC8368nr.a() { // from class: o.I6
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return J6.a(bundle);
        }
    };
    @InterfaceC11300zs1
    public final Object X;
    public final int Y;
    public final long Y0;
    public final long Z;
    public final int Z0;
    public final b[] a1;

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8368nr {
        public static final String d1 = TD2.R0(0);
        public static final String e1 = TD2.R0(1);
        public static final String f1 = TD2.R0(2);
        public static final String g1 = TD2.R0(3);
        public static final String h1 = TD2.R0(4);
        public static final String i1 = TD2.R0(5);
        public static final String j1 = TD2.R0(6);
        public static final String k1 = TD2.R0(7);
        public static final InterfaceC8368nr.a<b> l1 = new InterfaceC8368nr.a() { // from class: o.K6
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                return J6.b.a(bundle);
            }
        };
        public final long X;
        public final int Y;
        public final Uri[] Y0;
        public final int Z;
        public final int[] Z0;
        public final long[] a1;
        public final long b1;
        public final boolean c1;

        public static /* synthetic */ b a(Bundle bundle) {
            return f(bundle);
        }

        @OB
        public static long[] c(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, (long) C10323vs.b);
            return copyOf;
        }

        @OB
        public static int[] d(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public static b f(Bundle bundle) {
            Uri[] uriArr;
            long j = bundle.getLong(d1);
            int i = bundle.getInt(e1);
            int i2 = bundle.getInt(k1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1);
            int[] intArray = bundle.getIntArray(g1);
            long[] longArray = bundle.getLongArray(h1);
            long j2 = bundle.getLong(i1);
            boolean z = bundle.getBoolean(j1);
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            if (longArray == null) {
                longArray = new long[0];
            }
            long[] jArr = longArray;
            return new b(j, i, i2, iArr, uriArr, jArr, j2, z);
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putLong(d1, this.X);
            bundle.putInt(e1, this.Y);
            bundle.putInt(k1, this.Z);
            bundle.putParcelableArrayList(f1, new ArrayList<>(Arrays.asList(this.Y0)));
            bundle.putIntArray(g1, this.Z0);
            bundle.putLongArray(h1, this.a1);
            bundle.putLong(i1, this.b1);
            bundle.putBoolean(j1, this.c1);
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.X == bVar.X && this.Y == bVar.Y && this.Z == bVar.Z && Arrays.equals(this.Y0, bVar.Y0) && Arrays.equals(this.Z0, bVar.Z0) && Arrays.equals(this.a1, bVar.a1) && this.b1 == bVar.b1 && this.c1 == bVar.c1) {
                    return true;
                }
            }
            return false;
        }

        public int g() {
            return h(-1);
        }

        public int h(@BR0(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.Z0;
                if (i3 >= iArr.length || this.c1 || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public int hashCode() {
            long j = this.X;
            long j2 = this.b1;
            return (((((((((((((this.Y * 31) + this.Z) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.Y0)) * 31) + Arrays.hashCode(this.Z0)) * 31) + Arrays.hashCode(this.a1)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c1 ? 1 : 0);
        }

        public boolean i() {
            if (this.Y == -1) {
                return true;
            }
            for (int i = 0; i < this.Y; i++) {
                int i2 = this.Z0[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean j() {
            if (this.c1 && this.X == Long.MIN_VALUE && this.Y == -1) {
                return true;
            }
            return false;
        }

        public boolean k() {
            if (this.Y != -1 && g() >= this.Y) {
                return false;
            }
            return true;
        }

        @OB
        public b l(int i) {
            int[] d = d(this.Z0, i);
            long[] c = c(this.a1, i);
            return new b(this.X, i, this.Z, d, (Uri[]) Arrays.copyOf(this.Y0, i), c, this.b1, this.c1);
        }

        @OB
        public b m(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.Y0;
            if (length < uriArr.length) {
                jArr = c(jArr, uriArr.length);
            } else if (this.Y != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new b(this.X, this.Y, this.Z, this.Z0, this.Y0, jArr, this.b1, this.c1);
        }

        @OB
        public b n(int i, @BR0(from = 0) int i2) {
            boolean z;
            int i3 = this.Y;
            boolean z2 = false;
            if (i3 != -1 && i2 >= i3) {
                z = false;
            } else {
                z = true;
            }
            C9542sf.a(z);
            int[] d = d(this.Z0, i2 + 1);
            int i4 = d[i2];
            if (i4 == 0 || i4 == 1 || i4 == i) {
                z2 = true;
            }
            C9542sf.a(z2);
            long[] jArr = this.a1;
            if (jArr.length != d.length) {
                jArr = c(jArr, d.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = this.Y0;
            if (uriArr.length != d.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, d.length);
            }
            Uri[] uriArr2 = uriArr;
            d[i2] = i;
            return new b(this.X, this.Y, this.Z, d, uriArr2, jArr2, this.b1, this.c1);
        }

        @OB
        public b o(Uri uri, @BR0(from = 0) int i) {
            int[] d = d(this.Z0, i + 1);
            long[] jArr = this.a1;
            if (jArr.length != d.length) {
                jArr = c(jArr, d.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.Y0, d.length);
            uriArr[i] = uri;
            d[i] = 1;
            return new b(this.X, this.Y, this.Z, d, uriArr, jArr2, this.b1, this.c1);
        }

        @OB
        public b p() {
            int i;
            if (this.Y == -1) {
                return this;
            }
            int[] iArr = this.Z0;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = copyOf[i2];
                if (i3 == 3 || i3 == 2 || i3 == 4) {
                    if (this.Y0[i2] == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    copyOf[i2] = i;
                }
            }
            return new b(this.X, length, this.Z, copyOf, this.Y0, this.a1, this.b1, this.c1);
        }

        @OB
        public b q() {
            if (this.Y == -1) {
                return new b(this.X, 0, this.Z, new int[0], new Uri[0], new long[0], this.b1, this.c1);
            }
            int[] iArr = this.Z0;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = copyOf[i];
                if (i2 == 1 || i2 == 0) {
                    copyOf[i] = 2;
                }
            }
            return new b(this.X, length, this.Z, copyOf, this.Y0, this.a1, this.b1, this.c1);
        }

        @OB
        public b r(long j) {
            return new b(this.X, this.Y, this.Z, this.Z0, this.Y0, this.a1, j, this.c1);
        }

        @OB
        public b s(boolean z) {
            return new b(this.X, this.Y, this.Z, this.Z0, this.Y0, this.a1, this.b1, z);
        }

        public b t() {
            int[] iArr = this.Z0;
            int length = iArr.length - 1;
            int[] copyOf = Arrays.copyOf(iArr, length);
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.Y0, length);
            long[] jArr = this.a1;
            if (jArr.length > length) {
                jArr = Arrays.copyOf(jArr, length);
            }
            long[] jArr2 = jArr;
            return new b(this.X, length, this.Z, copyOf, uriArr, jArr2, TD2.O1(jArr2), this.c1);
        }

        public b u(int i) {
            return new b(this.X, this.Y, i, this.Z0, this.Y0, this.a1, this.b1, this.c1);
        }

        @OB
        public b v(long j) {
            return new b(j, this.Y, this.Z, this.Z0, this.Y0, this.a1, this.b1, this.c1);
        }

        public b(long j) {
            this(j, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public b(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            C9542sf.a(iArr.length == uriArr.length);
            this.X = j;
            this.Y = i;
            this.Z = i2;
            this.Z0 = iArr;
            this.Y0 = uriArr;
            this.a1 = jArr;
            this.b1 = j2;
            this.c1 = z;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    public J6(Object obj, long... jArr) {
        this(obj, b(jArr), 0L, C10323vs.b, 0);
    }

    public static /* synthetic */ J6 a(Bundle bundle) {
        return f(bundle);
    }

    public static b[] b(long[] jArr) {
        int length = jArr.length;
        b[] bVarArr = new b[length];
        for (int i = 0; i < length; i++) {
            bVarArr[i] = new b(jArr[i]);
        }
        return bVarArr;
    }

    public static J6 d(Object obj, J6 j6) {
        int i = j6.Y - j6.Z0;
        b[] bVarArr = new b[i];
        for (int i2 = 0; i2 < i; i2++) {
            b bVar = j6.a1[i2];
            long j = bVar.X;
            int i3 = bVar.Y;
            int i4 = bVar.Z;
            int[] iArr = bVar.Z0;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            Uri[] uriArr = bVar.Y0;
            long[] jArr = bVar.a1;
            bVarArr[i2] = new b(j, i3, i4, copyOf, (Uri[]) Arrays.copyOf(uriArr, uriArr.length), Arrays.copyOf(jArr, jArr.length), bVar.b1, bVar.c1);
        }
        return new J6(obj, bVarArr, j6.Z, j6.Y0, j6.Z0);
    }

    public static J6 f(Bundle bundle) {
        b[] bVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(i1);
        if (parcelableArrayList == null) {
            bVarArr = new b[0];
        } else {
            b[] bVarArr2 = new b[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                bVarArr2[i] = b.l1.a((Bundle) parcelableArrayList.get(i));
            }
            bVarArr = bVarArr2;
        }
        String str = j1;
        J6 j6 = g1;
        return new J6(null, bVarArr, bundle.getLong(str, j6.Z), bundle.getLong(k1, j6.Y0), bundle.getInt(l1, j6.Z0));
    }

    @OB
    public J6 A(@BR0(from = 0) int i, int i2) {
        int i3 = i - this.Z0;
        b[] bVarArr = this.a1;
        if (bVarArr[i3].Z == i2) {
            return this;
        }
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].u(i2);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 B(@BR0(from = 0) int i, @BR0(from = 0) int i2) {
        int i3 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].n(3, i2);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 C(@BR0(from = 0) int i) {
        boolean z;
        int i2 = this.Z0;
        if (i2 == i) {
            return this;
        }
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int i3 = this.Y - i;
        b[] bVarArr = new b[i3];
        System.arraycopy(this.a1, i - this.Z0, bVarArr, 0, i3);
        return new J6(this.X, bVarArr, this.Z, this.Y0, i);
    }

    @OB
    public J6 D(@BR0(from = 0) int i) {
        int i2 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].p();
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 E(@BR0(from = 0) int i, @BR0(from = 0) int i2) {
        int i3 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].n(2, i2);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 F(@BR0(from = 0) int i) {
        int i2 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].q();
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    public boolean c() {
        int i = this.Y - 1;
        if (i >= 0 && k(i)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (b bVar : this.a1) {
            arrayList.add(bVar.e());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(i1, arrayList);
        }
        long j = this.Z;
        J6 j6 = g1;
        if (j != j6.Z) {
            bundle.putLong(j1, j);
        }
        long j2 = this.Y0;
        if (j2 != j6.Y0) {
            bundle.putLong(k1, j2);
        }
        int i = this.Z0;
        if (i != j6.Z0) {
            bundle.putInt(l1, i);
        }
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J6.class == obj.getClass()) {
            J6 j6 = (J6) obj;
            if (TD2.g(this.X, j6.X) && this.Y == j6.Y && this.Z == j6.Z && this.Y0 == j6.Y0 && this.Z0 == j6.Z0 && Arrays.equals(this.a1, j6.a1)) {
                return true;
            }
        }
        return false;
    }

    public b g(@BR0(from = 0) int i) {
        int i2 = this.Z0;
        if (i < i2) {
            return h1;
        }
        return this.a1[i - i2];
    }

    public int h(long j, long j2) {
        if (j != Long.MIN_VALUE && (j2 == C10323vs.b || j < j2)) {
            int i = this.Z0;
            while (i < this.Y && ((g(i).X != Long.MIN_VALUE && g(i).X <= j) || !g(i).k())) {
                i++;
            }
            if (i < this.Y) {
                return i;
            }
        }
        return -1;
    }

    public int hashCode() {
        int hashCode;
        int i = this.Y * 31;
        Object obj = this.X;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i + hashCode) * 31) + ((int) this.Z)) * 31) + ((int) this.Y0)) * 31) + this.Z0) * 31) + Arrays.hashCode(this.a1);
    }

    public int i(long j, long j2) {
        int i = this.Y - 1;
        int i2 = i - (k(i) ? 1 : 0);
        while (i2 >= 0) {
            long j3 = j;
            long j4 = j2;
            if (!l(j3, j4, i2)) {
                break;
            }
            i2--;
            j = j3;
            j2 = j4;
        }
        if (i2 >= 0 && g(i2).i()) {
            return i2;
        }
        return -1;
    }

    public boolean j(@BR0(from = 0) int i, @BR0(from = 0) int i2) {
        b g;
        int i3;
        if (i >= this.Y || (i3 = (g = g(i)).Y) == -1 || i2 >= i3 || g.Z0[i2] != 4) {
            return false;
        }
        return true;
    }

    public boolean k(int i) {
        if (i == this.Y - 1 && g(i).j()) {
            return true;
        }
        return false;
    }

    public final boolean l(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        b g = g(i);
        long j3 = g.X;
        if (j3 == Long.MIN_VALUE) {
            if (j2 != C10323vs.b && ((!g.c1 || g.Y != -1) && j >= j2)) {
                return false;
            }
            return true;
        } else if (j >= j3) {
            return false;
        } else {
            return true;
        }
    }

    @OB
    public J6 m(@BR0(from = 0) int i, @BR0(from = 1) int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int i3 = i - this.Z0;
        b[] bVarArr = this.a1;
        if (bVarArr[i3].Y == i2) {
            return this;
        }
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i3] = this.a1[i3].l(i2);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 n(@BR0(from = 0) int i, long... jArr) {
        int i2 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].m(jArr);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 o(long[][] jArr) {
        boolean z;
        if (this.Z0 == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        for (int i = 0; i < this.Y; i++) {
            bVarArr2[i] = bVarArr2[i].m(jArr[i]);
        }
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 p(@BR0(from = 0) int i, long j) {
        int i2 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i2] = this.a1[i2].v(j);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 q(@BR0(from = 0) int i, @BR0(from = 0) int i2) {
        int i3 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].n(4, i2);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 r(long j) {
        if (this.Z == j) {
            return this;
        }
        return new J6(this.X, this.a1, j, this.Y0, this.Z0);
    }

    @OB
    public J6 s(@BR0(from = 0) int i, @BR0(from = 0) int i2) {
        return t(i, i2, Uri.EMPTY);
    }

    @OB
    public J6 t(@BR0(from = 0) int i, @BR0(from = 0) int i2, Uri uri) {
        boolean z;
        int i3 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        if (Uri.EMPTY.equals(uri) && !bVarArr2[i3].c1) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.i(z);
        bVarArr2[i3] = bVarArr2[i3].o(uri, i2);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.X);
        sb.append(", adResumePositionUs=");
        sb.append(this.Z);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.a1.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.a1[i].X);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.a1[i].Z0.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.a1[i].Z0[i2];
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    sb.append('?');
                                } else {
                                    sb.append('!');
                                }
                            } else {
                                sb.append('P');
                            }
                        } else {
                            sb.append('S');
                        }
                    } else {
                        sb.append('R');
                    }
                } else {
                    sb.append('_');
                }
                sb.append(", durationUs=");
                sb.append(this.a1[i].a1[i2]);
                sb.append(')');
                if (i2 < this.a1[i].Z0.length - 1) {
                    sb.append(C6566gU0.h);
                }
            }
            sb.append("])");
            if (i < this.a1.length - 1) {
                sb.append(C6566gU0.h);
            }
        }
        sb.append("])");
        return sb.toString();
    }

    @OB
    public J6 u(long j) {
        if (this.Y0 == j) {
            return this;
        }
        return new J6(this.X, this.a1, this.Z, j, this.Z0);
    }

    @OB
    public J6 v(@BR0(from = 0) int i, long j) {
        int i2 = i - this.Z0;
        b[] bVarArr = this.a1;
        if (bVarArr[i2].b1 == j) {
            return this;
        }
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].r(j);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 w(@BR0(from = 0) int i, boolean z) {
        int i2 = i - this.Z0;
        b[] bVarArr = this.a1;
        if (bVarArr[i2].c1 == z) {
            return this;
        }
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].s(z);
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    @OB
    public J6 x(@BR0(from = 0) int i) {
        int i2 = i - this.Z0;
        b[] bVarArr = this.a1;
        b[] bVarArr2 = (b[]) TD2.p1(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].t();
        return new J6(this.X, bVarArr2, this.Z, this.Y0, this.Z0);
    }

    public J6 y() {
        return z(this.Y, Long.MIN_VALUE).w(this.Y, true);
    }

    @OB
    public J6 z(@BR0(from = 0) int i, long j) {
        int i2 = i - this.Z0;
        b bVar = new b(j);
        b[] bVarArr = (b[]) TD2.n1(this.a1, bVar);
        System.arraycopy(bVarArr, i2, bVarArr, i2 + 1, this.a1.length - i2);
        bVarArr[i2] = bVar;
        return new J6(this.X, bVarArr, this.Z, this.Y0, this.Z0);
    }

    public J6(@InterfaceC11300zs1 Object obj, b[] bVarArr, long j, long j2, int i) {
        this.X = obj;
        this.Z = j;
        this.Y0 = j2;
        this.Y = bVarArr.length + i;
        this.a1 = bVarArr;
        this.Z0 = i;
    }
}
