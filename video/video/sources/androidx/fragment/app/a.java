package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import androidx.lifecycle.f;
import java.io.PrintWriter;
import java.util.ArrayList;
import o.C4500Ve2;
import o.C5722d40;
import o.C6208f41;
import o.TD0;

/* loaded from: classes.dex */
public final class a extends j implements FragmentManager.j, FragmentManager.q {
    public static final String R = "FragmentManager";
    public final FragmentManager N;
    public boolean O;
    public int P;
    public boolean Q;

    public a(FragmentManager fragmentManager) {
        super(fragmentManager.H0(), fragmentManager.K0() != null ? fragmentManager.K0().g().getClassLoader() : null);
        this.P = -1;
        this.Q = false;
        this.N = fragmentManager;
    }

    @Override // androidx.fragment.app.j
    public j K(Fragment fragment, f.b bVar) {
        if (fragment.o1 == this.N) {
            if (bVar == f.b.INITIALIZED && fragment.X > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
            } else if (bVar != f.b.DESTROYED) {
                return super.K(fragment, bVar);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.N);
    }

    @Override // androidx.fragment.app.j
    public j L(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.o1) != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.L(fragment);
    }

    @Override // androidx.fragment.app.j
    public j P(Fragment fragment) {
        FragmentManager fragmentManager = fragment.o1;
        if (fragmentManager != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.P(fragment);
    }

    public void Q(int i) {
        j.a aVar;
        if (this.i) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.c.get(i2).b;
                if (fragment != null) {
                    fragment.n1 += i;
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.n1);
                    }
                }
            }
        }
    }

    public void R() {
        int size = this.c.size() - 1;
        while (size >= 0) {
            j.a aVar = this.c.get(size);
            if (aVar.c) {
                if (aVar.a == 8) {
                    aVar.c = false;
                    this.c.remove(size - 1);
                    size--;
                } else {
                    int i = aVar.b.t1;
                    aVar.a = 2;
                    aVar.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        j.a aVar2 = this.c.get(i2);
                        if (aVar2.c && aVar2.b.t1 == i) {
                            this.c.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int S(boolean z) {
        if (!this.O) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C6208f41("FragmentManager"));
                T(TD0.a.Y0, printWriter);
                printWriter.close();
            }
            this.O = true;
            if (this.i) {
                this.P = this.N.r();
            } else {
                this.P = -1;
            }
            this.N.h0(this, z);
            return this.P;
        }
        throw new IllegalStateException("commit already called");
    }

    public void T(String str, PrintWriter printWriter) {
        U(str, printWriter, true);
    }

    public void U(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.P);
            printWriter.print(" mCommitted=");
            printWriter.println(this.O);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.f34o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f34o);
            }
        }
        if (!this.c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                j.a aVar = this.c.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = C5722d40.r1;
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(C4500Ve2.b);
                printWriter.println(aVar.b);
                if (z) {
                    if (aVar.d != 0 || aVar.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.e));
                    }
                    if (aVar.f != 0 || aVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.g));
                    }
                }
            }
        }
    }

    public void V() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            j.a aVar = this.c.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.i1 = this.Q;
                fragment.p2(false);
                fragment.o2(this.h);
                fragment.v2(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.R1(fragment, false);
                    this.N.n(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.y1(fragment);
                    break;
                case 4:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.U0(fragment);
                    break;
                case 5:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.R1(fragment, false);
                    this.N.Y1(fragment);
                    break;
                case 6:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.E(fragment);
                    break;
                case 7:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.R1(fragment, false);
                    this.N.t(fragment);
                    break;
                case 8:
                    this.N.U1(fragment);
                    break;
                case 9:
                    this.N.U1(null);
                    break;
                case 10:
                    this.N.T1(fragment, aVar.i);
                    break;
            }
        }
    }

    public void W() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            j.a aVar = this.c.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.i1 = this.Q;
                fragment.p2(true);
                fragment.o2(FragmentManager.K1(this.h));
                fragment.v2(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.R1(fragment, true);
                    this.N.y1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.n(fragment);
                    break;
                case 4:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.Y1(fragment);
                    break;
                case 5:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.R1(fragment, true);
                    this.N.U0(fragment);
                    break;
                case 6:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.t(fragment);
                    break;
                case 7:
                    fragment.e2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.N.R1(fragment, true);
                    this.N.E(fragment);
                    break;
                case 8:
                    this.N.U1(null);
                    break;
                case 9:
                    this.N.U1(fragment);
                    break;
                case 10:
                    this.N.T1(fragment, aVar.h);
                    break;
            }
        }
    }

    public Fragment X(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.c.size()) {
            j.a aVar = this.c.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 6) {
                        if (i2 != 7) {
                            if (i2 == 8) {
                                this.c.add(i, new j.a(9, fragment2, true));
                                aVar.c = true;
                                i++;
                                fragment2 = aVar.b;
                            }
                        }
                    } else {
                        arrayList.remove(aVar.b);
                        Fragment fragment3 = aVar.b;
                        if (fragment3 == fragment2) {
                            this.c.add(i, new j.a(9, fragment3));
                            i++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = aVar.b;
                    int i3 = fragment4.t1;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.t1 == i3) {
                            if (fragment5 == fragment4) {
                                z = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.c.add(i, new j.a(9, fragment5, true));
                                    i++;
                                    fragment2 = null;
                                }
                                j.a aVar2 = new j.a(3, fragment5, true);
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                aVar2.e = aVar.e;
                                aVar2.g = aVar.g;
                                this.c.add(i, aVar2);
                                arrayList.remove(fragment5);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.c.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        aVar.c = true;
                        arrayList.add(fragment4);
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    public void Y() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.get(i).run();
            }
            this.s = null;
        }
    }

    public Fragment Z(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            j.a aVar = this.c.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.i = aVar.h;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.q
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            this.N.m(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public CharSequence getBreadCrumbShortTitle() {
        if (this.n != 0) {
            return this.N.K0().g().getText(this.n);
        }
        return this.f34o;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getBreadCrumbShortTitleRes() {
        return this.n;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public CharSequence getBreadCrumbTitle() {
        if (this.l != 0) {
            return this.N.K0().g().getText(this.l);
        }
        return this.m;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getBreadCrumbTitleRes() {
        return this.l;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getId() {
        return this.P;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public String getName() {
        return this.k;
    }

    @Override // androidx.fragment.app.j
    public int m() {
        return S(false);
    }

    @Override // androidx.fragment.app.j
    public int n() {
        return S(true);
    }

    @Override // androidx.fragment.app.j
    public void o() {
        s();
        this.N.k0(this, false);
    }

    @Override // androidx.fragment.app.j
    public void p() {
        s();
        this.N.k0(this, true);
    }

    @Override // androidx.fragment.app.j
    public j r(Fragment fragment) {
        FragmentManager fragmentManager = fragment.o1;
        if (fragmentManager != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.r(fragment);
    }

    @Override // androidx.fragment.app.j
    public void t(int i, Fragment fragment, String str, int i2) {
        super.t(i, fragment, str, i2);
        fragment.o1 = this.N;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.P >= 0) {
            sb.append(" #");
            sb.append(this.P);
        }
        if (this.k != null) {
            sb.append(C4500Ve2.b);
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.j
    public j u(Fragment fragment) {
        FragmentManager fragmentManager = fragment.o1;
        if (fragmentManager != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.u(fragment);
    }

    @Override // androidx.fragment.app.j
    public boolean w() {
        return this.c.isEmpty();
    }

    @Override // androidx.fragment.app.j
    public j x(Fragment fragment) {
        FragmentManager fragmentManager = fragment.o1;
        if (fragmentManager != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.x(fragment);
    }

    public a(a aVar) {
        super(aVar.N.H0(), aVar.N.K0() != null ? aVar.N.K0().g().getClassLoader() : null, aVar);
        this.P = -1;
        this.Q = false;
        this.N = aVar.N;
        this.O = aVar.O;
        this.P = aVar.P;
        this.Q = aVar.Q;
    }
}
