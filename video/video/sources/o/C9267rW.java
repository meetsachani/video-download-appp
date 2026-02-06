package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

@Deprecated
/* renamed from: o.rW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9267rW extends AbstractC5906dq {
    public static final int e1 = 0;
    public static final int f1 = 1;
    public static final int g1 = 2;
    @InterfaceC11300zs1
    public C10833xx0 Y;
    @InterfaceC11300zs1
    public ByteBuffer Y0;
    public final C7766lR Z;
    public boolean Z0;
    public long a1;
    @InterfaceC11300zs1
    public ByteBuffer b1;
    public final int c1;
    public final int d1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.rW$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* renamed from: o.rW$b */
    /* loaded from: classes2.dex */
    public static final class b extends IllegalStateException {
        public final int X;
        public final int Y;

        public b(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + C9811tl1.d);
            this.X = i;
            this.Y = i2;
        }
    }

    static {
        C6361fi0.a("goog.exo.decoder");
    }

    public C9267rW(int i) {
        this(i, 0);
    }

    public static C9267rW z() {
        return new C9267rW(0);
    }

    @InterfaceC8557od0({"supplementalData"})
    public void A(int i) {
        ByteBuffer byteBuffer = this.b1;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            this.b1.clear();
        } else {
            this.b1 = ByteBuffer.allocate(i);
        }
    }

    @Override // o.AbstractC5906dq
    public void l() {
        super.l();
        ByteBuffer byteBuffer = this.Y0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.b1;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.Z0 = false;
    }

    public final ByteBuffer v(int i) {
        int capacity;
        int i2 = this.c1;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.Y0;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new b(capacity, i);
    }

    @InterfaceC8557od0({"data"})
    public void w(int i) {
        int i2 = i + this.d1;
        ByteBuffer byteBuffer = this.Y0;
        if (byteBuffer == null) {
            this.Y0 = v(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.Y0 = byteBuffer;
            return;
        }
        ByteBuffer v = v(i3);
        v.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            v.put(byteBuffer);
        }
        this.Y0 = v;
    }

    public final void x() {
        ByteBuffer byteBuffer = this.Y0;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.b1;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean y() {
        return n(1073741824);
    }

    public C9267rW(int i, int i2) {
        this.Z = new C7766lR();
        this.c1 = i;
        this.d1 = i2;
    }
}
