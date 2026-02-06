package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.f51  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6212f51 extends AbstractC8476oH1<long[]> {
    @NotNull
    public final long[] d;

    public C6212f51(int i) {
        super(i);
        this.d = new long[i];
    }

    public final void h(long j) {
        long[] jArr = this.d;
        int b = b();
        e(b + 1);
        jArr[b] = j;
    }

    @Override // o.AbstractC8476oH1
    /* renamed from: i */
    public int c(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public final long[] j() {
        return g(this.d, new long[f()]);
    }
}
