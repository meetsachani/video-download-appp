package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import androidx.lifecycle.f;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC2891Eu1;
import o.AbstractC5216az0;
import o.AbstractC5244b6;
import o.AbstractC5701cz0;
import o.ActivityC4864Yy0;
import o.C10355vz0;
import o.C10841xz0;
import o.C2513Az0;
import o.C4500Ve2;
import o.C6208f41;
import o.C7897lz0;
import o.C8158mz0;
import o.C9070qk;
import o.C9254rS0;
import o.C9329rm1;
import o.G5;
import o.GH2;
import o.H5;
import o.HH2;
import o.InterfaceC10042ui1;
import o.InterfaceC10929yL;
import o.InterfaceC3294Iu1;
import o.InterfaceC3313Ja2;
import o.InterfaceC3587Lu1;
import o.InterfaceC5201av1;
import o.InterfaceC5486c6;
import o.InterfaceC5928dv1;
import o.InterfaceC7587ki1;
import o.InterfaceC8386nv1;
import o.InterfaceC8401nz0;
import o.InterfaceC9138qz0;
import o.InterfaceC9380rz0;
import o.KZ0;
import o.LayoutInflater$Factory2C5943dz0;
import o.O5;
import o.OX1;
import o.P5;
import o.TD0;
import o.X5;
import o.XC1;
import o.XL1;

/* loaded from: classes.dex */
public abstract class FragmentManager implements InterfaceC9380rz0 {
    public static final String S = "android:support:fragments";
    public static final String T = "state";
    public static final String U = "result_";
    public static final String V = "fragment_";
    public static boolean W = false;
    public static final String X = "FragmentManager";
    public static final int Y = 1;
    public static final String Z = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public X5<Intent> D;
    public X5<C9254rS0> E;
    public X5<String[]> F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList<androidx.fragment.app.a> M;
    public ArrayList<Boolean> N;
    public ArrayList<Fragment> O;
    public C8158mz0 P;
    public C2513Az0.c Q;
    public boolean b;
    public ArrayList<androidx.fragment.app.a> d;
    public ArrayList<Fragment> e;
    public OnBackPressedDispatcher g;
    public ArrayList<p> m;
    public AbstractC5701cz0<?> v;
    public AbstractC5216az0 w;
    public Fragment x;
    public Fragment y;
    public final ArrayList<q> a = new ArrayList<>();
    public final C10841xz0 c = new C10841xz0();
    public final LayoutInflater$Factory2C5943dz0 f = new LayoutInflater$Factory2C5943dz0(this);
    public final AbstractC2891Eu1 h = new b(false);
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, C9070qk> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> k = Collections.synchronizedMap(new HashMap());
    public final Map<String, o> l = Collections.synchronizedMap(new HashMap());
    public final androidx.fragment.app.f n = new androidx.fragment.app.f(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC8401nz0> f32o = new CopyOnWriteArrayList<>();
    public final InterfaceC10929yL<Configuration> p = new InterfaceC10929yL() { // from class: o.fz0
        @Override // o.InterfaceC10929yL
        public final void accept(Object obj) {
            FragmentManager.i(FragmentManager.this, (Configuration) obj);
        }
    };
    public final InterfaceC10929yL<Integer> q = new InterfaceC10929yL() { // from class: o.gz0
        @Override // o.InterfaceC10929yL
        public final void accept(Object obj) {
            FragmentManager.e(FragmentManager.this, (Integer) obj);
        }
    };
    public final InterfaceC10929yL<C9329rm1> r = new InterfaceC10929yL() { // from class: o.hz0
        @Override // o.InterfaceC10929yL
        public final void accept(Object obj) {
            FragmentManager.h(FragmentManager.this, (C9329rm1) obj);
        }
    };
    public final InterfaceC10929yL<XC1> s = new InterfaceC10929yL() { // from class: o.iz0
        @Override // o.InterfaceC10929yL
        public final void accept(Object obj) {
            FragmentManager.g(FragmentManager.this, (XC1) obj);
        }
    };
    public final InterfaceC10042ui1 t = new c();
    public int u = -1;
    public androidx.fragment.app.e z = null;
    public androidx.fragment.app.e A = new d();
    public InterfaceC3313Ja2 B = null;
    public InterfaceC3313Ja2 C = new e();
    public ArrayDeque<n> G = new ArrayDeque<>();
    public Runnable R = new f();

    /* loaded from: classes.dex */
    public class a implements H5<Map<String, Boolean>> {
        public a() {
        }

        @Override // o.H5
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            n pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.X;
            int i3 = pollFirst.Y;
            Fragment i4 = FragmentManager.this.c.i(str);
            if (i4 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i4.h1(i3, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            FragmentManager.this.T0();
        }
    }

    /* loaded from: classes.dex */
    public class c implements InterfaceC10042ui1 {
        public c() {
        }

        @Override // o.InterfaceC10042ui1
        public void a(Menu menu) {
            FragmentManager.this.S(menu);
        }

        @Override // o.InterfaceC10042ui1
        public void b(Menu menu) {
            FragmentManager.this.W(menu);
        }

        @Override // o.InterfaceC10042ui1
        public boolean c(MenuItem menuItem) {
            return FragmentManager.this.R(menuItem);
        }

        @Override // o.InterfaceC10042ui1
        public void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.K(menu, menuInflater);
        }
    }

    /* loaded from: classes.dex */
    public class d extends androidx.fragment.app.e {
        public d() {
        }

        @Override // androidx.fragment.app.e
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.K0().c(FragmentManager.this.K0().g(), str, null);
        }
    }

    /* loaded from: classes.dex */
    public class e implements InterfaceC3313Ja2 {
        public e() {
        }

        @Override // o.InterfaceC3313Ja2
        public androidx.fragment.app.k a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.j0(true);
        }
    }

    /* loaded from: classes.dex */
    public class g implements InterfaceC8401nz0 {
        public final /* synthetic */ Fragment X;

        public g(Fragment fragment) {
            this.X = fragment;
        }

        @Override // o.InterfaceC8401nz0
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.X.L0(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class h implements H5<G5> {
        public h() {
        }

        @Override // o.H5
        /* renamed from: b */
        public void a(G5 g5) {
            n pollLast = FragmentManager.this.G.pollLast();
            if (pollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollLast.X;
            int i = pollLast.Y;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.I0(i, g5.b(), g5.a());
        }
    }

    /* loaded from: classes.dex */
    public class i implements H5<G5> {
        public i() {
        }

        @Override // o.H5
        /* renamed from: b */
        public void a(G5 g5) {
            n pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.X;
            int i = pollFirst.Y;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.I0(i, g5.b(), g5.a());
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Deprecated
        CharSequence getBreadCrumbTitle();

        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        String getName();
    }

    /* loaded from: classes.dex */
    public class k implements q {
        public final String a;

        public k(String str) {
            this.a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.z(arrayList, arrayList2, this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends O5<C9254rS0, G5> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, C9254rS0 c9254rS0) {
            Bundle bundleExtra;
            Intent intent = new Intent(P5.n.b);
            Intent a = c9254rS0.a();
            if (a != null && (bundleExtra = a.getBundleExtra(P5.m.b)) != null) {
                intent.putExtra(P5.m.b, bundleExtra);
                a.removeExtra(P5.m.b);
                if (a.getBooleanExtra(FragmentManager.Z, false)) {
                    c9254rS0 = new C9254rS0.a(c9254rS0.d()).b(null).c(c9254rS0.c(), c9254rS0.b()).a();
                }
            }
            intent.putExtra(P5.n.c, c9254rS0);
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // o.O5
        /* renamed from: e */
        public G5 c(int i, Intent intent) {
            return new G5(i, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        @Deprecated
        public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void d(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void i(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void k(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void l(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public static class o implements InterfaceC9138qz0 {
        public final androidx.lifecycle.f a;
        public final InterfaceC9138qz0 b;
        public final androidx.lifecycle.i c;

        public o(androidx.lifecycle.f fVar, InterfaceC9138qz0 interfaceC9138qz0, androidx.lifecycle.i iVar) {
            this.a = fVar;
            this.b = interfaceC9138qz0;
            this.c = iVar;
        }

        @Override // o.InterfaceC9138qz0
        public void a(String str, Bundle bundle) {
            this.b.a(str, bundle);
        }

        public boolean b(f.b bVar) {
            return this.a.b().g(bVar);
        }

        public void c() {
            this.a.d(this.c);
        }
    }

    /* loaded from: classes.dex */
    public interface p {
        default void a(Fragment fragment, boolean z) {
        }

        default void b(Fragment fragment, boolean z) {
        }

        void onBackStackChanged();
    }

    /* loaded from: classes.dex */
    public interface q {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class r implements q {
        public final String a;
        public final int b;
        public final int c;

        public r(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.y;
            if (fragment != null && this.b < 0 && this.a == null && fragment.u().r1()) {
                return false;
            }
            return FragmentManager.this.v1(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    /* loaded from: classes.dex */
    public class s implements q {
        public final String a;

        public s(String str) {
            this.a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.G1(arrayList, arrayList2, this.a);
        }
    }

    /* loaded from: classes.dex */
    public class t implements q {
        public final String a;

        public t(String str) {
            this.a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.O1(arrayList, arrayList2, this.a);
        }
    }

    public static int K1(int i2) {
        if (i2 != 4097) {
            if (i2 != 8194) {
                if (i2 != 8197) {
                    if (i2 != 4099) {
                        if (i2 != 4100) {
                            return 0;
                        }
                        return androidx.fragment.app.j.M;
                    }
                    return androidx.fragment.app.j.K;
                }
                return androidx.fragment.app.j.L;
            }
            return androidx.fragment.app.j.I;
        }
        return 8194;
    }

    public static Fragment R0(View view) {
        Object tag = view.getTag(XL1.c.a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean X0(int i2) {
        if (!W && !Log.isLoggable("FragmentManager", i2)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.Z0() && num.intValue() == 80) {
            fragmentManager.N(false);
        }
    }

    @Deprecated
    public static void f0(boolean z) {
        W = z;
    }

    public static /* synthetic */ void g(FragmentManager fragmentManager, XC1 xc1) {
        if (fragmentManager.Z0()) {
            fragmentManager.V(xc1.b(), false);
        }
    }

    public static /* synthetic */ void h(FragmentManager fragmentManager, C9329rm1 c9329rm1) {
        if (fragmentManager.Z0()) {
            fragmentManager.O(c9329rm1.b(), false);
        }
    }

    public static /* synthetic */ void i(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.Z0()) {
            fragmentManager.H(configuration, false);
        }
    }

    public static void l0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.Q(-1);
                aVar.W();
            } else {
                aVar.Q(1);
                aVar.V();
            }
            i2++;
        }
    }

    public static <F extends Fragment> F q0(View view) {
        F f2 = (F) v0(view);
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager u0(View view) {
        ActivityC4864Yy0 activityC4864Yy0;
        Fragment v0 = v0(view);
        if (v0 != null) {
            if (v0.v0()) {
                return v0.u();
            }
            throw new IllegalStateException("The Fragment " + v0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof ActivityC4864Yy0) {
                    activityC4864Yy0 = (ActivityC4864Yy0) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activityC4864Yy0 = null;
                break;
            }
        }
        if (activityC4864Yy0 != null) {
            return activityC4864Yy0.W0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static Fragment v0(View view) {
        while (view != null) {
            Fragment R0 = R0(view);
            if (R0 != null) {
                return R0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public final void A() {
        boolean z;
        AbstractC5701cz0<?> abstractC5701cz0 = this.v;
        if (abstractC5701cz0 instanceof HH2) {
            z = this.c.q().q();
        } else if (abstractC5701cz0.g() instanceof Activity) {
            z = !((Activity) this.v.g()).isChangingConfigurations();
        } else {
            z = true;
        }
        if (z) {
            for (C9070qk c9070qk : this.j.values()) {
                for (String str : c9070qk.X) {
                    this.c.q().i(str);
                }
            }
        }
    }

    public List<Fragment> A0() {
        return this.c.m();
    }

    public void A1(p pVar) {
        ArrayList<p> arrayList = this.m;
        if (arrayList != null) {
            arrayList.remove(pVar);
        }
    }

    public final Set<androidx.fragment.app.k> B() {
        HashSet hashSet = new HashSet();
        for (androidx.fragment.app.h hVar : this.c.l()) {
            ViewGroup viewGroup = hVar.k().C1;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.k.s(viewGroup, P0()));
            }
        }
        return hashSet;
    }

    public j B0(int i2) {
        return this.d.get(i2);
    }

    public final void B1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).r) {
                        if (i3 != i2) {
                            m0(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                                i3++;
                            }
                        }
                        m0(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    m0(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final Set<androidx.fragment.app.k> C(ArrayList<androidx.fragment.app.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<j.a> it = arrayList.get(i2).c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.C1) != null) {
                    hashSet.add(androidx.fragment.app.k.r(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public int C0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void C1(Fragment fragment) {
        this.P.r(fragment);
    }

    public androidx.fragment.app.h D(Fragment fragment) {
        androidx.fragment.app.h o2 = this.c.o(fragment.a1);
        if (o2 != null) {
            return o2;
        }
        androidx.fragment.app.h hVar = new androidx.fragment.app.h(this.n, this.c, fragment);
        hVar.o(this.v.g().getClassLoader());
        hVar.t(this.u);
        return hVar;
    }

    public final C8158mz0 D0(Fragment fragment) {
        return this.P.l(fragment);
    }

    public final void D1() {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.m.get(i2).onBackStackChanged();
            }
        }
    }

    public void E(Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.w1) {
            fragment.w1 = true;
            if (fragment.g1) {
                if (X0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.c.v(fragment);
                if (Y0(fragment)) {
                    this.H = true;
                }
                X1(fragment);
            }
        }
    }

    public AbstractC5216az0 E0() {
        return this.w;
    }

    public void E1(Parcelable parcelable, C7897lz0 c7897lz0) {
        if (this.v instanceof HH2) {
            a2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.P.s(c7897lz0);
        I1(parcelable);
    }

    public void F() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(4);
    }

    public Fragment F0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment o0 = o0(string);
        if (o0 == null) {
            a2(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return o0;
    }

    public void F1(String str) {
        h0(new s(str), false);
    }

    public void G() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(0);
    }

    public final ViewGroup G0(Fragment fragment) {
        ViewGroup viewGroup = fragment.C1;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.t1 > 0 && this.w.e()) {
            View d2 = this.w.d(fragment.t1);
            if (d2 instanceof ViewGroup) {
                return (ViewGroup) d2;
            }
        }
        return null;
    }

    public boolean G1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        C9070qk remove = this.j.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<androidx.fragment.app.a> it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.a next = it.next();
            if (next.Q) {
                Iterator<j.a> it2 = next.c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().b;
                    if (fragment != null) {
                        hashMap.put(fragment.a1, fragment);
                    }
                }
            }
        }
        while (true) {
            boolean z = false;
            for (androidx.fragment.app.a aVar : remove.a(this, hashMap)) {
                if (aVar.a(arrayList, arrayList2) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public void H(Configuration configuration, boolean z) {
        if (z && (this.v instanceof InterfaceC3587Lu1)) {
            a2(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null) {
                fragment.q1(configuration);
                if (z) {
                    fragment.q1.H(configuration, true);
                }
            }
        }
    }

    public androidx.fragment.app.e H0() {
        androidx.fragment.app.e eVar = this.z;
        if (eVar != null) {
            return eVar;
        }
        Fragment fragment = this.x;
        if (fragment != null) {
            return fragment.o1.H0();
        }
        return this.A;
    }

    public void H1(Parcelable parcelable) {
        if (this.v instanceof OX1) {
            a2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        I1(parcelable);
    }

    public boolean I(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && fragment.r1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public C10841xz0 I0() {
        return this.c;
    }

    public void I1(Parcelable parcelable) {
        androidx.fragment.app.h hVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String str : bundle3.keySet()) {
                if (str.startsWith(U) && (bundle2 = bundle3.getBundle(str)) != null) {
                    bundle2.setClassLoader(this.v.g().getClassLoader());
                    this.k.put(str.substring(7), bundle2);
                }
            }
            HashMap<String, Bundle> hashMap = new HashMap<>();
            for (String str2 : bundle3.keySet()) {
                if (str2.startsWith(V) && (bundle = bundle3.getBundle(str2)) != null) {
                    bundle.setClassLoader(this.v.g().getClassLoader());
                    hashMap.put(str2.substring(9), bundle);
                }
            }
            this.c.y(hashMap);
            androidx.fragment.app.g gVar = (androidx.fragment.app.g) bundle3.getParcelable("state");
            if (gVar == null) {
                return;
            }
            this.c.w();
            Iterator<String> it = gVar.X.iterator();
            while (it.hasNext()) {
                Bundle C = this.c.C(it.next(), null);
                if (C != null) {
                    Fragment k2 = this.P.k(((C10355vz0) C.getParcelable("state")).Y);
                    if (k2 != null) {
                        if (X0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + k2);
                        }
                        hVar = new androidx.fragment.app.h(this.n, this.c, k2, C);
                    } else {
                        hVar = new androidx.fragment.app.h(this.n, this.c, this.v.g().getClassLoader(), H0(), C);
                    }
                    Fragment k3 = hVar.k();
                    k3.Y = C;
                    k3.o1 = this;
                    if (X0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: active (" + k3.a1 + "): " + k3);
                    }
                    hVar.o(this.v.g().getClassLoader());
                    this.c.s(hVar);
                    hVar.t(this.u);
                }
            }
            for (Fragment fragment : this.P.n()) {
                if (!this.c.c(fragment.a1)) {
                    if (X0(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + gVar.X);
                    }
                    this.P.r(fragment);
                    fragment.o1 = this;
                    androidx.fragment.app.h hVar2 = new androidx.fragment.app.h(this.n, this.c, fragment);
                    hVar2.t(1);
                    hVar2.m();
                    fragment.h1 = true;
                    hVar2.m();
                }
            }
            this.c.x(gVar.Y);
            if (gVar.Z != null) {
                this.d = new ArrayList<>(gVar.Z.length);
                int i2 = 0;
                while (true) {
                    androidx.fragment.app.b[] bVarArr = gVar.Z;
                    if (i2 >= bVarArr.length) {
                        break;
                    }
                    androidx.fragment.app.a b2 = bVarArr[i2].b(this);
                    if (X0(2)) {
                        Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + b2.P + "): " + b2);
                        PrintWriter printWriter = new PrintWriter(new C6208f41("FragmentManager"));
                        b2.U(TD0.a.Y0, printWriter, false);
                        printWriter.close();
                    }
                    this.d.add(b2);
                    i2++;
                }
            } else {
                this.d = null;
            }
            this.i.set(gVar.Y0);
            String str3 = gVar.Z0;
            if (str3 != null) {
                Fragment o0 = o0(str3);
                this.y = o0;
                T(o0);
            }
            ArrayList<String> arrayList = gVar.a1;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    this.j.put(arrayList.get(i3), gVar.b1.get(i3));
                }
            }
            this.G = new ArrayDeque<>(gVar.c1);
        }
    }

    public void J() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(1);
    }

    public List<Fragment> J0() {
        return this.c.p();
    }

    @Deprecated
    public C7897lz0 J1() {
        if (this.v instanceof HH2) {
            a2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.P.o();
    }

    public boolean K(Menu menu, MenuInflater menuInflater) {
        if (this.u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && b1(fragment) && fragment.t1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.T0();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public AbstractC5701cz0<?> K0() {
        return this.v;
    }

    public void L() {
        this.K = true;
        j0(true);
        g0();
        A();
        a0(-1);
        AbstractC5701cz0<?> abstractC5701cz0 = this.v;
        if (abstractC5701cz0 instanceof InterfaceC8386nv1) {
            ((InterfaceC8386nv1) abstractC5701cz0).s(this.q);
        }
        AbstractC5701cz0<?> abstractC5701cz02 = this.v;
        if (abstractC5701cz02 instanceof InterfaceC3587Lu1) {
            ((InterfaceC3587Lu1) abstractC5701cz02).H(this.p);
        }
        AbstractC5701cz0<?> abstractC5701cz03 = this.v;
        if (abstractC5701cz03 instanceof InterfaceC5201av1) {
            ((InterfaceC5201av1) abstractC5701cz03).w(this.r);
        }
        AbstractC5701cz0<?> abstractC5701cz04 = this.v;
        if (abstractC5701cz04 instanceof InterfaceC5928dv1) {
            ((InterfaceC5928dv1) abstractC5701cz04).G(this.s);
        }
        AbstractC5701cz0<?> abstractC5701cz05 = this.v;
        if ((abstractC5701cz05 instanceof InterfaceC7587ki1) && this.x == null) {
            ((InterfaceC7587ki1) abstractC5701cz05).C(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.h();
            this.g = null;
        }
        X5<Intent> x5 = this.D;
        if (x5 != null) {
            x5.d();
            this.E.d();
            this.F.d();
        }
    }

    public LayoutInflater.Factory2 L0() {
        return this.f;
    }

    public Parcelable L1() {
        if (this.v instanceof OX1) {
            a2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle M1 = M1();
        if (M1.isEmpty()) {
            return null;
        }
        return M1;
    }

    public void M() {
        a0(1);
    }

    public androidx.fragment.app.f M0() {
        return this.n;
    }

    public Bundle M1() {
        androidx.fragment.app.b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        w0();
        g0();
        j0(true);
        this.I = true;
        this.P.t(true);
        ArrayList<String> z = this.c.z();
        HashMap<String, Bundle> n2 = this.c.n();
        if (n2.isEmpty()) {
            if (X0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            ArrayList<String> A = this.c.A();
            ArrayList<androidx.fragment.app.a> arrayList = this.d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i2 = 0; i2 < size; i2++) {
                    bVarArr[i2] = new androidx.fragment.app.b(this.d.get(i2));
                    if (X0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.d.get(i2));
                    }
                }
            } else {
                bVarArr = null;
            }
            androidx.fragment.app.g gVar = new androidx.fragment.app.g();
            gVar.X = z;
            gVar.Y = A;
            gVar.Z = bVarArr;
            gVar.Y0 = this.i.get();
            Fragment fragment = this.y;
            if (fragment != null) {
                gVar.Z0 = fragment.a1;
            }
            gVar.a1.addAll(this.j.keySet());
            gVar.b1.addAll(this.j.values());
            gVar.c1 = new ArrayList<>(this.G);
            bundle.putParcelable("state", gVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle(U + str, this.k.get(str));
            }
            for (String str2 : n2.keySet()) {
                bundle.putBundle(V + str2, n2.get(str2));
            }
        }
        return bundle;
    }

    public void N(boolean z) {
        if (z && (this.v instanceof InterfaceC8386nv1)) {
            a2(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null) {
                fragment.z1();
                if (z) {
                    fragment.q1.N(true);
                }
            }
        }
    }

    public Fragment N0() {
        return this.x;
    }

    public void N1(String str) {
        h0(new t(str), false);
    }

    public void O(boolean z, boolean z2) {
        if (z2 && (this.v instanceof InterfaceC5201av1)) {
            a2(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null) {
                fragment.A1(z);
                if (z2) {
                    fragment.q1.O(z, true);
                }
            }
        }
    }

    public Fragment O0() {
        return this.y;
    }

    public boolean O1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        String str2;
        String str3;
        int i2;
        int p0 = p0(str, -1, true);
        if (p0 < 0) {
            return false;
        }
        for (int i3 = p0; i3 < this.d.size(); i3++) {
            androidx.fragment.app.a aVar = this.d.get(i3);
            if (!aVar.r) {
                a2(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i4 = p0; i4 < this.d.size(); i4++) {
            androidx.fragment.app.a aVar2 = this.d.get(i4);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<j.a> it = aVar2.c.iterator();
            while (it.hasNext()) {
                j.a next = it.next();
                Fragment fragment = next.b;
                if (fragment != null) {
                    if (!next.c || (i2 = next.a) == 1 || i2 == 2 || i2 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i5 = next.a;
                    if (i5 == 1 || i5 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str3 = C4500Ve2.b + hashSet2.iterator().next();
                } else {
                    str3 = "s " + hashSet2;
                }
                sb.append(str3);
                sb.append(" in ");
                sb.append(aVar2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                a2(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.x1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                sb2.append(str2);
                sb2.append("fragment ");
                sb2.append(fragment2);
                a2(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.q1.A0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).a1);
        }
        ArrayList arrayList4 = new ArrayList(this.d.size() - p0);
        for (int i6 = p0; i6 < this.d.size(); i6++) {
            arrayList4.add(null);
        }
        C9070qk c9070qk = new C9070qk(arrayList3, arrayList4);
        for (int size = this.d.size() - 1; size >= p0; size--) {
            androidx.fragment.app.a remove = this.d.remove(size);
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(remove);
            aVar3.R();
            arrayList4.set(size - p0, new androidx.fragment.app.b(aVar3));
            remove.Q = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.j.put(str, c9070qk);
        return true;
    }

    public void P(Fragment fragment) {
        Iterator<InterfaceC8401nz0> it = this.f32o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public InterfaceC3313Ja2 P0() {
        InterfaceC3313Ja2 interfaceC3313Ja2 = this.B;
        if (interfaceC3313Ja2 != null) {
            return interfaceC3313Ja2;
        }
        Fragment fragment = this.x;
        if (fragment != null) {
            return fragment.o1.P0();
        }
        return this.C;
    }

    public Fragment.n P1(Fragment fragment) {
        androidx.fragment.app.h o2 = this.c.o(fragment.a1);
        if (o2 == null || !o2.k().equals(fragment)) {
            a2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return o2.q();
    }

    public void Q() {
        for (Fragment fragment : this.c.m()) {
            if (fragment != null) {
                fragment.X0(fragment.x0());
                fragment.q1.Q();
            }
        }
    }

    public C2513Az0.c Q0() {
        return this.Q;
    }

    public void Q1() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.h().removeCallbacks(this.R);
                    this.v.h().post(this.R);
                    c2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean R(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && fragment.B1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void R1(Fragment fragment, boolean z) {
        ViewGroup G0 = G0(fragment);
        if (G0 != null && (G0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) G0).setDrawDisappearingViewsLast(!z);
        }
    }

    public void S(Menu menu) {
        if (this.u >= 1) {
            for (Fragment fragment : this.c.p()) {
                if (fragment != null) {
                    fragment.C1(menu);
                }
            }
        }
    }

    public GH2 S0(Fragment fragment) {
        return this.P.p(fragment);
    }

    public void S1(androidx.fragment.app.e eVar) {
        this.z = eVar;
    }

    public final void T(Fragment fragment) {
        if (fragment != null && fragment.equals(o0(fragment.a1))) {
            fragment.G1();
        }
    }

    public void T0() {
        j0(true);
        if (this.h.g()) {
            r1();
        } else {
            this.g.l();
        }
    }

    public void T1(Fragment fragment, f.b bVar) {
        if (fragment.equals(o0(fragment.a1)) && (fragment.p1 == null || fragment.o1 == this)) {
            fragment.N1 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void U() {
        a0(5);
    }

    public void U0(Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.v1) {
            fragment.v1 = true;
            fragment.J1 = true ^ fragment.J1;
            X1(fragment);
        }
    }

    public void U1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(o0(fragment.a1)) || (fragment.p1 != null && fragment.o1 != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.y;
        this.y = fragment;
        T(fragment2);
        T(this.y);
    }

    public void V(boolean z, boolean z2) {
        if (z2 && (this.v instanceof InterfaceC5928dv1)) {
            a2(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null) {
                fragment.E1(z);
                if (z2) {
                    fragment.q1.V(z, true);
                }
            }
        }
    }

    public void V0(Fragment fragment) {
        if (fragment.g1 && Y0(fragment)) {
            this.H = true;
        }
    }

    public void V1(InterfaceC3313Ja2 interfaceC3313Ja2) {
        this.B = interfaceC3313Ja2;
    }

    public boolean W(Menu menu) {
        boolean z = false;
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && b1(fragment) && fragment.F1(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean W0() {
        return this.K;
    }

    public void W1(C2513Az0.c cVar) {
        this.Q = cVar;
    }

    public void X() {
        c2();
        T(this.y);
    }

    public final void X1(Fragment fragment) {
        ViewGroup G0 = G0(fragment);
        if (G0 != null && fragment.w() + fragment.z() + fragment.Q() + fragment.S() > 0) {
            int i2 = XL1.c.c;
            if (G0.getTag(i2) == null) {
                G0.setTag(i2, fragment);
            }
            ((Fragment) G0.getTag(i2)).p2(fragment.P());
        }
    }

    public void Y() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(7);
    }

    public final boolean Y0(Fragment fragment) {
        if ((fragment.z1 && fragment.A1) || fragment.q1.v()) {
            return true;
        }
        return false;
    }

    public void Y1(Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.v1) {
            fragment.v1 = false;
            fragment.J1 = !fragment.J1;
        }
    }

    public void Z() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(5);
    }

    public final boolean Z0() {
        Fragment fragment = this.x;
        if (fragment == null) {
            return true;
        }
        if (fragment.v0() && this.x.O().Z0()) {
            return true;
        }
        return false;
    }

    public final void Z1() {
        for (androidx.fragment.app.h hVar : this.c.l()) {
            m1(hVar);
        }
    }

    @Override // o.InterfaceC9380rz0
    public final void a(String str, Bundle bundle) {
        o oVar = this.l.get(str);
        if (oVar != null && oVar.b(f.b.STARTED)) {
            oVar.a(str, bundle);
        } else {
            this.k.put(str, bundle);
        }
        if (X0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final void a0(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            i1(i2, false);
            for (androidx.fragment.app.k kVar : B()) {
                kVar.n();
            }
            this.b = false;
            j0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public boolean a1(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.x0();
    }

    public final void a2(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C6208f41("FragmentManager"));
        AbstractC5701cz0<?> abstractC5701cz0 = this.v;
        if (abstractC5701cz0 != null) {
            try {
                abstractC5701cz0.i(TD0.a.Y0, null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                e0(TD0.a.Y0, null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    @Override // o.InterfaceC9380rz0
    public final void b(String str) {
        o remove = this.l.remove(str);
        if (remove != null) {
            remove.c();
        }
        if (X0(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    public void b0() {
        this.J = true;
        this.P.t(true);
        a0(4);
    }

    public boolean b1(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.A0();
    }

    public void b2(m mVar) {
        this.n.p(mVar);
    }

    @Override // o.InterfaceC9380rz0
    public final void c(final String str, KZ0 kz0, final InterfaceC9138qz0 interfaceC9138qz0) {
        final androidx.lifecycle.f b2 = kz0.b();
        if (b2.b() == f.b.DESTROYED) {
            return;
        }
        androidx.lifecycle.i iVar = new androidx.lifecycle.i() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.i
            public void i(KZ0 kz02, f.a aVar) {
                Bundle bundle;
                if (aVar == f.a.ON_START && (bundle = (Bundle) FragmentManager.this.k.get(str)) != null) {
                    interfaceC9138qz0.a(str, bundle);
                    FragmentManager.this.d(str);
                }
                if (aVar == f.a.ON_DESTROY) {
                    b2.d(this);
                    FragmentManager.this.l.remove(str);
                }
            }
        };
        o put = this.l.put(str, new o(b2, interfaceC9138qz0, iVar));
        if (put != null) {
            put.c();
        }
        if (X0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + b2 + " and listener " + interfaceC9138qz0);
        }
        b2.a(iVar);
    }

    public void c0() {
        a0(2);
    }

    public boolean c1(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.o1;
        if (fragment.equals(fragmentManager.O0()) && c1(fragmentManager.x)) {
            return true;
        }
        return false;
    }

    public final void c2() {
        synchronized (this.a) {
            try {
                boolean z = true;
                if (!this.a.isEmpty()) {
                    this.h.j(true);
                } else {
                    this.h.j((C0() <= 0 || !c1(this.x)) ? false : false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC9380rz0
    public final void d(String str) {
        this.k.remove(str);
        if (X0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public final void d0() {
        if (this.L) {
            this.L = false;
            Z1();
        }
    }

    public boolean d1(int i2) {
        if (this.u >= i2) {
            return true;
        }
        return false;
    }

    public void e0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.e.get(i2).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.T(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size3 = this.a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(this.a.get(i4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public boolean e1() {
        if (!this.I && !this.J) {
            return false;
        }
        return true;
    }

    public void f1(Fragment fragment, String[] strArr, int i2) {
        if (this.F != null) {
            this.G.addLast(new n(fragment.a1, i2));
            this.F.b(strArr);
            return;
        }
        this.v.n(fragment, strArr, i2);
    }

    public final void g0() {
        for (androidx.fragment.app.k kVar : B()) {
            kVar.n();
        }
    }

    public void g1(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        if (this.D != null) {
            this.G.addLast(new n(fragment.a1, i2));
            if (bundle != null) {
                intent.putExtra(P5.m.b, bundle);
            }
            this.D.b(intent);
            return;
        }
        this.v.t(fragment, intent, i2, bundle);
    }

    public void h0(q qVar, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            w();
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (z) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.a.add(qVar);
                Q1();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h1(Fragment fragment, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.E != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent = new Intent();
                    intent.putExtra(Z, true);
                }
                if (X0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
                }
                intent.putExtra(P5.m.b, bundle);
            }
            C9254rS0 a2 = new C9254rS0.a(intentSender).b(intent).c(i4, i3).a();
            this.G.addLast(new n(fragment.a1, i2));
            if (X0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.E.b(a2);
            return;
        }
        this.v.u(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public final void i0(boolean z) {
        if (!this.b) {
            if (this.v == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.v.h().getLooper()) {
                if (!z) {
                    w();
                }
                if (this.M == null) {
                    this.M = new ArrayList<>();
                    this.N = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public void i1(int i2, boolean z) {
        AbstractC5701cz0<?> abstractC5701cz0;
        if (this.v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.u) {
            this.u = i2;
            this.c.u();
            Z1();
            if (this.H && (abstractC5701cz0 = this.v) != null && this.u == 7) {
                abstractC5701cz0.v();
                this.H = false;
            }
        }
    }

    public boolean j0(boolean z) {
        i0(z);
        boolean z2 = false;
        while (y0(this.M, this.N)) {
            z2 = true;
            this.b = true;
            try {
                B1(this.M, this.N);
            } finally {
                x();
            }
        }
        c2();
        d0();
        this.c.b();
        return z2;
    }

    public void j1() {
        if (this.v != null) {
            this.I = false;
            this.J = false;
            this.P.t(false);
            for (Fragment fragment : this.c.p()) {
                if (fragment != null) {
                    fragment.G0();
                }
            }
        }
    }

    public void k0(q qVar, boolean z) {
        if (z && (this.v == null || this.K)) {
            return;
        }
        i0(z);
        if (qVar.a(this.M, this.N)) {
            this.b = true;
            try {
                B1(this.M, this.N);
            } finally {
                x();
            }
        }
        c2();
        d0();
        this.c.b();
    }

    public void k1(FragmentContainerView fragmentContainerView) {
        View view;
        for (androidx.fragment.app.h hVar : this.c.l()) {
            Fragment k2 = hVar.k();
            if (k2.t1 == fragmentContainerView.getId() && (view = k2.D1) != null && view.getParent() == null) {
                k2.C1 = fragmentContainerView;
                hVar.b();
            }
        }
    }

    @Deprecated
    public androidx.fragment.app.j l1() {
        return u();
    }

    public void m(androidx.fragment.app.a aVar) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(aVar);
    }

    public final void m0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<p> arrayList3;
        boolean z = arrayList.get(i2).r;
        ArrayList<Fragment> arrayList4 = this.O;
        if (arrayList4 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.O.addAll(this.c.p());
        Fragment O0 = O0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (!arrayList2.get(i4).booleanValue()) {
                O0 = aVar.X(this.O, O0);
            } else {
                O0 = aVar.Z(this.O, O0);
            }
            if (!z2 && !aVar.i) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        this.O.clear();
        if (!z && this.u >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator<j.a> it = arrayList.get(i5).c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().b;
                    if (fragment != null && fragment.o1 != null) {
                        this.c.s(D(fragment));
                    }
                }
            }
        }
        l0(arrayList, arrayList2, i2, i3);
        boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
        if (z2 && (arrayList3 = this.m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(x0(it2.next()));
            }
            Iterator<p> it3 = this.m.iterator();
            while (it3.hasNext()) {
                p next = it3.next();
                for (Fragment fragment2 : linkedHashSet) {
                    next.b(fragment2, booleanValue);
                }
            }
            Iterator<p> it4 = this.m.iterator();
            while (it4.hasNext()) {
                p next2 = it4.next();
                for (Fragment fragment3 : linkedHashSet) {
                    next2.a(fragment3, booleanValue);
                }
            }
        }
        for (int i6 = i2; i6 < i3; i6++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (booleanValue) {
                for (int size = aVar2.c.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = aVar2.c.get(size).b;
                    if (fragment4 != null) {
                        D(fragment4).m();
                    }
                }
            } else {
                Iterator<j.a> it5 = aVar2.c.iterator();
                while (it5.hasNext()) {
                    Fragment fragment5 = it5.next().b;
                    if (fragment5 != null) {
                        D(fragment5).m();
                    }
                }
            }
        }
        i1(this.u, true);
        for (androidx.fragment.app.k kVar : C(arrayList, i2, i3)) {
            kVar.v(booleanValue);
            kVar.t();
            kVar.k();
        }
        while (i2 < i3) {
            androidx.fragment.app.a aVar3 = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue() && aVar3.P >= 0) {
                aVar3.P = -1;
            }
            aVar3.Y();
            i2++;
        }
        if (z2) {
            D1();
        }
    }

    public void m1(androidx.fragment.app.h hVar) {
        Fragment k2 = hVar.k();
        if (k2.E1) {
            if (this.b) {
                this.L = true;
                return;
            }
            k2.E1 = false;
            hVar.m();
        }
    }

    public androidx.fragment.app.h n(Fragment fragment) {
        String str = fragment.M1;
        if (str != null) {
            C2513Az0.i(fragment, str);
        }
        if (X0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        androidx.fragment.app.h D = D(fragment);
        fragment.o1 = this;
        this.c.s(D);
        if (!fragment.w1) {
            this.c.a(fragment);
            fragment.h1 = false;
            if (fragment.D1 == null) {
                fragment.J1 = false;
            }
            if (Y0(fragment)) {
                this.H = true;
            }
        }
        return D;
    }

    public boolean n0() {
        boolean j0 = j0(true);
        w0();
        return j0;
    }

    public void n1() {
        h0(new r(null, -1, 0), false);
    }

    public void o(InterfaceC8401nz0 interfaceC8401nz0) {
        this.f32o.add(interfaceC8401nz0);
    }

    public Fragment o0(String str) {
        return this.c.f(str);
    }

    public void o1(int i2, int i3) {
        p1(i2, i3, false);
    }

    public void p(p pVar) {
        if (this.m == null) {
            this.m = new ArrayList<>();
        }
        this.m.add(pVar);
    }

    public final int p0(String str, int i2, boolean z) {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.d.get(size);
            if ((str != null && str.equals(aVar.getName())) || (i2 >= 0 && i2 == aVar.P)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z) {
            while (size > 0) {
                androidx.fragment.app.a aVar2 = this.d.get(size - 1);
                if ((str == null || !str.equals(aVar2.getName())) && (i2 < 0 || i2 != aVar2.P)) {
                    break;
                }
                size--;
            }
            return size;
        } else if (size == this.d.size() - 1) {
            return -1;
        } else {
            return size + 1;
        }
    }

    public void p1(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            h0(new r(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void q(Fragment fragment) {
        this.P.g(fragment);
    }

    public void q1(String str, int i2) {
        h0(new r(str, -1, i2), false);
    }

    public int r() {
        return this.i.getAndIncrement();
    }

    public Fragment r0(int i2) {
        return this.c.g(i2);
    }

    public boolean r1() {
        return u1(null, -1, 0);
    }

    public void s(AbstractC5701cz0<?> abstractC5701cz0, AbstractC5216az0 abstractC5216az0, Fragment fragment) {
        String str;
        if (this.v == null) {
            this.v = abstractC5701cz0;
            this.w = abstractC5216az0;
            this.x = fragment;
            if (fragment != null) {
                o(new g(fragment));
            } else if (abstractC5701cz0 instanceof InterfaceC8401nz0) {
                o((InterfaceC8401nz0) abstractC5701cz0);
            }
            if (this.x != null) {
                c2();
            }
            if (abstractC5701cz0 instanceof InterfaceC3294Iu1) {
                InterfaceC3294Iu1 interfaceC3294Iu1 = (InterfaceC3294Iu1) abstractC5701cz0;
                OnBackPressedDispatcher R = interfaceC3294Iu1.R();
                this.g = R;
                KZ0 kz0 = interfaceC3294Iu1;
                if (fragment != null) {
                    kz0 = fragment;
                }
                R.d(kz0, this.h);
            }
            if (fragment != null) {
                this.P = fragment.o1.D0(fragment);
            } else if (abstractC5701cz0 instanceof HH2) {
                this.P = C8158mz0.m(((HH2) abstractC5701cz0).A());
            } else {
                this.P = new C8158mz0(false);
            }
            this.P.t(e1());
            this.c.B(this.P);
            AbstractC5701cz0<?> abstractC5701cz02 = this.v;
            if ((abstractC5701cz02 instanceof OX1) && fragment == null) {
                androidx.savedstate.a E = ((OX1) abstractC5701cz02).E();
                E.j(S, new a.c() { // from class: o.jz0
                    @Override // androidx.savedstate.a.c
                    public final Bundle a() {
                        Bundle M1;
                        M1 = FragmentManager.this.M1();
                        return M1;
                    }
                });
                Bundle b2 = E.b(S);
                if (b2 != null) {
                    I1(b2);
                }
            }
            AbstractC5701cz0<?> abstractC5701cz03 = this.v;
            if (abstractC5701cz03 instanceof InterfaceC5486c6) {
                AbstractC5244b6 x = ((InterfaceC5486c6) abstractC5701cz03).x();
                if (fragment != null) {
                    str = fragment.a1 + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.D = x.n(str2 + "StartActivityForResult", new P5.m(), new h());
                this.E = x.n(str2 + "StartIntentSenderForResult", new l(), new i());
                this.F = x.n(str2 + "RequestPermissions", new P5.k(), new a());
            }
            AbstractC5701cz0<?> abstractC5701cz04 = this.v;
            if (abstractC5701cz04 instanceof InterfaceC3587Lu1) {
                ((InterfaceC3587Lu1) abstractC5701cz04).F(this.p);
            }
            AbstractC5701cz0<?> abstractC5701cz05 = this.v;
            if (abstractC5701cz05 instanceof InterfaceC8386nv1) {
                ((InterfaceC8386nv1) abstractC5701cz05).J(this.q);
            }
            AbstractC5701cz0<?> abstractC5701cz06 = this.v;
            if (abstractC5701cz06 instanceof InterfaceC5201av1) {
                ((InterfaceC5201av1) abstractC5701cz06).K(this.r);
            }
            AbstractC5701cz0<?> abstractC5701cz07 = this.v;
            if (abstractC5701cz07 instanceof InterfaceC5928dv1) {
                ((InterfaceC5928dv1) abstractC5701cz07).Y(this.s);
            }
            AbstractC5701cz0<?> abstractC5701cz08 = this.v;
            if ((abstractC5701cz08 instanceof InterfaceC7587ki1) && fragment == null) {
                ((InterfaceC7587ki1) abstractC5701cz08).N(this.t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public Fragment s0(String str) {
        return this.c.h(str);
    }

    public boolean s1(int i2, int i3) {
        if (i2 >= 0) {
            return u1(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void t(Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.w1) {
            fragment.w1 = false;
            if (!fragment.g1) {
                this.c.a(fragment);
                if (X0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (Y0(fragment)) {
                    this.H = true;
                }
            }
        }
    }

    public Fragment t0(String str) {
        return this.c.i(str);
    }

    public boolean t1(String str, int i2) {
        return u1(str, -1, i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            AbstractC5701cz0<?> abstractC5701cz0 = this.v;
            if (abstractC5701cz0 != null) {
                sb.append(abstractC5701cz0.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public androidx.fragment.app.j u() {
        return new androidx.fragment.app.a(this);
    }

    public final boolean u1(String str, int i2, int i3) {
        j0(false);
        i0(true);
        Fragment fragment = this.y;
        if (fragment != null && i2 < 0 && str == null && fragment.u().r1()) {
            return true;
        }
        boolean v1 = v1(this.M, this.N, str, i2, i3);
        if (v1) {
            this.b = true;
            try {
                B1(this.M, this.N);
            } finally {
                x();
            }
        }
        c2();
        d0();
        this.c.b();
        return v1;
    }

    public boolean v() {
        boolean z = false;
        for (Fragment fragment : this.c.m()) {
            if (fragment != null) {
                z = Y0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean v1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        boolean z;
        if ((i3 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int p0 = p0(str, i2, z);
        if (p0 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= p0; size--) {
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void w() {
        if (!e1()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final void w0() {
        for (androidx.fragment.app.k kVar : B()) {
            kVar.o();
        }
    }

    public void w1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.o1 != this) {
            a2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.a1);
    }

    public final void x() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final Set<Fragment> x0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.c.size(); i2++) {
            Fragment fragment = aVar.c.get(i2).b;
            if (fragment != null && aVar.i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public void x1(m mVar, boolean z) {
        this.n.o(mVar, z);
    }

    public void y(String str) {
        h0(new k(str), false);
    }

    public final boolean y0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.v.h().removeCallbacks(this.R);
            return z;
        }
    }

    public void y1(Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.n1);
        }
        boolean y0 = fragment.y0();
        if (fragment.w1 && y0) {
            return;
        }
        this.c.v(fragment);
        if (Y0(fragment)) {
            this.H = true;
        }
        fragment.h1 = true;
        X1(fragment);
    }

    public boolean z(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        if (!G1(arrayList, arrayList2, str)) {
            return false;
        }
        return v1(arrayList, arrayList2, str, -1, 1);
    }

    public int z0() {
        return this.c.k();
    }

    public void z1(InterfaceC8401nz0 interfaceC8401nz0) {
        this.f32o.remove(interfaceC8401nz0);
    }

    /* loaded from: classes.dex */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();
        public String X;
        public int Y;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public n[] newArray(int i) {
                return new n[i];
            }
        }

        public n(String str, int i) {
            this.X = str;
            this.Y = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.X);
            parcel.writeInt(this.Y);
        }

        public n(Parcel parcel) {
            this.X = parcel.readString();
            this.Y = parcel.readInt();
        }
    }
}
