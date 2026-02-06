package o;

import o.AbstractC7373jp2;

@InterfaceC5056aJ2(otherwise = 3)
@Deprecated
/* renamed from: o.r82  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9176r82 extends AbstractC3696My0 {
    public final J6 b1;

    public C9176r82(AbstractC7373jp2 abstractC7373jp2, J6 j6) {
        super(abstractC7373jp2);
        boolean z;
        if (abstractC7373jp2.n() == 1) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        C9542sf.i(abstractC7373jp2.w() == 1);
        this.b1 = j6;
    }

    @Override // o.AbstractC3696My0, o.AbstractC7373jp2
    public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
        this.a1.l(i, bVar, z);
        long j = bVar.Y0;
        if (j == C10323vs.b) {
            j = this.b1.Y0;
        }
        bVar.z(bVar.X, bVar.Y, bVar.Z, j, bVar.t(), this.b1, bVar.a1);
        return bVar;
    }
}
