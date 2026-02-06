package o;

import java.io.File;
import java.util.List;
import o.InterfaceC10233vU;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.pU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8769pU implements InterfaceC10233vU, InterfaceC9990uU.a<Object> {
    public final List<InterfaceC6575gX0> X;
    public final WV<?> Y;
    public int Y0;
    public final InterfaceC10233vU.a Z;
    public InterfaceC6575gX0 Z0;
    public List<InterfaceC7595kk1<File, ?>> a1;
    public int b1;
    public volatile InterfaceC7595kk1.a<?> c1;
    public File d1;

    public C8769pU(WV<?> wv, InterfaceC10233vU.a aVar) {
        this(wv.c(), wv, aVar);
    }

    private boolean b() {
        if (this.b1 < this.a1.size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (b() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = r7.a1;
        r3 = r7.b1;
        r7.b1 = r3 + 1;
        r7.c1 = r0.get(r3).b(r7.d1, r7.Y.t(), r7.Y.f(), r7.Y.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r7.c1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r7.Y.u(r7.c1.c.a()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r7.c1.c.d(r7.Y.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        r7.c1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r2 != false) goto L30;
     */
    @Override // o.InterfaceC10233vU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a() {
        C5034aE0.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.a1 != null && b()) {
                    break;
                }
                int i = this.Y0 + 1;
                this.Y0 = i;
                if (i >= this.X.size()) {
                    return false;
                }
                InterfaceC6575gX0 interfaceC6575gX0 = this.X.get(this.Y0);
                File b = this.Y.d().b(new C9012qU(interfaceC6575gX0, this.Y.p()));
                this.d1 = b;
                if (b != null) {
                    this.Z0 = interfaceC6575gX0;
                    this.a1 = this.Y.j(b);
                    this.b1 = 0;
                }
            } finally {
                C5034aE0.f();
            }
        }
    }

    @Override // o.InterfaceC9990uU.a
    public void c(Exception exc) {
        this.Z.g(this.Z0, exc, this.c1.c, GU.DATA_DISK_CACHE);
    }

    @Override // o.InterfaceC10233vU
    public void cancel() {
        InterfaceC7595kk1.a<?> aVar = this.c1;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // o.InterfaceC9990uU.a
    public void f(Object obj) {
        this.Z.h(this.Z0, obj, this.c1.c, GU.DATA_DISK_CACHE, this.Z0);
    }

    public C8769pU(List<InterfaceC6575gX0> list, WV<?> wv, InterfaceC10233vU.a aVar) {
        this.Y0 = -1;
        this.X = list;
        this.Y = wv;
        this.Z = aVar;
    }
}
