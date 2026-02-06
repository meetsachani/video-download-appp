package o;

import o.InterfaceC5809dQ;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.iQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7035iQ {
    @NotNull
    public static final String a = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final InterfaceC5809dQ d(InterfaceC5809dQ interfaceC5809dQ, InterfaceC5809dQ interfaceC5809dQ2, final boolean z) {
        boolean h = h(interfaceC5809dQ);
        boolean h2 = h(interfaceC5809dQ2);
        if (!h && !h2) {
            return interfaceC5809dQ.M(interfaceC5809dQ2);
        }
        final RP1.h hVar = new RP1.h();
        hVar.X = interfaceC5809dQ2;
        C3897Pa0 c3897Pa0 = C3897Pa0.X;
        InterfaceC5809dQ interfaceC5809dQ3 = (InterfaceC5809dQ) interfaceC5809dQ.m(c3897Pa0, new VA0() { // from class: o.gQ
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                InterfaceC5809dQ e;
                e = C7035iQ.e(RP1.h.this, z, (InterfaceC5809dQ) obj, (InterfaceC5809dQ.b) obj2);
                return e;
            }
        });
        if (h2) {
            hVar.X = ((InterfaceC5809dQ) hVar.X).m(c3897Pa0, new VA0() { // from class: o.hQ
                @Override // o.VA0
                public final Object i(Object obj, Object obj2) {
                    InterfaceC5809dQ f;
                    f = C7035iQ.f((InterfaceC5809dQ) obj, (InterfaceC5809dQ.b) obj2);
                    return f;
                }
            });
        }
        return interfaceC5809dQ3.M((InterfaceC5809dQ) hVar.X);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, o.dQ] */
    public static final InterfaceC5809dQ e(RP1.h hVar, boolean z, InterfaceC5809dQ interfaceC5809dQ, InterfaceC5809dQ.b bVar) {
        QP qp;
        if (!(bVar instanceof QP)) {
            return interfaceC5809dQ.M(bVar);
        }
        InterfaceC5809dQ.b f = ((InterfaceC5809dQ) hVar.X).f(bVar.getKey());
        if (f == null) {
            if (z) {
                qp = ((QP) bVar).y();
            } else {
                qp = (QP) bVar;
            }
            return interfaceC5809dQ.M(qp);
        }
        hVar.X = ((InterfaceC5809dQ) hVar.X).j(bVar.getKey());
        return interfaceC5809dQ.M(((QP) bVar).x(f));
    }

    public static final InterfaceC5809dQ f(InterfaceC5809dQ interfaceC5809dQ, InterfaceC5809dQ.b bVar) {
        if (bVar instanceof QP) {
            return interfaceC5809dQ.M(((QP) bVar).y());
        }
        return interfaceC5809dQ.M(bVar);
    }

    @Nullable
    public static final String g(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return null;
    }

    public static final boolean h(InterfaceC5809dQ interfaceC5809dQ) {
        return ((Boolean) interfaceC5809dQ.m(Boolean.FALSE, new VA0() { // from class: o.fQ
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                boolean i;
                i = C7035iQ.i(((Boolean) obj).booleanValue(), (InterfaceC5809dQ.b) obj2);
                return Boolean.valueOf(i);
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z, InterfaceC5809dQ.b bVar) {
        if (!z && !(bVar instanceof QP)) {
            return false;
        }
        return true;
    }

    @InterfaceC10472wS0
    @NotNull
    public static final InterfaceC5809dQ j(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC5809dQ interfaceC5809dQ2) {
        if (!h(interfaceC5809dQ2)) {
            return interfaceC5809dQ.M(interfaceC5809dQ2);
        }
        return d(interfaceC5809dQ, interfaceC5809dQ2, false);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final InterfaceC5809dQ k(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        InterfaceC5809dQ d = d(interfaceC9974uQ.a0(), interfaceC5809dQ, true);
        if (d != C8909q40.a() && d.f(LM.y) == null) {
            return d.M(C8909q40.a());
        }
        return d;
    }

    @Nullable
    public static final Qz2<?> l(@NotNull InterfaceC10706xQ interfaceC10706xQ) {
        while (!(interfaceC10706xQ instanceof C7675l40) && (interfaceC10706xQ = interfaceC10706xQ.g()) != null) {
            if (interfaceC10706xQ instanceof Qz2) {
                return (Qz2) interfaceC10706xQ;
            }
        }
        return null;
    }

    @Nullable
    public static final Qz2<?> m(@NotNull HM<?> hm, @NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable Object obj) {
        if (!(hm instanceof InterfaceC10706xQ) || interfaceC5809dQ.f(Sz2.X) == null) {
            return null;
        }
        Qz2<?> l = l((InterfaceC10706xQ) hm);
        if (l != null) {
            l.U1(interfaceC5809dQ, obj);
        }
        return l;
    }

    public static final <T> T n(@NotNull HM<?> hm, @Nullable Object obj, @NotNull FA0<? extends T> fa0) {
        Qz2<?> qz2;
        InterfaceC5809dQ context = hm.getContext();
        Object i = C10795xn2.i(context, obj);
        if (i != C10795xn2.a) {
            qz2 = m(hm, context, i);
        } else {
            qz2 = null;
        }
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            if (qz2 == null || qz2.T1()) {
                C10795xn2.f(context, i);
            }
            UP0.c(1);
        }
    }

    public static final <T> T o(@NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable Object obj, @NotNull FA0<? extends T> fa0) {
        Object i = C10795xn2.i(interfaceC5809dQ, obj);
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            C10795xn2.f(interfaceC5809dQ, i);
            UP0.c(1);
        }
    }
}
