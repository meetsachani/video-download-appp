package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@NN0
@InterfaceC7311ja0
/* renamed from: o.p0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8649p0 extends T0 {
    public static final long Y = 0;
    public final InterfaceC9449sG0[] X;

    /* renamed from: o.p0$a */
    /* loaded from: classes3.dex */
    public class a implements CG0 {
        public final /* synthetic */ CG0[] a;

        public a(CG0[] cg0Arr) {
            this.a = cg0Arr;
        }

        @Override // o.CG0
        public <T> CG0 n(@InterfaceC8885py1 T t, TB0<? super T> tb0) {
            for (CG0 cg0 : this.a) {
                cg0.n(t, tb0);
            }
            return this;
        }

        @Override // o.CG0
        public AbstractC8471oG0 o() {
            return AbstractC8649p0.this.m(this.a);
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 a(double d) {
            for (CG0 cg0 : this.a) {
                cg0.a(d);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 b(float f) {
            for (CG0 cg0 : this.a) {
                cg0.b(f);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 c(short s) {
            for (CG0 cg0 : this.a) {
                cg0.c(s);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 d(boolean z) {
            for (CG0 cg0 : this.a) {
                cg0.d(z);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 e(int i) {
            for (CG0 cg0 : this.a) {
                cg0.e(i);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 f(long j) {
            for (CG0 cg0 : this.a) {
                cg0.f(j);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 g(byte[] bArr) {
            for (CG0 cg0 : this.a) {
                cg0.g(bArr);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 h(char c) {
            for (CG0 cg0 : this.a) {
                cg0.h(c);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 i(byte b) {
            for (CG0 cg0 : this.a) {
                cg0.i(b);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 j(CharSequence charSequence) {
            for (CG0 cg0 : this.a) {
                cg0.j(charSequence);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 k(byte[] bArr, int i, int i2) {
            for (CG0 cg0 : this.a) {
                cg0.k(bArr, i, i2);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 l(ByteBuffer byteBuffer) {
            CG0[] cg0Arr;
            int position = byteBuffer.position();
            for (CG0 cg0 : this.a) {
                C10480wU0.d(byteBuffer, position);
                cg0.l(byteBuffer);
            }
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 m(CharSequence charSequence, Charset charset) {
            for (CG0 cg0 : this.a) {
                cg0.m(charSequence, charset);
            }
            return this;
        }
    }

    public AbstractC8649p0(InterfaceC9449sG0... interfaceC9449sG0Arr) {
        for (InterfaceC9449sG0 interfaceC9449sG0 : interfaceC9449sG0Arr) {
            C10664xF1.E(interfaceC9449sG0);
        }
        this.X = interfaceC9449sG0Arr;
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public CG0 e(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int length = this.X.length;
        CG0[] cg0Arr = new CG0[length];
        for (int i2 = 0; i2 < length; i2++) {
            cg0Arr[i2] = this.X[i2].e(i);
        }
        return l(cg0Arr);
    }

    @Override // o.InterfaceC9449sG0
    public CG0 g() {
        int length = this.X.length;
        CG0[] cg0Arr = new CG0[length];
        for (int i = 0; i < length; i++) {
            cg0Arr[i] = this.X[i].g();
        }
        return l(cg0Arr);
    }

    public final CG0 l(CG0[] cg0Arr) {
        return new a(cg0Arr);
    }

    public abstract AbstractC8471oG0 m(CG0[] cg0Arr);
}
