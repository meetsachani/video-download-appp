package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.No  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3757No extends AbstractC8476oH1<boolean[]> {
    @NotNull
    public final boolean[] d;

    public C3757No(int i) {
        super(i);
        this.d = new boolean[i];
    }

    public final void h(boolean z) {
        boolean[] zArr = this.d;
        int b = b();
        e(b + 1);
        zArr[b] = z;
    }

    @Override // o.AbstractC8476oH1
    /* renamed from: i */
    public int c(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return zArr.length;
    }

    @NotNull
    public final boolean[] j() {
        return g(this.d, new boolean[f()]);
    }
}
