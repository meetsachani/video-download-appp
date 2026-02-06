package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class HR0 extends AbstractC8476oH1<int[]> {
    @NotNull
    public final int[] d;

    public HR0(int i) {
        super(i);
        this.d = new int[i];
    }

    public final void h(int i) {
        int[] iArr = this.d;
        int b = b();
        e(b + 1);
        iArr[b] = i;
    }

    @Override // o.AbstractC8476oH1
    /* renamed from: i */
    public int c(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public final int[] j() {
        return g(this.d, new int[f()]);
    }
}
