package o;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class YE2 {
    public static final String d = "VersionedParcel";
    public static final int e = -1;
    public static final int f = -2;
    public static final int g = -3;
    public static final int h = -4;
    public static final int i = -5;
    public static final int j = -6;
    public static final int k = -7;
    public static final int l = -9;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f669o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 7;
    public static final int s = 8;
    public final C2531Be<String, Method> a;
    public final C2531Be<String, Method> b;
    public final C2531Be<String, Class> c;

    /* loaded from: classes.dex */
    public class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    public YE2(C2531Be<String, Method> c2531Be, C2531Be<String, Method> c2531Be2, C2531Be<String, Class> c2531Be3) {
        this.a = c2531Be;
        this.b = c2531Be2;
        this.c = c2531Be3;
    }

    public static Throwable f(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public double[] A() {
        int L = L();
        if (L < 0) {
            return null;
        }
        double[] dArr = new double[L];
        for (int i2 = 0; i2 < L; i2++) {
            dArr[i2] = y();
        }
        return dArr;
    }

    public final <T> void A0(Collection<T> collection) {
        if (collection == null) {
            L0(-1);
            return;
        }
        int size = collection.size();
        L0(size);
        if (size > 0) {
            int g2 = g(collection.iterator().next());
            L0(g2);
            switch (g2) {
                case 1:
                    for (T t : collection) {
                        l1(t);
                    }
                    return;
                case 2:
                    for (T t2 : collection) {
                        W0(t2);
                    }
                    return;
                case 3:
                    for (T t3 : collection) {
                        Y0(t3);
                    }
                    return;
                case 4:
                    for (T t4 : collection) {
                        e1(t4);
                    }
                    return;
                case 5:
                    for (T t5 : collection) {
                        g1(t5);
                    }
                    return;
                case 6:
                default:
                    return;
                case 7:
                    for (T t6 : collection) {
                        L0(t6.intValue());
                    }
                    return;
                case 8:
                    for (T t7 : collection) {
                        H0(t7.floatValue());
                    }
                    return;
            }
        }
    }

    public double[] B(double[] dArr, int i2) {
        if (!F(i2)) {
            return dArr;
        }
        return A();
    }

    public final <T> void B0(Collection<T> collection, int i2) {
        i0(i2);
        A0(collection);
    }

    public final Exception C(int i2, String str) {
        return b(i2, str);
    }

    public abstract void C0(double d2);

    public Exception D(Exception exc, int i2) {
        int E;
        if (F(i2) && (E = E()) != 0) {
            return C(E, c0());
        }
        return exc;
    }

    public void D0(double d2, int i2) {
        i0(i2);
        C0(d2);
    }

    public final int E() {
        return L();
    }

    public void E0(double[] dArr) {
        if (dArr != null) {
            L0(dArr.length);
            for (double d2 : dArr) {
                C0(d2);
            }
            return;
        }
        L0(-1);
    }

    public abstract boolean F(int i2);

    public void F0(double[] dArr, int i2) {
        i0(i2);
        E0(dArr);
    }

    public abstract float G();

    public void G0(Exception exc, int i2) {
        int i3;
        i0(i2);
        if (exc == null) {
            V0();
            return;
        }
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i3 = -9;
        } else if (exc instanceof SecurityException) {
            i3 = -1;
        } else if (exc instanceof BadParcelableException) {
            i3 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i3 = -3;
        } else if (exc instanceof NullPointerException) {
            i3 = -4;
        } else if (exc instanceof IllegalStateException) {
            i3 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i3 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i3 = -7;
        } else {
            i3 = 0;
        }
        L0(i3);
        if (i3 == 0) {
            if (exc instanceof RuntimeException) {
                throw ((RuntimeException) exc);
            }
            throw new RuntimeException(exc);
        }
        e1(exc.getMessage());
        if (i3 != -9) {
            return;
        }
        W0((Parcelable) exc);
    }

    public float H(float f2, int i2) {
        if (!F(i2)) {
            return f2;
        }
        return G();
    }

    public abstract void H0(float f2);

    public float[] I() {
        int L = L();
        if (L < 0) {
            return null;
        }
        float[] fArr = new float[L];
        for (int i2 = 0; i2 < L; i2++) {
            fArr[i2] = G();
        }
        return fArr;
    }

    public void I0(float f2, int i2) {
        i0(i2);
        H0(f2);
    }

    public float[] J(float[] fArr, int i2) {
        if (!F(i2)) {
            return fArr;
        }
        return I();
    }

    public void J0(float[] fArr) {
        if (fArr != null) {
            L0(fArr.length);
            for (float f2 : fArr) {
                H0(f2);
            }
            return;
        }
        L0(-1);
    }

    public <T extends InterfaceC5283bF2> T K(String str, YE2 ye2) {
        try {
            return (T) e(str).invoke(null, ye2);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public void K0(float[] fArr, int i2) {
        i0(i2);
        J0(fArr);
    }

    public abstract int L();

    public abstract void L0(int i2);

    public int M(int i2, int i3) {
        if (!F(i3)) {
            return i2;
        }
        return L();
    }

    public void M0(int i2, int i3) {
        i0(i3);
        L0(i2);
    }

    public int[] N() {
        int L = L();
        if (L < 0) {
            return null;
        }
        int[] iArr = new int[L];
        for (int i2 = 0; i2 < L; i2++) {
            iArr[i2] = L();
        }
        return iArr;
    }

    public void N0(int[] iArr) {
        if (iArr != null) {
            L0(iArr.length);
            for (int i2 : iArr) {
                L0(i2);
            }
            return;
        }
        L0(-1);
    }

    public int[] O(int[] iArr, int i2) {
        if (!F(i2)) {
            return iArr;
        }
        return N();
    }

    public void O0(int[] iArr, int i2) {
        i0(i2);
        N0(iArr);
    }

    public <T> List<T> P(List<T> list, int i2) {
        if (!F(i2)) {
            return list;
        }
        return (List) x(new ArrayList());
    }

    public <T> void P0(List<T> list, int i2) {
        B0(list, i2);
    }

    public abstract long Q();

    public abstract void Q0(long j2);

    public long R(long j2, int i2) {
        if (!F(i2)) {
            return j2;
        }
        return Q();
    }

    public void R0(long j2, int i2) {
        i0(i2);
        Q0(j2);
    }

    public long[] S() {
        int L = L();
        if (L < 0) {
            return null;
        }
        long[] jArr = new long[L];
        for (int i2 = 0; i2 < L; i2++) {
            jArr[i2] = Q();
        }
        return jArr;
    }

    public void S0(long[] jArr) {
        if (jArr != null) {
            L0(jArr.length);
            for (long j2 : jArr) {
                Q0(j2);
            }
            return;
        }
        L0(-1);
    }

    public long[] T(long[] jArr, int i2) {
        if (!F(i2)) {
            return jArr;
        }
        return S();
    }

    public void T0(long[] jArr, int i2) {
        i0(i2);
        S0(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> U(Map<K, V> map, int i2) {
        if (!F(i2)) {
            return map;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        C2531Be c2531Be = new C2531Be();
        if (L != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            x(arrayList);
            x(arrayList2);
            for (int i3 = 0; i3 < L; i3++) {
                c2531Be.put(arrayList.get(i3), arrayList2.get(i3));
            }
        }
        return c2531Be;
    }

    public <K, V> void U0(Map<K, V> map, int i2) {
        i0(i2);
        if (map == null) {
            L0(-1);
            return;
        }
        int size = map.size();
        L0(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        A0(arrayList);
        A0(arrayList2);
    }

    public abstract <T extends Parcelable> T V();

    public void V0() {
        L0(0);
    }

    public <T extends Parcelable> T W(T t, int i2) {
        if (!F(i2)) {
            return t;
        }
        return (T) V();
    }

    public abstract void W0(Parcelable parcelable);

    public Serializable X() {
        String c0 = c0();
        if (c0 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(s())).readObject();
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + c0 + C9811tl1.d, e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + c0 + C9811tl1.d, e3);
        }
    }

    public void X0(Parcelable parcelable, int i2) {
        i0(i2);
        W0(parcelable);
    }

    public <T> Set<T> Y(Set<T> set, int i2) {
        if (!F(i2)) {
            return set;
        }
        return (Set) x(new C3228Ie());
    }

    public final void Y0(Serializable serializable) {
        if (serializable == null) {
            e1(null);
            return;
        }
        String name = serializable.getClass().getName();
        e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + C9811tl1.d, e2);
        }
    }

    public Size Z(Size size, int i2) {
        if (!F(i2)) {
            return size;
        }
        if (l()) {
            return new Size(L(), L());
        }
        return null;
    }

    public void Z0(Serializable serializable, int i2) {
        i0(i2);
        Y0(serializable);
    }

    public abstract void a();

    public SizeF a0(SizeF sizeF, int i2) {
        if (!F(i2)) {
            return sizeF;
        }
        if (l()) {
            return new SizeF(G(), G());
        }
        return null;
    }

    public <T> void a1(Set<T> set, int i2) {
        B0(set, i2);
    }

    public final Exception b(int i2, String str) {
        switch (i2) {
            case l /* -9 */:
                return (Exception) V();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i2 + " msg " + str);
            case k /* -7 */:
                return new UnsupportedOperationException(str);
            case j /* -6 */:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int i2) {
        if (!F(i2)) {
            return sparseBooleanArray;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(L);
        for (int i3 = 0; i3 < L; i3++) {
            sparseBooleanArray2.put(L(), l());
        }
        return sparseBooleanArray2;
    }

    public void b1(Size size, int i2) {
        boolean z;
        i0(i2);
        if (size != null) {
            z = true;
        } else {
            z = false;
        }
        m0(z);
        if (size != null) {
            L0(size.getWidth());
            L0(size.getHeight());
        }
    }

    public abstract YE2 c();

    public abstract String c0();

    public void c1(SizeF sizeF, int i2) {
        boolean z;
        i0(i2);
        if (sizeF != null) {
            z = true;
        } else {
            z = false;
        }
        m0(z);
        if (sizeF != null) {
            H0(sizeF.getWidth());
            H0(sizeF.getHeight());
        }
    }

    public final Class d(Class<? extends InterfaceC5283bF2> cls) throws ClassNotFoundException {
        Class cls2 = this.c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public String d0(String str, int i2) {
        if (!F(i2)) {
            return str;
        }
        return c0();
    }

    public void d1(SparseBooleanArray sparseBooleanArray, int i2) {
        i0(i2);
        if (sparseBooleanArray == null) {
            L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        L0(size);
        for (int i3 = 0; i3 < size; i3++) {
            L0(sparseBooleanArray.keyAt(i3));
            m0(sparseBooleanArray.valueAt(i3));
        }
    }

    public final Method e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, YE2.class.getClassLoader()).getDeclaredMethod("read", YE2.class);
            this.a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract IBinder e0();

    public abstract void e1(String str);

    public IBinder f0(IBinder iBinder, int i2) {
        if (!F(i2)) {
            return iBinder;
        }
        return e0();
    }

    public void f1(String str, int i2) {
        i0(i2);
        e1(str);
    }

    public final <T> int g(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof InterfaceC5283bF2) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    public <T extends InterfaceC5283bF2> T g0() {
        String c0 = c0();
        if (c0 == null) {
            return null;
        }
        return (T) K(c0, c());
    }

    public abstract void g1(IBinder iBinder);

    public final Method h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.b.get(cls.getName());
        if (method == null) {
            Class d2 = d(cls);
            System.currentTimeMillis();
            Method declaredMethod = d2.getDeclaredMethod("write", cls, YE2.class);
            this.b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public <T extends InterfaceC5283bF2> T h0(T t, int i2) {
        if (!F(i2)) {
            return t;
        }
        return (T) g0();
    }

    public void h1(IBinder iBinder, int i2) {
        i0(i2);
        g1(iBinder);
    }

    public boolean i() {
        return false;
    }

    public abstract void i0(int i2);

    public abstract void i1(IInterface iInterface);

    public <T> T[] j(T[] tArr) {
        int L = L();
        if (L < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(L);
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 != 1) {
                if (L2 != 2) {
                    if (L2 != 3) {
                        if (L2 != 4) {
                            if (L2 == 5) {
                                while (L > 0) {
                                    arrayList.add(e0());
                                    L--;
                                }
                            }
                        } else {
                            while (L > 0) {
                                arrayList.add(c0());
                                L--;
                            }
                        }
                    } else {
                        while (L > 0) {
                            arrayList.add(X());
                            L--;
                        }
                    }
                } else {
                    while (L > 0) {
                        arrayList.add(V());
                        L--;
                    }
                }
            } else {
                while (L > 0) {
                    arrayList.add(g0());
                    L--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public void j1(IInterface iInterface, int i2) {
        i0(i2);
        i1(iInterface);
    }

    public <T> T[] k(T[] tArr, int i2) {
        if (!F(i2)) {
            return tArr;
        }
        return (T[]) j(tArr);
    }

    public <T> void k0(T[] tArr) {
        if (tArr == null) {
            L0(-1);
            return;
        }
        int length = tArr.length;
        L0(length);
        if (length > 0) {
            int i2 = 0;
            int g2 = g(tArr[0]);
            L0(g2);
            if (g2 != 1) {
                if (g2 != 2) {
                    if (g2 != 3) {
                        if (g2 != 4) {
                            if (g2 == 5) {
                                while (i2 < length) {
                                    g1((IBinder) tArr[i2]);
                                    i2++;
                                }
                                return;
                            }
                            return;
                        }
                        while (i2 < length) {
                            e1((String) tArr[i2]);
                            i2++;
                        }
                        return;
                    }
                    while (i2 < length) {
                        Y0((Serializable) tArr[i2]);
                        i2++;
                    }
                    return;
                }
                while (i2 < length) {
                    W0((Parcelable) tArr[i2]);
                    i2++;
                }
                return;
            }
            while (i2 < length) {
                l1((InterfaceC5283bF2) tArr[i2]);
                i2++;
            }
        }
    }

    public <T extends InterfaceC5283bF2> void k1(T t, YE2 ye2) {
        try {
            h(t.getClass()).invoke(null, t, ye2);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract boolean l();

    public <T> void l0(T[] tArr, int i2) {
        i0(i2);
        k0(tArr);
    }

    public void l1(InterfaceC5283bF2 interfaceC5283bF2) {
        if (interfaceC5283bF2 == null) {
            e1(null);
            return;
        }
        n1(interfaceC5283bF2);
        YE2 c = c();
        k1(interfaceC5283bF2, c);
        c.a();
    }

    public boolean m(boolean z, int i2) {
        if (!F(i2)) {
            return z;
        }
        return l();
    }

    public abstract void m0(boolean z);

    public void m1(InterfaceC5283bF2 interfaceC5283bF2, int i2) {
        i0(i2);
        l1(interfaceC5283bF2);
    }

    public boolean[] n() {
        boolean z;
        int L = L();
        if (L < 0) {
            return null;
        }
        boolean[] zArr = new boolean[L];
        for (int i2 = 0; i2 < L; i2++) {
            if (L() != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i2] = z;
        }
        return zArr;
    }

    public void n0(boolean z, int i2) {
        i0(i2);
        m0(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n1(InterfaceC5283bF2 interfaceC5283bF2) {
        try {
            e1(d(interfaceC5283bF2.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(interfaceC5283bF2.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public boolean[] o(boolean[] zArr, int i2) {
        if (!F(i2)) {
            return zArr;
        }
        return n();
    }

    public void o0(boolean[] zArr) {
        if (zArr != null) {
            L0(zArr.length);
            for (boolean z : zArr) {
                L0(z ? 1 : 0);
            }
            return;
        }
        L0(-1);
    }

    public abstract Bundle p();

    public void p0(boolean[] zArr, int i2) {
        i0(i2);
        o0(zArr);
    }

    public Bundle q(Bundle bundle, int i2) {
        if (!F(i2)) {
            return bundle;
        }
        return p();
    }

    public abstract void q0(Bundle bundle);

    public byte r(byte b2, int i2) {
        if (!F(i2)) {
            return b2;
        }
        return (byte) (L() & 255);
    }

    public void r0(Bundle bundle, int i2) {
        i0(i2);
        q0(bundle);
    }

    public abstract byte[] s();

    public void s0(byte b2, int i2) {
        i0(i2);
        L0(b2);
    }

    public byte[] t(byte[] bArr, int i2) {
        if (!F(i2)) {
            return bArr;
        }
        return s();
    }

    public abstract void t0(byte[] bArr);

    public char[] u(char[] cArr, int i2) {
        if (!F(i2)) {
            return cArr;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        char[] cArr2 = new char[L];
        for (int i3 = 0; i3 < L; i3++) {
            cArr2[i3] = (char) L();
        }
        return cArr2;
    }

    public void u0(byte[] bArr, int i2) {
        i0(i2);
        t0(bArr);
    }

    public abstract CharSequence v();

    public abstract void v0(byte[] bArr, int i2, int i3);

    public CharSequence w(CharSequence charSequence, int i2) {
        if (!F(i2)) {
            return charSequence;
        }
        return v();
    }

    public void w0(byte[] bArr, int i2, int i3, int i4) {
        i0(i4);
        v0(bArr, i2, i3);
    }

    public final <T, S extends Collection<T>> S x(S s2) {
        int L = L();
        if (L < 0) {
            return null;
        }
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 != 1) {
                if (L2 != 2) {
                    if (L2 != 3) {
                        if (L2 != 4) {
                            if (L2 == 5) {
                                while (L > 0) {
                                    s2.add(e0());
                                    L--;
                                }
                            }
                        } else {
                            while (L > 0) {
                                s2.add(c0());
                                L--;
                            }
                        }
                    } else {
                        while (L > 0) {
                            s2.add(X());
                            L--;
                        }
                    }
                } else {
                    while (L > 0) {
                        s2.add(V());
                        L--;
                    }
                }
            } else {
                while (L > 0) {
                    s2.add(g0());
                    L--;
                }
            }
        }
        return s2;
    }

    public void x0(char[] cArr, int i2) {
        i0(i2);
        if (cArr != null) {
            L0(cArr.length);
            for (char c : cArr) {
                L0(c);
            }
            return;
        }
        L0(-1);
    }

    public abstract double y();

    public abstract void y0(CharSequence charSequence);

    public double z(double d2, int i2) {
        if (!F(i2)) {
            return d2;
        }
        return y();
    }

    public void z0(CharSequence charSequence, int i2) {
        i0(i2);
        y0(charSequence);
    }

    public void j0(boolean z, boolean z2) {
    }
}
