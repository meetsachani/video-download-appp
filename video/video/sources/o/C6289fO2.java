package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* renamed from: o.fO2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6289fO2 extends AbstractC10696xN1 implements Serializable {
    @NotNull
    public static final a d1 = new a(null);
    private static final long serialVersionUID = 0;
    public int Y0;
    public int Z;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;

    /* renamed from: o.fO2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C6289fO2(int i, int i2, int i3, int i4, int i5, int i6) {
        this.Z = i;
        this.Y0 = i2;
        this.Z0 = i3;
        this.a1 = i4;
        this.b1 = i5;
        this.c1 = i6;
        if ((i | i2 | i3 | i4 | i5) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i7 = 0; i7 < 64; i7++) {
            l();
        }
    }

    @Override // o.AbstractC10696xN1
    public int b(int i) {
        return JN1.j(l(), i);
    }

    @Override // o.AbstractC10696xN1
    public int l() {
        int i = this.Z;
        int i2 = i ^ (i >>> 2);
        this.Z = this.Y0;
        this.Y0 = this.Z0;
        this.Z0 = this.a1;
        int i3 = this.b1;
        this.a1 = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.b1 = i4;
        int i5 = this.c1 + 362437;
        this.c1 = i5;
        return i4 + i5;
    }

    public C6289fO2(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }
}
