package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgym;
import com.google.android.gms.internal.ads.zzgys;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzgys<MessageType extends zzgys<MessageType, BuilderType>, BuilderType extends zzgym<MessageType, BuilderType>> extends zzgwt<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgys<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhbj zzt = zzhbj.c();

    public static <T extends zzgys> void F1(Class<T> cls, T t) {
        t.B1();
        zzc.put(cls, t);
    }

    public static <ContainingType extends zzhad, Type> zzgyq<ContainingType, Type> K1(ContainingType containingtype, zzhad zzhadVar, zzgyx zzgyxVar, int i, zzhbv zzhbvVar, boolean z, Class cls) {
        return new zzgyq<>(containingtype, zzhao.e(), zzhadVar, new zzgyp(zzgyxVar, i, zzhbvVar, true, z), cls);
    }

    public static <ContainingType extends zzhad, Type> zzgyq<ContainingType, Type> L1(ContainingType containingtype, Type type, zzhad zzhadVar, zzgyx zzgyxVar, int i, zzhbv zzhbvVar, Class cls) {
        return new zzgyq<>(containingtype, type, zzhadVar, new zzgyp(zzgyxVar, i, zzhbvVar, false, false), cls);
    }

    public static <T extends zzgys> T N1(Class<T> cls) {
        zzgys<?, ?> zzgysVar = zzc.get(cls);
        if (zzgysVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgysVar = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgysVar == null) {
            zzgys<?, ?> R0 = ((zzgys) zzhbp.o(cls)).R0();
            if (R0 != null) {
                zzc.put(cls, R0);
                return R0;
            }
            throw new IllegalStateException();
        }
        return zzgysVar;
    }

    public static <T extends zzgys<T, ?>> T Q1(T t, InputStream inputStream) throws zzgzh {
        int i = zzgyc.e;
        int i2 = zzhan.d;
        T t2 = (T) n2(t, inputStream, zzgyc.d);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T R1(T t, InputStream inputStream, zzgyc zzgycVar) throws zzgzh {
        T t2 = (T) n2(t, inputStream, zzgycVar);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T S1(T t, zzgxk zzgxkVar) throws zzgzh {
        int i = zzgyc.e;
        int i2 = zzhan.d;
        T t2 = (T) X1(t, zzgxkVar, zzgyc.d);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T T1(T t, zzgxq zzgxqVar) throws zzgzh {
        int i = zzgyc.e;
        int i2 = zzhan.d;
        return (T) Y1(t, zzgxqVar, zzgyc.d);
    }

    public static <T extends zzgys<T, ?>> T U1(T t, InputStream inputStream) throws zzgzh {
        zzgxq f = zzgxq.f(inputStream, 4096);
        int i = zzgyc.e;
        int i2 = zzhan.d;
        T t2 = (T) d2(t, f, zzgyc.d);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T V1(T t, ByteBuffer byteBuffer) throws zzgzh {
        int i = zzgyc.e;
        int i2 = zzhan.d;
        return (T) a2(t, byteBuffer, zzgyc.d);
    }

    public static <T extends zzgys<T, ?>> T W1(T t, byte[] bArr) throws zzgzh {
        int length = bArr.length;
        int i = zzgyc.e;
        int i2 = zzhan.d;
        T t2 = (T) p2(t, bArr, 0, length, zzgyc.d);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T X1(T t, zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        T t2 = (T) o2(t, zzgxkVar, zzgycVar);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T Y1(T t, zzgxq zzgxqVar, zzgyc zzgycVar) throws zzgzh {
        T t2 = (T) d2(t, zzgxqVar, zzgycVar);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T Z1(T t, InputStream inputStream, zzgyc zzgycVar) throws zzgzh {
        T t2 = (T) d2(t, zzgxq.f(inputStream, 4096), zzgycVar);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T a2(T t, ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
        zzgxq g;
        int i = zzgxq.e;
        if (byteBuffer.hasArray()) {
            g = zzgxq.g(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            if (byteBuffer.isDirect()) {
                int i2 = zzgxo.n;
                if (zzhbp.b()) {
                    g = new zzgxo(byteBuffer, false, null);
                }
            }
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            g = zzgxq.g(bArr, 0, remaining, true);
        }
        T t2 = (T) Y1(t, g, zzgycVar);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T b2(T t, byte[] bArr, zzgyc zzgycVar) throws zzgzh {
        T t2 = (T) p2(t, bArr, 0, bArr.length, zzgycVar);
        m2(t2);
        return t2;
    }

    public static <T extends zzgys<T, ?>> T c2(T t, zzgxq zzgxqVar) throws zzgzh {
        int i = zzgyc.e;
        int i2 = zzhan.d;
        return (T) d2(t, zzgxqVar, zzgyc.d);
    }

    public static <T extends zzgys<T, ?>> T d2(T t, zzgxq zzgxqVar, zzgyc zzgycVar) throws zzgzh {
        T t2 = (T) t.P1();
        try {
            zzhaw b = zzhan.a().b(t2.getClass());
            b.i(t2, zzgxr.T(zzgxqVar), zzgycVar);
            b.e(t2);
            return t2;
        } catch (zzgzh e) {
            if (e.b()) {
                throw new zzgzh(e);
            }
            throw e;
        } catch (zzhbh e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgzh) {
                throw ((zzgzh) e3.getCause());
            }
            throw new zzgzh(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgzh) {
                throw ((zzgzh) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzgyu g1() {
        return zzgxa.e();
    }

    public static zzgyu h1(zzgyu zzgyuVar) {
        int size = zzgyuVar.size();
        return zzgyuVar.E(size + size);
    }

    public static zzgyv i1() {
        return zzgxz.f();
    }

    public static zzgyv j1(zzgyv zzgyvVar) {
        int size = zzgyvVar.size();
        return zzgyvVar.A(size + size);
    }

    public static zzgyz k1() {
        return zzgyj.f();
    }

    public static <MessageType extends zzgyo<MessageType, BuilderType>, BuilderType, T> zzgyq<MessageType, T> k2(zzgya<MessageType, T> zzgyaVar) {
        return (zzgyq) zzgyaVar;
    }

    public static zzgyz l1(zzgyz zzgyzVar) {
        int size = zzgyzVar.size();
        return zzgyzVar.A(size + size);
    }

    public static zzgza m1() {
        return zzgyt.e();
    }

    public static <T extends zzgys<T, ?>> T m2(T t) throws zzgzh {
        if (t != null && !t.D0()) {
            throw t.H0().a();
        }
        return t;
    }

    public static zzgza n1(zzgza zzgzaVar) {
        int size = zzgzaVar.size();
        return zzgzaVar.W(size + size);
    }

    public static <T extends zzgys<T, ?>> T n2(T t, InputStream inputStream, zzgyc zzgycVar) throws zzgzh {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgxq f = zzgxq.f(new zzgwr(inputStream, zzgxq.d(read, inputStream)), 4096);
            T t2 = (T) d2(t, f, zzgycVar);
            f.A(0);
            return t2;
        } catch (zzgzh e) {
            if (e.b()) {
                throw new zzgzh(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzgzh(e2);
        }
    }

    public static zzgzd o1() {
        return zzgzs.e();
    }

    public static <T extends zzgys<T, ?>> T o2(T t, zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        zzgxq B = zzgxkVar.B();
        T t2 = (T) d2(t, B, zzgycVar);
        B.A(0);
        return t2;
    }

    public static zzgzd p1(zzgzd zzgzdVar) {
        int size = zzgzdVar.size();
        return zzgzdVar.E(size + size);
    }

    public static <T extends zzgys<T, ?>> T p2(T t, byte[] bArr, int i, int i2, zzgyc zzgycVar) throws zzgzh {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.P1();
        try {
            zzhaw b = zzhan.a().b(t2.getClass());
            b.f(t2, bArr, i, i + i2, new zzgwy(zzgycVar));
            b.e(t2);
            return t2;
        } catch (zzgzh e) {
            if (e.b()) {
                throw new zzgzh(e);
            }
            throw e;
        } catch (zzhbh e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgzh) {
                throw ((zzgzh) e3.getCause());
            }
            throw new zzgzh(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <E> zzgze<E> q1() {
        return zzhao.e();
    }

    public static <E> zzgze<E> r1(zzgze<E> zzgzeVar) {
        int size = zzgzeVar.size();
        return zzgzeVar.S(size + size);
    }

    public static final <T extends zzgys<T, ?>> boolean r2(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.l2(zzgyr.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean j = zzhan.a().b(t.getClass()).j(t);
        if (z) {
            if (true != j) {
                obj = null;
            } else {
                obj = t;
            }
            t.l2(zzgyr.SET_MEMOIZED_IS_INITIALIZED, obj, null);
        }
        return j;
    }

    public static Object v1(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object w1(zzhad zzhadVar, String str, Object[] objArr) {
        return new zzhap(zzhadVar, str, objArr);
    }

    public static Method x1(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException("Generated message class \"" + name + "\" missing method \"" + str + "\".", e);
        }
    }

    public void A1() {
        zzhan.a().b(getClass()).e(this);
        B1();
    }

    @Override // com.google.android.gms.internal.ads.zzgwt
    public int B0() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public void B1() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public void C1(int i, zzgxk zzgxkVar) {
        q2();
        zzhbj zzhbjVar = this.zzt;
        zzhbjVar.g();
        if (i != 0) {
            zzhbjVar.j((i << 3) | 2, zzgxkVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean D0() {
        return r2(this, true);
    }

    public final void D1(zzhbj zzhbjVar) {
        this.zzt = zzhbj.e(this.zzt, zzhbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwt
    public int E0(zzhaw zzhawVar) {
        if (i2()) {
            int e2 = e2(zzhawVar);
            if (e2 >= 0) {
                return e2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + e2);
        } else if (B0() != Integer.MAX_VALUE) {
            return B0();
        } else {
            int e22 = e2(zzhawVar);
            Y0(e22);
            return e22;
        }
    }

    public void E1(int i, int i2) {
        q2();
        zzhbj zzhbjVar = this.zzt;
        zzhbjVar.g();
        if (i != 0) {
            zzhbjVar.j(i << 3, Long.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwt
    public zzhai G0() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    public final <MessageType2 extends zzgys<MessageType2, BuilderType2>, BuilderType2 extends zzgym<MessageType2, BuilderType2>> BuilderType2 G1(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) f1();
        buildertype2.M1(messagetype2);
        return buildertype2;
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    /* renamed from: H1 */
    public final BuilderType V0() {
        return (BuilderType) l2(zzgyr.NEW_BUILDER, null, null);
    }

    /* renamed from: I1 */
    public final BuilderType s1() {
        BuilderType buildertype = (BuilderType) l2(zzgyr.NEW_BUILDER, null, null);
        buildertype.M1(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    public int O0() {
        return E0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    /* renamed from: O1 */
    public final MessageType R0() {
        return (MessageType) l2(zzgyr.GET_DEFAULT_INSTANCE, null, null);
    }

    public MessageType P1() {
        return (MessageType) l2(zzgyr.NEW_MUTABLE_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    public void W0(zzgxx zzgxxVar) throws IOException {
        zzhan.a().b(getClass()).g(this, zzgxy.a(zzgxxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzgwt
    public void Y0(int i) {
        if (i >= 0) {
            this.zzd = i | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    public int d1() {
        return zzhan.a().b(getClass()).c(this);
    }

    public int e1() {
        return this.zzq;
    }

    public final int e2(zzhaw<?> zzhawVar) {
        if (zzhawVar == null) {
            return zzhan.a().b(getClass()).b(this);
        }
        return zzhawVar.b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhan.a().b(getClass()).a(this, (zzgys) obj);
    }

    public final <MessageType2 extends zzgys<MessageType2, BuilderType2>, BuilderType2 extends zzgym<MessageType2, BuilderType2>> BuilderType2 f1() {
        return (BuilderType2) l2(zzgyr.NEW_BUILDER, null, null);
    }

    public void f2(int i) {
        this.zzq = i;
    }

    public boolean h2() {
        return e1() == 0;
    }

    public int hashCode() {
        if (i2()) {
            return d1();
        }
        if (h2()) {
            f2(d1());
        }
        return e1();
    }

    public boolean i2() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public boolean j2(int i, zzgxq zzgxqVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        q2();
        return this.zzt.m(i, zzgxqVar);
    }

    public abstract Object l2(zzgyr zzgyrVar, Object obj, Object obj2);

    public final void q2() {
        if (this.zzt == zzhbj.c()) {
            this.zzt = zzhbj.f();
        }
    }

    public final zzhal<MessageType> t1() {
        return (zzhal) l2(zzgyr.GET_PARSER, null, null);
    }

    public String toString() {
        return zzhaf.a(this, super.toString());
    }

    public Object u1() throws Exception {
        return l2(zzgyr.BUILD_MESSAGE_INFO, null, null);
    }

    public void y1() {
        this.zzq = 0;
    }

    public void z1() {
        Y0(Integer.MAX_VALUE);
    }
}
