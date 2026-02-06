package o;

import java.util.List;
import o.InterfaceC2426Ac0;

/* renamed from: o.Ij  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3248Ij extends VG2 {
    public final int b;
    public final int c;
    public final List<InterfaceC2426Ac0.a> d;
    public final List<InterfaceC2426Ac0.c> e;
    public final InterfaceC2426Ac0.a f;
    public final InterfaceC2426Ac0.c g;

    public C3248Ij(int i, int i2, List<InterfaceC2426Ac0.a> list, List<InterfaceC2426Ac0.c> list2, InterfaceC2426Ac0.a aVar, InterfaceC2426Ac0.c cVar) {
        this.b = i;
        this.c = i2;
        if (list != null) {
            this.d = list;
            if (list2 != null) {
                this.e = list2;
                this.f = aVar;
                if (cVar != null) {
                    this.g = cVar;
                    return;
                }
                throw new NullPointerException("Null defaultVideoProfile");
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
        InterfaceC2426Ac0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VG2) {
            VG2 vg2 = (VG2) obj;
            if (this.b == vg2.a() && this.c == vg2.e() && this.d.equals(vg2.f()) && this.e.equals(vg2.b()) && ((aVar = this.f) != null ? aVar.equals(vg2.j()) : vg2.j() == null) && this.g.equals(vg2.k())) {
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
        int hashCode;
        int hashCode2 = (((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        InterfaceC2426Ac0.a aVar = this.f;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.g.hashCode();
    }

    @Override // o.VG2
    public InterfaceC2426Ac0.a j() {
        return this.f;
    }

    @Override // o.VG2
    public InterfaceC2426Ac0.c k() {
        return this.g;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.b + ", recommendedFileFormat=" + this.c + ", audioProfiles=" + this.d + ", videoProfiles=" + this.e + ", defaultAudioProfile=" + this.f + ", defaultVideoProfile=" + this.g + "}";
    }
}
