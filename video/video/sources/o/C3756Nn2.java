package o;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o.InterfaceC3854On2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n27#2:160\n27#2:162\n27#2:164\n27#2:166\n27#2:168\n27#2:170\n27#2:172\n16#3:161\n16#3:163\n16#3:165\n16#3:167\n16#3:169\n16#3:171\n16#3:173\n1#4:174\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160\n41#1:162\n43#1:164\n51#1:166\n60#1:168\n63#1:170\n72#1:172\n33#1:161\n41#1:163\n43#1:165\n51#1:167\n60#1:169\n63#1:171\n72#1:173\n*E\n"})
@InterfaceC10472wS0
/* renamed from: o.Nn2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3756Nn2<T extends InterfaceC3854On2 & Comparable<? super T>> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C3756Nn2.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    @Nullable
    public T[] a;

    @HK1
    public final void a(@NotNull T t) {
        t.i(this);
        T[] k = k();
        int f = f();
        p(f + 1);
        k[f] = t;
        t.setIndex(f);
        s(f);
    }

    public final void b(@NotNull T t) {
        synchronized (this) {
            a(t);
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    public final boolean c(@NotNull T t, @NotNull HA0<? super T, Boolean> ha0) {
        boolean z;
        synchronized (this) {
            try {
                if (ha0.invoke(e()).booleanValue()) {
                    a(t);
                    z = true;
                } else {
                    z = false;
                }
                UP0.d(1);
            } catch (Throwable th) {
                UP0.d(1);
                UP0.c(1);
                throw th;
            }
        }
        UP0.c(1);
        return z;
    }

    @Nullable
    public final T d(@NotNull HA0<? super T, Boolean> ha0) {
        T t;
        synchronized (this) {
            try {
                int f = f();
                int i = 0;
                while (true) {
                    t = null;
                    if (i >= f) {
                        break;
                    }
                    T[] tArr = this.a;
                    if (tArr != null) {
                        t = tArr[i];
                    }
                    C6562gT0.m(t);
                    if (ha0.invoke(t).booleanValue()) {
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @HK1
    @Nullable
    public final T e() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int f() {
        return b.get(this);
    }

    public final /* synthetic */ int g() {
        return this._size$volatile;
    }

    public final boolean i() {
        if (f() == 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public final T j() {
        T e;
        synchronized (this) {
            e = e();
        }
        return e;
    }

    public final T[] k() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC3854On2[4];
            this.a = tArr2;
            return tArr2;
        } else if (f() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, f() * 2);
            C6562gT0.o(copyOf, "copyOf(...)");
            T[] tArr3 = (T[]) ((InterfaceC3854On2[]) copyOf);
            this.a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    public final boolean l(@NotNull T t) {
        boolean z;
        synchronized (this) {
            if (t.h() == null) {
                z = false;
            } else {
                m(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    @HK1
    @NotNull
    public final T m(int i) {
        T[] tArr = this.a;
        C6562gT0.m(tArr);
        p(f() - 1);
        if (i < f()) {
            t(i, f());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C6562gT0.m(t);
                T t2 = tArr[i2];
                C6562gT0.m(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    t(i, i2);
                    s(i2);
                }
            }
            r(i);
        }
        T t3 = tArr[f()];
        C6562gT0.m(t3);
        t3.i(null);
        t3.setIndex(-1);
        tArr[f()] = null;
        return t3;
    }

    @Nullable
    public final T n(@NotNull HA0<? super T, Boolean> ha0) {
        synchronized (this) {
            try {
                T e = e();
                T t = null;
                if (e == null) {
                    UP0.d(2);
                    UP0.c(2);
                    return null;
                }
                if (ha0.invoke(e).booleanValue()) {
                    t = m(0);
                }
                UP0.d(1);
                UP0.c(1);
                return t;
            } catch (Throwable th) {
                UP0.d(1);
                UP0.c(1);
                throw th;
            }
        }
    }

    @Nullable
    public final T o() {
        T t;
        synchronized (this) {
            if (f() > 0) {
                t = m(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    public final void p(int i) {
        b.set(this, i);
    }

    public final /* synthetic */ void q(int i) {
        this._size$volatile = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 < f()) {
                T[] tArr = this.a;
                C6562gT0.m(tArr);
                int i4 = i2 + 2;
                if (i4 < f()) {
                    T t = tArr[i4];
                    C6562gT0.m(t);
                    T t2 = tArr[i3];
                    C6562gT0.m(t2);
                }
                i4 = i3;
                T t3 = tArr[i];
                C6562gT0.m(t3);
                T t4 = tArr[i4];
                C6562gT0.m(t4);
                if (((Comparable) t3).compareTo(t4) <= 0) {
                    return;
                }
                t(i, i4);
                i = i4;
            } else {
                return;
            }
        }
    }

    public final void s(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            C6562gT0.m(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C6562gT0.m(t);
            T t2 = tArr[i];
            C6562gT0.m(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            t(i, i2);
            i = i2;
        }
    }

    public final void t(int i, int i2) {
        T[] tArr = this.a;
        C6562gT0.m(tArr);
        T t = tArr[i2];
        C6562gT0.m(t);
        T t2 = tArr[i];
        C6562gT0.m(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
