package o;

/* renamed from: o.Un1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4438Un1<L, M, R> extends AbstractC11309zu2<L, M, R> {
    public static final C4438Un1<?, ?, ?>[] Z0 = new C4438Un1[0];
    private static final long serialVersionUID = 1;
    public L Y;
    public R Y0;
    public M Z;

    public C4438Un1() {
    }

    public static <L, M, R> C4438Un1<L, M, R>[] n() {
        return (C4438Un1<L, M, R>[]) Z0;
    }

    public static <L, M, R> C4438Un1<L, M, R> o(L l, M m, R r) {
        return new C4438Un1<>(l, m, r);
    }

    @Override // o.AbstractC11309zu2
    public L h() {
        return this.Y;
    }

    @Override // o.AbstractC11309zu2
    public M i() {
        return this.Z;
    }

    @Override // o.AbstractC11309zu2
    public R j() {
        return this.Y0;
    }

    public void p(L l) {
        this.Y = l;
    }

    public void q(M m) {
        this.Z = m;
    }

    public void r(R r) {
        this.Y0 = r;
    }

    public C4438Un1(L l, M m, R r) {
        this.Y = l;
        this.Z = m;
        this.Y0 = r;
    }
}
