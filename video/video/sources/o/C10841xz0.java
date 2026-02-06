package o;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.xz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10841xz0 {
    public static final String e = "FragmentManager";
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, androidx.fragment.app.h> b = new HashMap<>();
    public final HashMap<String, Bundle> c = new HashMap<>();
    public C8158mz0 d;

    public ArrayList<String> A() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.a.size());
                Iterator<Fragment> it = this.a.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.a1);
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.a1 + "): " + next);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(C8158mz0 c8158mz0) {
        this.d = c8158mz0;
    }

    public Bundle C(String str, Bundle bundle) {
        if (bundle != null) {
            return this.c.put(str, bundle);
        }
        return this.c.remove(str);
    }

    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.g1 = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        if (this.b.get(str) != null) {
            return true;
        }
        return false;
    }

    public void d(int i) {
        for (androidx.fragment.app.h hVar : this.b.values()) {
            if (hVar != null) {
                hVar.t(i);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.h hVar : this.b.values()) {
                printWriter.print(str);
                if (hVar != null) {
                    Fragment k = hVar.k();
                    printWriter.println(k);
                    k.k(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.a.get(i).toString());
            }
        }
    }

    public Fragment f(String str) {
        androidx.fragment.app.h hVar = this.b.get(str);
        if (hVar != null) {
            return hVar.k();
        }
        return null;
    }

    public Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.s1 == i) {
                return fragment;
            }
        }
        for (androidx.fragment.app.h hVar : this.b.values()) {
            if (hVar != null) {
                Fragment k = hVar.k();
                if (k.s1 == i) {
                    return k;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.u1)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (androidx.fragment.app.h hVar : this.b.values()) {
                if (hVar != null) {
                    Fragment k = hVar.k();
                    if (str.equals(k.u1)) {
                        return k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment m;
        for (androidx.fragment.app.h hVar : this.b.values()) {
            if (hVar != null && (m = hVar.k().m(str)) != null) {
                return m;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.C1;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.a.get(i);
            if (fragment2.C1 == viewGroup && (view2 = fragment2.D1) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(indexOf);
            if (fragment3.C1 == viewGroup && (view = fragment3.D1) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public int k() {
        return this.b.size();
    }

    public List<androidx.fragment.app.h> l() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.h hVar : this.b.values()) {
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.h hVar : this.b.values()) {
            if (hVar != null) {
                arrayList.add(hVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap<String, Bundle> n() {
        return this.c;
    }

    public androidx.fragment.app.h o(String str) {
        return this.b.get(str);
    }

    public List<Fragment> p() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public C8158mz0 q() {
        return this.d;
    }

    public Bundle r(String str) {
        return this.c.get(str);
    }

    public void s(androidx.fragment.app.h hVar) {
        Fragment k = hVar.k();
        if (!c(k.a1)) {
            this.b.put(k.a1, hVar);
            if (k.y1) {
                if (k.x1) {
                    this.d.g(k);
                } else {
                    this.d.r(k);
                }
                k.y1 = false;
            }
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    public void t(androidx.fragment.app.h hVar) {
        Fragment k = hVar.k();
        if (k.x1) {
            this.d.r(k);
        }
        if (this.b.get(k.a1) == hVar && this.b.put(k.a1, null) != null && FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    public void u() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.h hVar = this.b.get(it.next().a1);
            if (hVar != null) {
                hVar.m();
            }
        }
        for (androidx.fragment.app.h hVar2 : this.b.values()) {
            if (hVar2 != null) {
                hVar2.m();
                Fragment k = hVar2.k();
                if (k.h1 && !k.y0()) {
                    if (k.i1 && !this.c.containsKey(k.a1)) {
                        C(k.a1, hVar2.r());
                    }
                    t(hVar2);
                }
            }
        }
    }

    public void v(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.g1 = false;
    }

    public void w() {
        this.b.clear();
    }

    public void x(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = f(str);
                if (f != null) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f);
                    }
                    a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + C9811tl1.d);
                }
            }
        }
    }

    public void y(HashMap<String, Bundle> hashMap) {
        this.c.clear();
        this.c.putAll(hashMap);
    }

    public ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>(this.b.size());
        for (androidx.fragment.app.h hVar : this.b.values()) {
            if (hVar != null) {
                Fragment k = hVar.k();
                C(k.a1, hVar.r());
                arrayList.add(k.a1);
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + k.Y);
                }
            }
        }
        return arrayList;
    }
}
