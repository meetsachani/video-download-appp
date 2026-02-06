package o;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: classes4.dex */
public final class PZ1 {
    @NotNull
    public static final a h = new a(null);
    public static final int i = 8192;
    public static final int j = 1024;
    @InterfaceC7058iW0
    @NotNull
    public final byte[] a;
    @InterfaceC7058iW0
    public int b;
    @InterfaceC7058iW0
    public int c;
    @InterfaceC7058iW0
    public boolean d;
    @InterfaceC7058iW0
    public boolean e;
    @InterfaceC7058iW0
    @Nullable
    public PZ1 f;
    @InterfaceC7058iW0
    @Nullable
    public PZ1 g;

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public PZ1() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final void a() {
        int i2;
        PZ1 pz1 = this.g;
        if (pz1 != this) {
            C6562gT0.m(pz1);
            if (pz1.e) {
                int i3 = this.c - this.b;
                PZ1 pz12 = this.g;
                C6562gT0.m(pz12);
                int i4 = 8192 - pz12.c;
                PZ1 pz13 = this.g;
                C6562gT0.m(pz13);
                if (pz13.d) {
                    i2 = 0;
                } else {
                    PZ1 pz14 = this.g;
                    C6562gT0.m(pz14);
                    i2 = pz14.b;
                }
                if (i3 > i4 + i2) {
                    return;
                }
                PZ1 pz15 = this.g;
                C6562gT0.m(pz15);
                g(pz15, i3);
                b();
                UZ1.d(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact");
    }

    @Nullable
    public final PZ1 b() {
        PZ1 pz1 = this.f;
        if (pz1 == this) {
            pz1 = null;
        }
        PZ1 pz12 = this.g;
        C6562gT0.m(pz12);
        pz12.f = this.f;
        PZ1 pz13 = this.f;
        C6562gT0.m(pz13);
        pz13.g = this.g;
        this.f = null;
        this.g = null;
        return pz1;
    }

    @NotNull
    public final PZ1 c(@NotNull PZ1 pz1) {
        C6562gT0.p(pz1, "segment");
        pz1.g = this;
        pz1.f = this.f;
        PZ1 pz12 = this.f;
        C6562gT0.m(pz12);
        pz12.g = pz1;
        this.f = pz1;
        return pz1;
    }

    @NotNull
    public final PZ1 d() {
        this.d = true;
        return new PZ1(this.a, this.b, this.c, true, false);
    }

    @NotNull
    public final PZ1 e(int i2) {
        PZ1 e;
        if (i2 > 0 && i2 <= this.c - this.b) {
            if (i2 >= 1024) {
                e = d();
            } else {
                e = UZ1.e();
                byte[] bArr = this.a;
                byte[] bArr2 = e.a;
                int i3 = this.b;
                C4788Ye.E0(bArr, bArr2, 0, i3, i3 + i2, 2, null);
            }
            e.c = e.b + i2;
            this.b += i2;
            PZ1 pz1 = this.g;
            C6562gT0.m(pz1);
            pz1.c(e);
            return e;
        }
        throw new IllegalArgumentException("byteCount out of range");
    }

    @NotNull
    public final PZ1 f() {
        byte[] bArr = this.a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6562gT0.o(copyOf, "copyOf(this, size)");
        return new PZ1(copyOf, this.b, this.c, false, true);
    }

    public final void g(@NotNull PZ1 pz1, int i2) {
        C6562gT0.p(pz1, "sink");
        if (pz1.e) {
            int i3 = pz1.c;
            if (i3 + i2 > 8192) {
                if (!pz1.d) {
                    int i4 = pz1.b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = pz1.a;
                        C4788Ye.E0(bArr, bArr, 0, i4, i3, 2, null);
                        pz1.c -= pz1.b;
                        pz1.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = pz1.a;
            int i5 = pz1.c;
            int i6 = this.b;
            C4788Ye.v0(bArr2, bArr3, i5, i6, i6 + i2);
            pz1.c += i2;
            this.b += i2;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public PZ1(@NotNull byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        C6562gT0.p(bArr, "data");
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
    }
}
