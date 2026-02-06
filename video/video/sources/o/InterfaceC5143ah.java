package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@Deprecated
/* renamed from: o.ah  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5143ah {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: o.ah$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3) {
            int i4;
            this.a = i;
            this.b = i2;
            this.c = i3;
            if (TD2.U0(i3)) {
                i4 = TD2.w0(i3, i2);
            } else {
                i4 = -1;
            }
            this.d = i4;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C2593Bt1.b(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
        }
    }

    /* renamed from: o.ah$b */
    /* loaded from: classes2.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + C4500Ve2.b + aVar);
        }
    }

    boolean c();

    ByteBuffer d();

    @InterfaceC6181ey
    a e(a aVar) throws b;

    void f(ByteBuffer byteBuffer);

    void flush();

    void g();

    boolean h();

    void reset();
}
