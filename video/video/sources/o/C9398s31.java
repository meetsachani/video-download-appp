package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n295#2,3:305\n295#2,3:308\n295#2,3:311\n295#2,3:314\n295#2,3:317\n295#2,3:321\n295#2,3:324\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n87#1:305,3\n88#1:308,3\n103#1:311,3\n163#1:314,3\n196#1:317,3\n227#1:321,3\n243#1:324,3\n*E\n"})
/* renamed from: o.s31  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9398s31<E> {
    public static final int h = 8;
    public static final int i = 30;
    public static final int j = 1073741823;
    public static final int k = 0;
    public static final long l = 1073741823;
    public static final int m = 30;
    public static final long n = 1152921503533105152L;

    /* renamed from: o  reason: collision with root package name */
    public static final int f857o = 60;
    public static final long p = 1152921504606846976L;
    public static final int q = 61;
    public static final long r = 2305843009213693952L;
    public static final int s = 1024;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    @NotNull
    public static final a e = new a(null);
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(C9398s31.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(C9398s31.class, "_state$volatile");
    @InterfaceC7058iW0
    @NotNull
    public static final C7592kj2 t = new C7592kj2("REMOVE_FROZEN");

    /* renamed from: o.s31$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final int a(long j) {
            if ((j & C9398s31.r) != 0) {
                return 2;
            }
            return 1;
        }

        public final long b(long j, int i) {
            return e(j, C9398s31.l) | i;
        }

        public final long c(long j, int i) {
            return e(j, C9398s31.n) | (i << 30);
        }

        public final <T> T d(long j, @NotNull VA0<? super Integer, ? super Integer, ? extends T> va0) {
            return va0.i(Integer.valueOf((int) (C9398s31.l & j)), Integer.valueOf((int) ((j & C9398s31.n) >> 30)));
        }

        public final long e(long j, long j2) {
            return j & (~j2);
        }

        public a() {
        }
    }

    /* renamed from: o.s31$b */
    /* loaded from: classes4.dex */
    public static final class b {
        @InterfaceC7058iW0
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    public C9398s31(int i2, boolean z) {
        this.a = i2;
        this.b = z;
        int i3 = i2 - 1;
        this.c = i3;
        this.d = new AtomicReferenceArray(i2);
        if (i3 <= 1073741823) {
            if ((i2 & i3) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(@NotNull E e2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return e.a(j2);
            }
            int i2 = (int) (l & j2);
            int i3 = (int) ((n & j2) >> 30);
            int i4 = this.c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (!this.b && f().get(i3 & i4) != null) {
                int i5 = this.a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    break;
                }
            } else if (g.compareAndSet(this, j2, e.c(j2, (i3 + 1) & 1073741823))) {
                f().set(i3 & i4, e2);
                C9398s31<E> c9398s31 = this;
                while ((g.get(c9398s31) & 1152921504606846976L) != 0 && (c9398s31 = c9398s31.r().e(i3, e2)) != null) {
                }
                return 0;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C9398s31<E> b(long j2) {
        C9398s31<E> c9398s31 = new C9398s31<>(this.a * 2, this.b);
        int i2 = (int) (l & j2);
        int i3 = (int) ((n & j2) >> 30);
        while (true) {
            int i4 = this.c;
            if ((i2 & i4) != (i4 & i3)) {
                Object obj = f().get(this.c & i2);
                if (obj == null) {
                    obj = new b(i2);
                }
                c9398s31.f().set(c9398s31.c & i2, obj);
                i2++;
            } else {
                g.set(c9398s31, e.e(j2, 1152921504606846976L));
                return c9398s31;
            }
        }
    }

    public final C9398s31<E> c(long j2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        while (true) {
            C9398s31<E> c9398s31 = (C9398s31) atomicReferenceFieldUpdater.get(this);
            if (c9398s31 != null) {
                return c9398s31;
            }
            P2.a(f, this, null, b(j2));
        }
    }

    public final boolean d() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & r) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, r | j2));
        return true;
    }

    public final C9398s31<E> e(int i2, E e2) {
        Object obj = f().get(this.c & i2);
        if ((obj instanceof b) && ((b) obj).a == i2) {
            f().set(i2 & this.c, e2);
            return this;
        }
        return null;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.d;
    }

    public final int g() {
        long j2 = g.get(this);
        return (((int) ((j2 & n) >> 30)) - ((int) (l & j2))) & 1073741823;
    }

    public final /* synthetic */ Object h() {
        return this._next$volatile;
    }

    public final /* synthetic */ long j() {
        return this._state$volatile;
    }

    public final boolean l() {
        if ((g.get(this) & r) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        long j2 = g.get(this);
        if (((int) (l & j2)) == ((int) ((j2 & n) >> 30))) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void n(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, HA0<? super Long, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void o(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @NotNull
    public final <R> List<R> p(@NotNull HA0<? super E, ? extends R> ha0) {
        ArrayList arrayList = new ArrayList(this.a);
        long j2 = g.get(this);
        int i2 = (int) (l & j2);
        int i3 = (int) ((j2 & n) >> 30);
        while (true) {
            int i4 = this.c;
            if ((i2 & i4) != (i4 & i3)) {
                Object obj = (Object) f().get(this.c & i2);
                if (obj != 0 && !(obj instanceof b)) {
                    arrayList.add(ha0.invoke(obj));
                }
                i2++;
            } else {
                return arrayList;
            }
        }
    }

    public final long q() {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = 1152921504606846976L | j2;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        return j3;
    }

    @NotNull
    public final C9398s31<E> r() {
        return c(q());
    }

    @Nullable
    public final Object s() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j2) != 0) {
                return t;
            }
            int i2 = (int) (l & j2);
            int i3 = this.c;
            if ((((int) ((n & j2) >> 30)) & i3) == (i3 & i2)) {
                return null;
            }
            Object obj = f().get(this.c & i2);
            if (obj == null) {
                if (this.b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i4 = (i2 + 1) & 1073741823;
                if (g.compareAndSet(this, j2, e.b(j2, i4))) {
                    f().set(this.c & i2, null);
                    return obj;
                } else if (this.b) {
                    C9398s31<E> c9398s31 = this;
                    do {
                        c9398s31 = c9398s31.t(i2, i4);
                    } while (c9398s31 != null);
                    return obj;
                }
            }
        }
    }

    public final C9398s31<E> t(int i2, int i3) {
        long j2;
        int i4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            i4 = (int) (l & j2);
            if ((1152921504606846976L & j2) != 0) {
                return r();
            }
        } while (!g.compareAndSet(this, j2, e.b(j2, i3)));
        f().set(this.c & i4, null);
        return null;
    }

    public final /* synthetic */ void u(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void v(long j2) {
        this._state$volatile = j2;
    }

    public final /* synthetic */ void w(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, HA0<? super Long, Long> ha0) {
        while (true) {
            long j2 = atomicLongFieldUpdater.get(obj);
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j2, ha0.invoke(Long.valueOf(j2)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    public final /* synthetic */ long x(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, HA0<? super Long, Long> ha0) {
        while (true) {
            long j2 = atomicLongFieldUpdater.get(obj);
            Long invoke = ha0.invoke(Long.valueOf(j2));
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j2, invoke.longValue())) {
                return invoke.longValue();
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }
}
