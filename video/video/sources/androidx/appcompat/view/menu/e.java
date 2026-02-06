package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C10201vM;
import o.InterfaceMenuC9553sh2;
import o.U4;

/* loaded from: classes.dex */
public class e implements InterfaceMenuC9553sh2 {
    public static final String L = "MenuBuilder";
    public static final String M = "android:menu:presenters";
    public static final String N = "android:menu:actionviewstates";
    public static final String O = "android:menu:expandedactionview";
    public static final int[] P = {1, 4, 5, 3, 2, 0};
    public View A;
    public h I;
    public boolean K;
    public final Context l;
    public final Resources m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8o;
    public a p;
    public ContextMenu.ContextMenuInfo x;
    public CharSequence y;
    public Drawable z;
    public int w = 0;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public ArrayList<h> G = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<j>> H = new CopyOnWriteArrayList<>();
    public boolean J = false;
    public ArrayList<h> q = new ArrayList<>();
    public ArrayList<h> r = new ArrayList<>();
    public boolean s = true;
    public ArrayList<h> t = new ArrayList<>();
    public ArrayList<h> u = new ArrayList<>();
    public boolean v = true;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean b(h hVar);
    }

    public e(Context context) {
        this.l = context;
        this.m = context.getResources();
        l0(true);
    }

    public static int E(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = P;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int q(ArrayList<h> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<h> C() {
        u();
        return this.u;
    }

    public boolean D() {
        return this.E;
    }

    public Resources F() {
        return this.m;
    }

    public e G() {
        return this;
    }

    public ArrayList<h> H() {
        if (!this.s) {
            return this.r;
        }
        this.r.clear();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            h hVar = this.q.get(i);
            if (hVar.isVisible()) {
                this.r.add(hVar);
            }
        }
        this.s = false;
        this.v = true;
        return this.r;
    }

    public boolean I() {
        return !this.B;
    }

    public boolean J() {
        return this.J;
    }

    public boolean K() {
        return this.n;
    }

    public boolean L() {
        return this.f8o;
    }

    public void M(h hVar) {
        this.v = true;
        O(true);
    }

    public void N(h hVar) {
        this.s = true;
        O(true);
    }

    public void O(boolean z) {
        if (!this.B) {
            if (z) {
                this.s = true;
                this.v = true;
            }
            j(z);
            return;
        }
        this.C = true;
        if (z) {
            this.D = true;
        }
    }

    public boolean P(MenuItem menuItem, int i) {
        return Q(menuItem, null, i);
    }

    public boolean Q(MenuItem menuItem, j jVar, int i) {
        boolean z;
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean n = hVar.n();
        U4 a2 = hVar.a();
        if (a2 != null && a2.b()) {
            z = true;
        } else {
            z = false;
        }
        if (hVar.m()) {
            boolean expandActionView = hVar.expandActionView() | n;
            if (expandActionView) {
                f(true);
            }
            return expandActionView;
        } else if (!hVar.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                f(true);
            }
            return n;
        } else {
            if ((i & 4) == 0) {
                f(false);
            }
            if (!hVar.hasSubMenu()) {
                hVar.A(new m(x(), this, hVar));
            }
            m mVar = (m) hVar.getSubMenu();
            if (z) {
                a2.g(mVar);
            }
            boolean m = m(mVar, jVar) | n;
            if (!m) {
                f(true);
            }
            return m;
        }
    }

    public void R(int i) {
        S(i, true);
    }

    public final void S(int i, boolean z) {
        if (i >= 0 && i < this.q.size()) {
            this.q.remove(i);
            if (z) {
                O(true);
            }
        }
    }

    public void T(j jVar) {
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.H.remove(next);
            }
        }
    }

    public void U(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).U(bundle);
                }
            }
            int i2 = bundle.getInt(O);
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).W(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void X(Bundle bundle) {
        l(bundle);
    }

    public void Y(a aVar) {
        this.p = aVar;
    }

    public void Z(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.x = contextMenuInfo;
    }

    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int E = E(i3);
        h h = h(i, i2, i3, E, charSequence, this.w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.x;
        if (contextMenuInfo != null) {
            h.y(contextMenuInfo);
        }
        ArrayList<h> arrayList = this.q;
        arrayList.add(q(arrayList, E), h);
        O(true);
        return h;
    }

    public e a0(int i) {
        this.w = i;
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.l.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.l);
    }

    public void b0(MenuItem menuItem) {
        boolean z;
        int groupId = menuItem.getGroupId();
        int size = this.q.size();
        n0();
        for (int i = 0; i < size; i++) {
            h hVar = this.q.get(i);
            if (hVar.getGroupId() == groupId && hVar.p() && hVar.isCheckable()) {
                if (hVar == menuItem) {
                    z = true;
                } else {
                    z = false;
                }
                hVar.v(z);
            }
        }
        m0();
    }

    public void c(j jVar, Context context) {
        this.H.add(new WeakReference<>(jVar));
        jVar.l(context, this);
        this.v = true;
    }

    public e c0(int i) {
        e0(0, null, i, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        h hVar = this.I;
        if (hVar != null) {
            g(hVar);
        }
        this.q.clear();
        O(true);
    }

    public void clearHeader() {
        this.z = null;
        this.y = null;
        this.A = null;
        O(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public e d0(Drawable drawable) {
        e0(0, null, 0, drawable, null);
        return this;
    }

    public void e() {
        this.B = true;
        clear();
        clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        O(true);
    }

    public final void e0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources F = F();
        if (view != null) {
            this.A = view;
            this.y = null;
            this.z = null;
        } else {
            if (i > 0) {
                this.y = F.getText(i);
            } else if (charSequence != null) {
                this.y = charSequence;
            }
            if (i2 > 0) {
                this.z = C10201vM.l(x(), i2);
            } else if (drawable != null) {
                this.z = drawable;
            }
            this.A = null;
        }
        O(false);
    }

    public final void f(boolean z) {
        if (this.F) {
            return;
        }
        this.F = true;
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.H.remove(next);
            } else {
                jVar.a(this, z);
            }
        }
        this.F = false;
    }

    public e f0(int i) {
        e0(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.q.get(i2);
            if (hVar.getItemId() == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(h hVar) {
        boolean z = false;
        if (!this.H.isEmpty() && this.I == hVar) {
            n0();
            Iterator<WeakReference<j>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.H.remove(next);
                } else {
                    z = jVar.k(this, hVar);
                    if (z) {
                        break;
                    }
                }
            }
            m0();
            if (z) {
                this.I = null;
            }
        }
        return z;
    }

    public e g0(CharSequence charSequence) {
        e0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.q.get(i);
    }

    public final h h(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new h(this, i, i2, i3, i4, charSequence, i5);
    }

    public e h0(View view) {
        e0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.q.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean i(e eVar, MenuItem menuItem) {
        a aVar = this.p;
        if (aVar != null && aVar.a(eVar, menuItem)) {
            return true;
        }
        return false;
    }

    public void i0(boolean z) {
        this.E = z;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (s(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final void j(boolean z) {
        if (this.H.isEmpty()) {
            return;
        }
        n0();
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.H.remove(next);
            } else {
                jVar.i(z);
            }
        }
        m0();
    }

    public void j0(boolean z) {
        this.K = z;
    }

    public final void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(M);
        if (sparseParcelableArray != null && !this.H.isEmpty()) {
            Iterator<WeakReference<j>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.H.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.e(parcelable);
                    }
                }
            }
        }
    }

    public void k0(boolean z) {
        if (this.f8o == z) {
            return;
        }
        l0(z);
        O(false);
    }

    public final void l(Bundle bundle) {
        Parcelable h;
        if (this.H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.H.remove(next);
            } else {
                int id = jVar.getId();
                if (id > 0 && (h = jVar.h()) != null) {
                    sparseArray.put(id, h);
                }
            }
        }
        bundle.putSparseParcelableArray(M, sparseArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (o.C7486kH2.n(android.view.ViewConfiguration.get(r2.l), r2.l) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(boolean z) {
        boolean z2;
        if (z) {
            z2 = true;
            if (this.m.getConfiguration().keyboard != 1) {
            }
        }
        z2 = false;
        this.f8o = z2;
    }

    public final boolean m(m mVar, j jVar) {
        boolean z = false;
        if (this.H.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z = jVar.f(mVar);
        }
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.H.remove(next);
            } else if (!z) {
                z = jVar2.f(mVar);
            }
        }
        return z;
    }

    public void m0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            O(this.D);
        }
    }

    public boolean n(h hVar) {
        boolean z = false;
        if (this.H.isEmpty()) {
            return false;
        }
        n0();
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.H.remove(next);
            } else {
                z = jVar.c(this, hVar);
                if (z) {
                    break;
                }
            }
        }
        m0();
        if (z) {
            this.I = hVar;
        }
        return z;
    }

    public void n0() {
        if (!this.B) {
            this.B = true;
            this.C = false;
            this.D = false;
        }
    }

    public int o(int i) {
        return p(i, 0);
    }

    public int p(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.q.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return P(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        h s = s(i, keyEvent);
        if (s != null) {
            z = P(s, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            f(true);
        }
        return z;
    }

    public int r(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.q.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int o2 = o(i);
        if (o2 >= 0) {
            int size = this.q.size() - o2;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.q.get(o2).getGroupId() != i) {
                    break;
                }
                S(o2, false);
                i2 = i3;
            }
            O(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        S(r(i), true);
    }

    public h s(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<h> arrayList = this.G;
        arrayList.clear();
        t(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean K = K();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = arrayList.get(i2);
            if (K) {
                numericShortcut = hVar.getAlphabeticShortcut();
            } else {
                numericShortcut = hVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (K && numericShortcut == '\b' && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.q.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.w(z2);
                hVar.setCheckable(z);
            }
        }
    }

    @Override // o.InterfaceMenuC9553sh2, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.J = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.q.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.q.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.q.get(i2);
            if (hVar.getGroupId() == i && hVar.B(z)) {
                z2 = true;
            }
        }
        if (z2) {
            O(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        O(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.q.size();
    }

    public void t(List<h> list, int i, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean K = K();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = this.q.get(i2);
                if (hVar.hasSubMenu()) {
                    ((e) hVar.getSubMenu()).t(list, i, keyEvent);
                }
                if (K) {
                    numericShortcut = hVar.getAlphabeticShortcut();
                } else {
                    numericShortcut = hVar.getNumericShortcut();
                }
                if (K) {
                    numericModifiers = hVar.getAlphabeticModifiers();
                } else {
                    numericModifiers = hVar.getNumericModifiers();
                }
                if ((modifiers & InterfaceMenuC9553sh2.e) == (numericModifiers & InterfaceMenuC9553sh2.e) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (K && numericShortcut == '\b' && i == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<h> H = H();
        if (!this.v) {
            return;
        }
        Iterator<WeakReference<j>> it = this.H.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.H.remove(next);
            } else {
                z |= jVar.j();
            }
        }
        if (z) {
            this.t.clear();
            this.u.clear();
            int size = H.size();
            for (int i = 0; i < size; i++) {
                h hVar = H.get(i);
                if (hVar.o()) {
                    this.t.add(hVar);
                } else {
                    this.u.add(hVar);
                }
            }
        } else {
            this.t.clear();
            this.u.clear();
            this.u.addAll(H());
        }
        this.v = false;
    }

    public ArrayList<h> v() {
        u();
        return this.t;
    }

    public String w() {
        return N;
    }

    public Context x() {
        return this.l;
    }

    public h y() {
        return this.I;
    }

    public Drawable z() {
        return this.z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        h hVar = (h) a(i, i2, i3, charSequence);
        m mVar = new m(this.l, this, hVar);
        hVar.A(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.m.getString(i4));
    }
}
