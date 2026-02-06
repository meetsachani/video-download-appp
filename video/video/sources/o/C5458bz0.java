package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5458bz0 {
    public final AbstractC5701cz0<?> a;

    public C5458bz0(AbstractC5701cz0<?> abstractC5701cz0) {
        this.a = abstractC5701cz0;
    }

    public static C5458bz0 b(AbstractC5701cz0<?> abstractC5701cz0) {
        return new C5458bz0((AbstractC5701cz0) C10907yF1.m(abstractC5701cz0, "callbacks == null"));
    }

    public Fragment A(String str) {
        return this.a.Z0.t0(str);
    }

    public List<Fragment> B(List<Fragment> list) {
        return this.a.Z0.A0();
    }

    public int C() {
        return this.a.Z0.z0();
    }

    public FragmentManager D() {
        return this.a.Z0;
    }

    @Deprecated
    public V11 E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.a.Z0.j1();
    }

    public View G(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.Z0.L0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void I(Parcelable parcelable, List<Fragment> list) {
        this.a.Z0.E1(parcelable, new C7897lz0(list, null, null));
    }

    @Deprecated
    public void J(Parcelable parcelable, C7897lz0 c7897lz0) {
        this.a.Z0.E1(parcelable, c7897lz0);
    }

    @Deprecated
    public void L(Parcelable parcelable) {
        AbstractC5701cz0<?> abstractC5701cz0 = this.a;
        if (abstractC5701cz0 instanceof HH2) {
            abstractC5701cz0.Z0.H1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    @Deprecated
    public C9654t62<String, V11> M() {
        return null;
    }

    @Deprecated
    public C7897lz0 N() {
        return this.a.Z0.J1();
    }

    @Deprecated
    public List<Fragment> O() {
        C7897lz0 J1 = this.a.Z0.J1();
        if (J1 != null && J1.b() != null) {
            return new ArrayList(J1.b());
        }
        return null;
    }

    @Deprecated
    public Parcelable P() {
        return this.a.Z0.L1();
    }

    public void a(Fragment fragment) {
        AbstractC5701cz0<?> abstractC5701cz0 = this.a;
        abstractC5701cz0.Z0.s(abstractC5701cz0, abstractC5701cz0, fragment);
    }

    public void c() {
        this.a.Z0.F();
    }

    @Deprecated
    public void d(Configuration configuration) {
        this.a.Z0.H(configuration, true);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.Z0.I(menuItem);
    }

    public void f() {
        this.a.Z0.J();
    }

    @Deprecated
    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.Z0.K(menu, menuInflater);
    }

    public void h() {
        this.a.Z0.L();
    }

    public void i() {
        this.a.Z0.M();
    }

    @Deprecated
    public void j() {
        this.a.Z0.N(true);
    }

    @Deprecated
    public void k(boolean z) {
        this.a.Z0.O(z, true);
    }

    @Deprecated
    public boolean l(MenuItem menuItem) {
        return this.a.Z0.R(menuItem);
    }

    @Deprecated
    public void m(Menu menu) {
        this.a.Z0.S(menu);
    }

    public void n() {
        this.a.Z0.U();
    }

    @Deprecated
    public void o(boolean z) {
        this.a.Z0.V(z, true);
    }

    @Deprecated
    public boolean p(Menu menu) {
        return this.a.Z0.W(menu);
    }

    public void r() {
        this.a.Z0.Y();
    }

    public void s() {
        this.a.Z0.Z();
    }

    public void t() {
        this.a.Z0.b0();
    }

    public boolean z() {
        return this.a.Z0.j0(true);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void q() {
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void K(C9654t62<String, V11> c9654t62) {
    }

    @Deprecated
    public void x(boolean z) {
    }

    @Deprecated
    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
