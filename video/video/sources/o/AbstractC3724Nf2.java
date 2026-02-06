package o;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

@InterfaceC7311ja0
@InterfaceC11149zF0
/* renamed from: o.Nf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3724Nf2 extends Number {
    public static final ThreadLocal<int[]> Y0 = new ThreadLocal<>();
    public static final Random Z0 = new Random();
    public static final int a1 = Runtime.getRuntime().availableProcessors();
    public static final Unsafe b1;
    public static final long c1;
    public static final long d1;
    @MB
    public volatile transient b[] X;
    public volatile transient long Y;
    public volatile transient int Z;

    /* renamed from: o.Nf2$a */
    /* loaded from: classes3.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* renamed from: o.Nf2$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final Unsafe p;
        public static final long q;
        public volatile long a;
        public volatile long b;
        public volatile long c;
        public volatile long d;
        public volatile long e;
        public volatile long f;
        public volatile long g;
        public volatile long h;
        public volatile long i;
        public volatile long j;
        public volatile long k;
        public volatile long l;
        public volatile long m;
        public volatile long n;

        /* renamed from: o  reason: collision with root package name */
        public volatile long f554o;

        static {
            try {
                Unsafe b = AbstractC3724Nf2.b();
                p = b;
                q = b.objectFieldOffset(b.class.getDeclaredField(C10901yE.i));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public b(long j) {
            this.h = j;
        }

        public final boolean a(long j, long j2) {
            return p.compareAndSwapLong(this, q, j, j2);
        }
    }

    static {
        try {
            Unsafe f = f();
            b1 = f;
            c1 = f.objectFieldOffset(AbstractC3724Nf2.class.getDeclaredField("Y"));
            d1 = f.objectFieldOffset(AbstractC3724Nf2.class.getDeclaredField("Z"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public static /* synthetic */ Unsafe b() {
        return f();
    }

    public static Unsafe f() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new a());
            }
        } catch (PrivilegedActionException e) {
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
    }

    public final boolean c(long j, long j2) {
        return b1.compareAndSwapLong(this, c1, j, j2);
    }

    public final boolean d() {
        return b1.compareAndSwapInt(this, d1, 0, 1);
    }

    public abstract long e(long j, long j2);

    public final void g(long j) {
        b[] bVarArr = this.X;
        this.Y = j;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.h = j;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, @MB int[] iArr, boolean z) {
        int i;
        int[] iArr2;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            Y0.set(iArr2);
            i = Z0.nextInt();
            if (i == 0) {
                i = 1;
            }
            iArr2[0] = i;
        } else {
            i = iArr[0];
            iArr2 = iArr;
        }
        boolean z4 = false;
        int i2 = i;
        boolean z5 = z;
        while (true) {
            b[] bVarArr = this.X;
            if (bVarArr != null && (length = bVarArr.length) > 0) {
                b bVar = bVarArr[(length - 1) & i2];
                if (bVar == null) {
                    if (this.Z == 0) {
                        b bVar2 = new b(j);
                        if (this.Z == 0 && d()) {
                            try {
                                b[] bVarArr2 = this.X;
                                if (bVarArr2 != null && (length2 = bVarArr2.length) > 0) {
                                    int i3 = (length2 - 1) & i2;
                                    if (bVarArr2[i3] == null) {
                                        bVarArr2[i3] = bVar2;
                                        z3 = true;
                                        if (!z3) {
                                            return;
                                        }
                                    }
                                }
                                z3 = false;
                                if (!z3) {
                                }
                            } finally {
                            }
                        }
                    }
                    z4 = false;
                } else if (!z5) {
                    z5 = true;
                } else {
                    long j2 = bVar.h;
                    if (!bVar.a(j2, e(j2, j))) {
                        if (length < a1 && this.X == bVarArr) {
                            if (!z4) {
                                z4 = true;
                            } else if (this.Z == 0 && d()) {
                                try {
                                    if (this.X == bVarArr) {
                                        b[] bVarArr3 = new b[length << 1];
                                        for (int i4 = 0; i4 < length; i4++) {
                                            bVarArr3[i4] = bVarArr[i4];
                                        }
                                        this.X = bVarArr3;
                                    }
                                    this.Z = 0;
                                    z4 = false;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        z4 = false;
                    } else {
                        return;
                    }
                }
                int i5 = i2 ^ (i2 << 13);
                int i6 = i5 ^ (i5 >>> 17);
                i2 = i6 ^ (i6 << 5);
                iArr2[0] = i2;
            } else if (this.Z == 0 && this.X == bVarArr && d()) {
                try {
                    if (this.X == bVarArr) {
                        b[] bVarArr4 = new b[2];
                        bVarArr4[i2 & 1] = new b(j);
                        this.X = bVarArr4;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                } finally {
                }
            } else {
                long j3 = this.Y;
                if (c(j3, e(j3, j))) {
                    return;
                }
            }
        }
    }
}
