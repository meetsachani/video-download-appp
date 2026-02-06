package o;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class DV0 {
    public IV0 B() {
        if (M()) {
            return (IV0) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public MV0 D() {
        if (Q()) {
            return (MV0) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long F() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number G() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short H() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String J() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean K() {
        return this instanceof C10237vV0;
    }

    public boolean L() {
        return this instanceof HV0;
    }

    public boolean M() {
        return this instanceof IV0;
    }

    public boolean Q() {
        return this instanceof MV0;
    }

    public abstract DV0 d();

    public BigDecimal e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public C10237vV0 r() {
        if (K()) {
            return (C10237vV0) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C5589cW0 c5589cW0 = new C5589cW0(C4690Xd2.c(sb));
            c5589cW0.H(EnumC7572ke2.LENIENT);
            C4690Xd2.b(this, c5589cW0);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @InterfaceC6181ey
    public HV0 w() {
        if (L()) {
            return (HV0) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }
}
