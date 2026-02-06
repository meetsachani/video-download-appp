package o;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class IV0 extends DV0 {
    public final I01<String, DV0> X = new I01<>(false);

    public void U(String str, DV0 dv0) {
        I01<String, DV0> i01 = this.X;
        if (dv0 == null) {
            dv0 = HV0.X;
        }
        i01.put(str, dv0);
    }

    public void V(String str, Boolean bool) {
        DV0 mv0;
        if (bool == null) {
            mv0 = HV0.X;
        } else {
            mv0 = new MV0(bool);
        }
        U(str, mv0);
    }

    public void X(String str, Character ch) {
        DV0 mv0;
        if (ch == null) {
            mv0 = HV0.X;
        } else {
            mv0 = new MV0(ch);
        }
        U(str, mv0);
    }

    public void Y(String str, Number number) {
        DV0 mv0;
        if (number == null) {
            mv0 = HV0.X;
        } else {
            mv0 = new MV0(number);
        }
        U(str, mv0);
    }

    public void a0(String str, String str2) {
        DV0 mv0;
        if (str2 == null) {
            mv0 = HV0.X;
        } else {
            mv0 = new MV0(str2);
        }
        U(str, mv0);
    }

    public Map<String, DV0> b0() {
        return this.X;
    }

    @Override // o.DV0
    /* renamed from: d0 */
    public IV0 d() {
        IV0 iv0 = new IV0();
        for (Map.Entry<String, DV0> entry : this.X.entrySet()) {
            iv0.U(entry.getKey(), entry.getValue().d());
        }
        return iv0;
    }

    public DV0 e0(String str) {
        return this.X.get(str);
    }

    public Set<Map.Entry<String, DV0>> entrySet() {
        return this.X.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof IV0) || !((IV0) obj).X.equals(this.X)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public C10237vV0 f0(String str) {
        return (C10237vV0) this.X.get(str);
    }

    public IV0 h0(String str) {
        return (IV0) this.X.get(str);
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    public MV0 j0(String str) {
        return (MV0) this.X.get(str);
    }

    public boolean k0(String str) {
        return this.X.containsKey(str);
    }

    public Set<String> l0() {
        return this.X.keySet();
    }

    @InterfaceC6181ey
    public DV0 m0(String str) {
        return this.X.remove(str);
    }

    public int size() {
        return this.X.size();
    }
}
