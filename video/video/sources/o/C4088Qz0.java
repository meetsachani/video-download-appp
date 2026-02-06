package o;

@Deprecated
/* renamed from: o.Qz0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4088Qz0 {
    public final int a;
    public final int b;
    public final float c;
    public final long d;

    public C4088Qz0(int i, int i2, float f, long j) {
        boolean z = i > 0;
        C9542sf.b(z, "width must be positive, but is: " + i);
        boolean z2 = i2 > 0;
        C9542sf.b(z2, "height must be positive, but is: " + i2);
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = j;
    }

    /* renamed from: o.Qz0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public int a;
        public int b;
        public float c;
        public long d;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = 1.0f;
        }

        public C4088Qz0 a() {
            return new C4088Qz0(this.a, this.b, this.c, this.d);
        }

        @InterfaceC6181ey
        public b b(int i) {
            this.b = i;
            return this;
        }

        @InterfaceC6181ey
        public b c(long j) {
            this.d = j;
            return this;
        }

        @InterfaceC6181ey
        public b d(float f) {
            this.c = f;
            return this;
        }

        @InterfaceC6181ey
        public b e(int i) {
            this.a = i;
            return this;
        }

        public b(C4088Qz0 c4088Qz0) {
            this.a = c4088Qz0.a;
            this.b = c4088Qz0.b;
            this.c = c4088Qz0.c;
            this.d = c4088Qz0.d;
        }
    }
}
