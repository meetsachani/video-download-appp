package o;

import java.io.Serializable;

@InterfaceC6480g82(version = "1.4")
/* renamed from: o.o7  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8433o7 implements InterfaceC6976iB0, Serializable {
    public final Object X;
    public final Class Y;
    public final String Y0;
    public final String Z;
    public final boolean Z0;
    public final int a1;
    public final int b1;

    public C8433o7(int i, Class cls, String str, String str2, int i2) {
        this(i, AbstractC2787Dt.b1, cls, str, str2, i2);
    }

    public EW0 c() {
        Class cls = this.Y;
        if (cls == null) {
            return null;
        }
        if (this.Z0) {
            return C6551gQ1.g(cls);
        }
        return C6551gQ1.d(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8433o7)) {
            return false;
        }
        C8433o7 c8433o7 = (C8433o7) obj;
        if (this.Z0 == c8433o7.Z0 && this.a1 == c8433o7.a1 && this.b1 == c8433o7.b1 && C6562gT0.g(this.X, c8433o7.X) && C6562gT0.g(this.Y, c8433o7.Y) && this.Z.equals(c8433o7.Z) && this.Y0.equals(c8433o7.Y0)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6976iB0
    public int getArity() {
        return this.a1;
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.X;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.Y;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int hashCode = (((((i4 + i3) * 31) + this.Z.hashCode()) * 31) + this.Y0.hashCode()) * 31;
        if (this.Z0) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((hashCode + i2) * 31) + this.a1) * 31) + this.b1;
    }

    public String toString() {
        return C6551gQ1.w(this);
    }

    public C8433o7(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.X = obj;
        this.Y = cls;
        this.Z = str;
        this.Y0 = str2;
        this.Z0 = (i2 & 1) == 1;
        this.a1 = i;
        this.b1 = i2 >> 1;
    }
}
