package o;

import java.io.Serializable;
import java.util.zip.Checksum;

@NN0
@InterfaceC7311ja0
/* loaded from: classes3.dex */
public final class VB extends T0 implements Serializable {
    private static final long serialVersionUID = 0;
    public final AO0<? extends Checksum> X;
    public final int Y;
    public final String Z;

    /* loaded from: classes3.dex */
    public final class b extends AbstractC5462c0 {
        public final Checksum b;

        @Override // o.CG0
        public AbstractC8471oG0 o() {
            long value = this.b.getValue();
            if (VB.this.Y == 32) {
                return AbstractC8471oG0.i((int) value);
            }
            return AbstractC8471oG0.j(value);
        }

        @Override // o.AbstractC5462c0
        public void q(byte b) {
            this.b.update(b);
        }

        @Override // o.AbstractC5462c0
        public void t(byte[] bArr, int i, int i2) {
            this.b.update(bArr, i, i2);
        }

        public b(Checksum checksum) {
            this.b = (Checksum) C10664xF1.E(checksum);
        }
    }

    public VB(AO0<? extends Checksum> ao0, int i, String str) {
        boolean z;
        this.X = (AO0) C10664xF1.E(ao0);
        if (i != 32 && i != 64) {
            z = false;
        } else {
            z = true;
        }
        C10664xF1.k(z, "bits (%s) must be either 32 or 64", i);
        this.Y = i;
        this.Z = (String) C10664xF1.E(str);
    }

    @Override // o.InterfaceC9449sG0
    public int d() {
        return this.Y;
    }

    @Override // o.InterfaceC9449sG0
    public CG0 g() {
        return new b(this.X.get());
    }

    public String toString() {
        return this.Z;
    }
}
