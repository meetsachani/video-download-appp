package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.lB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7702lB extends AbstractC8476oH1<char[]> {
    @NotNull
    public final char[] d;

    public C7702lB(int i) {
        super(i);
        this.d = new char[i];
    }

    public final void h(char c) {
        char[] cArr = this.d;
        int b = b();
        e(b + 1);
        cArr[b] = c;
    }

    @Override // o.AbstractC8476oH1
    /* renamed from: i */
    public int c(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return cArr.length;
    }

    @NotNull
    public final char[] j() {
        return g(this.d, new char[f()]);
    }
}
