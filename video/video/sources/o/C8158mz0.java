package o;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.mz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8158mz0 extends CH2 {
    public static final String k = "FragmentManager";
    public static final u.b l = new a();
    public final boolean g;
    public final HashMap<String, Fragment> d = new HashMap<>();
    public final HashMap<String, C8158mz0> e = new HashMap<>();
    public final HashMap<String, GH2> f = new HashMap<>();
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    /* renamed from: o.mz0$a */
    /* loaded from: classes.dex */
    public class a implements u.b {
        @Override // androidx.lifecycle.u.b
        public <T extends CH2> T b(Class<T> cls) {
            return new C8158mz0(true);
        }
    }

    public C8158mz0(boolean z) {
        this.g = z;
    }

    public static C8158mz0 m(GH2 gh2) {
        return (C8158mz0) new androidx.lifecycle.u(gh2, l).a(C8158mz0.class);
    }

    @Override // o.CH2
    public void e() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8158mz0.class == obj.getClass()) {
            C8158mz0 c8158mz0 = (C8158mz0) obj;
            if (this.d.equals(c8158mz0.d) && this.e.equals(c8158mz0.e) && this.f.equals(c8158mz0.f)) {
                return true;
            }
        }
        return false;
    }

    public void g(Fragment fragment) {
        if (this.j) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.d.containsKey(fragment.a1)) {
            this.d.put(fragment.a1, fragment);
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void h(Fragment fragment) {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        j(fragment.a1);
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public void i(String str) {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        j(str);
    }

    public final void j(String str) {
        C8158mz0 c8158mz0 = this.e.get(str);
        if (c8158mz0 != null) {
            c8158mz0.e();
            this.e.remove(str);
        }
        GH2 gh2 = this.f.get(str);
        if (gh2 != null) {
            gh2.a();
            this.f.remove(str);
        }
    }

    public Fragment k(String str) {
        return this.d.get(str);
    }

    public C8158mz0 l(Fragment fragment) {
        C8158mz0 c8158mz0 = this.e.get(fragment.a1);
        if (c8158mz0 == null) {
            C8158mz0 c8158mz02 = new C8158mz0(this.g);
            this.e.put(fragment.a1, c8158mz02);
            return c8158mz02;
        }
        return c8158mz0;
    }

    public Collection<Fragment> n() {
        return new ArrayList(this.d.values());
    }

    @Deprecated
    public C7897lz0 o() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, C8158mz0> entry : this.e.entrySet()) {
            C7897lz0 o2 = entry.getValue().o();
            if (o2 != null) {
                hashMap.put(entry.getKey(), o2);
            }
        }
        this.i = true;
        if (this.d.isEmpty() && hashMap.isEmpty() && this.f.isEmpty()) {
            return null;
        }
        return new C7897lz0(new ArrayList(this.d.values()), hashMap, new HashMap(this.f));
    }

    public GH2 p(Fragment fragment) {
        GH2 gh2 = this.f.get(fragment.a1);
        if (gh2 == null) {
            GH2 gh22 = new GH2();
            this.f.put(fragment.a1, gh22);
            return gh22;
        }
        return gh2;
    }

    public boolean q() {
        return this.h;
    }

    public void r(Fragment fragment) {
        if (this.j) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.d.remove(fragment.a1) != null && FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Deprecated
    public void s(C7897lz0 c7897lz0) {
        this.d.clear();
        this.e.clear();
        this.f.clear();
        if (c7897lz0 != null) {
            Collection<Fragment> b = c7897lz0.b();
            if (b != null) {
                for (Fragment fragment : b) {
                    if (fragment != null) {
                        this.d.put(fragment.a1, fragment);
                    }
                }
            }
            Map<String, C7897lz0> a2 = c7897lz0.a();
            if (a2 != null) {
                for (Map.Entry<String, C7897lz0> entry : a2.entrySet()) {
                    C8158mz0 c8158mz0 = new C8158mz0(this.g);
                    c8158mz0.s(entry.getValue());
                    this.e.put(entry.getKey(), c8158mz0);
                }
            }
            Map<String, GH2> c = c7897lz0.c();
            if (c != null) {
                this.f.putAll(c);
            }
        }
        this.i = false;
    }

    public void t(boolean z) {
        this.j = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(C6566gU0.h);
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(C6566gU0.h);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(C6566gU0.h);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public boolean u(Fragment fragment) {
        if (!this.d.containsKey(fragment.a1)) {
            return true;
        }
        if (this.g) {
            return this.h;
        }
        return !this.i;
    }
}
