package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.z42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11107z42 extends AbstractC8476oH1<short[]> {
    @NotNull
    public final short[] d;

    public C11107z42(int i) {
        super(i);
        this.d = new short[i];
    }

    public final void h(short s) {
        short[] sArr = this.d;
        int b = b();
        e(b + 1);
        sArr[b] = s;
    }

    @Override // o.AbstractC8476oH1
    /* renamed from: i */
    public int c(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return sArr.length;
    }

    @NotNull
    public final short[] j() {
        return g(this.d, new short[f()]);
    }
}
