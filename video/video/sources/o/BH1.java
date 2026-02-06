package o;

import o.FU;

@Deprecated
/* loaded from: classes2.dex */
public final class BH1 implements FU.a {
    public final FU.a a;
    public final FH1 b;
    public final int c;

    public BH1(FU.a aVar, FH1 fh1, int i) {
        this.a = aVar;
        this.b = fh1;
        this.c = i;
    }

    @Override // o.FU.a
    /* renamed from: c */
    public AH1 a() {
        return new AH1(this.a.a(), this.b, this.c);
    }
}
