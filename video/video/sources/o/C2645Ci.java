package o;

import android.content.Context;

/* renamed from: o.Ci  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2645Ci extends AbstractC5813dR {
    public final Context b;
    public final ND c;
    public final ND d;
    public final String e;

    public C2645Ci(Context context, ND nd, ND nd2, String str) {
        if (context != null) {
            this.b = context;
            if (nd != null) {
                this.c = nd;
                if (nd2 != null) {
                    this.d = nd2;
                    if (str != null) {
                        this.e = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // o.AbstractC5813dR
    public Context c() {
        return this.b;
    }

    @Override // o.AbstractC5813dR
    @InterfaceC5670cr1
    public String d() {
        return this.e;
    }

    @Override // o.AbstractC5813dR
    public ND e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5813dR) {
            AbstractC5813dR abstractC5813dR = (AbstractC5813dR) obj;
            if (this.b.equals(abstractC5813dR.c()) && this.c.equals(abstractC5813dR.f()) && this.d.equals(abstractC5813dR.e()) && this.e.equals(abstractC5813dR.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC5813dR
    public ND f() {
        return this.c;
    }

    public int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.b + ", wallClock=" + this.c + ", monotonicClock=" + this.d + ", backendName=" + this.e + "}";
    }
}
