package o;

@Deprecated
/* renamed from: o.Be1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2533Be1 extends AbstractC6238fC {
    public final long j;

    public AbstractC2533Be1(FU fu, OU ou, C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 Object obj, long j, long j2, long j3) {
        super(fu, ou, 1, c10833xx0, i, obj, j, j2);
        C9542sf.g(c10833xx0);
        this.j = j3;
    }

    public long g() {
        long j = this.j;
        if (j == -1) {
            return -1L;
        }
        return j + 1;
    }

    public abstract boolean h();
}
