package o;

@Deprecated
/* renamed from: o.tl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9809tl extends AbstractC2533Be1 {
    public final long k;
    public final long l;
    public C10295vl m;
    public int[] n;

    public AbstractC9809tl(FU fu, OU ou, C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 Object obj, long j, long j2, long j3, long j4, long j5) {
        super(fu, ou, c10833xx0, i, obj, j, j2, j5);
        this.k = j3;
        this.l = j4;
    }

    public final int i(int i) {
        return ((int[]) C9542sf.k(this.n))[i];
    }

    public final C10295vl j() {
        return (C10295vl) C9542sf.k(this.m);
    }

    public void k(C10295vl c10295vl) {
        this.m = c10295vl;
        this.n = c10295vl.a();
    }
}
