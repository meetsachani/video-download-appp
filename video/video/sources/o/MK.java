package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.Q92;

/* loaded from: classes.dex */
public class MK {
    public static final boolean j = false;
    public static final int k = Integer.MIN_VALUE;
    public int b;
    public boolean c;
    public final UK d;
    public final a e;
    public MK f;
    public Q92 i;
    public HashSet<MK> a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public MK(UK uk, a aVar) {
        this.d = uk;
        this.e = aVar;
    }

    public void A(int i) {
        this.b = i;
        this.c = true;
    }

    public void B(int i) {
        if (p()) {
            this.h = i;
        }
    }

    public void C(int i) {
        if (p()) {
            this.g = i;
        }
    }

    public boolean a(MK mk, int i) {
        return b(mk, i, Integer.MIN_VALUE, false);
    }

    public boolean b(MK mk, int i, int i2, boolean z) {
        if (mk == null) {
            x();
            return true;
        } else if (!z && !v(mk)) {
            return false;
        } else {
            this.f = mk;
            if (mk.a == null) {
                mk.a = new HashSet<>();
            }
            HashSet<MK> hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i;
            this.h = i2;
            return true;
        }
    }

    public void c(MK mk, HashMap<UK, UK> hashMap) {
        HashSet<MK> hashSet;
        MK mk2 = this.f;
        if (mk2 != null && (hashSet = mk2.a) != null) {
            hashSet.remove(this);
        }
        MK mk3 = mk.f;
        if (mk3 != null) {
            this.f = hashMap.get(mk.f.d).r(mk3.l());
        } else {
            this.f = null;
        }
        MK mk4 = this.f;
        if (mk4 != null) {
            if (mk4.a == null) {
                mk4.a = new HashSet<>();
            }
            this.f.a.add(this);
        }
        this.g = mk.g;
        this.h = mk.h;
    }

    public void d(int i, ArrayList<VK2> arrayList, VK2 vk2) {
        HashSet<MK> hashSet = this.a;
        if (hashSet != null) {
            Iterator<MK> it = hashSet.iterator();
            while (it.hasNext()) {
                VE0.a(it.next().d, i, arrayList, vk2);
            }
        }
    }

    public HashSet<MK> e() {
        return this.a;
    }

    public int f() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public int g() {
        MK mk;
        if (this.d.l0() == 8) {
            return 0;
        }
        if (this.h != Integer.MIN_VALUE && (mk = this.f) != null && mk.d.l0() == 8) {
            return this.h;
        }
        return this.g;
    }

    public final MK h() {
        switch (this.e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.d.S;
            case 2:
                return this.d.T;
            case 3:
                return this.d.Q;
            case 4:
                return this.d.R;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public UK i() {
        return this.d;
    }

    public Q92 j() {
        return this.i;
    }

    public MK k() {
        return this.f;
    }

    public a l() {
        return this.e;
    }

    public boolean m() {
        HashSet<MK> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<MK> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<MK> hashSet = this.a;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean o() {
        return this.c;
    }

    public boolean p() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public boolean q(UK uk) {
        if (s(uk, new HashSet<>())) {
            return false;
        }
        UK U = i().U();
        if (U != uk && uk.U() != U) {
            return false;
        }
        return true;
    }

    public boolean r(UK uk, MK mk) {
        return q(uk);
    }

    public final boolean s(UK uk, HashSet<UK> hashSet) {
        if (hashSet.contains(uk)) {
            return false;
        }
        hashSet.add(uk);
        if (uk == i()) {
            return true;
        }
        ArrayList<MK> s = uk.s();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            MK mk = s.get(i);
            if (mk.u(this) && mk.p() && s(mk.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        switch (this.e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public String toString() {
        return this.d.y() + ":" + this.e.toString();
    }

    public boolean u(MK mk) {
        a l = mk.l();
        a aVar = this.e;
        if (l == aVar) {
            return true;
        }
        switch (aVar.ordinal()) {
            case 0:
                return false;
            case 1:
            case 3:
            case 7:
                if (l == a.LEFT || l == a.RIGHT || l == a.CENTER_X) {
                    return true;
                }
                return false;
            case 2:
            case 4:
            case 5:
            case 8:
                if (l == a.TOP || l == a.BOTTOM || l == a.CENTER_Y || l == a.BASELINE) {
                    return true;
                }
                return false;
            case 6:
                if (l != a.BASELINE) {
                    return true;
                }
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public boolean v(MK mk) {
        boolean z;
        boolean z2;
        if (mk == null) {
            return false;
        }
        a l = mk.l();
        a aVar = this.e;
        if (l != aVar) {
            switch (aVar.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (l != a.LEFT && l != a.RIGHT) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (mk.i() instanceof C9445sF0) {
                        if (!z && l != a.CENTER_X) {
                            return false;
                        }
                        return true;
                    }
                    return z;
                case 2:
                case 4:
                    if (l != a.TOP && l != a.BOTTOM) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (mk.i() instanceof C9445sF0) {
                        if (!z2 && l != a.CENTER_Y) {
                            return false;
                        }
                        return true;
                    }
                    return z2;
                case 5:
                    if (l == a.LEFT || l == a.RIGHT) {
                        return false;
                    }
                    return true;
                case 6:
                    if (l == a.BASELINE || l == a.CENTER_X || l == a.CENTER_Y) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.e.name());
            }
        } else if (aVar == a.BASELINE && (!mk.i().q0() || !i().q0())) {
            return false;
        } else {
            return true;
        }
    }

    public boolean w() {
        switch (this.e.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 5:
            case 8:
                return true;
            case 1:
            case 3:
            case 6:
            case 7:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public void x() {
        HashSet<MK> hashSet;
        MK mk = this.f;
        if (mk != null && (hashSet = mk.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public void y() {
        this.c = false;
        this.b = 0;
    }

    public void z(C5191at c5191at) {
        Q92 q92 = this.i;
        if (q92 == null) {
            this.i = new Q92(Q92.a.UNRESTRICTED, (String) null);
        } else {
            q92.n();
        }
    }
}
