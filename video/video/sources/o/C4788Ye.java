package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n14151#2,14:3052\n14181#2,14:3066\n14211#2,14:3080\n14241#2,14:3094\n14271#2,14:3108\n14301#2,14:3122\n14331#2,14:3136\n14361#2,14:3150\n14391#2,14:3164\n17123#2,14:3178\n17153#2,14:3192\n17183#2,14:3206\n17213#2,14:3220\n17243#2,14:3234\n17273#2,14:3248\n17303#2,14:3262\n17333#2,14:3276\n17363#2,14:3290\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2443#1:3052,14\n2450#1:3066,14\n2457#1:3080,14\n2464#1:3094,14\n2471#1:3108,14\n2478#1:3122,14\n2485#1:3136,14\n2492#1:3150,14\n2499#1:3164,14\n2641#1:3178,14\n2648#1:3192,14\n2655#1:3206,14\n2662#1:3220,14\n2669#1:3234,14\n2676#1:3248,14\n2683#1:3262,14\n2690#1:3276,14\n2697#1:3290,14\n*E\n"})
/* renamed from: o.Ye */
/* loaded from: classes3.dex */
public class C4788Ye extends C4691Xe {

    /* renamed from: o.Ye$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC8896q1<Byte> implements RandomAccess {
        public final /* synthetic */ byte[] Z;

        public a(byte[] bArr) {
            this.Z = bArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            return h(((Number) obj).byteValue());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z.length;
        }

        public boolean h(byte b) {
            return C7330jf.v8(this.Z, b);
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public Byte get(int i) {
            return Byte.valueOf(this.Z[i]);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return j(((Number) obj).byteValue());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            if (this.Z.length == 0) {
                return true;
            }
            return false;
        }

        public int j(byte b) {
            return C7330jf.Mf(this.Z, b);
        }

        public int k(byte b) {
            return C7330jf.Qh(this.Z, b);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return k(((Number) obj).byteValue());
        }
    }

    /* renamed from: o.Ye$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC8896q1<Short> implements RandomAccess {
        public final /* synthetic */ short[] Z;

        public b(short[] sArr) {
            this.Z = sArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Short)) {
                return false;
            }
            return h(((Number) obj).shortValue());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z.length;
        }

        public boolean h(short s) {
            return C7330jf.C8(this.Z, s);
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public Short get(int i) {
            return Short.valueOf(this.Z[i]);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return j(((Number) obj).shortValue());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            if (this.Z.length == 0) {
                return true;
            }
            return false;
        }

        public int j(short s) {
            return C7330jf.Tf(this.Z, s);
        }

        public int k(short s) {
            return C7330jf.Xh(this.Z, s);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return k(((Number) obj).shortValue());
        }
    }

    /* renamed from: o.Ye$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC8896q1<Integer> implements RandomAccess {
        public final /* synthetic */ int[] Z;

        public c(int[] iArr) {
            this.Z = iArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return h(((Number) obj).intValue());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z.length;
        }

        public boolean h(int i) {
            return C7330jf.z8(this.Z, i);
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public Integer get(int i) {
            return Integer.valueOf(this.Z[i]);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return j(((Number) obj).intValue());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            if (this.Z.length == 0) {
                return true;
            }
            return false;
        }

        public int j(int i) {
            return C7330jf.Qf(this.Z, i);
        }

        public int k(int i) {
            return C7330jf.Uh(this.Z, i);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return k(((Number) obj).intValue());
        }
    }

    /* renamed from: o.Ye$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC8896q1<Long> implements RandomAccess {
        public final /* synthetic */ long[] Z;

        public d(long[] jArr) {
            this.Z = jArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return h(((Number) obj).longValue());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z.length;
        }

        public boolean h(long j) {
            return C7330jf.A8(this.Z, j);
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public Long get(int i) {
            return Long.valueOf(this.Z[i]);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return j(((Number) obj).longValue());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            if (this.Z.length == 0) {
                return true;
            }
            return false;
        }

        public int j(long j) {
            return C7330jf.Rf(this.Z, j);
        }

        public int k(long j) {
            return C7330jf.Vh(this.Z, j);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return k(((Number) obj).longValue());
        }
    }

    @InterfaceC8303na2({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n12687#2,2:3052\n1742#2,6:3054\n1850#2,6:3060\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3052,2\n201#1:3054,6\n202#1:3060,6\n*E\n"})
    /* renamed from: o.Ye$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC8896q1<Float> implements RandomAccess {
        public final /* synthetic */ float[] Z;

        public e(float[] fArr) {
            this.Z = fArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Float)) {
                return false;
            }
            return h(((Number) obj).floatValue());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z.length;
        }

        public boolean h(float f) {
            for (float f2 : this.Z) {
                if (Float.floatToIntBits(f2) == Float.floatToIntBits(f)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public Float get(int i) {
            return Float.valueOf(this.Z[i]);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return j(((Number) obj).floatValue());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            if (this.Z.length == 0) {
                return true;
            }
            return false;
        }

        public int j(float f) {
            float[] fArr = this.Z;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                    return i;
                }
            }
            return -1;
        }

        public int k(float f) {
            float[] fArr = this.Z;
            int length = fArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
            return -1;
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return k(((Number) obj).floatValue());
        }
    }

    @InterfaceC8303na2({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n12697#2,2:3052\n1754#2,6:3054\n1862#2,6:3060\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3052,2\n215#1:3054,6\n216#1:3060,6\n*E\n"})
    /* renamed from: o.Ye$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC8896q1<Double> implements RandomAccess {
        public final /* synthetic */ double[] Z;

        public f(double[] dArr) {
            this.Z = dArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Double)) {
                return false;
            }
            return h(((Number) obj).doubleValue());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z.length;
        }

        public boolean h(double d) {
            double[] dArr = this.Z;
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public Double get(int i) {
            return Double.valueOf(this.Z[i]);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return j(((Number) obj).doubleValue());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            if (this.Z.length == 0) {
                return true;
            }
            return false;
        }

        public int j(double d) {
            double[] dArr = this.Z;
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    return i;
                }
            }
            return -1;
        }

        public int k(double d) {
            double[] dArr = this.Z;
            int length = dArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d)) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
            return -1;
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return k(((Number) obj).doubleValue());
        }
    }

    /* renamed from: o.Ye$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC8896q1<Boolean> implements RandomAccess {
        public final /* synthetic */ boolean[] Z;

        public g(boolean[] zArr) {
            this.Z = zArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return h(((Boolean) obj).booleanValue());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z.length;
        }

        public boolean h(boolean z) {
            return C7330jf.D8(this.Z, z);
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public Boolean get(int i) {
            return Boolean.valueOf(this.Z[i]);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return j(((Boolean) obj).booleanValue());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            if (this.Z.length == 0) {
                return true;
            }
            return false;
        }

        public int j(boolean z) {
            return C7330jf.Uf(this.Z, z);
        }

        public int k(boolean z) {
            return C7330jf.Yh(this.Z, z);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return k(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: o.Ye$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC8896q1<Character> implements RandomAccess {
        public final /* synthetic */ char[] Z;

        public h(char[] cArr) {
            this.Z = cArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Character)) {
                return false;
            }
            return h(((Character) obj).charValue());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z.length;
        }

        public boolean h(char c) {
            return C7330jf.w8(this.Z, c);
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public Character get(int i) {
            return Character.valueOf(this.Z[i]);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return j(((Character) obj).charValue());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            if (this.Z.length == 0) {
                return true;
            }
            return false;
        }

        public int j(char c) {
            return C7330jf.Nf(this.Z, c);
        }

        public int k(char c) {
            return C7330jf.Rh(this.Z, c);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return k(((Character) obj).charValue());
        }
    }

    public static final int A(@NotNull int[] iArr, int i, int i2, int i3) {
        C6562gT0.p(iArr, "<this>");
        return Arrays.binarySearch(iArr, i2, i3, i);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static long[] A0(@NotNull long[] jArr, @NotNull long[] jArr2, int i, int i2, int i3) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    @XP0
    public static final float A1(float[] fArr, int i) {
        C6562gT0.p(fArr, "<this>");
        return fArr[i];
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object A2(Object[] objArr, Comparator comparator) {
        C6562gT0.p(objArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.sl(objArr, comparator);
    }

    @NotNull
    public static short[] A3(@NotNull short[] sArr, short s) {
        C6562gT0.p(sArr, "<this>");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, length + 1);
        copyOf[length] = s;
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger A4(short[] sArr, HA0<? super Short, ? extends BigInteger> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (short s : sArr) {
            valueOf = valueOf.add(ha0.invoke(Short.valueOf(s)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int B(@NotNull long[] jArr, long j, int i, int i2) {
        C6562gT0.p(jArr, "<this>");
        return Arrays.binarySearch(jArr, i, i2, j);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <T> T[] B0(@NotNull T[] tArr, @NotNull T[] tArr2, int i, int i2, int i3) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    @XP0
    public static final int B1(int[] iArr, int i) {
        C6562gT0.p(iArr, "<this>");
        return iArr[i];
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short B2(short[] sArr, Comparator comparator) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.tl(sArr, comparator);
    }

    @NotNull
    public static short[] B3(@NotNull short[] sArr, @NotNull short[] sArr2) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(sArr2, "elements");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] copyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, copyOf, length, length2);
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger B4(boolean[] zArr, HA0<? super Boolean, ? extends BigInteger> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (boolean z : zArr) {
            valueOf = valueOf.add(ha0.invoke(Boolean.valueOf(z)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final <T> int C(@NotNull T[] tArr, T t, int i, int i2) {
        C6562gT0.p(tArr, "<this>");
        return Arrays.binarySearch(tArr, i, i2, t);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static short[] C0(@NotNull short[] sArr, @NotNull short[] sArr2, int i, int i2, int i3) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(sArr2, "destination");
        System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    @XP0
    public static final long C1(long[] jArr, int i) {
        C6562gT0.p(jArr, "<this>");
        return jArr[i];
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte C2(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return C7330jf.pn(bArr);
    }

    @NotNull
    public static final boolean[] C3(@NotNull boolean[] zArr, @NotNull Collection<Boolean> collection) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, collection.size() + length);
        for (Boolean bool : collection) {
            copyOf[length] = bool.booleanValue();
            length++;
        }
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @NotNull
    public static final SortedSet<Byte> C4(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return (SortedSet) C7330jf.ty(bArr, new TreeSet());
    }

    public static final <T> int D(@NotNull T[] tArr, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final boolean[] D0(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, int i, int i2, int i3) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(zArr2, "destination");
        System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    @XP0
    public static final <T> T D1(T[] tArr, int i) {
        C6562gT0.p(tArr, "<this>");
        return tArr[i];
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character D2(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return C7330jf.qn(cArr);
    }

    @NotNull
    public static final boolean[] D3(@NotNull boolean[] zArr, boolean z) {
        C6562gT0.p(zArr, "<this>");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        copyOf[length] = z;
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @NotNull
    public static final SortedSet<Character> D4(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return (SortedSet) C7330jf.uy(cArr, new TreeSet());
    }

    public static final int E(@NotNull short[] sArr, short s, int i, int i2) {
        C6562gT0.p(sArr, "<this>");
        return Arrays.binarySearch(sArr, i, i2, s);
    }

    public static /* synthetic */ byte[] E0(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return v0(bArr, bArr2, i, i2, i3);
    }

    @XP0
    public static final short E1(short[] sArr, int i) {
        C6562gT0.p(sArr, "<this>");
        return sArr[i];
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable E2(Comparable[] comparableArr) {
        C6562gT0.p(comparableArr, "<this>");
        return C7330jf.rn(comparableArr);
    }

    @NotNull
    public static final boolean[] E3(@NotNull boolean[] zArr, @NotNull boolean[] zArr2) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @NotNull
    public static final SortedSet<Double> E4(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return (SortedSet) C7330jf.vy(dArr, new TreeSet());
    }

    public static /* synthetic */ int F(byte[] bArr, byte b2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return w(bArr, b2, i, i2);
    }

    public static /* synthetic */ char[] F0(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return w0(cArr, cArr2, i, i2, i3);
    }

    @XP0
    public static final boolean F1(boolean[] zArr, int i) {
        C6562gT0.p(zArr, "<this>");
        return zArr[i];
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double F2(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return C7330jf.sn(dArr);
    }

    @XP0
    public static final <T> T[] F3(T[] tArr, T t) {
        C6562gT0.p(tArr, "<this>");
        return (T[]) w3(tArr, t);
    }

    @NotNull
    public static final SortedSet<Float> F4(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return (SortedSet) C7330jf.wy(fArr, new TreeSet());
    }

    public static /* synthetic */ int G(char[] cArr, char c2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return x(cArr, c2, i, i2);
    }

    public static /* synthetic */ double[] G0(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return x0(dArr, dArr2, i, i2, i3);
    }

    public static void G1(@NotNull byte[] bArr, byte b2, int i, int i2) {
        C6562gT0.p(bArr, "<this>");
        Arrays.fill(bArr, i, i2, b2);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Double G2(Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return C7330jf.tn(dArr);
    }

    public static final void G3(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @NotNull
    public static final SortedSet<Integer> G4(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return (SortedSet) C7330jf.xy(iArr, new TreeSet());
    }

    public static /* synthetic */ int H(double[] dArr, double d2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return y(dArr, d2, i, i2);
    }

    public static /* synthetic */ float[] H0(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return y0(fArr, fArr2, i, i2, i3);
    }

    public static void H1(@NotNull char[] cArr, char c2, int i, int i2) {
        C6562gT0.p(cArr, "<this>");
        Arrays.fill(cArr, i, i2, c2);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float H2(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return C7330jf.un(fArr);
    }

    public static final void H3(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "<this>");
        Arrays.sort(bArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Long> H4(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return (SortedSet) C7330jf.yy(jArr, new TreeSet());
    }

    public static /* synthetic */ int I(float[] fArr, float f2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return z(fArr, f2, i, i2);
    }

    public static /* synthetic */ int[] I0(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return z0(iArr, iArr2, i, i2, i3);
    }

    public static final void I1(@NotNull double[] dArr, double d2, int i, int i2) {
        C6562gT0.p(dArr, "<this>");
        Arrays.fill(dArr, i, i2, d2);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Float I2(Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return C7330jf.vn(fArr);
    }

    public static final void I3(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> I4(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return (SortedSet) C7330jf.zy(tArr, new TreeSet());
    }

    public static /* synthetic */ int J(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return A(iArr, i, i2, i3);
    }

    public static /* synthetic */ long[] J0(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return A0(jArr, jArr2, i, i2, i3);
    }

    public static final void J1(@NotNull float[] fArr, float f2, int i, int i2) {
        C6562gT0.p(fArr, "<this>");
        Arrays.fill(fArr, i, i2, f2);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer J2(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return C7330jf.wn(iArr);
    }

    public static final void J3(@NotNull char[] cArr, int i, int i2) {
        C6562gT0.p(cArr, "<this>");
        Arrays.sort(cArr, i, i2);
    }

    @NotNull
    public static final <T> SortedSet<T> J4(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (SortedSet) C7330jf.zy(tArr, new TreeSet(comparator));
    }

    public static /* synthetic */ int K(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return B(jArr, j, i, i2);
    }

    public static /* synthetic */ Object[] K0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return B0(objArr, objArr2, i, i2, i3);
    }

    public static void K1(@NotNull int[] iArr, int i, int i2, int i3) {
        C6562gT0.p(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long K2(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return C7330jf.xn(jArr);
    }

    public static final void K3(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @NotNull
    public static final SortedSet<Short> K4(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return (SortedSet) C7330jf.Ay(sArr, new TreeSet());
    }

    public static /* synthetic */ int L(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return C(objArr, obj, i, i2);
    }

    public static /* synthetic */ short[] L0(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return C0(sArr, sArr2, i, i2, i3);
    }

    public static void L1(@NotNull long[] jArr, long j, int i, int i2) {
        C6562gT0.p(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short L2(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return C7330jf.yn(sArr);
    }

    public static final void L3(@NotNull double[] dArr, int i, int i2) {
        C6562gT0.p(dArr, "<this>");
        Arrays.sort(dArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Boolean> L4(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return (SortedSet) C7330jf.By(zArr, new TreeSet());
    }

    public static /* synthetic */ int M(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return D(objArr, obj, comparator, i, i2);
    }

    public static /* synthetic */ boolean[] M0(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return D0(zArr, zArr2, i, i2, i3);
    }

    public static <T> void M1(@NotNull T[] tArr, T t, int i, int i2) {
        C6562gT0.p(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean M2(boolean[] zArr, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int He = C7330jf.He(zArr);
        if (He == 0) {
            return Boolean.valueOf(z);
        }
        R invoke = ha0.invoke(Boolean.valueOf(z));
        int i = 1;
        if (1 <= He) {
            while (true) {
                boolean z2 = zArr[i];
                R invoke2 = ha0.invoke(Boolean.valueOf(z2));
                if (invoke.compareTo(invoke2) > 0) {
                    z = z2;
                    invoke = invoke2;
                }
                if (i == He) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final void M3(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @NotNull
    public static final Boolean[] M4(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    public static /* synthetic */ int N(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return E(sArr, s, i, i2);
    }

    @XP0
    public static final byte[] N0(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static void N1(@NotNull short[] sArr, short s, int i, int i2) {
        C6562gT0.p(sArr, "<this>");
        Arrays.fill(sArr, i, i2, s);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte N2(byte[] bArr, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = C7330jf.ze(bArr);
        if (ze == 0) {
            return Byte.valueOf(b2);
        }
        R invoke = ha0.invoke(Byte.valueOf(b2));
        int i = 1;
        if (1 <= ze) {
            while (true) {
                byte b3 = bArr[i];
                R invoke2 = ha0.invoke(Byte.valueOf(b3));
                if (invoke.compareTo(invoke2) > 0) {
                    b2 = b3;
                    invoke = invoke2;
                }
                if (i == ze) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b2);
    }

    public static void N3(@NotNull float[] fArr, int i, int i2) {
        C6562gT0.p(fArr, "<this>");
        Arrays.sort(fArr, i, i2);
    }

    @NotNull
    public static final Byte[] N4(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @XP0
    @R61
    @InterfaceC8046mW0(name = "contentDeepEqualsInline")
    @InterfaceC6480g82(version = "1.1")
    public static final <T> boolean O(T[] tArr, T[] tArr2) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(tArr2, "other");
        return C4691Xe.g(tArr, tArr2);
    }

    @XP0
    public static final byte[] O0(byte[] bArr, int i) {
        C6562gT0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final void O1(@NotNull boolean[] zArr, boolean z, int i, int i2) {
        C6562gT0.p(zArr, "<this>");
        Arrays.fill(zArr, i, i2, z);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character O2(char[] cArr, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = C7330jf.Ae(cArr);
        if (Ae == 0) {
            return Character.valueOf(c2);
        }
        R invoke = ha0.invoke(Character.valueOf(c2));
        int i = 1;
        if (1 <= Ae) {
            while (true) {
                char c3 = cArr[i];
                R invoke2 = ha0.invoke(Character.valueOf(c3));
                if (invoke.compareTo(invoke2) > 0) {
                    c2 = c3;
                    invoke = invoke2;
                }
                if (i == Ae) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c2);
    }

    public static final void O3(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @NotNull
    public static final Character[] O4(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    @XP0
    @InterfaceC8046mW0(name = "contentDeepEqualsNullable")
    @InterfaceC6480g82(version = "1.4")
    public static final <T> boolean P(T[] tArr, T[] tArr2) {
        return C4691Xe.g(tArr, tArr2);
    }

    @XP0
    public static final char[] P0(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void P1(byte[] bArr, byte b2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        G1(bArr, b2, i, i2);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double P2(double[] dArr, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = C7330jf.Be(dArr);
        if (Be == 0) {
            return Double.valueOf(d2);
        }
        R invoke = ha0.invoke(Double.valueOf(d2));
        int i = 1;
        if (1 <= Be) {
            while (true) {
                double d3 = dArr[i];
                R invoke2 = ha0.invoke(Double.valueOf(d3));
                if (invoke.compareTo(invoke2) > 0) {
                    d2 = d3;
                    invoke = invoke2;
                }
                if (i == Be) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d2);
    }

    public static void P3(@NotNull int[] iArr, int i, int i2) {
        C6562gT0.p(iArr, "<this>");
        Arrays.sort(iArr, i, i2);
    }

    @NotNull
    public static final Double[] P4(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @XP0
    @R61
    @InterfaceC8046mW0(name = "contentDeepHashCodeInline")
    @InterfaceC6480g82(version = "1.1")
    public static final <T> int Q(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return C4594We.b(tArr);
    }

    @XP0
    public static final char[] Q0(char[] cArr, int i) {
        C6562gT0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void Q1(char[] cArr, char c2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        H1(cArr, c2, i, i2);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float Q2(float[] fArr, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = C7330jf.Ce(fArr);
        if (Ce == 0) {
            return Float.valueOf(f2);
        }
        R invoke = ha0.invoke(Float.valueOf(f2));
        int i = 1;
        if (1 <= Ce) {
            while (true) {
                float f3 = fArr[i];
                R invoke2 = ha0.invoke(Float.valueOf(f3));
                if (invoke.compareTo(invoke2) > 0) {
                    f2 = f3;
                    invoke = invoke2;
                }
                if (i == Ce) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f2);
    }

    public static final void Q3(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @NotNull
    public static final Float[] Q4(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @XP0
    @InterfaceC8046mW0(name = "contentDeepHashCodeNullable")
    @InterfaceC6480g82(version = "1.4")
    public static final <T> int R(T[] tArr) {
        return C4594We.b(tArr);
    }

    @XP0
    public static final double[] R0(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void R1(double[] dArr, double d2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        I1(dArr, d2, i, i2);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer R2(int[] iArr, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int De = C7330jf.De(iArr);
        if (De == 0) {
            return Integer.valueOf(i);
        }
        R invoke = ha0.invoke(Integer.valueOf(i));
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                int i3 = iArr[i2];
                R invoke2 = ha0.invoke(Integer.valueOf(i3));
                if (invoke.compareTo(invoke2) > 0) {
                    i = i3;
                    invoke = invoke2;
                }
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static void R3(@NotNull long[] jArr, int i, int i2) {
        C6562gT0.p(jArr, "<this>");
        Arrays.sort(jArr, i, i2);
    }

    @NotNull
    public static final Integer[] R4(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @XP0
    @R61
    @InterfaceC8046mW0(name = "contentDeepToStringInline")
    @InterfaceC6480g82(version = "1.1")
    public static final <T> String S(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return C4691Xe.h(tArr);
    }

    @XP0
    public static final double[] S0(double[] dArr, int i) {
        C6562gT0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void S1(float[] fArr, float f2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        J1(fArr, f2, i, i2);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long S2(long[] jArr, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int Ee = C7330jf.Ee(jArr);
        if (Ee == 0) {
            return Long.valueOf(j);
        }
        R invoke = ha0.invoke(Long.valueOf(j));
        int i = 1;
        if (1 <= Ee) {
            while (true) {
                long j2 = jArr[i];
                R invoke2 = ha0.invoke(Long.valueOf(j2));
                if (invoke.compareTo(invoke2) > 0) {
                    j = j2;
                    invoke = invoke2;
                }
                if (i == Ee) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @XP0
    public static final <T extends Comparable<? super T>> void S3(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        U3(tArr);
    }

    @NotNull
    public static final Long[] S4(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @XP0
    @InterfaceC8046mW0(name = "contentDeepToStringNullable")
    @InterfaceC6480g82(version = "1.4")
    public static final <T> String T(T[] tArr) {
        return C4691Xe.h(tArr);
    }

    @XP0
    public static final float[] T0(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void T1(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        K1(iArr, i, i2, i3);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T T2(T[] tArr, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int Fe = C7330jf.Fe(tArr);
        if (Fe != 0) {
            R invoke = ha0.invoke(t);
            int i = 1;
            if (1 <= Fe) {
                while (true) {
                    T t2 = tArr[i];
                    R invoke2 = ha0.invoke(t2);
                    if (invoke.compareTo(invoke2) > 0) {
                        t = t2;
                        invoke = invoke2;
                    }
                    if (i == Fe) {
                        break;
                    }
                    i++;
                }
            }
        }
        return t;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final <T extends Comparable<? super T>> void T3(@NotNull T[] tArr, int i, int i2) {
        C6562gT0.p(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    @NotNull
    public static final Short[] T4(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean U(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @XP0
    public static final float[] U0(float[] fArr, int i) {
        C6562gT0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void U1(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        L1(jArr, j, i, i2);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short U2(short[] sArr, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int Ge = C7330jf.Ge(sArr);
        if (Ge == 0) {
            return Short.valueOf(s);
        }
        R invoke = ha0.invoke(Short.valueOf(s));
        int i = 1;
        if (1 <= Ge) {
            while (true) {
                short s2 = sArr[i];
                R invoke2 = ha0.invoke(Short.valueOf(s2));
                if (invoke.compareTo(invoke2) > 0) {
                    s = s2;
                    invoke = invoke2;
                }
                if (i == Ge) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    public static <T> void U3(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean V(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @XP0
    public static final int[] V0(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void V1(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        M1(objArr, obj, i, i2);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean V2(boolean[] zArr, Comparator comparator) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.Jn(zArr, comparator);
    }

    public static final <T> void V3(@NotNull T[] tArr, int i, int i2) {
        C6562gT0.p(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean W(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @XP0
    public static final int[] W0(int[] iArr, int i) {
        C6562gT0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void W1(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        N1(sArr, s, i, i2);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte W2(byte[] bArr, Comparator comparator) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.Kn(bArr, comparator);
    }

    public static final void W3(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean X(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @XP0
    public static final long[] X0(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void X1(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        O1(zArr, z, i, i2);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X2(char[] cArr, Comparator comparator) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.Ln(cArr, comparator);
    }

    public static final void X3(@NotNull short[] sArr, int i, int i2) {
        C6562gT0.p(sArr, "<this>");
        Arrays.sort(sArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean Y(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @XP0
    public static final long[] Y0(long[] jArr, int i) {
        C6562gT0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @NotNull
    public static final <R> List<R> Y1(@NotNull Object[] objArr, @NotNull Class<R> cls) {
        C6562gT0.p(objArr, "<this>");
        C6562gT0.p(cls, "klass");
        return (List) Z1(objArr, new ArrayList(), cls);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double Y2(double[] dArr, Comparator comparator) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.Mn(dArr, comparator);
    }

    public static /* synthetic */ void Y3(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        H3(bArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean Z(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @XP0
    public static final <T> T[] Z0(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        C6562gT0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C Z1(@NotNull Object[] objArr, @NotNull C c2, @NotNull Class<R> cls) {
        C6562gT0.p(objArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(cls, "klass");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c2.add(obj);
            }
        }
        return c2;
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float Z2(float[] fArr, Comparator comparator) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.Nn(fArr, comparator);
    }

    public static /* synthetic */ void Z3(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        J3(cArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T> boolean a0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @XP0
    public static final <T> T[] a1(T[] tArr, int i) {
        C6562gT0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        C6562gT0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte a2(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return C7330jf.Rk(bArr);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer a3(int[] iArr, Comparator comparator) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.On(iArr, comparator);
    }

    public static /* synthetic */ void a4(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        L3(dArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean b0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @XP0
    public static final short[] b1(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character b2(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return C7330jf.Sk(cArr);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long b3(long[] jArr, Comparator comparator) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.Pn(jArr, comparator);
    }

    public static /* synthetic */ void b4(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        N3(fArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean c0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @XP0
    public static final short[] c1(short[] sArr, int i) {
        C6562gT0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable c2(Comparable[] comparableArr) {
        C6562gT0.p(comparableArr, "<this>");
        return C7330jf.Tk(comparableArr);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object c3(Object[] objArr, Comparator comparator) {
        C6562gT0.p(objArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.Qn(objArr, comparator);
    }

    public static /* synthetic */ void c4(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        P3(iArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int d0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @XP0
    public static final boolean[] d1(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double d2(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return C7330jf.Uk(dArr);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short d3(short[] sArr, Comparator comparator) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.Rn(sArr, comparator);
    }

    public static /* synthetic */ void d4(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        R3(jArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int e0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @XP0
    public static final boolean[] e1(boolean[] zArr, int i) {
        C6562gT0.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Double e2(Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return C7330jf.Vk(dArr);
    }

    @NotNull
    public static byte[] e3(@NotNull byte[] bArr, byte b2) {
        C6562gT0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + 1);
        copyOf[length] = b2;
        C6562gT0.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void e4(Comparable[] comparableArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        T3(comparableArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int f0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static byte[] f1(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "<this>");
        C4594We.c(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C6562gT0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float f2(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return C7330jf.Wk(fArr);
    }

    @NotNull
    public static final byte[] f3(@NotNull byte[] bArr, @NotNull Collection<Byte> collection) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, collection.size() + length);
        for (Byte b2 : collection) {
            copyOf[length] = b2.byteValue();
            length++;
        }
        C6562gT0.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void f4(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        V3(objArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int g0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static final char[] g1(@NotNull char[] cArr, int i, int i2) {
        C6562gT0.p(cArr, "<this>");
        C4594We.c(i2, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
        C6562gT0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6480g82(version = "1.1")
    public static final /* synthetic */ Float g2(Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return C7330jf.Xk(fArr);
    }

    @NotNull
    public static byte[] g3(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        C6562gT0.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void g4(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        X3(sArr, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int h0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static final double[] h1(@NotNull double[] dArr, int i, int i2) {
        C6562gT0.p(dArr, "<this>");
        C4594We.c(i2, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i, i2);
        C6562gT0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer h2(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return C7330jf.Yk(iArr);
    }

    @NotNull
    public static final char[] h3(@NotNull char[] cArr, char c2) {
        C6562gT0.p(cArr, "<this>");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, length + 1);
        copyOf[length] = c2;
        C6562gT0.m(copyOf);
        return copyOf;
    }

    public static final <T> void h4(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int i0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static final float[] i1(@NotNull float[] fArr, int i, int i2) {
        C6562gT0.p(fArr, "<this>");
        C4594We.c(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        C6562gT0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long i2(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return C7330jf.Zk(jArr);
    }

    @NotNull
    public static final char[] i3(@NotNull char[] cArr, @NotNull Collection<Character> collection) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, collection.size() + length);
        for (Character ch : collection) {
            copyOf[length] = ch.charValue();
            length++;
        }
        C6562gT0.m(copyOf);
        return copyOf;
    }

    public static final <T> void i4(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i, int i2) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T> int j0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static int[] j1(@NotNull int[] iArr, int i, int i2) {
        C6562gT0.p(iArr, "<this>");
        C4594We.c(i2, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
        C6562gT0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short j2(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return C7330jf.al(sArr);
    }

    @NotNull
    public static final char[] j3(@NotNull char[] cArr, @NotNull char[] cArr2) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        C6562gT0.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void j4(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        i4(objArr, comparator, i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int k0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static long[] k1(@NotNull long[] jArr, int i, int i2) {
        C6562gT0.p(jArr, "<this>");
        C4594We.c(i2, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i, i2);
        C6562gT0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean k2(boolean[] zArr, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int He = C7330jf.He(zArr);
        if (He == 0) {
            return Boolean.valueOf(z);
        }
        R invoke = ha0.invoke(Boolean.valueOf(z));
        int i = 1;
        if (1 <= He) {
            while (true) {
                boolean z2 = zArr[i];
                R invoke2 = ha0.invoke(Boolean.valueOf(z2));
                if (invoke.compareTo(invoke2) < 0) {
                    z = z2;
                    invoke = invoke2;
                }
                if (i == He) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    @NotNull
    public static final double[] k3(@NotNull double[] dArr, double d2) {
        C6562gT0.p(dArr, "<this>");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
        copyOf[length] = d2;
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal k4(byte[] bArr, HA0<? super Byte, ? extends BigDecimal> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (byte b2 : bArr) {
            valueOf = valueOf.add(ha0.invoke(Byte.valueOf(b2)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int l0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static <T> T[] l1(@NotNull T[] tArr, int i, int i2) {
        C6562gT0.p(tArr, "<this>");
        C4594We.c(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        C6562gT0.o(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte l2(byte[] bArr, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = C7330jf.ze(bArr);
        if (ze == 0) {
            return Byte.valueOf(b2);
        }
        R invoke = ha0.invoke(Byte.valueOf(b2));
        int i = 1;
        if (1 <= ze) {
            while (true) {
                byte b3 = bArr[i];
                R invoke2 = ha0.invoke(Byte.valueOf(b3));
                if (invoke.compareTo(invoke2) < 0) {
                    b2 = b3;
                    invoke = invoke2;
                }
                if (i == ze) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b2);
    }

    @NotNull
    public static final double[] l3(@NotNull double[] dArr, @NotNull Collection<Double> collection) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, collection.size() + length);
        for (Double d2 : collection) {
            copyOf[length] = d2.doubleValue();
            length++;
        }
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal l4(char[] cArr, HA0<? super Character, ? extends BigDecimal> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (char c2 : cArr) {
            valueOf = valueOf.add(ha0.invoke(Character.valueOf(c2)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String m0(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static short[] m1(@NotNull short[] sArr, int i, int i2) {
        C6562gT0.p(sArr, "<this>");
        C4594We.c(i2, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i, i2);
        C6562gT0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m2(char[] cArr, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = C7330jf.Ae(cArr);
        if (Ae == 0) {
            return Character.valueOf(c2);
        }
        R invoke = ha0.invoke(Character.valueOf(c2));
        int i = 1;
        if (1 <= Ae) {
            while (true) {
                char c3 = cArr[i];
                R invoke2 = ha0.invoke(Character.valueOf(c3));
                if (invoke.compareTo(invoke2) < 0) {
                    c2 = c3;
                    invoke = invoke2;
                }
                if (i == Ae) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c2);
    }

    @NotNull
    public static final double[] m3(@NotNull double[] dArr, @NotNull double[] dArr2) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, copyOf, length, length2);
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal m4(double[] dArr, HA0<? super Double, ? extends BigDecimal> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (double d2 : dArr) {
            valueOf = valueOf.add(ha0.invoke(Double.valueOf(d2)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static final List<Byte> n(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return new a(bArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String n0(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "copyOfRange")
    @InterfaceC6480g82(version = "1.3")
    public static final boolean[] n1(@NotNull boolean[] zArr, int i, int i2) {
        C6562gT0.p(zArr, "<this>");
        C4594We.c(i2, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i, i2);
        C6562gT0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double n2(double[] dArr, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = C7330jf.Be(dArr);
        if (Be == 0) {
            return Double.valueOf(d2);
        }
        R invoke = ha0.invoke(Double.valueOf(d2));
        int i = 1;
        if (1 <= Be) {
            while (true) {
                double d3 = dArr[i];
                R invoke2 = ha0.invoke(Double.valueOf(d3));
                if (invoke.compareTo(invoke2) < 0) {
                    d2 = d3;
                    invoke = invoke2;
                }
                if (i == Be) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d2);
    }

    @NotNull
    public static final float[] n3(@NotNull float[] fArr, float f2) {
        C6562gT0.p(fArr, "<this>");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        copyOf[length] = f2;
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal n4(float[] fArr, HA0<? super Float, ? extends BigDecimal> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (float f2 : fArr) {
            valueOf = valueOf.add(ha0.invoke(Float.valueOf(f2)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static final List<Character> o(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return new h(cArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String o0(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final byte[] o1(byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "<this>");
        return f1(bArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float o2(float[] fArr, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = C7330jf.Ce(fArr);
        if (Ce == 0) {
            return Float.valueOf(f2);
        }
        R invoke = ha0.invoke(Float.valueOf(f2));
        int i = 1;
        if (1 <= Ce) {
            while (true) {
                float f3 = fArr[i];
                R invoke2 = ha0.invoke(Float.valueOf(f3));
                if (invoke.compareTo(invoke2) < 0) {
                    f2 = f3;
                    invoke = invoke2;
                }
                if (i == Ce) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f2);
    }

    @NotNull
    public static final float[] o3(@NotNull float[] fArr, @NotNull Collection<Float> collection) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, collection.size() + length);
        for (Float f2 : collection) {
            copyOf[length] = f2.floatValue();
            length++;
        }
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal o4(int[] iArr, HA0<? super Integer, ? extends BigDecimal> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (int i : iArr) {
            valueOf = valueOf.add(ha0.invoke(Integer.valueOf(i)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static List<Double> p(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return new f(dArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String p0(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final char[] p1(char[] cArr, int i, int i2) {
        C6562gT0.p(cArr, "<this>");
        return g1(cArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer p2(int[] iArr, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int De = C7330jf.De(iArr);
        if (De == 0) {
            return Integer.valueOf(i);
        }
        R invoke = ha0.invoke(Integer.valueOf(i));
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                int i3 = iArr[i2];
                R invoke2 = ha0.invoke(Integer.valueOf(i3));
                if (invoke.compareTo(invoke2) < 0) {
                    i = i3;
                    invoke = invoke2;
                }
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @NotNull
    public static final float[] p3(@NotNull float[] fArr, @NotNull float[] fArr2) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal p4(long[] jArr, HA0<? super Long, ? extends BigDecimal> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (long j : jArr) {
            valueOf = valueOf.add(ha0.invoke(Long.valueOf(j)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static final List<Float> q(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return new e(fArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String q0(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final double[] q1(double[] dArr, int i, int i2) {
        C6562gT0.p(dArr, "<this>");
        return h1(dArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long q2(long[] jArr, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int Ee = C7330jf.Ee(jArr);
        if (Ee == 0) {
            return Long.valueOf(j);
        }
        R invoke = ha0.invoke(Long.valueOf(j));
        int i = 1;
        if (1 <= Ee) {
            while (true) {
                long j2 = jArr[i];
                R invoke2 = ha0.invoke(Long.valueOf(j2));
                if (invoke.compareTo(invoke2) < 0) {
                    j = j2;
                    invoke = invoke2;
                }
                if (i == Ee) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @NotNull
    public static int[] q3(@NotNull int[] iArr, int i) {
        C6562gT0.p(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> BigDecimal q4(T[] tArr, HA0<? super T, ? extends BigDecimal> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (T t : tArr) {
            valueOf = valueOf.add(ha0.invoke(t));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static List<Integer> r(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return new c(iArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String r0(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final float[] r1(float[] fArr, int i, int i2) {
        C6562gT0.p(fArr, "<this>");
        return i1(fArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T r2(T[] tArr, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int Fe = C7330jf.Fe(tArr);
        if (Fe != 0) {
            R invoke = ha0.invoke(t);
            int i = 1;
            if (1 <= Fe) {
                while (true) {
                    T t2 = tArr[i];
                    R invoke2 = ha0.invoke(t2);
                    if (invoke.compareTo(invoke2) < 0) {
                        t = t2;
                        invoke = invoke2;
                    }
                    if (i == Fe) {
                        break;
                    }
                    i++;
                }
            }
        }
        return t;
    }

    @NotNull
    public static final int[] r3(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, collection.size() + length);
        for (Integer num : collection) {
            copyOf[length] = num.intValue();
            length++;
        }
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal r4(short[] sArr, HA0<? super Short, ? extends BigDecimal> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (short s : sArr) {
            valueOf = valueOf.add(ha0.invoke(Short.valueOf(s)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static List<Long> s(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return new d(jArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T> String s0(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final int[] s1(int[] iArr, int i, int i2) {
        C6562gT0.p(iArr, "<this>");
        return j1(iArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short s2(short[] sArr, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int Ge = C7330jf.Ge(sArr);
        if (Ge == 0) {
            return Short.valueOf(s);
        }
        R invoke = ha0.invoke(Short.valueOf(s));
        int i = 1;
        if (1 <= Ge) {
            while (true) {
                short s2 = sArr[i];
                R invoke2 = ha0.invoke(Short.valueOf(s2));
                if (invoke.compareTo(invoke2) < 0) {
                    s = s2;
                    invoke = invoke2;
                }
                if (i == Ge) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @NotNull
    public static int[] s3(@NotNull int[] iArr, @NotNull int[] iArr2) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal s4(boolean[] zArr, HA0<? super Boolean, ? extends BigDecimal> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (boolean z : zArr) {
            valueOf = valueOf.add(ha0.invoke(Boolean.valueOf(z)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static <T> List<T> t(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        List<T> a2 = C7573kf.a(tArr);
        C6562gT0.o(a2, "asList(...)");
        return a2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String t0(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final long[] t1(long[] jArr, int i, int i2) {
        C6562gT0.p(jArr, "<this>");
        return k1(jArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean t2(boolean[] zArr, Comparator comparator) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.ll(zArr, comparator);
    }

    @NotNull
    public static long[] t3(@NotNull long[] jArr, long j) {
        C6562gT0.p(jArr, "<this>");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        copyOf[length] = j;
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger t4(byte[] bArr, HA0<? super Byte, ? extends BigInteger> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (byte b2 : bArr) {
            valueOf = valueOf.add(ha0.invoke(Byte.valueOf(b2)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static final List<Short> u(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return new b(sArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String u0(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        C6562gT0.o(arrays, "toString(...)");
        return arrays;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final <T> T[] u1(T[] tArr, int i, int i2) {
        C6562gT0.p(tArr, "<this>");
        return (T[]) l1(tArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte u2(byte[] bArr, Comparator comparator) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.ml(bArr, comparator);
    }

    @NotNull
    public static final long[] u3(@NotNull long[] jArr, @NotNull Collection<Long> collection) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, collection.size() + length);
        for (Long l : collection) {
            copyOf[length] = l.longValue();
            length++;
        }
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger u4(char[] cArr, HA0<? super Character, ? extends BigInteger> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (char c2 : cArr) {
            valueOf = valueOf.add(ha0.invoke(Character.valueOf(c2)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static final List<Boolean> v(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return new g(zArr);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static byte[] v0(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final short[] v1(short[] sArr, int i, int i2) {
        C6562gT0.p(sArr, "<this>");
        return m1(sArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character v2(char[] cArr, Comparator comparator) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.nl(cArr, comparator);
    }

    @NotNull
    public static long[] v3(@NotNull long[] jArr, @NotNull long[] jArr2) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger v4(double[] dArr, HA0<? super Double, ? extends BigInteger> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (double d2 : dArr) {
            valueOf = valueOf.add(ha0.invoke(Double.valueOf(d2)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int w(@NotNull byte[] bArr, byte b2, int i, int i2) {
        C6562gT0.p(bArr, "<this>");
        return Arrays.binarySearch(bArr, i, i2, b2);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final char[] w0(@NotNull char[] cArr, @NotNull char[] cArr2, int i, int i2, int i3) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(cArr2, "destination");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    @XP0
    @InterfaceC8046mW0(name = "copyOfRangeInline")
    public static final boolean[] w1(boolean[] zArr, int i, int i2) {
        C6562gT0.p(zArr, "<this>");
        return n1(zArr, i, i2);
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double w2(double[] dArr, Comparator comparator) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.ol(dArr, comparator);
    }

    @NotNull
    public static final <T> T[] w3(@NotNull T[] tArr, T t) {
        C6562gT0.p(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        C6562gT0.m(tArr2);
        return tArr2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger w4(float[] fArr, HA0<? super Float, ? extends BigInteger> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (float f2 : fArr) {
            valueOf = valueOf.add(ha0.invoke(Float.valueOf(f2)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int x(@NotNull char[] cArr, char c2, int i, int i2) {
        C6562gT0.p(cArr, "<this>");
        return Arrays.binarySearch(cArr, i, i2, c2);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final double[] x0(@NotNull double[] dArr, @NotNull double[] dArr2, int i, int i2, int i3) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(dArr2, "destination");
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    @XP0
    public static final byte x1(byte[] bArr, int i) {
        C6562gT0.p(bArr, "<this>");
        return bArr[i];
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float x2(float[] fArr, Comparator comparator) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.pl(fArr, comparator);
    }

    @NotNull
    public static final <T> T[] x3(@NotNull T[] tArr, @NotNull Collection<? extends T> collection) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        for (T t : collection) {
            tArr2[length] = t;
            length++;
        }
        C6562gT0.m(tArr2);
        return tArr2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger x4(int[] iArr, HA0<? super Integer, ? extends BigInteger> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (int i : iArr) {
            valueOf = valueOf.add(ha0.invoke(Integer.valueOf(i)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int y(@NotNull double[] dArr, double d2, int i, int i2) {
        C6562gT0.p(dArr, "<this>");
        return Arrays.binarySearch(dArr, i, i2, d2);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static float[] y0(@NotNull float[] fArr, @NotNull float[] fArr2, int i, int i2, int i3) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    @XP0
    public static final char y1(char[] cArr, int i) {
        C6562gT0.p(cArr, "<this>");
        return cArr[i];
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer y2(int[] iArr, Comparator comparator) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.ql(iArr, comparator);
    }

    @NotNull
    public static final <T> T[] y3(@NotNull T[] tArr, @NotNull T[] tArr2) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        C6562gT0.m(tArr3);
        return tArr3;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger y4(long[] jArr, HA0<? super Long, ? extends BigInteger> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (long j : jArr) {
            valueOf = valueOf.add(ha0.invoke(Long.valueOf(j)));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int z(@NotNull float[] fArr, float f2, int i, int i2) {
        C6562gT0.p(fArr, "<this>");
        return Arrays.binarySearch(fArr, i, i2, f2);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static int[] z0(@NotNull int[] iArr, @NotNull int[] iArr2, int i, int i2, int i3) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    @XP0
    public static final double z1(double[] dArr, int i) {
        C6562gT0.p(dArr, "<this>");
        return dArr[i];
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long z2(long[] jArr, Comparator comparator) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C7330jf.rl(jArr, comparator);
    }

    @NotNull
    public static final short[] z3(@NotNull short[] sArr, @NotNull Collection<Short> collection) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(collection, "elements");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, collection.size() + length);
        for (Short sh : collection) {
            copyOf[length] = sh.shortValue();
            length++;
        }
        C6562gT0.m(copyOf);
        return copyOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> BigInteger z4(T[] tArr, HA0<? super T, ? extends BigInteger> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (T t : tArr) {
            valueOf = valueOf.add(ha0.invoke(t));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }
}
