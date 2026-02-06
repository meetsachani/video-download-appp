package o;

import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class UZ1 {
    @NotNull
    public static final UZ1 a = new UZ1();
    public static final int b = 65536;
    @NotNull
    public static final PZ1 c = new PZ1(new byte[0], 0, 0, false, false);
    public static final int d;
    @NotNull
    public static final AtomicReference<PZ1>[] e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        d = highestOneBit;
        AtomicReference<PZ1>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        e = atomicReferenceArr;
    }

    @InterfaceC9511sW0
    public static final void d(@NotNull PZ1 pz1) {
        AtomicReference<PZ1> a2;
        PZ1 pz12;
        PZ1 andSet;
        int i;
        C6562gT0.p(pz1, "segment");
        if (pz1.f == null && pz1.g == null) {
            if (pz1.d || (andSet = (a2 = a.a()).getAndSet((pz12 = c))) == pz12) {
                return;
            }
            if (andSet != null) {
                i = andSet.c;
            } else {
                i = 0;
            }
            if (i >= b) {
                a2.set(andSet);
                return;
            }
            pz1.f = andSet;
            pz1.b = 0;
            pz1.c = i + 8192;
            a2.set(pz1);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final PZ1 e() {
        AtomicReference<PZ1> a2 = a.a();
        PZ1 pz1 = c;
        PZ1 andSet = a2.getAndSet(pz1);
        if (andSet == pz1) {
            return new PZ1();
        }
        if (andSet == null) {
            a2.set(null);
            return new PZ1();
        }
        a2.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }

    public final AtomicReference<PZ1> a() {
        return e[(int) (Thread.currentThread().getId() & (d - 1))];
    }

    public final int b() {
        PZ1 pz1 = a().get();
        if (pz1 == null) {
            return 0;
        }
        return pz1.c;
    }

    public final int c() {
        return b;
    }
}
