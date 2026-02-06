package o;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.jsoup.helper.CookieUtil;

/* renamed from: o.Cs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2685Cs extends C2783Ds {
    public ArrayList<C2783Ds> c1;

    public C2685Cs(char[] cArr) {
        super(cArr);
        this.c1 = new ArrayList<>();
    }

    public static C2783Ds V(char[] cArr) {
        return new C2685Cs(cArr);
    }

    public ArrayList<String> C0() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<C2783Ds> it = this.c1.iterator();
        while (it.hasNext()) {
            C2783Ds next = it.next();
            if (next instanceof C2881Es) {
                arrayList.add(((C2881Es) next).f());
            }
        }
        return arrayList;
    }

    public void F0(String str, C2783Ds c2783Ds) {
        Iterator<C2783Ds> it = this.c1.iterator();
        while (it.hasNext()) {
            C2881Es c2881Es = (C2881Es) it.next();
            if (c2881Es.f().equals(str)) {
                c2881Es.P0(c2783Ds);
                return;
            }
        }
        this.c1.add((C2881Es) C2881Es.L0(str, c2783Ds));
    }

    public void I0(String str, float f) {
        F0(str, new C2990Fs(f));
    }

    public void J0(String str, String str2) {
        C3382Js c3382Js = new C3382Js(str2.toCharArray());
        c3382Js.L(0L);
        c3382Js.J(str2.length() - 1);
        F0(str, c3382Js);
    }

    public void K0(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<C2783Ds> it = this.c1.iterator();
        while (it.hasNext()) {
            C2783Ds next = it.next();
            if (((C2881Es) next).f().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.c1.remove((C2783Ds) it2.next());
        }
    }

    public void U(C2783Ds c2783Ds) {
        this.c1.add(c2783Ds);
        if (C3186Hs.d) {
            PrintStream printStream = System.out;
            printStream.println("added element " + c2783Ds + " to " + this);
        }
    }

    @Override // o.C2783Ds
    /* renamed from: X */
    public C2685Cs e() {
        C2685Cs c2685Cs = (C2685Cs) super.clone();
        ArrayList<C2783Ds> arrayList = new ArrayList<>(this.c1.size());
        Iterator<C2783Ds> it = this.c1.iterator();
        while (it.hasNext()) {
            C2783Ds clone = it.next().clone();
            clone.H(c2685Cs);
            arrayList.add(clone);
        }
        c2685Cs.c1 = arrayList;
        return c2685Cs;
    }

    public C2783Ds Y(int i) throws C3284Is {
        if (i >= 0 && i < this.c1.size()) {
            return this.c1.get(i);
        }
        throw new C3284Is("no element at index " + i, this);
    }

    public C2783Ds b0(String str) throws C3284Is {
        Iterator<C2783Ds> it = this.c1.iterator();
        while (it.hasNext()) {
            C2881Es c2881Es = (C2881Es) it.next();
            if (c2881Es.f().equals(str)) {
                return c2881Es.O0();
            }
        }
        throw new C3284Is("no element for key <" + str + ">", this);
    }

    public void clear() {
        this.c1.clear();
    }

    public C2587Bs d0(int i) throws C3284Is {
        C2783Ds Y = Y(i);
        if (Y instanceof C2587Bs) {
            return (C2587Bs) Y;
        }
        throw new C3284Is("no array at index " + i, this);
    }

    @Override // o.C2783Ds
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2685Cs)) {
            return false;
        }
        return this.c1.equals(((C2685Cs) obj).c1);
    }

    public C2587Bs f0(String str) throws C3284Is {
        C2783Ds b0 = b0(str);
        if (b0 instanceof C2587Bs) {
            return (C2587Bs) b0;
        }
        throw new C3284Is("no array found for key <" + str + ">, found [" + b0.w() + "] : " + b0, this);
    }

    public boolean getBoolean(int i) throws C3284Is {
        C2783Ds Y = Y(i);
        if (Y instanceof C3480Ks) {
            return ((C3480Ks) Y).V();
        }
        throw new C3284Is("no boolean at index " + i, this);
    }

    public float getFloat(int i) throws C3284Is {
        C2783Ds Y = Y(i);
        if (Y != null) {
            return Y.k();
        }
        throw new C3284Is("no float at index " + i, this);
    }

    public int getInt(int i) throws C3284Is {
        C2783Ds Y = Y(i);
        if (Y != null) {
            return Y.l();
        }
        throw new C3284Is("no int at index " + i, this);
    }

    public C2587Bs h0(String str) {
        C2587Bs j0 = j0(str);
        if (j0 != null) {
            return j0;
        }
        C2587Bs c2587Bs = new C2587Bs(new char[0]);
        F0(str, c2587Bs);
        return c2587Bs;
    }

    @Override // o.C2783Ds
    public int hashCode() {
        return Objects.hash(this.c1, Integer.valueOf(super.hashCode()));
    }

    public C2587Bs j0(String str) {
        C2783Ds u0 = u0(str);
        if (u0 instanceof C2587Bs) {
            return (C2587Bs) u0;
        }
        return null;
    }

    public boolean k0(String str) throws C3284Is {
        C2783Ds b0 = b0(str);
        if (b0 instanceof C3480Ks) {
            return ((C3480Ks) b0).V();
        }
        throw new C3284Is("no boolean found for key <" + str + ">, found [" + b0.w() + "] : " + b0, this);
    }

    public float l0(String str) throws C3284Is {
        C2783Ds b0 = b0(str);
        if (b0 != null) {
            return b0.k();
        }
        throw new C3284Is("no float found for key <" + str + ">, found [" + b0.w() + "] : " + b0, this);
    }

    public float m0(String str) {
        C2783Ds u0 = u0(str);
        if (u0 instanceof C2990Fs) {
            return u0.k();
        }
        return Float.NaN;
    }

    public int n0(String str) throws C3284Is {
        C2783Ds b0 = b0(str);
        if (b0 != null) {
            return b0.l();
        }
        throw new C3284Is("no int found for key <" + str + ">, found [" + b0.w() + "] : " + b0, this);
    }

    public C3088Gs p0(int i) throws C3284Is {
        C2783Ds Y = Y(i);
        if (Y instanceof C3088Gs) {
            return (C3088Gs) Y;
        }
        throw new C3284Is("no object at index " + i, this);
    }

    public C3088Gs r0(String str) throws C3284Is {
        C2783Ds b0 = b0(str);
        if (b0 instanceof C3088Gs) {
            return (C3088Gs) b0;
        }
        throw new C3284Is("no object found for key <" + str + ">, found [" + b0.w() + "] : " + b0, this);
    }

    public C3088Gs s0(String str) {
        C2783Ds u0 = u0(str);
        if (u0 instanceof C3088Gs) {
            return (C3088Gs) u0;
        }
        return null;
    }

    public int size() {
        return this.c1.size();
    }

    public C2783Ds t0(int i) {
        if (i >= 0 && i < this.c1.size()) {
            return this.c1.get(i);
        }
        return null;
    }

    @Override // o.C2783Ds
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C2783Ds> it = this.c1.iterator();
        while (it.hasNext()) {
            C2783Ds next = it.next();
            if (sb.length() > 0) {
                sb.append(CookieUtil.b);
            }
            sb.append(next);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public C2783Ds u0(String str) {
        Iterator<C2783Ds> it = this.c1.iterator();
        while (it.hasNext()) {
            C2881Es c2881Es = (C2881Es) it.next();
            if (c2881Es.f().equals(str)) {
                return c2881Es.O0();
            }
        }
        return null;
    }

    public String v0(int i) throws C3284Is {
        C2783Ds Y = Y(i);
        if (Y instanceof C3382Js) {
            return Y.f();
        }
        throw new C3284Is("no string at index " + i, this);
    }

    public String w0(String str) throws C3284Is {
        String str2;
        C2783Ds b0 = b0(str);
        if (b0 instanceof C3382Js) {
            return b0.f();
        }
        if (b0 != null) {
            str2 = b0.w();
        } else {
            str2 = null;
        }
        throw new C3284Is("no string found for key <" + str + ">, found [" + str2 + "] : " + b0, this);
    }

    public String x0(int i) {
        C2783Ds t0 = t0(i);
        if (t0 instanceof C3382Js) {
            return t0.f();
        }
        return null;
    }

    public String y0(String str) {
        C2783Ds u0 = u0(str);
        if (u0 instanceof C3382Js) {
            return u0.f();
        }
        return null;
    }

    public boolean z0(String str) {
        Iterator<C2783Ds> it = this.c1.iterator();
        while (it.hasNext()) {
            C2783Ds next = it.next();
            if ((next instanceof C2881Es) && ((C2881Es) next).f().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
