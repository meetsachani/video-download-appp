package o;

import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class UX0 extends Random {
    @NotNull
    public static final a Z = new a(null);
    private static final long serialVersionUID = 0;
    @NotNull
    public final AbstractC10696xN1 X;
    public boolean Y;

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public UX0(@NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(abstractC10696xN1, "impl");
        this.X = abstractC10696xN1;
    }

    @NotNull
    public final AbstractC10696xN1 a() {
        return this.X;
    }

    @Override // java.util.Random
    public int next(int i) {
        return this.X.b(i);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.X.c();
    }

    @Override // java.util.Random
    public void nextBytes(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "bytes");
        this.X.e(bArr);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.X.h();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.X.k();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.X.l();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.X.o();
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (!this.Y) {
            this.Y = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return this.X.m(i);
    }
}
