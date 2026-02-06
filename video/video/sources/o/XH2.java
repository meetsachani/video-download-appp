package o;

import o.C6022eI2;

/* loaded from: classes.dex */
public class XH2<R> implements InterfaceC9109qt2<R> {
    public final C6022eI2.a a;
    public C6022eI2<R> b;

    public XH2(C6022eI2.a aVar) {
        this.a = aVar;
    }

    @Override // o.InterfaceC9109qt2
    public InterfaceC8136mt2<R> a(GU gu, boolean z) {
        if (gu != GU.MEMORY_CACHE && z) {
            if (this.b == null) {
                this.b = new C6022eI2<>(this.a);
            }
            return this.b;
        }
        return C3767Nq1.b();
    }
}
