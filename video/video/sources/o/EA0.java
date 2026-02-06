package o;

import java.io.Serializable;

@InterfaceC6480g82(version = "1.7")
/* loaded from: classes3.dex */
public class EA0 extends C7703lB0 implements Serializable {
    public final Class e1;

    public EA0(Class cls) {
        super(1);
        this.e1 = cls;
    }

    @Override // o.C7703lB0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EA0)) {
            return false;
        }
        return this.e1.equals(((EA0) obj).e1);
    }

    @Override // o.C7703lB0
    public int hashCode() {
        return this.e1.hashCode();
    }

    @Override // o.C7703lB0, o.AbstractC2787Dt
    /* renamed from: t0 */
    public FW0 p0() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // o.C7703lB0
    public String toString() {
        return "fun interface " + this.e1.getName();
    }
}
