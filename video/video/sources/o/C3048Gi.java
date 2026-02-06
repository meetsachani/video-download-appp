package o;

import java.util.List;
import o.InterfaceC2426Ac0;

/* renamed from: o.Gi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3048Gi extends InterfaceC2426Ac0.b {
    public final int b;
    public final int c;
    public final List<InterfaceC2426Ac0.a> d;
    public final List<InterfaceC2426Ac0.c> e;

    public C3048Gi(int i, int i2, List<InterfaceC2426Ac0.a> list, List<InterfaceC2426Ac0.c> list2) {
        this.b = i;
        this.c = i2;
        if (list != null) {
            this.d = list;
            if (list2 != null) {
                this.e = list2;
                return;
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    @Override // o.InterfaceC2426Ac0
    public int a() {
        return this.b;
    }

    @Override // o.InterfaceC2426Ac0
    public List<InterfaceC2426Ac0.c> b() {
        return this.e;
    }

    @Override // o.InterfaceC2426Ac0
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC2426Ac0.b) {
            InterfaceC2426Ac0.b bVar = (InterfaceC2426Ac0.b) obj;
            if (this.b == bVar.a() && this.c == bVar.e() && this.d.equals(bVar.f()) && this.e.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC2426Ac0
    public List<InterfaceC2426Ac0.a> f() {
        return this.d;
    }

    public int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.b + ", recommendedFileFormat=" + this.c + ", audioProfiles=" + this.d + ", videoProfiles=" + this.e + "}";
    }
}
