package o;

import java.io.Serializable;

/* renamed from: o.Lm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3556Lm1 implements InterfaceC3360Jm1<Boolean>, Serializable, Comparable<C3556Lm1> {
    private static final long serialVersionUID = -4830728138360036487L;
    public boolean X;

    public C3556Lm1() {
    }

    public boolean e() {
        return this.X;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3556Lm1) || this.X != ((C3556Lm1) obj).e()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C3556Lm1 c3556Lm1) {
        return C3855Oo.d(this.X, c3556Lm1.X);
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: h */
    public Boolean getValue() {
        return Boolean.valueOf(this.X);
    }

    public int hashCode() {
        Boolean bool;
        if (this.X) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        return bool.hashCode();
    }

    public boolean i() {
        return !this.X;
    }

    public boolean j() {
        return this.X;
    }

    public void l() {
        this.X = false;
    }

    public void m() {
        this.X = true;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: n */
    public void setValue(Boolean bool) {
        this.X = bool.booleanValue();
    }

    public void o(boolean z) {
        this.X = z;
    }

    public Boolean p() {
        return Boolean.valueOf(e());
    }

    public String toString() {
        return String.valueOf(this.X);
    }

    public C3556Lm1(boolean z) {
        this.X = z;
    }

    public C3556Lm1(Boolean bool) {
        this.X = bool.booleanValue();
    }
}
