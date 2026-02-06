package o;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: o.Se  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4206Se {
    public static final boolean[] a = new boolean[0];
    public static final Boolean[] b = new Boolean[0];
    public static final byte[] c = new byte[0];
    public static final Byte[] d = new Byte[0];
    public static final char[] e = new char[0];
    public static final Character[] f = new Character[0];
    public static final Class<?>[] g = new Class[0];
    public static final double[] h = new double[0];
    public static final Double[] i = new Double[0];
    public static final Field[] j = new Field[0];
    public static final float[] k = new float[0];
    public static final Float[] l = new Float[0];
    public static final int[] m = new int[0];
    public static final Integer[] n = new Integer[0];

    /* renamed from: o  reason: collision with root package name */
    public static final long[] f612o = new long[0];
    public static final Long[] p = new Long[0];
    public static final Method[] q = new Method[0];
    public static final Object[] r = new Object[0];
    public static final short[] s = new short[0];
    public static final Short[] t = new Short[0];
    public static final String[] u = new String[0];
    public static final Throwable[] v = new Throwable[0];
    public static final Type[] w = new Type[0];
    public static final int x = -1;

    public static short[] A(short[] sArr, short... sArr2) {
        if (sArr == null) {
            return S(sArr2);
        }
        if (sArr2 == null) {
            return S(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static int A0(short[] sArr, short s2, int i2) {
        if (sArr == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < sArr.length) {
            if (s2 == sArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static boolean A1(Object obj, Object obj2) {
        if (h0(obj) == h0(obj2)) {
            return true;
        }
        return false;
    }

    public static Float[] A2(Float[] fArr) {
        if (n1(fArr)) {
            return l;
        }
        return fArr;
    }

    public static int[] A3(int[] iArr, int i2) {
        int t0 = t0(iArr, i2);
        if (t0 == -1) {
            return P(iArr);
        }
        return O2(iArr, t0);
    }

    public static void A4(char[] cArr) {
        B4(cArr, new Random());
    }

    public static Short[] A5(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return t;
        }
        Short[] shArr = new Short[sArr.length];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            shArr[i2] = Short.valueOf(sArr[i2]);
        }
        return shArr;
    }

    public static boolean[] B(boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return T(zArr2);
        }
        if (zArr2 == null) {
            return T(zArr);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr, 0, zArr3, 0, zArr.length);
        System.arraycopy(zArr2, 0, zArr3, zArr.length, zArr2.length);
        return zArr3;
    }

    public static int B0(boolean[] zArr, boolean z) {
        return C0(zArr, z, 0);
    }

    public static boolean B1(byte[] bArr, byte[] bArr2) {
        if (h0(bArr) == h0(bArr2)) {
            return true;
        }
        return false;
    }

    public static Integer[] B2(Integer[] numArr) {
        if (n1(numArr)) {
            return n;
        }
        return numArr;
    }

    public static long[] B3(long[] jArr, long j2) {
        int v0 = v0(jArr, j2);
        if (v0 == -1) {
            return Q(jArr);
        }
        return P2(jArr, v0);
    }

    public static void B4(char[] cArr, Random random) {
        for (int length = cArr.length; length > 1; length--) {
            c5(cArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Object B5(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> b0 = C8457oD.b0(obj.getClass().getComponentType());
        if (Boolean.TYPE.equals(b0)) {
            return Q5((Boolean[]) obj);
        }
        if (Character.TYPE.equals(b0)) {
            return E5((Character[]) obj);
        }
        if (Byte.TYPE.equals(b0)) {
            return C5((Byte[]) obj);
        }
        if (Integer.TYPE.equals(b0)) {
            return K5((Integer[]) obj);
        }
        if (Long.TYPE.equals(b0)) {
            return M5((Long[]) obj);
        }
        if (Short.TYPE.equals(b0)) {
            return O5((Short[]) obj);
        }
        if (Double.TYPE.equals(b0)) {
            return G5((Double[]) obj);
        }
        if (Float.TYPE.equals(b0)) {
            return I5((Float[]) obj);
        }
        return obj;
    }

    public static byte[] C(byte[] bArr, byte b2) {
        if (bArr == null) {
            return b(bArr, b2);
        }
        return X0(0, bArr, b2);
    }

    public static int C0(boolean[] zArr, boolean z, int i2) {
        if (p1(zArr)) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < zArr.length) {
            if (z == zArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static boolean C1(char[] cArr, char[] cArr2) {
        if (h0(cArr) == h0(cArr2)) {
            return true;
        }
        return false;
    }

    public static Long[] C2(Long[] lArr) {
        if (n1(lArr)) {
            return p;
        }
        return lArr;
    }

    public static <T> T[] C3(T[] tArr, Object obj) {
        int x0 = x0(tArr, obj);
        if (x0 == -1) {
            return (T[]) R(tArr);
        }
        return (T[]) Q2(tArr, x0);
    }

    public static void C4(double[] dArr) {
        D4(dArr, new Random());
    }

    public static byte[] C5(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return c;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = bArr[i2].byteValue();
        }
        return bArr2;
    }

    public static char[] D(char[] cArr, char c2) {
        if (cArr == null) {
            return d(cArr, c2);
        }
        return Y0(0, cArr, c2);
    }

    public static BitSet D0(byte[] bArr, byte b2) {
        return E0(bArr, b2, 0);
    }

    public static boolean D1(double[] dArr, double[] dArr2) {
        if (h0(dArr) == h0(dArr2)) {
            return true;
        }
        return false;
    }

    public static Object[] D2(Object[] objArr) {
        if (n1(objArr)) {
            return r;
        }
        return objArr;
    }

    public static short[] D3(short[] sArr, short s2) {
        int z0 = z0(sArr, s2);
        if (z0 == -1) {
            return S(sArr);
        }
        return R2(sArr, z0);
    }

    public static void D4(double[] dArr, Random random) {
        for (int length = dArr.length; length > 1; length--) {
            e5(dArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static byte[] D5(Byte[] bArr, byte b2) {
        byte byteValue;
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return c;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            Byte b3 = bArr[i2];
            if (b3 == null) {
                byteValue = b2;
            } else {
                byteValue = b3.byteValue();
            }
            bArr2[i2] = byteValue;
        }
        return bArr2;
    }

    public static double[] E(double[] dArr, double d2) {
        if (dArr == null) {
            return f(dArr, d2);
        }
        return Z0(0, dArr, d2);
    }

    public static BitSet E0(byte[] bArr, byte b2, int i2) {
        int k0;
        BitSet bitSet = new BitSet();
        if (bArr != null) {
            while (i2 < bArr.length && (k0 = k0(bArr, b2, i2)) != -1) {
                bitSet.set(k0);
                i2 = k0 + 1;
            }
        }
        return bitSet;
    }

    public static boolean E1(float[] fArr, float[] fArr2) {
        if (h0(fArr) == h0(fArr2)) {
            return true;
        }
        return false;
    }

    public static <T> T[] E2(T[] tArr, Class<T[]> cls) {
        if (cls != null) {
            if (tArr == null) {
                return cls.cast(Array.newInstance(cls.getComponentType(), 0));
            }
            return tArr;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public static boolean[] E3(boolean[] zArr, boolean z) {
        int B0 = B0(zArr, z);
        if (B0 == -1) {
            return T(zArr);
        }
        return S2(zArr, B0);
    }

    public static void E4(float[] fArr) {
        F4(fArr, new Random());
    }

    public static char[] E5(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return e;
        }
        char[] cArr = new char[chArr.length];
        for (int i2 = 0; i2 < chArr.length; i2++) {
            cArr[i2] = chArr[i2].charValue();
        }
        return cArr;
    }

    public static float[] F(float[] fArr, float f2) {
        if (fArr == null) {
            return h(fArr, f2);
        }
        return a1(0, fArr, f2);
    }

    public static BitSet F0(char[] cArr, char c2) {
        return G0(cArr, c2, 0);
    }

    public static boolean F1(int[] iArr, int[] iArr2) {
        if (h0(iArr) == h0(iArr2)) {
            return true;
        }
        return false;
    }

    public static Short[] F2(Short[] shArr) {
        if (n1(shArr)) {
            return t;
        }
        return shArr;
    }

    public static byte[] F3(byte[] bArr, byte... bArr2) {
        if (!h1(bArr) && !h1(bArr2)) {
            HashMap hashMap = new HashMap(bArr2.length);
            for (byte b2 : bArr2) {
                Byte valueOf = Byte.valueOf(b2);
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(valueOf);
                if (c5654cn1 == null) {
                    hashMap.put(valueOf, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b3 = bArr[i2];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(Byte.valueOf(b3));
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(Byte.valueOf(b3));
                    }
                    bitSet.set(i2);
                }
            }
            return (byte[]) T2(bArr, bitSet);
        }
        return L(bArr);
    }

    public static void F4(float[] fArr, Random random) {
        for (int length = fArr.length; length > 1; length--) {
            g5(fArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static char[] F5(Character[] chArr, char c2) {
        char charValue;
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return e;
        }
        char[] cArr = new char[chArr.length];
        for (int i2 = 0; i2 < chArr.length; i2++) {
            Character ch = chArr[i2];
            if (ch == null) {
                charValue = c2;
            } else {
                charValue = ch.charValue();
            }
            cArr[i2] = charValue;
        }
        return cArr;
    }

    public static int[] G(int[] iArr, int i2) {
        if (iArr == null) {
            return j(iArr, i2);
        }
        return b1(0, iArr, i2);
    }

    public static BitSet G0(char[] cArr, char c2, int i2) {
        int m0;
        BitSet bitSet = new BitSet();
        if (cArr != null) {
            while (i2 < cArr.length && (m0 = m0(cArr, c2, i2)) != -1) {
                bitSet.set(m0);
                i2 = m0 + 1;
            }
        }
        return bitSet;
    }

    public static boolean G1(long[] jArr, long[] jArr2) {
        if (h0(jArr) == h0(jArr2)) {
            return true;
        }
        return false;
    }

    public static String[] G2(String[] strArr) {
        if (n1(strArr)) {
            return u;
        }
        return strArr;
    }

    public static char[] G3(char[] cArr, char... cArr2) {
        if (!i1(cArr) && !i1(cArr2)) {
            HashMap hashMap = new HashMap(cArr2.length);
            for (char c2 : cArr2) {
                Character valueOf = Character.valueOf(c2);
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(valueOf);
                if (c5654cn1 == null) {
                    hashMap.put(valueOf, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i2 = 0; i2 < cArr.length; i2++) {
                char c3 = cArr[i2];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(Character.valueOf(c3));
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(Character.valueOf(c3));
                    }
                    bitSet.set(i2);
                }
            }
            return (char[]) T2(cArr, bitSet);
        }
        return M(cArr);
    }

    public static void G4(int[] iArr) {
        H4(iArr, new Random());
    }

    public static double[] G5(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return h;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = dArr[i2].doubleValue();
        }
        return dArr2;
    }

    public static long[] H(long[] jArr, long j2) {
        if (jArr == null) {
            return m(jArr, j2);
        }
        return c1(0, jArr, j2);
    }

    public static BitSet H0(double[] dArr, double d2) {
        return J0(dArr, d2, 0);
    }

    public static boolean H1(Object[] objArr, Object[] objArr2) {
        if (h0(objArr) == h0(objArr2)) {
            return true;
        }
        return false;
    }

    public static short[] H2(short[] sArr) {
        if (o1(sArr)) {
            return s;
        }
        return sArr;
    }

    public static double[] H3(double[] dArr, double... dArr2) {
        if (!j1(dArr) && !j1(dArr2)) {
            HashMap hashMap = new HashMap(dArr2.length);
            for (double d2 : dArr2) {
                Double valueOf = Double.valueOf(d2);
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(valueOf);
                if (c5654cn1 == null) {
                    hashMap.put(valueOf, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i2 = 0; i2 < dArr.length; i2++) {
                double d3 = dArr[i2];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(Double.valueOf(d3));
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(Double.valueOf(d3));
                    }
                    bitSet.set(i2);
                }
            }
            return (double[]) T2(dArr, bitSet);
        }
        return N(dArr);
    }

    public static void H4(int[] iArr, Random random) {
        for (int length = iArr.length; length > 1; length--) {
            i5(iArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static double[] H5(Double[] dArr, double d2) {
        double doubleValue;
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return h;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            Double d3 = dArr[i2];
            if (d3 == null) {
                doubleValue = d2;
            } else {
                doubleValue = d3.doubleValue();
            }
            dArr2[i2] = doubleValue;
        }
        return dArr2;
    }

    public static <T> T[] I(T[] tArr, T t2) {
        if (tArr == null) {
            return (T[]) o(tArr, t2);
        }
        return (T[]) d1(0, tArr, t2);
    }

    public static BitSet I0(double[] dArr, double d2, double d3) {
        return K0(dArr, d2, 0, d3);
    }

    public static boolean I1(short[] sArr, short[] sArr2) {
        if (h0(sArr) == h0(sArr2)) {
            return true;
        }
        return false;
    }

    public static boolean[] I2(boolean[] zArr) {
        if (p1(zArr)) {
            return a;
        }
        return zArr;
    }

    public static float[] I3(float[] fArr, float... fArr2) {
        if (!k1(fArr) && !k1(fArr2)) {
            HashMap hashMap = new HashMap(fArr2.length);
            for (float f2 : fArr2) {
                Float valueOf = Float.valueOf(f2);
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(valueOf);
                if (c5654cn1 == null) {
                    hashMap.put(valueOf, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i2 = 0; i2 < fArr.length; i2++) {
                float f3 = fArr[i2];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(Float.valueOf(f3));
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(Float.valueOf(f3));
                    }
                    bitSet.set(i2);
                }
            }
            return (float[]) T2(fArr, bitSet);
        }
        return O(fArr);
    }

    public static void I4(long[] jArr) {
        J4(jArr, new Random());
    }

    public static float[] I5(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return k;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = fArr[i2].floatValue();
        }
        return fArr2;
    }

    public static short[] J(short[] sArr, short s2) {
        if (sArr == null) {
            return q(sArr, s2);
        }
        return e1(0, sArr, s2);
    }

    public static BitSet J0(double[] dArr, double d2, int i2) {
        int p0;
        BitSet bitSet = new BitSet();
        if (dArr != null) {
            while (i2 < dArr.length && (p0 = p0(dArr, d2, i2)) != -1) {
                bitSet.set(p0);
                i2 = p0 + 1;
            }
        }
        return bitSet;
    }

    public static boolean J1(boolean[] zArr, boolean[] zArr2) {
        if (h0(zArr) == h0(zArr2)) {
            return true;
        }
        return false;
    }

    public static Object J2(Object obj, int i2) {
        int h0 = h0(obj);
        if (i2 >= 0 && i2 < h0) {
            int i3 = h0 - 1;
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i3);
            System.arraycopy(obj, 0, newInstance, 0, i2);
            if (i2 < i3) {
                System.arraycopy(obj, i2 + 1, newInstance, i2, (h0 - i2) - 1);
            }
            return newInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + h0);
    }

    public static int[] J3(int[] iArr, int... iArr2) {
        if (!l1(iArr) && !l1(iArr2)) {
            HashMap hashMap = new HashMap(iArr2.length);
            for (int i2 : iArr2) {
                Integer valueOf = Integer.valueOf(i2);
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(valueOf);
                if (c5654cn1 == null) {
                    hashMap.put(valueOf, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int i4 = iArr[i3];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(Integer.valueOf(i4));
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(Integer.valueOf(i4));
                    }
                    bitSet.set(i3);
                }
            }
            return (int[]) T2(iArr, bitSet);
        }
        return P(iArr);
    }

    public static void J4(long[] jArr, Random random) {
        for (int length = jArr.length; length > 1; length--) {
            k5(jArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static float[] J5(Float[] fArr, float f2) {
        float floatValue;
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return k;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            Float f3 = fArr[i2];
            if (f3 == null) {
                floatValue = f2;
            } else {
                floatValue = f3.floatValue();
            }
            fArr2[i2] = floatValue;
        }
        return fArr2;
    }

    public static boolean[] K(boolean[] zArr, boolean z) {
        if (zArr == null) {
            return s(zArr, z);
        }
        return f1(0, zArr, z);
    }

    public static BitSet K0(double[] dArr, double d2, int i2, double d3) {
        int q0;
        BitSet bitSet = new BitSet();
        if (dArr != null) {
            while (i2 < dArr.length && (q0 = q0(dArr, d2, i2, d3)) != -1) {
                bitSet.set(q0);
                i2 = q0 + 1;
            }
        }
        return bitSet;
    }

    public static boolean K1(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return obj.getClass().getName().equals(obj2.getClass().getName());
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static byte[] K2(byte[] bArr, int i2) {
        return (byte[]) J2(bArr, i2);
    }

    public static long[] K3(long[] jArr, long... jArr2) {
        if (!m1(jArr) && !m1(jArr2)) {
            HashMap hashMap = new HashMap(jArr2.length);
            for (long j2 : jArr2) {
                Long valueOf = Long.valueOf(j2);
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(valueOf);
                if (c5654cn1 == null) {
                    hashMap.put(valueOf, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                long j3 = jArr[i2];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(Long.valueOf(j3));
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(Long.valueOf(j3));
                    }
                    bitSet.set(i2);
                }
            }
            return (long[]) T2(jArr, bitSet);
        }
        return Q(jArr);
    }

    public static void K4(Object[] objArr) {
        L4(objArr, new Random());
    }

    public static int[] K5(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return m;
        }
        int[] iArr = new int[numArr.length];
        for (int i2 = 0; i2 < numArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public static byte[] L(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static BitSet L0(float[] fArr, float f2) {
        return M0(fArr, f2, 0);
    }

    public static boolean L1(byte[] bArr) {
        if (bArr != null && bArr.length >= 2) {
            byte b2 = bArr[0];
            int length = bArr.length;
            int i2 = 1;
            while (i2 < length) {
                byte b3 = bArr[i2];
                if (C3482Ks1.a(b2, b3) > 0) {
                    return false;
                }
                i2++;
                b2 = b3;
            }
        }
        return true;
    }

    public static char[] L2(char[] cArr, int i2) {
        return (char[]) J2(cArr, i2);
    }

    @SafeVarargs
    public static <T> T[] L3(T[] tArr, T... tArr2) {
        if (!n1(tArr) && !n1(tArr2)) {
            HashMap hashMap = new HashMap(tArr2.length);
            for (T t2 : tArr2) {
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(t2);
                if (c5654cn1 == null) {
                    hashMap.put(t2, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i2 = 0; i2 < tArr.length; i2++) {
                T t3 = tArr[i2];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(t3);
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(t3);
                    }
                    bitSet.set(i2);
                }
            }
            return (T[]) ((Object[]) T2(tArr, bitSet));
        }
        return (T[]) R(tArr);
    }

    public static void L4(Object[] objArr, Random random) {
        for (int length = objArr.length; length > 1; length--) {
            m5(objArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static int[] L5(Integer[] numArr, int i2) {
        int intValue;
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return m;
        }
        int[] iArr = new int[numArr.length];
        for (int i3 = 0; i3 < numArr.length; i3++) {
            Integer num = numArr[i3];
            if (num == null) {
                intValue = i2;
            } else {
                intValue = num.intValue();
            }
            iArr[i3] = intValue;
        }
        return iArr;
    }

    public static char[] M(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static BitSet M0(float[] fArr, float f2, int i2) {
        int s0;
        BitSet bitSet = new BitSet();
        if (fArr != null) {
            while (i2 < fArr.length && (s0 = s0(fArr, f2, i2)) != -1) {
                bitSet.set(s0);
                i2 = s0 + 1;
            }
        }
        return bitSet;
    }

    public static boolean M1(char[] cArr) {
        if (cArr != null && cArr.length >= 2) {
            char c2 = cArr[0];
            int length = cArr.length;
            int i2 = 1;
            while (i2 < length) {
                char c3 = cArr[i2];
                if (C8206nB.a(c2, c3) > 0) {
                    return false;
                }
                i2++;
                c2 = c3;
            }
        }
        return true;
    }

    public static double[] M2(double[] dArr, int i2) {
        return (double[]) J2(dArr, i2);
    }

    public static short[] M3(short[] sArr, short... sArr2) {
        if (!o1(sArr) && !o1(sArr2)) {
            HashMap hashMap = new HashMap(sArr2.length);
            for (short s2 : sArr2) {
                Short valueOf = Short.valueOf(s2);
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(valueOf);
                if (c5654cn1 == null) {
                    hashMap.put(valueOf, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i2 = 0; i2 < sArr.length; i2++) {
                short s3 = sArr[i2];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(Short.valueOf(s3));
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(Short.valueOf(s3));
                    }
                    bitSet.set(i2);
                }
            }
            return (short[]) T2(sArr, bitSet);
        }
        return S(sArr);
    }

    public static void M4(short[] sArr) {
        N4(sArr, new Random());
    }

    public static long[] M5(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f612o;
        }
        long[] jArr = new long[lArr.length];
        for (int i2 = 0; i2 < lArr.length; i2++) {
            jArr[i2] = lArr[i2].longValue();
        }
        return jArr;
    }

    public static double[] N(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return (double[]) dArr.clone();
    }

    public static BitSet N0(int[] iArr, int i2) {
        return O0(iArr, i2, 0);
    }

    public static boolean N1(double[] dArr) {
        if (dArr != null && dArr.length >= 2) {
            double d2 = dArr[0];
            int length = dArr.length;
            int i2 = 1;
            while (i2 < length) {
                double d3 = dArr[i2];
                if (Double.compare(d2, d3) > 0) {
                    return false;
                }
                i2++;
                d2 = d3;
            }
        }
        return true;
    }

    public static float[] N2(float[] fArr, int i2) {
        return (float[]) J2(fArr, i2);
    }

    public static boolean[] N3(boolean[] zArr, boolean... zArr2) {
        if (!p1(zArr) && !p1(zArr2)) {
            HashMap hashMap = new HashMap(2);
            for (boolean z : zArr2) {
                Boolean valueOf = Boolean.valueOf(z);
                C5654cn1 c5654cn1 = (C5654cn1) hashMap.get(valueOf);
                if (c5654cn1 == null) {
                    hashMap.put(valueOf, new C5654cn1(1));
                } else {
                    c5654cn1.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i2 = 0; i2 < zArr.length; i2++) {
                boolean z2 = zArr[i2];
                C5654cn1 c5654cn12 = (C5654cn1) hashMap.get(Boolean.valueOf(z2));
                if (c5654cn12 != null) {
                    if (c5654cn12.m() == 0) {
                        hashMap.remove(Boolean.valueOf(z2));
                    }
                    bitSet.set(i2);
                }
            }
            return (boolean[]) T2(zArr, bitSet);
        }
        return T(zArr);
    }

    public static void N4(short[] sArr, Random random) {
        for (int length = sArr.length; length > 1; length--) {
            o5(sArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static long[] N5(Long[] lArr, long j2) {
        long longValue;
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f612o;
        }
        long[] jArr = new long[lArr.length];
        for (int i2 = 0; i2 < lArr.length; i2++) {
            Long l2 = lArr[i2];
            if (l2 == null) {
                longValue = j2;
            } else {
                longValue = l2.longValue();
            }
            jArr[i2] = longValue;
        }
        return jArr;
    }

    public static float[] O(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    public static BitSet O0(int[] iArr, int i2, int i3) {
        int u0;
        BitSet bitSet = new BitSet();
        if (iArr != null) {
            while (i3 < iArr.length && (u0 = u0(iArr, i2, i3)) != -1) {
                bitSet.set(u0);
                i3 = u0 + 1;
            }
        }
        return bitSet;
    }

    public static boolean O1(float[] fArr) {
        if (fArr != null && fArr.length >= 2) {
            float f2 = fArr[0];
            int length = fArr.length;
            int i2 = 1;
            while (i2 < length) {
                float f3 = fArr[i2];
                if (Float.compare(f2, f3) > 0) {
                    return false;
                }
                i2++;
                f2 = f3;
            }
        }
        return true;
    }

    public static int[] O2(int[] iArr, int i2) {
        return (int[]) J2(iArr, i2);
    }

    public static void O3(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        P3(bArr, 0, bArr.length);
    }

    public static void O4(boolean[] zArr) {
        P4(zArr, new Random());
    }

    public static short[] O5(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return s;
        }
        short[] sArr = new short[shArr.length];
        for (int i2 = 0; i2 < shArr.length; i2++) {
            sArr[i2] = shArr[i2].shortValue();
        }
        return sArr;
    }

    public static int[] P(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static BitSet P0(long[] jArr, long j2) {
        return Q0(jArr, j2, 0);
    }

    public static boolean P1(int[] iArr) {
        if (iArr != null && iArr.length >= 2) {
            int i2 = iArr[0];
            int length = iArr.length;
            int i3 = 1;
            while (i3 < length) {
                int i4 = iArr[i3];
                if (C3482Ks1.b(i2, i4) > 0) {
                    return false;
                }
                i3++;
                i2 = i4;
            }
        }
        return true;
    }

    public static long[] P2(long[] jArr, int i2) {
        return (long[]) J2(jArr, i2);
    }

    public static void P3(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            int min = Math.min(bArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                byte b2 = bArr[min];
                bArr[min] = bArr[max];
                bArr[max] = b2;
                min--;
            }
        }
    }

    public static void P4(boolean[] zArr, Random random) {
        for (int length = zArr.length; length > 1; length--) {
            q5(zArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static short[] P5(Short[] shArr, short s2) {
        short shortValue;
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return s;
        }
        short[] sArr = new short[shArr.length];
        for (int i2 = 0; i2 < shArr.length; i2++) {
            Short sh = shArr[i2];
            if (sh == null) {
                shortValue = s2;
            } else {
                shortValue = sh.shortValue();
            }
            sArr[i2] = shortValue;
        }
        return sArr;
    }

    public static long[] Q(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static BitSet Q0(long[] jArr, long j2, int i2) {
        int w0;
        BitSet bitSet = new BitSet();
        if (jArr != null) {
            while (i2 < jArr.length && (w0 = w0(jArr, j2, i2)) != -1) {
                bitSet.set(w0);
                i2 = w0 + 1;
            }
        }
        return bitSet;
    }

    public static boolean Q1(long[] jArr) {
        if (jArr != null && jArr.length >= 2) {
            long j2 = jArr[0];
            int length = jArr.length;
            int i2 = 1;
            while (i2 < length) {
                long j3 = jArr[i2];
                if (C3482Ks1.c(j2, j3) > 0) {
                    return false;
                }
                i2++;
                j2 = j3;
            }
        }
        return true;
    }

    public static <T> T[] Q2(T[] tArr, int i2) {
        return (T[]) ((Object[]) J2(tArr, i2));
    }

    public static void Q3(char[] cArr) {
        if (cArr == null) {
            return;
        }
        R3(cArr, 0, cArr.length);
    }

    public static byte[] Q4(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > bArr.length) {
            i3 = bArr.length;
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return c;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i2, bArr2, 0, i4);
        return bArr2;
    }

    public static boolean[] Q5(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return a;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i2 = 0; i2 < boolArr.length; i2++) {
            zArr[i2] = boolArr[i2].booleanValue();
        }
        return zArr;
    }

    public static <T> T[] R(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    public static BitSet R0(Object[] objArr, Object obj) {
        return S0(objArr, obj, 0);
    }

    public static <T extends Comparable<? super T>> boolean R1(T[] tArr) {
        return S1(tArr, new Comparator() { // from class: o.Re
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        });
    }

    public static short[] R2(short[] sArr, int i2) {
        return (short[]) J2(sArr, i2);
    }

    public static void R3(char[] cArr, int i2, int i3) {
        if (cArr != null) {
            int min = Math.min(cArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                char c2 = cArr[min];
                cArr[min] = cArr[max];
                cArr[max] = c2;
                min--;
            }
        }
    }

    public static char[] R4(char[] cArr, int i2, int i3) {
        if (cArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > cArr.length) {
            i3 = cArr.length;
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return e;
        }
        char[] cArr2 = new char[i4];
        System.arraycopy(cArr, i2, cArr2, 0, i4);
        return cArr2;
    }

    public static boolean[] R5(Boolean[] boolArr, boolean z) {
        boolean booleanValue;
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return a;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i2 = 0; i2 < boolArr.length; i2++) {
            Boolean bool = boolArr[i2];
            if (bool == null) {
                booleanValue = z;
            } else {
                booleanValue = bool.booleanValue();
            }
            zArr[i2] = booleanValue;
        }
        return zArr;
    }

    public static short[] S(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static BitSet S0(Object[] objArr, Object obj, int i2) {
        int y0;
        BitSet bitSet = new BitSet();
        if (objArr != null) {
            while (i2 < objArr.length && (y0 = y0(objArr, obj, i2)) != -1) {
                bitSet.set(y0);
                i2 = y0 + 1;
            }
        }
        return bitSet;
    }

    public static <T> boolean S1(T[] tArr, Comparator<T> comparator) {
        if (comparator != null) {
            if (tArr != null && tArr.length >= 2) {
                T t2 = tArr[0];
                int length = tArr.length;
                int i2 = 1;
                while (i2 < length) {
                    T t3 = tArr[i2];
                    if (comparator.compare(t2, t3) > 0) {
                        return false;
                    }
                    i2++;
                    t2 = t3;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Comparator should not be null.");
    }

    public static boolean[] S2(boolean[] zArr, int i2) {
        return (boolean[]) J2(zArr, i2);
    }

    public static void S3(double[] dArr) {
        if (dArr == null) {
            return;
        }
        T3(dArr, 0, dArr.length);
    }

    public static double[] S4(double[] dArr, int i2, int i3) {
        if (dArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > dArr.length) {
            i3 = dArr.length;
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return h;
        }
        double[] dArr2 = new double[i4];
        System.arraycopy(dArr, i2, dArr2, 0, i4);
        return dArr2;
    }

    public static String S5(Object obj) {
        return T5(obj, "{}");
    }

    public static boolean[] T(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static BitSet T0(short[] sArr, short s2) {
        return U0(sArr, s2, 0);
    }

    public static boolean T1(short[] sArr) {
        if (sArr != null && sArr.length >= 2) {
            short s2 = sArr[0];
            int length = sArr.length;
            int i2 = 1;
            while (i2 < length) {
                short s3 = sArr[i2];
                if (C3482Ks1.d(s2, s3) > 0) {
                    return false;
                }
                i2++;
                s2 = s3;
            }
        }
        return true;
    }

    public static Object T2(Object obj, BitSet bitSet) {
        if (obj == null) {
            return null;
        }
        int h0 = h0(obj);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), h0 - bitSet.cardinality());
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i2);
            if (nextSetBit == -1) {
                break;
            }
            int i4 = nextSetBit - i2;
            if (i4 > 0) {
                System.arraycopy(obj, i2, newInstance, i3, i4);
                i3 += i4;
            }
            i2 = bitSet.nextClearBit(nextSetBit);
        }
        int i5 = h0 - i2;
        if (i5 > 0) {
            System.arraycopy(obj, i2, newInstance, i3, i5);
        }
        return newInstance;
    }

    public static void T3(double[] dArr, int i2, int i3) {
        if (dArr != null) {
            int min = Math.min(dArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                double d2 = dArr[min];
                dArr[min] = dArr[max];
                dArr[max] = d2;
                min--;
            }
        }
    }

    public static float[] T4(float[] fArr, int i2, int i3) {
        if (fArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > fArr.length) {
            i3 = fArr.length;
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return k;
        }
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, i4);
        return fArr2;
    }

    public static String T5(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return new C4056Qp2(obj, AbstractC4253Sp2.t1).g(obj).toString();
    }

    public static boolean U(byte[] bArr, byte b2) {
        if (j0(bArr, b2) != -1) {
            return true;
        }
        return false;
    }

    public static BitSet U0(short[] sArr, short s2, int i2) {
        int A0;
        BitSet bitSet = new BitSet();
        if (sArr != null) {
            while (i2 < sArr.length && (A0 = A0(sArr, s2, i2)) != -1) {
                bitSet.set(A0);
                i2 = A0 + 1;
            }
        }
        return bitSet;
    }

    public static boolean U1(boolean[] zArr) {
        if (zArr != null && zArr.length >= 2) {
            boolean z = zArr[0];
            int length = zArr.length;
            int i2 = 1;
            while (i2 < length) {
                boolean z2 = zArr[i2];
                if (C3855Oo.d(z, z2) > 0) {
                    return false;
                }
                i2++;
                z = z2;
            }
        }
        return true;
    }

    public static Object U2(Object obj, int... iArr) {
        int i2;
        int i3;
        int h0 = h0(obj);
        int[] e2 = C3619Me.e(P(iArr));
        if (v1(e2)) {
            int length = e2.length;
            int i4 = h0;
            i2 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i3 = e2[length];
                if (i3 < 0 || i3 >= h0) {
                    break;
                } else if (i3 < i4) {
                    i2++;
                    i4 = i3;
                }
            }
            throw new IndexOutOfBoundsException("Index: " + i3 + ", Length: " + h0);
        }
        i2 = 0;
        int i5 = h0 - i2;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i5);
        if (i2 < h0) {
            int length2 = e2.length - 1;
            while (length2 >= 0) {
                int i6 = e2[length2];
                int i7 = h0 - i6;
                if (i7 > 1) {
                    int i8 = i7 - 1;
                    i5 -= i8;
                    System.arraycopy(obj, i6 + 1, newInstance, i5, i8);
                }
                length2--;
                h0 = i6;
            }
            if (h0 > 0) {
                System.arraycopy(obj, 0, newInstance, 0, h0);
            }
        }
        return newInstance;
    }

    public static void U3(float[] fArr) {
        if (fArr == null) {
            return;
        }
        V3(fArr, 0, fArr.length);
    }

    public static int[] U4(int[] iArr, int i2, int i3) {
        if (iArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > iArr.length) {
            i3 = iArr.length;
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return m;
        }
        int[] iArr2 = new int[i4];
        System.arraycopy(iArr, i2, iArr2, 0, i4);
        return iArr2;
    }

    public static String[] U5(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return u;
        }
        String[] strArr = new String[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            strArr[i2] = objArr[i2].toString();
        }
        return strArr;
    }

    public static boolean V(char[] cArr, char c2) {
        if (l0(cArr, c2) != -1) {
            return true;
        }
        return false;
    }

    public static BitSet V0(boolean[] zArr, boolean z) {
        return W0(zArr, z, 0);
    }

    public static int V1(byte[] bArr, byte b2) {
        return W1(bArr, b2, Integer.MAX_VALUE);
    }

    public static byte[] V2(byte[] bArr, int... iArr) {
        return (byte[]) U2(bArr, iArr);
    }

    public static void V3(float[] fArr, int i2, int i3) {
        if (fArr != null) {
            int min = Math.min(fArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                float f2 = fArr[min];
                fArr[min] = fArr[max];
                fArr[max] = f2;
                min--;
            }
        }
    }

    public static long[] V4(long[] jArr, int i2, int i3) {
        if (jArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > jArr.length) {
            i3 = jArr.length;
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return f612o;
        }
        long[] jArr2 = new long[i4];
        System.arraycopy(jArr, i2, jArr2, 0, i4);
        return jArr2;
    }

    public static String[] V5(Object[] objArr, String str) {
        String obj;
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return u;
        }
        String[] strArr = new String[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                obj = str;
            } else {
                obj = obj2.toString();
            }
            strArr[i2] = obj;
        }
        return strArr;
    }

    public static boolean W(double[] dArr, double d2) {
        if (n0(dArr, d2) != -1) {
            return true;
        }
        return false;
    }

    public static BitSet W0(boolean[] zArr, boolean z, int i2) {
        int C0;
        BitSet bitSet = new BitSet();
        if (zArr != null) {
            while (i2 < zArr.length && (C0 = C0(zArr, z, i2)) != -1) {
                bitSet.set(C0);
                i2 = C0 + 1;
            }
        }
        return bitSet;
    }

    public static int W1(byte[] bArr, byte b2, int i2) {
        if (bArr == null || i2 < 0) {
            return -1;
        }
        if (i2 >= bArr.length) {
            i2 = bArr.length - 1;
        }
        while (i2 >= 0) {
            if (b2 == bArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static char[] W2(char[] cArr, int... iArr) {
        return (char[]) U2(cArr, iArr);
    }

    public static void W3(int[] iArr) {
        if (iArr == null) {
            return;
        }
        X3(iArr, 0, iArr.length);
    }

    public static <T> T[] W4(T[] tArr, int i2, int i3) {
        if (tArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > tArr.length) {
            i3 = tArr.length;
        }
        int i4 = i3 - i2;
        Class<?> componentType = tArr.getClass().getComponentType();
        if (i4 <= 0) {
            return (T[]) ((Object[]) Array.newInstance(componentType, 0));
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(componentType, i4));
        System.arraycopy(tArr, i2, tArr2, 0, i4);
        return tArr2;
    }

    public static boolean X(double[] dArr, double d2, double d3) {
        if (q0(dArr, d2, 0, d3) != -1) {
            return true;
        }
        return false;
    }

    public static byte[] X0(int i2, byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return null;
        }
        if (h1(bArr2)) {
            return L(bArr);
        }
        if (i2 >= 0 && i2 <= bArr.length) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, i2, bArr2.length);
            if (i2 > 0) {
                System.arraycopy(bArr, 0, bArr3, 0, i2);
            }
            if (i2 < bArr.length) {
                System.arraycopy(bArr, i2, bArr3, bArr2.length + i2, bArr.length - i2);
            }
            return bArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + bArr.length);
    }

    public static int X1(char[] cArr, char c2) {
        return Y1(cArr, c2, Integer.MAX_VALUE);
    }

    public static double[] X2(double[] dArr, int... iArr) {
        return (double[]) U2(dArr, iArr);
    }

    public static void X3(int[] iArr, int i2, int i3) {
        if (iArr != null) {
            int min = Math.min(iArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                int i4 = iArr[min];
                iArr[min] = iArr[max];
                iArr[max] = i4;
                min--;
            }
        }
    }

    public static short[] X4(short[] sArr, int i2, int i3) {
        if (sArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > sArr.length) {
            i3 = sArr.length;
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return s;
        }
        short[] sArr2 = new short[i4];
        System.arraycopy(sArr, i2, sArr2, 0, i4);
        return sArr2;
    }

    public static boolean Y(float[] fArr, float f2) {
        if (r0(fArr, f2) != -1) {
            return true;
        }
        return false;
    }

    public static char[] Y0(int i2, char[] cArr, char... cArr2) {
        if (cArr == null) {
            return null;
        }
        if (i1(cArr2)) {
            return M(cArr);
        }
        if (i2 >= 0 && i2 <= cArr.length) {
            char[] cArr3 = new char[cArr.length + cArr2.length];
            System.arraycopy(cArr2, 0, cArr3, i2, cArr2.length);
            if (i2 > 0) {
                System.arraycopy(cArr, 0, cArr3, 0, i2);
            }
            if (i2 < cArr.length) {
                System.arraycopy(cArr, i2, cArr3, cArr2.length + i2, cArr.length - i2);
            }
            return cArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + cArr.length);
    }

    public static int Y1(char[] cArr, char c2, int i2) {
        if (cArr == null || i2 < 0) {
            return -1;
        }
        if (i2 >= cArr.length) {
            i2 = cArr.length - 1;
        }
        while (i2 >= 0) {
            if (c2 == cArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static float[] Y2(float[] fArr, int... iArr) {
        return (float[]) U2(fArr, iArr);
    }

    public static void Y3(long[] jArr) {
        if (jArr == null) {
            return;
        }
        Z3(jArr, 0, jArr.length);
    }

    public static boolean[] Y4(boolean[] zArr, int i2, int i3) {
        if (zArr == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > zArr.length) {
            i3 = zArr.length;
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return a;
        }
        boolean[] zArr2 = new boolean[i4];
        System.arraycopy(zArr, i2, zArr2, 0, i4);
        return zArr2;
    }

    public static boolean Z(int[] iArr, int i2) {
        if (t0(iArr, i2) != -1) {
            return true;
        }
        return false;
    }

    public static double[] Z0(int i2, double[] dArr, double... dArr2) {
        if (dArr == null) {
            return null;
        }
        if (j1(dArr2)) {
            return N(dArr);
        }
        if (i2 >= 0 && i2 <= dArr.length) {
            double[] dArr3 = new double[dArr.length + dArr2.length];
            System.arraycopy(dArr2, 0, dArr3, i2, dArr2.length);
            if (i2 > 0) {
                System.arraycopy(dArr, 0, dArr3, 0, i2);
            }
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i2, dArr3, dArr2.length + i2, dArr.length - i2);
            }
            return dArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + dArr.length);
    }

    public static int Z1(double[] dArr, double d2) {
        return b2(dArr, d2, Integer.MAX_VALUE);
    }

    public static int[] Z2(int[] iArr, int... iArr2) {
        return (int[]) U2(iArr, iArr2);
    }

    public static void Z3(long[] jArr, int i2, int i3) {
        if (jArr != null) {
            int min = Math.min(jArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                long j2 = jArr[min];
                jArr[min] = jArr[max];
                jArr[max] = j2;
                min--;
            }
        }
    }

    public static void Z4(byte[] bArr, int i2, int i3) {
        if (h1(bArr)) {
            return;
        }
        a5(bArr, i2, i3, 1);
    }

    public static Object a(Object obj, int i2, Object obj2, Class<?> cls) {
        if (obj == null) {
            if (i2 == 0) {
                Object newInstance = Array.newInstance(cls, 1);
                Array.set(newInstance, 0, obj2);
                return newInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i2 <= length && i2 >= 0) {
            Object newInstance2 = Array.newInstance(cls, length + 1);
            System.arraycopy(obj, 0, newInstance2, 0, i2);
            Array.set(newInstance2, i2, obj2);
            if (i2 < length) {
                System.arraycopy(obj, i2, newInstance2, i2 + 1, length - i2);
            }
            return newInstance2;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + length);
    }

    public static boolean a0(long[] jArr, long j2) {
        if (v0(jArr, j2) != -1) {
            return true;
        }
        return false;
    }

    public static float[] a1(int i2, float[] fArr, float... fArr2) {
        if (fArr == null) {
            return null;
        }
        if (k1(fArr2)) {
            return O(fArr);
        }
        if (i2 >= 0 && i2 <= fArr.length) {
            float[] fArr3 = new float[fArr.length + fArr2.length];
            System.arraycopy(fArr2, 0, fArr3, i2, fArr2.length);
            if (i2 > 0) {
                System.arraycopy(fArr, 0, fArr3, 0, i2);
            }
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i2, fArr3, fArr2.length + i2, fArr.length - i2);
            }
            return fArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + fArr.length);
    }

    public static int a2(double[] dArr, double d2, double d3) {
        return c2(dArr, d2, Integer.MAX_VALUE, d3);
    }

    public static long[] a3(long[] jArr, int... iArr) {
        return (long[]) U2(jArr, iArr);
    }

    public static void a4(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        b4(objArr, 0, objArr.length);
    }

    public static void a5(byte[] bArr, int i2, int i3, int i4) {
        if (!h1(bArr) && i2 < bArr.length && i3 < bArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int min = Math.min(Math.min(i4, bArr.length - i2), bArr.length - i3);
            while (i5 < min) {
                byte b2 = bArr[i2];
                bArr[i2] = bArr[i3];
                bArr[i3] = b2;
                i5++;
                i2++;
                i3++;
            }
        }
    }

    public static byte[] b(byte[] bArr, byte b2) {
        byte[] bArr2 = (byte[]) e0(bArr, Byte.TYPE);
        bArr2[bArr2.length - 1] = b2;
        return bArr2;
    }

    public static boolean b0(Object[] objArr, Object obj) {
        if (x0(objArr, obj) != -1) {
            return true;
        }
        return false;
    }

    public static int[] b1(int i2, int[] iArr, int... iArr2) {
        if (iArr == null) {
            return null;
        }
        if (l1(iArr2)) {
            return P(iArr);
        }
        if (i2 >= 0 && i2 <= iArr.length) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, i2, iArr2.length);
            if (i2 > 0) {
                System.arraycopy(iArr, 0, iArr3, 0, i2);
            }
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i2, iArr3, iArr2.length + i2, iArr.length - i2);
            }
            return iArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + iArr.length);
    }

    public static int b2(double[] dArr, double d2, int i2) {
        if (j1(dArr) || i2 < 0) {
            return -1;
        }
        if (i2 >= dArr.length) {
            i2 = dArr.length - 1;
        }
        while (i2 >= 0) {
            if (d2 == dArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static <T> T[] b3(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) U2(tArr, iArr));
    }

    public static void b4(Object[] objArr, int i2, int i3) {
        if (objArr != null) {
            int min = Math.min(objArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                Object obj = objArr[min];
                objArr[min] = objArr[max];
                objArr[max] = obj;
                min--;
            }
        }
    }

    public static void b5(char[] cArr, int i2, int i3) {
        if (i1(cArr)) {
            return;
        }
        c5(cArr, i2, i3, 1);
    }

    @Deprecated
    public static byte[] c(byte[] bArr, int i2, byte b2) {
        return (byte[]) a(bArr, i2, Byte.valueOf(b2), Byte.TYPE);
    }

    public static boolean c0(short[] sArr, short s2) {
        if (z0(sArr, s2) != -1) {
            return true;
        }
        return false;
    }

    public static long[] c1(int i2, long[] jArr, long... jArr2) {
        if (jArr == null) {
            return null;
        }
        if (m1(jArr2)) {
            return Q(jArr);
        }
        if (i2 >= 0 && i2 <= jArr.length) {
            long[] jArr3 = new long[jArr.length + jArr2.length];
            System.arraycopy(jArr2, 0, jArr3, i2, jArr2.length);
            if (i2 > 0) {
                System.arraycopy(jArr, 0, jArr3, 0, i2);
            }
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i2, jArr3, jArr2.length + i2, jArr.length - i2);
            }
            return jArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + jArr.length);
    }

    public static int c2(double[] dArr, double d2, int i2, double d3) {
        if (j1(dArr) || i2 < 0) {
            return -1;
        }
        if (i2 >= dArr.length) {
            i2 = dArr.length - 1;
        }
        double d4 = d2 - d3;
        double d5 = d2 + d3;
        while (i2 >= 0) {
            double d6 = dArr[i2];
            if (d6 >= d4 && d6 <= d5) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static short[] c3(short[] sArr, int... iArr) {
        return (short[]) U2(sArr, iArr);
    }

    public static void c4(short[] sArr) {
        if (sArr == null) {
            return;
        }
        d4(sArr, 0, sArr.length);
    }

    public static void c5(char[] cArr, int i2, int i3, int i4) {
        if (!i1(cArr) && i2 < cArr.length && i3 < cArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int min = Math.min(Math.min(i4, cArr.length - i2), cArr.length - i3);
            while (i5 < min) {
                char c2 = cArr[i2];
                cArr[i2] = cArr[i3];
                cArr[i3] = c2;
                i5++;
                i2++;
                i3++;
            }
        }
    }

    public static char[] d(char[] cArr, char c2) {
        char[] cArr2 = (char[]) e0(cArr, Character.TYPE);
        cArr2[cArr2.length - 1] = c2;
        return cArr2;
    }

    public static boolean d0(boolean[] zArr, boolean z) {
        if (B0(zArr, z) != -1) {
            return true;
        }
        return false;
    }

    @SafeVarargs
    public static <T> T[] d1(int i2, T[] tArr, T... tArr2) {
        if (tArr == null) {
            return null;
        }
        if (n1(tArr2)) {
            return (T[]) R(tArr);
        }
        if (i2 >= 0 && i2 <= tArr.length) {
            T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
            System.arraycopy(tArr2, 0, tArr3, i2, tArr2.length);
            if (i2 > 0) {
                System.arraycopy(tArr, 0, tArr3, 0, i2);
            }
            if (i2 < tArr.length) {
                System.arraycopy(tArr, i2, tArr3, tArr2.length + i2, tArr.length - i2);
            }
            return tArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + tArr.length);
    }

    public static int d2(float[] fArr, float f2) {
        return e2(fArr, f2, Integer.MAX_VALUE);
    }

    public static boolean[] d3(boolean[] zArr, int... iArr) {
        return (boolean[]) U2(zArr, iArr);
    }

    public static void d4(short[] sArr, int i2, int i3) {
        if (sArr != null) {
            int min = Math.min(sArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                short s2 = sArr[min];
                sArr[min] = sArr[max];
                sArr[max] = s2;
                min--;
            }
        }
    }

    public static void d5(double[] dArr, int i2, int i3) {
        if (j1(dArr)) {
            return;
        }
        e5(dArr, i2, i3, 1);
    }

    @Deprecated
    public static char[] e(char[] cArr, int i2, char c2) {
        return (char[]) a(cArr, i2, Character.valueOf(c2), Character.TYPE);
    }

    public static Object e0(Object obj, Class<?> cls) {
        if (obj != null) {
            int length = Array.getLength(obj);
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, newInstance, 0, length);
            return newInstance;
        }
        return Array.newInstance(cls, 1);
    }

    public static short[] e1(int i2, short[] sArr, short... sArr2) {
        if (sArr == null) {
            return null;
        }
        if (o1(sArr2)) {
            return S(sArr);
        }
        if (i2 >= 0 && i2 <= sArr.length) {
            short[] sArr3 = new short[sArr.length + sArr2.length];
            System.arraycopy(sArr2, 0, sArr3, i2, sArr2.length);
            if (i2 > 0) {
                System.arraycopy(sArr, 0, sArr3, 0, i2);
            }
            if (i2 < sArr.length) {
                System.arraycopy(sArr, i2, sArr3, sArr2.length + i2, sArr.length - i2);
            }
            return sArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + sArr.length);
    }

    public static int e2(float[] fArr, float f2, int i2) {
        if (k1(fArr) || i2 < 0) {
            return -1;
        }
        if (i2 >= fArr.length) {
            i2 = fArr.length - 1;
        }
        while (i2 >= 0) {
            if (f2 == fArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    @Deprecated
    public static byte[] e3(byte[] bArr, byte b2) {
        return (byte[]) T2(bArr, D0(bArr, b2));
    }

    public static void e4(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        f4(zArr, 0, zArr.length);
    }

    public static void e5(double[] dArr, int i2, int i3, int i4) {
        if (!j1(dArr) && i2 < dArr.length && i3 < dArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int min = Math.min(Math.min(i4, dArr.length - i2), dArr.length - i3);
            while (i5 < min) {
                double d2 = dArr[i2];
                dArr[i2] = dArr[i3];
                dArr[i3] = d2;
                i5++;
                i2++;
                i3++;
            }
        }
    }

    public static double[] f(double[] dArr, double d2) {
        double[] dArr2 = (double[]) e0(dArr, Double.TYPE);
        dArr2[dArr2.length - 1] = d2;
        return dArr2;
    }

    public static <T> T f0(T[] tArr, int i2) {
        return (T) g0(tArr, i2, null);
    }

    public static boolean[] f1(int i2, boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return null;
        }
        if (p1(zArr2)) {
            return T(zArr);
        }
        if (i2 >= 0 && i2 <= zArr.length) {
            boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
            System.arraycopy(zArr2, 0, zArr3, i2, zArr2.length);
            if (i2 > 0) {
                System.arraycopy(zArr, 0, zArr3, 0, i2);
            }
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i2, zArr3, zArr2.length + i2, zArr.length - i2);
            }
            return zArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + zArr.length);
    }

    public static int f2(int[] iArr, int i2) {
        return g2(iArr, i2, Integer.MAX_VALUE);
    }

    @Deprecated
    public static char[] f3(char[] cArr, char c2) {
        return (char[]) T2(cArr, F0(cArr, c2));
    }

    public static void f4(boolean[] zArr, int i2, int i3) {
        if (zArr != null) {
            int min = Math.min(zArr.length, i3) - 1;
            for (int max = Math.max(i2, 0); min > max; max++) {
                boolean z = zArr[min];
                zArr[min] = zArr[max];
                zArr[max] = z;
                min--;
            }
        }
    }

    public static void f5(float[] fArr, int i2, int i3) {
        if (k1(fArr)) {
            return;
        }
        g5(fArr, i2, i3, 1);
    }

    @Deprecated
    public static double[] g(double[] dArr, int i2, double d2) {
        return (double[]) a(dArr, i2, Double.valueOf(d2), Double.TYPE);
    }

    public static <T> T g0(T[] tArr, int i2, T t2) {
        if (g1(tArr, i2)) {
            return tArr[i2];
        }
        return t2;
    }

    public static <T> boolean g1(T[] tArr, int i2) {
        if (i2 >= 0 && h0(tArr) > i2) {
            return true;
        }
        return false;
    }

    public static int g2(int[] iArr, int i2, int i3) {
        if (iArr == null || i3 < 0) {
            return -1;
        }
        if (i3 >= iArr.length) {
            i3 = iArr.length - 1;
        }
        while (i3 >= 0) {
            if (i2 == iArr[i3]) {
                return i3;
            }
            i3--;
        }
        return -1;
    }

    @Deprecated
    public static double[] g3(double[] dArr, double d2) {
        return (double[]) T2(dArr, H0(dArr, d2));
    }

    public static void g4(byte[] bArr, int i2) {
        if (bArr == null) {
            return;
        }
        h4(bArr, 0, bArr.length, i2);
    }

    public static void g5(float[] fArr, int i2, int i3, int i4) {
        if (!k1(fArr) && i2 < fArr.length && i3 < fArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int min = Math.min(Math.min(i4, fArr.length - i2), fArr.length - i3);
            while (i5 < min) {
                float f2 = fArr[i2];
                fArr[i2] = fArr[i3];
                fArr[i3] = f2;
                i5++;
                i2++;
                i3++;
            }
        }
    }

    public static float[] h(float[] fArr, float f2) {
        float[] fArr2 = (float[]) e0(fArr, Float.TYPE);
        fArr2[fArr2.length - 1] = f2;
        return fArr2;
    }

    public static int h0(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static boolean h1(byte[] bArr) {
        if (h0(bArr) == 0) {
            return true;
        }
        return false;
    }

    public static int h2(long[] jArr, long j2) {
        return i2(jArr, j2, Integer.MAX_VALUE);
    }

    @Deprecated
    public static float[] h3(float[] fArr, float f2) {
        return (float[]) T2(fArr, L0(fArr, f2));
    }

    public static void h4(byte[] bArr, int i2, int i3, int i4) {
        if (bArr != null && i2 < bArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= bArr.length) {
                i3 = bArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        a5(bArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        a5(bArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        a5(bArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static void h5(int[] iArr, int i2, int i3) {
        if (l1(iArr)) {
            return;
        }
        i5(iArr, i2, i3, 1);
    }

    @Deprecated
    public static float[] i(float[] fArr, int i2, float f2) {
        return (float[]) a(fArr, i2, Float.valueOf(f2), Float.TYPE);
    }

    public static int i0(Object obj) {
        return new C8714pG0().g(obj).F();
    }

    public static boolean i1(char[] cArr) {
        if (h0(cArr) == 0) {
            return true;
        }
        return false;
    }

    public static int i2(long[] jArr, long j2, int i2) {
        if (jArr == null || i2 < 0) {
            return -1;
        }
        if (i2 >= jArr.length) {
            i2 = jArr.length - 1;
        }
        while (i2 >= 0) {
            if (j2 == jArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    @Deprecated
    public static int[] i3(int[] iArr, int i2) {
        return (int[]) T2(iArr, N0(iArr, i2));
    }

    public static void i4(char[] cArr, int i2) {
        if (cArr == null) {
            return;
        }
        j4(cArr, 0, cArr.length, i2);
    }

    public static void i5(int[] iArr, int i2, int i3, int i4) {
        if (!l1(iArr) && i2 < iArr.length && i3 < iArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int min = Math.min(Math.min(i4, iArr.length - i2), iArr.length - i3);
            while (i5 < min) {
                int i6 = iArr[i2];
                iArr[i2] = iArr[i3];
                iArr[i3] = i6;
                i5++;
                i2++;
                i3++;
            }
        }
    }

    public static int[] j(int[] iArr, int i2) {
        int[] iArr2 = (int[]) e0(iArr, Integer.TYPE);
        iArr2[iArr2.length - 1] = i2;
        return iArr2;
    }

    public static int j0(byte[] bArr, byte b2) {
        return k0(bArr, b2, 0);
    }

    public static boolean j1(double[] dArr) {
        if (h0(dArr) == 0) {
            return true;
        }
        return false;
    }

    public static int j2(Object[] objArr, Object obj) {
        return k2(objArr, obj, Integer.MAX_VALUE);
    }

    @Deprecated
    public static long[] j3(long[] jArr, long j2) {
        return (long[]) T2(jArr, P0(jArr, j2));
    }

    public static void j4(char[] cArr, int i2, int i3, int i4) {
        if (cArr != null && i2 < cArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= cArr.length) {
                i3 = cArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        c5(cArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        c5(cArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        c5(cArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static void j5(long[] jArr, int i2, int i3) {
        if (m1(jArr)) {
            return;
        }
        k5(jArr, i2, i3, 1);
    }

    @Deprecated
    public static int[] k(int[] iArr, int i2, int i3) {
        return (int[]) a(iArr, i2, Integer.valueOf(i3), Integer.TYPE);
    }

    public static int k0(byte[] bArr, byte b2, int i2) {
        if (bArr == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < bArr.length) {
            if (b2 == bArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static boolean k1(float[] fArr) {
        if (h0(fArr) == 0) {
            return true;
        }
        return false;
    }

    public static int k2(Object[] objArr, Object obj, int i2) {
        if (objArr == null || i2 < 0) {
            return -1;
        }
        if (i2 >= objArr.length) {
            i2 = objArr.length - 1;
        }
        if (obj == null) {
            while (i2 >= 0) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2--;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i2 >= 0) {
                if (obj.equals(objArr[i2])) {
                    return i2;
                }
                i2--;
            }
        }
        return -1;
    }

    @Deprecated
    public static <T> T[] k3(T[] tArr, T t2) {
        return (T[]) ((Object[]) T2(tArr, R0(tArr, t2)));
    }

    public static void k4(double[] dArr, int i2) {
        if (dArr == null) {
            return;
        }
        l4(dArr, 0, dArr.length, i2);
    }

    public static void k5(long[] jArr, int i2, int i3, int i4) {
        if (!m1(jArr) && i2 < jArr.length && i3 < jArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int min = Math.min(Math.min(i4, jArr.length - i2), jArr.length - i3);
            while (i5 < min) {
                long j2 = jArr[i2];
                jArr[i2] = jArr[i3];
                jArr[i3] = j2;
                i5++;
                i2++;
                i3++;
            }
        }
    }

    @Deprecated
    public static long[] l(long[] jArr, int i2, long j2) {
        return (long[]) a(jArr, i2, Long.valueOf(j2), Long.TYPE);
    }

    public static int l0(char[] cArr, char c2) {
        return m0(cArr, c2, 0);
    }

    public static boolean l1(int[] iArr) {
        if (h0(iArr) == 0) {
            return true;
        }
        return false;
    }

    public static int l2(short[] sArr, short s2) {
        return m2(sArr, s2, Integer.MAX_VALUE);
    }

    @Deprecated
    public static short[] l3(short[] sArr, short s2) {
        return (short[]) T2(sArr, T0(sArr, s2));
    }

    public static void l4(double[] dArr, int i2, int i3, int i4) {
        if (dArr != null && i2 < dArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= dArr.length) {
                i3 = dArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        e5(dArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        e5(dArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        e5(dArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static void l5(Object[] objArr, int i2, int i3) {
        if (n1(objArr)) {
            return;
        }
        m5(objArr, i2, i3, 1);
    }

    public static long[] m(long[] jArr, long j2) {
        long[] jArr2 = (long[]) e0(jArr, Long.TYPE);
        jArr2[jArr2.length - 1] = j2;
        return jArr2;
    }

    public static int m0(char[] cArr, char c2, int i2) {
        if (cArr == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < cArr.length) {
            if (c2 == cArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static boolean m1(long[] jArr) {
        if (h0(jArr) == 0) {
            return true;
        }
        return false;
    }

    public static int m2(short[] sArr, short s2, int i2) {
        if (sArr == null || i2 < 0) {
            return -1;
        }
        if (i2 >= sArr.length) {
            i2 = sArr.length - 1;
        }
        while (i2 >= 0) {
            if (s2 == sArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    @Deprecated
    public static boolean[] m3(boolean[] zArr, boolean z) {
        return (boolean[]) T2(zArr, V0(zArr, z));
    }

    public static void m4(float[] fArr, int i2) {
        if (fArr == null) {
            return;
        }
        n4(fArr, 0, fArr.length, i2);
    }

    public static void m5(Object[] objArr, int i2, int i3, int i4) {
        if (!n1(objArr) && i2 < objArr.length && i3 < objArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int min = Math.min(Math.min(i4, objArr.length - i2), objArr.length - i3);
            while (i5 < min) {
                Object obj = objArr[i2];
                objArr[i2] = objArr[i3];
                objArr[i3] = obj;
                i5++;
                i2++;
                i3++;
            }
        }
    }

    @Deprecated
    public static <T> T[] n(T[] tArr, int i2, T t2) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else if (t2 != null) {
            cls = t2.getClass();
        } else {
            throw new IllegalArgumentException("Array and element cannot both be null");
        }
        return (T[]) ((Object[]) a(tArr, i2, t2, cls));
    }

    public static int n0(double[] dArr, double d2) {
        return p0(dArr, d2, 0);
    }

    public static boolean n1(Object[] objArr) {
        if (h0(objArr) == 0) {
            return true;
        }
        return false;
    }

    public static int n2(boolean[] zArr, boolean z) {
        return o2(zArr, z, Integer.MAX_VALUE);
    }

    public static byte[] n3(byte[] bArr, byte b2) {
        return (byte[]) T2(bArr, D0(bArr, b2));
    }

    public static void n4(float[] fArr, int i2, int i3, int i4) {
        if (fArr != null && i2 < fArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= fArr.length) {
                i3 = fArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        g5(fArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        g5(fArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        g5(fArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static void n5(short[] sArr, int i2, int i3) {
        if (o1(sArr)) {
            return;
        }
        o5(sArr, i2, i3, 1);
    }

    public static <T> T[] o(T[] tArr, T t2) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else if (t2 != null) {
            cls = t2.getClass();
        } else {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }
        T[] tArr2 = (T[]) ((Object[]) e0(tArr, cls));
        tArr2[tArr2.length - 1] = t2;
        return tArr2;
    }

    public static int o0(double[] dArr, double d2, double d3) {
        return q0(dArr, d2, 0, d3);
    }

    public static boolean o1(short[] sArr) {
        if (h0(sArr) == 0) {
            return true;
        }
        return false;
    }

    public static int o2(boolean[] zArr, boolean z, int i2) {
        if (p1(zArr) || i2 < 0) {
            return -1;
        }
        if (i2 >= zArr.length) {
            i2 = zArr.length - 1;
        }
        while (i2 >= 0) {
            if (z == zArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static char[] o3(char[] cArr, char c2) {
        return (char[]) T2(cArr, F0(cArr, c2));
    }

    public static void o4(int[] iArr, int i2) {
        if (iArr == null) {
            return;
        }
        p4(iArr, 0, iArr.length, i2);
    }

    public static void o5(short[] sArr, int i2, int i3, int i4) {
        if (!o1(sArr) && i2 < sArr.length && i3 < sArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (i2 != i3) {
                int min = Math.min(Math.min(i4, sArr.length - i2), sArr.length - i3);
                while (i5 < min) {
                    short s2 = sArr[i2];
                    sArr[i2] = sArr[i3];
                    sArr[i3] = s2;
                    i5++;
                    i2++;
                    i3++;
                }
            }
        }
    }

    @Deprecated
    public static short[] p(short[] sArr, int i2, short s2) {
        return (short[]) a(sArr, i2, Short.valueOf(s2), Short.TYPE);
    }

    public static int p0(double[] dArr, double d2, int i2) {
        if (j1(dArr)) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        boolean isNaN = Double.isNaN(d2);
        while (i2 < dArr.length) {
            double d3 = dArr[i2];
            if (d2 != d3 && (!isNaN || !Double.isNaN(d3))) {
                i2++;
            } else {
                return i2;
            }
        }
        return -1;
    }

    public static boolean p1(boolean[] zArr) {
        if (h0(zArr) == 0) {
            return true;
        }
        return false;
    }

    public static byte[] p2(byte[] bArr) {
        if (h1(bArr)) {
            return c;
        }
        return bArr;
    }

    public static double[] p3(double[] dArr, double d2) {
        return (double[]) T2(dArr, H0(dArr, d2));
    }

    public static void p4(int[] iArr, int i2, int i3, int i4) {
        if (iArr != null && i2 < iArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= iArr.length) {
                i3 = iArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        i5(iArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        i5(iArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        i5(iArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static void p5(boolean[] zArr, int i2, int i3) {
        if (p1(zArr)) {
            return;
        }
        q5(zArr, i2, i3, 1);
    }

    public static short[] q(short[] sArr, short s2) {
        short[] sArr2 = (short[]) e0(sArr, Short.TYPE);
        sArr2[sArr2.length - 1] = s2;
        return sArr2;
    }

    public static int q0(double[] dArr, double d2, int i2, double d3) {
        if (j1(dArr)) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        double d4 = d2 - d3;
        double d5 = d2 + d3;
        while (i2 < dArr.length) {
            double d6 = dArr[i2];
            if (d6 >= d4 && d6 <= d5) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Deprecated
    public static boolean q1(Object obj, Object obj2) {
        return new C5860de0().g(obj, obj2).x();
    }

    public static char[] q2(char[] cArr) {
        if (i1(cArr)) {
            return e;
        }
        return cArr;
    }

    public static float[] q3(float[] fArr, float f2) {
        return (float[]) T2(fArr, L0(fArr, f2));
    }

    public static void q4(long[] jArr, int i2) {
        if (jArr == null) {
            return;
        }
        r4(jArr, 0, jArr.length, i2);
    }

    public static void q5(boolean[] zArr, int i2, int i3, int i4) {
        if (!p1(zArr) && i2 < zArr.length && i3 < zArr.length) {
            int i5 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int min = Math.min(Math.min(i4, zArr.length - i2), zArr.length - i3);
            while (i5 < min) {
                boolean z = zArr[i2];
                zArr[i2] = zArr[i3];
                zArr[i3] = z;
                i5++;
                i2++;
                i3++;
            }
        }
    }

    @Deprecated
    public static boolean[] r(boolean[] zArr, int i2, boolean z) {
        return (boolean[]) a(zArr, i2, Boolean.valueOf(z), Boolean.TYPE);
    }

    public static int r0(float[] fArr, float f2) {
        return s0(fArr, f2, 0);
    }

    public static boolean r1(byte[] bArr) {
        return !h1(bArr);
    }

    public static double[] r2(double[] dArr) {
        if (j1(dArr)) {
            return h;
        }
        return dArr;
    }

    public static int[] r3(int[] iArr, int i2) {
        return (int[]) T2(iArr, N0(iArr, i2));
    }

    public static void r4(long[] jArr, int i2, int i3, int i4) {
        if (jArr != null && i2 < jArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= jArr.length) {
                i3 = jArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        k5(jArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        k5(jArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        k5(jArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static boolean[] s(boolean[] zArr, boolean z) {
        boolean[] zArr2 = (boolean[]) e0(zArr, Boolean.TYPE);
        zArr2[zArr2.length - 1] = z;
        return zArr2;
    }

    public static int s0(float[] fArr, float f2, int i2) {
        if (k1(fArr)) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        boolean isNaN = Float.isNaN(f2);
        while (i2 < fArr.length) {
            float f3 = fArr[i2];
            if (f2 != f3 && (!isNaN || !Float.isNaN(f3))) {
                i2++;
            } else {
                return i2;
            }
        }
        return -1;
    }

    public static boolean s1(char[] cArr) {
        return !i1(cArr);
    }

    public static float[] s2(float[] fArr) {
        if (k1(fArr)) {
            return k;
        }
        return fArr;
    }

    public static long[] s3(long[] jArr, long j2) {
        return (long[]) T2(jArr, P0(jArr, j2));
    }

    public static void s4(Object[] objArr, int i2) {
        if (objArr == null) {
            return;
        }
        t4(objArr, 0, objArr.length, i2);
    }

    public static Map<Object, Object> s5(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap((int) (objArr.length * 1.5d));
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                hashMap.put(entry.getKey(), entry.getValue());
            } else if (obj instanceof Object[]) {
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length >= 2) {
                    hashMap.put(objArr2[0], objArr2[1]);
                } else {
                    throw new IllegalArgumentException("Array element " + i2 + ", '" + obj + "', has a length less than 2");
                }
            } else {
                throw new IllegalArgumentException("Array element " + i2 + ", '" + obj + "', is neither of type Map.Entry nor an Array");
            }
        }
        return hashMap;
    }

    public static byte[] t(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return L(bArr2);
        }
        if (bArr2 == null) {
            return L(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int t0(int[] iArr, int i2) {
        return u0(iArr, i2, 0);
    }

    public static boolean t1(double[] dArr) {
        return !j1(dArr);
    }

    public static int[] t2(int[] iArr) {
        if (l1(iArr)) {
            return m;
        }
        return iArr;
    }

    public static <T> T[] t3(T[] tArr, T t2) {
        return (T[]) ((Object[]) T2(tArr, R0(tArr, t2)));
    }

    public static void t4(Object[] objArr, int i2, int i3, int i4) {
        if (objArr != null && i2 < objArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= objArr.length) {
                i3 = objArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        m5(objArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        m5(objArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        m5(objArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static Boolean[] t5(boolean[] zArr) {
        Boolean bool;
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return b;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            boolArr[i2] = bool;
        }
        return boolArr;
    }

    public static char[] u(char[] cArr, char... cArr2) {
        if (cArr == null) {
            return M(cArr2);
        }
        if (cArr2 == null) {
            return M(cArr);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    public static int u0(int[] iArr, int i2, int i3) {
        if (iArr == null) {
            return -1;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < iArr.length) {
            if (i2 == iArr[i3]) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static boolean u1(float[] fArr) {
        return !k1(fArr);
    }

    public static long[] u2(long[] jArr) {
        if (m1(jArr)) {
            return f612o;
        }
        return jArr;
    }

    public static short[] u3(short[] sArr, short s2) {
        return (short[]) T2(sArr, T0(sArr, s2));
    }

    public static void u4(short[] sArr, int i2) {
        if (sArr == null) {
            return;
        }
        v4(sArr, 0, sArr.length, i2);
    }

    public static Byte[] u5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return d;
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = Byte.valueOf(bArr[i2]);
        }
        return bArr2;
    }

    public static double[] v(double[] dArr, double... dArr2) {
        if (dArr == null) {
            return N(dArr2);
        }
        if (dArr2 == null) {
            return N(dArr);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }

    public static int v0(long[] jArr, long j2) {
        return w0(jArr, j2, 0);
    }

    public static boolean v1(int[] iArr) {
        return !l1(iArr);
    }

    public static Boolean[] v2(Boolean[] boolArr) {
        if (n1(boolArr)) {
            return b;
        }
        return boolArr;
    }

    public static boolean[] v3(boolean[] zArr, boolean z) {
        return (boolean[]) T2(zArr, V0(zArr, z));
    }

    public static void v4(short[] sArr, int i2, int i3, int i4) {
        if (sArr != null && i2 < sArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= sArr.length) {
                i3 = sArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        o5(sArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        o5(sArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        o5(sArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static Character[] v5(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return f;
        }
        Character[] chArr = new Character[cArr.length];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            chArr[i2] = Character.valueOf(cArr[i2]);
        }
        return chArr;
    }

    public static float[] w(float[] fArr, float... fArr2) {
        if (fArr == null) {
            return O(fArr2);
        }
        if (fArr2 == null) {
            return O(fArr);
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    public static int w0(long[] jArr, long j2, int i2) {
        if (jArr == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < jArr.length) {
            if (j2 == jArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static boolean w1(long[] jArr) {
        return !m1(jArr);
    }

    public static Byte[] w2(Byte[] bArr) {
        if (n1(bArr)) {
            return d;
        }
        return bArr;
    }

    public static byte[] w3(byte[] bArr, byte b2) {
        int j0 = j0(bArr, b2);
        if (j0 == -1) {
            return L(bArr);
        }
        return K2(bArr, j0);
    }

    public static void w4(boolean[] zArr, int i2) {
        if (zArr == null) {
            return;
        }
        x4(zArr, 0, zArr.length, i2);
    }

    public static Double[] w5(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return i;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }

    public static int[] x(int[] iArr, int... iArr2) {
        if (iArr == null) {
            return P(iArr2);
        }
        if (iArr2 == null) {
            return P(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static int x0(Object[] objArr, Object obj) {
        return y0(objArr, obj, 0);
    }

    public static <T> boolean x1(T[] tArr) {
        return !n1(tArr);
    }

    public static Character[] x2(Character[] chArr) {
        if (n1(chArr)) {
            return f;
        }
        return chArr;
    }

    public static char[] x3(char[] cArr, char c2) {
        int l0 = l0(cArr, c2);
        if (l0 == -1) {
            return M(cArr);
        }
        return L2(cArr, l0);
    }

    public static void x4(boolean[] zArr, int i2, int i3, int i4) {
        if (zArr != null && i2 < zArr.length - 1 && i3 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= zArr.length) {
                i3 = zArr.length;
            }
            int i5 = i3 - i2;
            if (i5 > 1) {
                int i6 = i4 % i5;
                if (i6 < 0) {
                    i6 += i5;
                }
                while (i5 > 1 && i6 > 0) {
                    int i7 = i5 - i6;
                    if (i6 > i7) {
                        q5(zArr, i2, (i5 + i2) - i7, i7);
                        int i8 = i6;
                        i6 -= i7;
                        i5 = i8;
                    } else if (i6 < i7) {
                        q5(zArr, i2, i2 + i7, i6);
                        i2 += i6;
                        i5 = i7;
                    } else {
                        q5(zArr, i2, i7 + i2, i6);
                        return;
                    }
                }
            }
        }
    }

    public static Float[] x5(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return l;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    public static long[] y(long[] jArr, long... jArr2) {
        if (jArr == null) {
            return Q(jArr2);
        }
        if (jArr2 == null) {
            return Q(jArr);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static int y0(Object[] objArr, Object obj, int i2) {
        if (objArr == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (obj == null) {
            while (i2 < objArr.length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
        } else {
            while (i2 < objArr.length) {
                if (obj.equals(objArr[i2])) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public static boolean y1(short[] sArr) {
        return !o1(sArr);
    }

    public static Class<?>[] y2(Class<?>[] clsArr) {
        if (n1(clsArr)) {
            return g;
        }
        return clsArr;
    }

    public static double[] y3(double[] dArr, double d2) {
        int n0 = n0(dArr, d2);
        if (n0 == -1) {
            return N(dArr);
        }
        return M2(dArr, n0);
    }

    public static void y4(byte[] bArr) {
        z4(bArr, new Random());
    }

    public static Integer[] y5(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return n;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    public static <T> T[] z(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return (T[]) R(tArr2);
        }
        if (tArr2 == null) {
            return (T[]) R(tArr);
        }
        Class<?> componentType = tArr.getClass().getComponentType();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(componentType, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e2) {
            Class<?> componentType2 = tArr2.getClass().getComponentType();
            if (!componentType.isAssignableFrom(componentType2)) {
                throw new IllegalArgumentException("Cannot store " + componentType2.getName() + " in an array of " + componentType.getName(), e2);
            }
            throw e2;
        }
    }

    public static int z0(short[] sArr, short s2) {
        return A0(sArr, s2, 0);
    }

    public static boolean z1(boolean[] zArr) {
        return !p1(zArr);
    }

    public static Double[] z2(Double[] dArr) {
        if (n1(dArr)) {
            return i;
        }
        return dArr;
    }

    public static float[] z3(float[] fArr, float f2) {
        int r0 = r0(fArr, f2);
        if (r0 == -1) {
            return O(fArr);
        }
        return N2(fArr, r0);
    }

    public static void z4(byte[] bArr, Random random) {
        for (int length = bArr.length; length > 1; length--) {
            a5(bArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Long[] z5(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return p;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    public static <T> T[] r5(T... tArr) {
        return tArr;
    }
}
