package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.HT1;
import o.InterfaceC8687p91;

@InterfaceC6184ey2
@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class RB<T extends InterfaceC8687p91<T>> {
    public final Map<Integer, T> a = new HashMap();
    public final Set<Integer> b = new HashSet();
    public b c;
    public boolean d;
    public boolean e;

    /* loaded from: classes3.dex */
    public class a implements InterfaceC8687p91.a<T> {
        public a() {
        }

        @Override // o.InterfaceC8687p91.a
        /* renamed from: b */
        public void a(T t, boolean z) {
            if (z) {
                if (!RB.this.g(t)) {
                    return;
                }
            } else {
                RB rb = RB.this;
                if (!rb.t(t, rb.e)) {
                    return;
                }
            }
            RB.this.n();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(@InterfaceC5670cr1 Set<Integer> set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t) {
        this.a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            g(t);
        }
        t.setInternalOnCheckedChangeListener(new a());
    }

    public void f(@PL0 int i) {
        T t = this.a.get(Integer.valueOf(i));
        if (t != null && g(t)) {
            n();
        }
    }

    public final boolean g(@InterfaceC5670cr1 InterfaceC8687p91<T> interfaceC8687p91) {
        int id = interfaceC8687p91.getId();
        if (this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.a.get(Integer.valueOf(k()));
        if (t != null) {
            t(t, false);
        }
        boolean add = this.b.add(Integer.valueOf(id));
        if (!interfaceC8687p91.isChecked()) {
            interfaceC8687p91.setChecked(true);
        }
        return add;
    }

    public void h() {
        boolean isEmpty = this.b.isEmpty();
        for (T t : this.a.values()) {
            t(t, false);
        }
        if (!isEmpty) {
            n();
        }
    }

    @InterfaceC5670cr1
    public Set<Integer> i() {
        return new HashSet(this.b);
    }

    @InterfaceC5670cr1
    public List<Integer> j(@InterfaceC5670cr1 ViewGroup viewGroup) {
        Set<Integer> i = i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof InterfaceC8687p91) && i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @PL0
    public int k() {
        if (this.d && !this.b.isEmpty()) {
            return this.b.iterator().next().intValue();
        }
        return -1;
    }

    public boolean l() {
        return this.e;
    }

    public boolean m() {
        return this.d;
    }

    public final void n() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    public void o(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.a.remove(Integer.valueOf(t.getId()));
        this.b.remove(Integer.valueOf(t.getId()));
    }

    public void p(@InterfaceC11300zs1 b bVar) {
        this.c = bVar;
    }

    public void q(boolean z) {
        this.e = z;
    }

    public void r(boolean z) {
        if (this.d != z) {
            this.d = z;
            h();
        }
    }

    public void s(@PL0 int i) {
        T t = this.a.get(Integer.valueOf(i));
        if (t != null && t(t, this.e)) {
            n();
        }
    }

    public final boolean t(@InterfaceC5670cr1 InterfaceC8687p91<T> interfaceC8687p91, boolean z) {
        int id = interfaceC8687p91.getId();
        if (!this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.b.size() == 1 && this.b.contains(Integer.valueOf(id))) {
            interfaceC8687p91.setChecked(true);
            return false;
        }
        boolean remove = this.b.remove(Integer.valueOf(id));
        if (interfaceC8687p91.isChecked()) {
            interfaceC8687p91.setChecked(false);
        }
        return remove;
    }
}
