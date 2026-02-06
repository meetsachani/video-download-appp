package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.ls  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7868ls extends AbstractC8476oH1<byte[]> {
    @NotNull
    public final byte[] d;

    public C7868ls(int i) {
        super(i);
        this.d = new byte[i];
    }

    public final void h(byte b) {
        byte[] bArr = this.d;
        int b2 = b();
        e(b2 + 1);
        bArr[b2] = b;
    }

    @Override // o.AbstractC8476oH1
    /* renamed from: i */
    public int c(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public final byte[] j() {
        return g(this.d, new byte[f()]);
    }
}
