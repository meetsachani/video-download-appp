package o;

import android.os.SystemClock;
import java.util.List;
import java.util.Random;
import o.C3087Gr2;
import o.InterfaceC6859hi0;
import o.InterfaceC7583kh1;
import o.NN1;

@Deprecated
/* loaded from: classes2.dex */
public final class NN1 extends AbstractC4037Ql {
    public final Random j;
    public int k;

    public NN1(C9593sr2 c9593sr2, int[] iArr, int i, Random random) {
        super(c9593sr2, iArr, i);
        this.j = random;
        this.k = random.nextInt(this.d);
    }

    @Override // o.InterfaceC6859hi0
    public int f() {
        return this.k;
    }

    @Override // o.InterfaceC6859hi0
    @InterfaceC11300zs1
    public Object j() {
        return null;
    }

    @Override // o.InterfaceC6859hi0
    public void l(long j, long j2, long j3, List<? extends AbstractC2533Be1> list, InterfaceC2631Ce1[] interfaceC2631Ce1Arr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        for (int i2 = 0; i2 < this.d; i2++) {
            if (!d(i2, elapsedRealtime)) {
                i++;
            }
        }
        this.k = this.j.nextInt(i);
        if (i != this.d) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.d; i4++) {
                if (!d(i4, elapsedRealtime)) {
                    int i5 = i3 + 1;
                    if (this.k == i3) {
                        this.k = i4;
                        return;
                    }
                    i3 = i5;
                }
            }
        }
    }

    @Override // o.InterfaceC6859hi0
    public int u() {
        return 3;
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC6859hi0.b {
        public final Random a;

        public a() {
            this.a = new Random();
        }

        public static /* synthetic */ InterfaceC6859hi0 b(a aVar, InterfaceC6859hi0.a aVar2) {
            aVar.getClass();
            return new NN1(aVar2.a, aVar2.b, aVar2.c, aVar.a);
        }

        @Override // o.InterfaceC6859hi0.b
        public InterfaceC6859hi0[] a(InterfaceC6859hi0.a[] aVarArr, InterfaceC3643Mk interfaceC3643Mk, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp2) {
            return C3087Gr2.d(aVarArr, new C3087Gr2.a() { // from class: o.MN1
                @Override // o.C3087Gr2.a
                public final InterfaceC6859hi0 a(InterfaceC6859hi0.a aVar) {
                    return NN1.a.b(NN1.a.this, aVar);
                }
            });
        }

        public a(int i) {
            this.a = new Random(i);
        }
    }
}
