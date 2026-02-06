package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.h71  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6718h71 {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public int[] a;
    public int b;
    @NotNull
    public float[] c;

    /* renamed from: o.h71$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final int b(int[] iArr) {
            if (iArr.length != 0) {
                int i = iArr[0];
                int De = C7330jf.De(iArr);
                int i2 = 1;
                if (1 <= De) {
                    while (true) {
                        i *= iArr[i2];
                        if (i2 == De) {
                            break;
                        }
                        i2++;
                    }
                }
                return i;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }

        public a() {
        }
    }

    public C6718h71(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "shape");
        this.a = iArr;
        int b = d.b(iArr);
        this.b = b;
        this.c = new float[b];
    }

    @NotNull
    public final float[] a() {
        return this.c;
    }

    public final int b(int i) {
        return this.a[i];
    }

    public final int c() {
        return this.a.length;
    }

    public final void d(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "shape");
        this.a = iArr;
        int b = d.b(iArr);
        float[] fArr = new float[b];
        System.arraycopy(this.c, 0, fArr, 0, Math.min(this.b, b));
        this.c = fArr;
        this.b = b;
    }
}
