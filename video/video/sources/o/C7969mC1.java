package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* renamed from: o.mC1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7969mC1 implements InterfaceC7072ia2 {
    @NotNull
    public final InterfaceC2677Cq X;
    @NotNull
    public final C5422bq Y;
    public int Y0;
    @Nullable
    public PZ1 Z;
    public boolean Z0;
    public long a1;

    public C7969mC1(@NotNull InterfaceC2677Cq interfaceC2677Cq) {
        int i;
        C6562gT0.p(interfaceC2677Cq, "upstream");
        this.X = interfaceC2677Cq;
        C5422bq B = interfaceC2677Cq.B();
        this.Y = B;
        PZ1 pz1 = B.X;
        this.Z = pz1;
        if (pz1 != null) {
            i = pz1.b;
        } else {
            i = -1;
        }
        this.Y0 = i;
    }

    @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Z0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r3 == r4.b) goto L14;
     */
    @Override // o.InterfaceC7072ia2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(@NotNull C5422bq c5422bq, long j) {
        PZ1 pz1;
        C6562gT0.p(c5422bq, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.Z0) {
                PZ1 pz12 = this.Z;
                if (pz12 != null) {
                    PZ1 pz13 = this.Y.X;
                    if (pz12 == pz13) {
                        int i2 = this.Y0;
                        C6562gT0.m(pz13);
                    }
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
                if (i == 0) {
                    return 0L;
                }
                if (!this.X.e2(this.a1 + 1)) {
                    return -1L;
                }
                if (this.Z == null && (pz1 = this.Y.X) != null) {
                    this.Z = pz1;
                    C6562gT0.m(pz1);
                    this.Y0 = pz1.b;
                }
                long min = Math.min(j, this.Y.size() - this.a1);
                this.Y.p(c5422bq, this.a1, min);
                this.a1 += min;
                return min;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o.InterfaceC7072ia2
    @NotNull
    public C8120mp2 timeout() {
        return this.X.timeout();
    }
}
