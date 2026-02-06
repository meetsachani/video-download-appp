package o;

import com.facebook.internal.H;
import java.nio.ByteBuffer;

/* renamed from: o.w8  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10391w8 {

    /* renamed from: o.w8$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC10391w8 {
        public final /* synthetic */ ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // o.AbstractC10391w8
        public byte[] a() {
            return this.a.array();
        }

        @Override // o.AbstractC10391w8
        public int b() {
            return this.a.arrayOffset();
        }

        @Override // o.AbstractC10391w8
        public boolean c() {
            return this.a.hasArray();
        }

        @Override // o.AbstractC10391w8
        public boolean d() {
            return true;
        }

        @Override // o.AbstractC10391w8
        public int e() {
            return this.a.limit();
        }

        @Override // o.AbstractC10391w8
        public ByteBuffer f() {
            return this.a;
        }

        @Override // o.AbstractC10391w8
        public int g() {
            return this.a.position();
        }

        @Override // o.AbstractC10391w8
        public AbstractC10391w8 h(int i) {
            this.a.position(i);
            return this;
        }

        @Override // o.AbstractC10391w8
        public int i() {
            return this.a.remaining();
        }
    }

    /* renamed from: o.w8$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC10391w8 {
        public int a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public b(byte[] bArr, int i, int i2) {
            this.b = bArr;
            this.c = i;
            this.d = i2;
        }

        @Override // o.AbstractC10391w8
        public byte[] a() {
            return this.b;
        }

        @Override // o.AbstractC10391w8
        public int b() {
            return this.c;
        }

        @Override // o.AbstractC10391w8
        public boolean c() {
            return true;
        }

        @Override // o.AbstractC10391w8
        public boolean d() {
            return false;
        }

        @Override // o.AbstractC10391w8
        public int e() {
            return this.d;
        }

        @Override // o.AbstractC10391w8
        public ByteBuffer f() {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10391w8
        public int g() {
            return this.a;
        }

        @Override // o.AbstractC10391w8
        public AbstractC10391w8 h(int i) {
            if (i >= 0 && i <= this.d) {
                this.a = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid position: " + i);
        }

        @Override // o.AbstractC10391w8
        public int i() {
            return this.d - this.a;
        }
    }

    public static AbstractC10391w8 j(ByteBuffer byteBuffer) {
        C9740tS0.e(byteBuffer, H.a.b);
        return new a(byteBuffer);
    }

    public static AbstractC10391w8 k(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static AbstractC10391w8 l(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            return m(bArr, i, i2);
        }
        throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static AbstractC10391w8 m(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    public abstract AbstractC10391w8 h(int i);

    public abstract int i();
}
