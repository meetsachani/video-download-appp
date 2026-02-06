package o;

/* loaded from: classes4.dex */
public final class CO0<L, M, R> extends AbstractC11309zu2<L, M, R> {
    public static final CO0<?, ?, ?>[] Z0 = new CO0[0];
    public static final CO0 a1 = p(null, null, null);
    private static final long serialVersionUID = 1;
    public final L Y;
    public final R Y0;
    public final M Z;

    public CO0(L l, M m, R r) {
        this.Y = l;
        this.Z = m;
        this.Y0 = r;
    }

    public static <L, M, R> CO0<L, M, R>[] n() {
        return (CO0<L, M, R>[]) Z0;
    }

    public static <L, M, R> CO0<L, M, R> o() {
        return a1;
    }

    public static <L, M, R> CO0<L, M, R> p(L l, M m, R r) {
        return new CO0<>(l, m, r);
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
}
