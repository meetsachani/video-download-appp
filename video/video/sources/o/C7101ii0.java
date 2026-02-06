package o;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

@Deprecated
/* renamed from: o.ii0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7101ii0 implements InterfaceC4117Rg2 {
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 2;
    public final C7527kS a = new C7527kS();
    public final C4508Vg2 b = new C4508Vg2();
    public final Deque<AbstractC4605Wg2> c = new ArrayDeque();
    public int d;
    public boolean e;

    /* renamed from: o.ii0$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC4605Wg2 {
        public a() {
        }

        @Override // o.AbstractC9510sW
        public void v() {
            C7101ii0.this.j(this);
        }
    }

    /* renamed from: o.ii0$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC4020Qg2 {
        public final long X;
        public final AbstractC5317bO0<C7284jS> Y;

        public b(long j, AbstractC5317bO0<C7284jS> abstractC5317bO0) {
            this.X = j;
            this.Y = abstractC5317bO0;
        }

        @Override // o.InterfaceC4020Qg2
        public int e(long j) {
            if (this.X > j) {
                return 0;
            }
            return -1;
        }

        @Override // o.InterfaceC4020Qg2
        public List<C7284jS> g(long j) {
            if (j >= this.X) {
                return this.Y;
            }
            return AbstractC5317bO0.L();
        }

        @Override // o.InterfaceC4020Qg2
        public long h(int i) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            return this.X;
        }

        @Override // o.InterfaceC4020Qg2
        public int i() {
            return 1;
        }
    }

    public C7101ii0() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.c.addFirst(new a());
        }
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(AbstractC4605Wg2 abstractC4605Wg2) {
        boolean z;
        if (this.c.size() < 2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        C9542sf.a(!this.c.contains(abstractC4605Wg2));
        abstractC4605Wg2.l();
        this.c.addFirst(abstractC4605Wg2);
    }

    @Override // o.InterfaceC8288nW
    @InterfaceC11300zs1
    /* renamed from: f */
    public C4508Vg2 d() throws C4217Sg2 {
        C9542sf.i(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.b;
    }

    @Override // o.InterfaceC8288nW
    public void flush() {
        C9542sf.i(!this.e);
        this.b.l();
        this.d = 0;
    }

    @Override // o.InterfaceC8288nW
    public void g() {
        this.e = true;
    }

    @Override // o.InterfaceC8288nW
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // o.InterfaceC8288nW
    @InterfaceC11300zs1
    /* renamed from: h */
    public AbstractC4605Wg2 b() throws C4217Sg2 {
        C9542sf.i(!this.e);
        if (this.d == 2 && !this.c.isEmpty()) {
            AbstractC4605Wg2 removeFirst = this.c.removeFirst();
            if (this.b.q()) {
                removeFirst.j(4);
            } else {
                C4508Vg2 c4508Vg2 = this.b;
                removeFirst.w(this.b.a1, new b(c4508Vg2.a1, this.a.a(((ByteBuffer) C9542sf.g(c4508Vg2.Y0)).array())), 0L);
            }
            this.b.l();
            this.d = 0;
            return removeFirst;
        }
        return null;
    }

    @Override // o.InterfaceC8288nW
    /* renamed from: i */
    public void c(C4508Vg2 c4508Vg2) throws C4217Sg2 {
        boolean z;
        boolean z2 = true;
        C9542sf.i(!this.e);
        if (this.d == 1) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (this.b != c4508Vg2) {
            z2 = false;
        }
        C9542sf.a(z2);
        this.d = 2;
    }

    @Override // o.InterfaceC4117Rg2
    public void a(long j) {
    }
}
