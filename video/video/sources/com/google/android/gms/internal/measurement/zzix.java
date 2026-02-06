package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzix.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzix<MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhd<MessageType, BuilderType> {
    private static Map<Object, zzix<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzlz zzb = zzlz.k();

    /* loaded from: classes3.dex */
    public static class zza<T extends zzix<T, ?>> extends zzhh<T> {
        public final T b;

        public zza(T t) {
            this.b = t;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzb<MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhf<MessageType, BuilderType> {
        public final MessageType X;
        public MessageType Y;

        public zzb(MessageType messagetype) {
            this.X = messagetype;
            if (!messagetype.E()) {
                this.Y = (MessageType) messagetype.y();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static <MessageType> void o(MessageType messagetype, MessageType messagetype2) {
            zzkx.a().c(messagetype).g(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.X.q(zze.e, null, null);
            zzbVar.Y = (MessageType) a0();
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final /* synthetic */ zzkj d() {
            return this.X;
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final boolean f() {
            return zzix.u(this.Y, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final /* synthetic */ zzhf h(zzib zzibVar, zzik zzikVar) throws IOException {
            return (zzb) l(zzibVar, zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final /* synthetic */ zzhf i(byte[] bArr, int i, int i2) throws zzji {
            return s(bArr, 0, i2, zzik.e);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final /* synthetic */ zzhf j(byte[] bArr, int i, int i2, zzik zzikVar) throws zzji {
            return s(bArr, 0, i2, zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final /* synthetic */ zzhf m() {
            return (zzb) clone();
        }

        public final BuilderType n(MessageType messagetype) {
            if (this.X.equals(messagetype)) {
                return this;
            }
            if (!this.Y.E()) {
                r();
            }
            o(this.Y, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.zzkm
        /* renamed from: p */
        public MessageType a0() {
            if (!this.Y.E()) {
                return this.Y;
            }
            this.Y.C();
            return this.Y;
        }

        public final void q() {
            if (!this.Y.E()) {
                r();
            }
        }

        public void r() {
            MessageType messagetype = (MessageType) this.X.y();
            o(messagetype, this.Y);
            this.Y = messagetype;
        }

        public final BuilderType s(byte[] bArr, int i, int i2, zzik zzikVar) throws zzji {
            if (!this.Y.E()) {
                r();
            }
            try {
                zzkx.a().c(this.Y).i(this.Y, bArr, 0, i2, new zzhl(zzikVar));
                return this;
            } catch (zzji e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzji.h();
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        /* renamed from: t */
        public final BuilderType l(zzib zzibVar, zzik zzikVar) throws IOException {
            if (!this.Y.E()) {
                r();
            }
            try {
                zzkx.a().c(this.Y).e(this.Y, zzif.O(zzibVar), zzikVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzkm
        /* renamed from: u */
        public final MessageType e0() {
            MessageType messagetype = (MessageType) a0();
            if (messagetype.f()) {
                return messagetype;
            }
            throw new zzlx(messagetype);
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzc implements zzis<zzc> {
        @Override // com.google.android.gms.internal.measurement.zzis
        public final zzks U0(zzks zzksVar, zzks zzksVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final zzkm V3(zzkm zzkmVar, zzkj zzkjVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final int a() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final zzmn b() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final zzmx c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final boolean d() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final boolean f() {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzix<MessageType, BuilderType> implements zzkl {
        protected zziq<zzc> zzc = zziq.j();

        public final zziq<zzc> F() {
            if (this.zzc.s()) {
                this.zzc = (zziq) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes3.dex */
    public enum zze {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static class zzf<ContainingType extends zzkj, Type> extends zzil<ContainingType, Type> {
    }

    public static zzjg A() {
        return zzjy.f();
    }

    public static <E> zzjf<E> B() {
        return zzla.h();
    }

    private final int m() {
        return zzkx.a().c(this).c(this);
    }

    public static <T extends zzix<?, ?>> T n(Class<T> cls) {
        T t = (T) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            T t2 = (T) ((zzix) zzmg.b(cls)).q(zze.f, null, null);
            if (t2 != null) {
                zzc.put(cls, t2);
                return t2;
            }
            throw new IllegalStateException();
        }
        return t;
    }

    public static <E> zzjf<E> o(zzjf<E> zzjfVar) {
        int i;
        int size = zzjfVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return zzjfVar.u(i);
    }

    public static zzjg p(zzjg zzjgVar) {
        int i;
        int size = zzjgVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return zzjgVar.C(i);
    }

    public static Object r(zzkj zzkjVar, String str, Object[] objArr) {
        return new zzkz(zzkjVar, str, objArr);
    }

    public static Object s(Method method, Object obj, Object... objArr) {
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

    public static <T extends zzix<?, ?>> void t(Class<T> cls, T t) {
        t.D();
        zzc.put(cls, t);
    }

    public static final <T extends zzix<T, ?>> boolean u(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.q(zze.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = zzkx.a().c(t).d(t);
        if (z) {
            int i = zze.b;
            if (d) {
                obj = t;
            } else {
                obj = null;
            }
            t.q(i, obj, null);
        }
        return d;
    }

    public static zzjd z() {
        return zzja.f();
    }

    public final void C() {
        zzkx.a().c(this).f(this);
        D();
    }

    public final void D() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final int D0() {
        return h(null);
    }

    public final boolean E() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final void b(zzig zzigVar) throws IOException {
        zzkx.a().c(this).h(this, zzij.N(zzigVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final /* synthetic */ zzkm c() {
        return ((zzb) q(zze.e, null, null)).n(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* synthetic */ zzkj d() {
        return (zzix) q(zze.f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final /* synthetic */ zzkm e() {
        return (zzb) q(zze.e, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzkx.a().c(this).j(this, (zzix) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final boolean f() {
        return u(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int h(zzlb zzlbVar) {
        if (E()) {
            int v = v(zzlbVar);
            if (v >= 0) {
                return v;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        } else if (j() != Integer.MAX_VALUE) {
            return j();
        } else {
            int v2 = v(zzlbVar);
            l(v2);
            return v2;
        }
    }

    public int hashCode() {
        if (E()) {
            return m();
        }
        if (this.zza == 0) {
            this.zza = m();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int j() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void l(int i) {
        if (i >= 0) {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    public abstract Object q(int i, Object obj, Object obj2);

    public String toString() {
        return zzko.a(this, super.toString());
    }

    public final int v(zzlb<?> zzlbVar) {
        if (zzlbVar == null) {
            return zzkx.a().c(this).b(this);
        }
        return zzlbVar.b(this);
    }

    public final <MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType w() {
        return (BuilderType) q(zze.e, null, null);
    }

    public final BuilderType x() {
        return (BuilderType) ((zzb) q(zze.e, null, null)).n(this);
    }

    public final MessageType y() {
        return (MessageType) q(zze.d, null, null);
    }
}
