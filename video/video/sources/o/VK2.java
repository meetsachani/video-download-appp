package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o.UK;

/* loaded from: classes.dex */
public class VK2 {
    public static final boolean g = false;
    public static int h;
    public int b;
    public int d;
    public ArrayList<UK> a = new ArrayList<>();
    public boolean c = false;
    public ArrayList<a> e = null;
    public int f = -1;

    /* loaded from: classes.dex */
    public static class a {
        public WeakReference<UK> a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public a(UK uk, C9872u01 c9872u01, int i) {
            this.a = new WeakReference<>(uk);
            this.b = c9872u01.M(uk.Q);
            this.c = c9872u01.M(uk.R);
            this.d = c9872u01.M(uk.S);
            this.e = c9872u01.M(uk.T);
            this.f = c9872u01.M(uk.U);
            this.g = i;
        }

        public void a() {
            UK uk = this.a.get();
            if (uk != null) {
                uk.q1(this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    public VK2(int i) {
        int i2 = h;
        h = i2 + 1;
        this.b = i2;
        this.d = i;
    }

    public boolean a(UK uk) {
        if (this.a.contains(uk)) {
            return false;
        }
        this.a.add(uk);
        return true;
    }

    public void b() {
        if (this.e != null && this.c) {
            for (int i = 0; i < this.e.size(); i++) {
                this.e.get(i).a();
            }
        }
    }

    public void c(ArrayList<VK2> arrayList) {
        int size = this.a.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                VK2 vk2 = arrayList.get(i);
                if (this.f == vk2.b) {
                    m(this.d, vk2);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.a.clear();
    }

    public final boolean e(UK uk) {
        return this.a.contains(uk);
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.d;
    }

    public final String h() {
        int i = this.d;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        if (i == 2) {
            return "Both";
        }
        return "Unknown";
    }

    public boolean i(VK2 vk2) {
        for (int i = 0; i < this.a.size(); i++) {
            if (vk2.e(this.a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.c;
    }

    public final int k(int i, UK uk) {
        UK.b z = uk.z(i);
        if (z != UK.b.WRAP_CONTENT && z != UK.b.MATCH_PARENT && z != UK.b.FIXED) {
            return -1;
        }
        if (i == 0) {
            return uk.m0();
        }
        return uk.D();
    }

    public int l(C9872u01 c9872u01, int i) {
        if (this.a.size() == 0) {
            return 0;
        }
        return q(c9872u01, this.a, i);
    }

    public void m(int i, VK2 vk2) {
        Iterator<UK> it = this.a.iterator();
        while (it.hasNext()) {
            UK next = it.next();
            vk2.a(next);
            if (i == 0) {
                next.S0 = vk2.f();
            } else {
                next.T0 = vk2.f();
            }
        }
        this.f = vk2.b;
    }

    public void n(boolean z) {
        this.c = z;
    }

    public void o(int i) {
        this.d = i;
    }

    public int p() {
        return this.a.size();
    }

    public final int q(C9872u01 c9872u01, ArrayList<UK> arrayList, int i) {
        int M;
        int M2;
        VK vk = (VK) arrayList.get(0).U();
        c9872u01.W();
        vk.g(c9872u01, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(c9872u01, false);
        }
        if (i == 0 && vk.N1 > 0) {
            C4381Tz.b(vk, c9872u01, arrayList, 0);
        }
        if (i == 1 && vk.O1 > 0) {
            C4381Tz.b(vk, c9872u01, arrayList, 1);
        }
        try {
            c9872u01.R();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace(C6566gU0.f, "   at ").replace(",", "\n   at").replace(C6566gU0.g, ""));
        }
        this.e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new a(arrayList.get(i3), c9872u01, i));
        }
        if (i == 0) {
            M = c9872u01.M(vk.Q);
            M2 = c9872u01.M(vk.S);
            c9872u01.W();
        } else {
            M = c9872u01.M(vk.R);
            M2 = c9872u01.M(vk.T);
            c9872u01.W();
        }
        return M2 - M;
    }

    public String toString() {
        Iterator<UK> it;
        String str = h() + " [" + this.b + "] <";
        while (this.a.iterator().hasNext()) {
            str = str + C4500Ve2.b + it.next().y();
        }
        return str + " >";
    }
}
