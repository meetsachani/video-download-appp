package o;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import o.AbstractC3698Mz;
import o.AbstractC9510sW;

@Deprecated
/* renamed from: o.Mz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3698Mz implements InterfaceC4117Rg2 {
    public static final int g = 10;
    public static final int h = 2;
    public final ArrayDeque<b> a = new ArrayDeque<>();
    public final ArrayDeque<AbstractC4605Wg2> b;
    public final PriorityQueue<b> c;
    @InterfaceC11300zs1
    public b d;
    public long e;
    public long f;

    /* renamed from: o.Mz$b */
    /* loaded from: classes2.dex */
    public static final class b extends C4508Vg2 implements Comparable<b> {
        public long i1;

        public b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: C */
        public int compareTo(b bVar) {
            if (q() != bVar.q()) {
                if (!q()) {
                    return -1;
                }
                return 1;
            }
            long j = this.a1 - bVar.a1;
            if (j == 0) {
                j = this.i1 - bVar.i1;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: o.Mz$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC4605Wg2 {
        public AbstractC9510sW.a<c> a1;

        public c(AbstractC9510sW.a<c> aVar) {
            this.a1 = aVar;
        }

        @Override // o.AbstractC9510sW
        public final void v() {
            this.a1.a(this);
        }
    }

    public AbstractC3698Mz() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new b());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new c(new AbstractC9510sW.a() { // from class: o.Lz
                @Override // o.AbstractC9510sW.a
                public final void a(AbstractC9510sW abstractC9510sW) {
                    AbstractC3698Mz.this.o((AbstractC3698Mz.c) abstractC9510sW);
                }
            }));
        }
        this.c = new PriorityQueue<>();
    }

    @Override // o.InterfaceC4117Rg2
    public void a(long j) {
        this.e = j;
    }

    public abstract InterfaceC4020Qg2 e();

    public abstract void f(C4508Vg2 c4508Vg2);

    @Override // o.InterfaceC8288nW
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            n((b) TD2.o(this.c.poll()));
        }
        b bVar = this.d;
        if (bVar != null) {
            n(bVar);
            this.d = null;
        }
    }

    @Override // o.InterfaceC8288nW
    public abstract String getName();

    @Override // o.InterfaceC8288nW
    @InterfaceC11300zs1
    /* renamed from: h */
    public C4508Vg2 d() throws C4217Sg2 {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (this.a.isEmpty()) {
            return null;
        }
        b pollFirst = this.a.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    @Override // o.InterfaceC8288nW
    @InterfaceC11300zs1
    /* renamed from: i */
    public AbstractC4605Wg2 b() throws C4217Sg2 {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b) TD2.o(this.c.peek())).a1 <= this.e) {
            b bVar = (b) TD2.o(this.c.poll());
            if (bVar.q()) {
                AbstractC4605Wg2 abstractC4605Wg2 = (AbstractC4605Wg2) TD2.o(this.b.pollFirst());
                abstractC4605Wg2.j(4);
                n(bVar);
                return abstractC4605Wg2;
            }
            f(bVar);
            if (l()) {
                InterfaceC4020Qg2 e = e();
                AbstractC4605Wg2 abstractC4605Wg22 = (AbstractC4605Wg2) TD2.o(this.b.pollFirst());
                abstractC4605Wg22.w(bVar.a1, e, Long.MAX_VALUE);
                n(bVar);
                return abstractC4605Wg22;
            }
            n(bVar);
        }
        return null;
    }

    @InterfaceC11300zs1
    public final AbstractC4605Wg2 j() {
        return this.b.pollFirst();
    }

    public final long k() {
        return this.e;
    }

    public abstract boolean l();

    @Override // o.InterfaceC8288nW
    /* renamed from: m */
    public void c(C4508Vg2 c4508Vg2) throws C4217Sg2 {
        boolean z;
        if (c4508Vg2 == this.d) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        b bVar = (b) c4508Vg2;
        if (bVar.p()) {
            n(bVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            bVar.i1 = j;
            this.c.add(bVar);
        }
        this.d = null;
    }

    public final void n(b bVar) {
        bVar.l();
        this.a.add(bVar);
    }

    public void o(AbstractC4605Wg2 abstractC4605Wg2) {
        abstractC4605Wg2.l();
        this.b.add(abstractC4605Wg2);
    }

    @Override // o.InterfaceC8288nW
    public void g() {
    }
}
