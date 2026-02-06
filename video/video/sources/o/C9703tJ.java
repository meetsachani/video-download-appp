package o;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
/* renamed from: o.tJ */
/* loaded from: classes4.dex */
public final class C9703tJ {
    public static final int a = 16;
    @NotNull
    public static final C7592kj2 b = new C7592kj2("CLOSED");

    public static final /* synthetic */ boolean b(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i, HA0<? super Integer, Boolean> ha0) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
            if (!ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, i2 + i));
        return true;
    }

    public static final /* synthetic */ boolean c(AtomicIntegerArray atomicIntegerArray, int i, int i2, HA0<? super Integer, Boolean> ha0) {
        int i3;
        do {
            i3 = atomicIntegerArray.get(i);
            if (!ha0.invoke(Integer.valueOf(i3)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i3, i3 + i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.uJ] */
    @NotNull
    public static final <N extends AbstractC9946uJ<N>> N d(@NotNull N n) {
        while (true) {
            Object g = n.g();
            if (g == b) {
                return n;
            }
            ?? r0 = (AbstractC9946uJ) g;
            if (r0 == 0) {
                if (n.o()) {
                    return n;
                }
            } else {
                n = r0;
            }
        }
    }

    public static final /* synthetic */ <S extends QZ1<S>> Object e(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j, S s, VA0<? super Long, ? super S, ? extends S> va0) {
        while (true) {
            Object g = g(s, j, va0);
            if (!TZ1.h(g)) {
                QZ1 f = TZ1.f(g);
                while (true) {
                    QZ1 qz1 = (QZ1) atomicReferenceFieldUpdater.get(obj);
                    if (qz1.Z >= f.Z) {
                        return g;
                    }
                    if (!f.C()) {
                        break;
                    } else if (P2.a(atomicReferenceFieldUpdater, obj, qz1, f)) {
                        if (qz1.v()) {
                            qz1.q();
                        }
                        return g;
                    } else if (f.v()) {
                        f.q();
                    }
                }
            } else {
                return g;
            }
        }
    }

    public static final /* synthetic */ <S extends QZ1<S>> Object f(AtomicReferenceArray atomicReferenceArray, int i, long j, S s, VA0<? super Long, ? super S, ? extends S> va0) {
        while (true) {
            Object g = g(s, j, va0);
            if (!TZ1.h(g)) {
                QZ1 f = TZ1.f(g);
                while (true) {
                    QZ1 qz1 = (QZ1) atomicReferenceArray.get(i);
                    if (qz1.Z >= f.Z) {
                        return g;
                    }
                    if (!f.C()) {
                        break;
                    } else if (C3626Mf2.a(atomicReferenceArray, i, qz1, f)) {
                        if (qz1.v()) {
                            qz1.q();
                        }
                        return g;
                    } else if (f.v()) {
                        f.q();
                    }
                }
            } else {
                return g;
            }
        }
    }

    @NotNull
    public static final <S extends QZ1<S>> Object g(@NotNull S s, long j, @NotNull VA0<? super Long, ? super S, ? extends S> va0) {
        while (true) {
            if (s.Z < j || s.m()) {
                Object g = s.g();
                if (g == b) {
                    return TZ1.b(b);
                }
                S s2 = (S) ((AbstractC9946uJ) g);
                if (s2 == null) {
                    s2 = va0.i(Long.valueOf(s.Z + 1), s);
                    if (s.t(s2)) {
                        if (s.m()) {
                            s.q();
                        }
                    }
                }
                s = s2;
            } else {
                return TZ1.b(s);
            }
        }
    }

    public static final /* synthetic */ <S extends QZ1<S>> boolean j(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, S s) {
        while (true) {
            QZ1 qz1 = (QZ1) atomicReferenceFieldUpdater.get(obj);
            if (qz1.Z >= s.Z) {
                return true;
            }
            if (!s.C()) {
                return false;
            }
            if (P2.a(atomicReferenceFieldUpdater, obj, qz1, s)) {
                if (qz1.v()) {
                    qz1.q();
                }
                return true;
            } else if (s.v()) {
                s.q();
            }
        }
    }

    public static final /* synthetic */ <S extends QZ1<S>> boolean k(AtomicReferenceArray atomicReferenceArray, int i, S s) {
        while (true) {
            QZ1 qz1 = (QZ1) atomicReferenceArray.get(i);
            if (qz1.Z >= s.Z) {
                return true;
            }
            if (!s.C()) {
                return false;
            }
            if (C3626Mf2.a(atomicReferenceArray, i, qz1, s)) {
                if (qz1.v()) {
                    qz1.q();
                }
                return true;
            } else if (s.v()) {
                s.q();
            }
        }
    }
}
