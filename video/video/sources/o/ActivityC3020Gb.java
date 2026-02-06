package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.savedstate.a;
import o.C4040Ql2;
import o.Q4;
import o.T4;

/* renamed from: o.Gb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC3020Gb extends ActivityC4864Yy0 implements InterfaceC4291Tb, C4040Ql2.a, Q4.c {
    public static final String B1 = "androidx:appcompat";
    public Resources A1;
    public AbstractC5608cc z1;

    /* renamed from: o.Gb$a */
    /* loaded from: classes.dex */
    public class a implements a.c {
        public a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            ActivityC3020Gb.this.m1().O(bundle);
            return bundle;
        }
    }

    /* renamed from: o.Gb$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC3783Nu1 {
        public b() {
        }

        @Override // o.InterfaceC3783Nu1
        public void a(Context context) {
            AbstractC5608cc m1 = ActivityC3020Gb.this.m1();
            m1.E();
            m1.K(ActivityC3020Gb.this.E().b(ActivityC3020Gb.B1));
        }
    }

    public ActivityC3020Gb() {
        o1();
    }

    public T4 B1(T4.a aVar) {
        return m1().i0(aVar);
    }

    public void C1(Intent intent) {
        C2867Eo1.g(this, intent);
    }

    public boolean D1(int i) {
        return m1().T(i);
    }

    public boolean E1(Intent intent) {
        return C2867Eo1.h(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K0();
        m1().f(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m1().m(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        O4 n1 = n1();
        if (getWindow().hasFeature(0)) {
            if (n1 == null || !n1.k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // o.Q4.c
    public Q4.b d() {
        return m1().w();
    }

    @Override // o.ActivityC8964qI, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        O4 n1 = n1();
        if (keyCode == 82 && n1 != null && n1.K(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m1().s(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m1().z();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.A1 == null && NE2.d()) {
            this.A1 = new NE2(this, super.getResources());
        }
        Resources resources = this.A1;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m1().F();
    }

    @Override // o.ActivityC4864Yy0
    public void j1() {
        m1().F();
    }

    public AbstractC5608cc m1() {
        if (this.z1 == null) {
            this.z1 = AbstractC5608cc.n(this, this);
        }
        return this.z1;
    }

    public O4 n1() {
        return m1().C();
    }

    public final void o1() {
        E().j(B1, new a());
        D(new b());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1().J(configuration);
        if (this.A1 != null) {
            this.A1.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        t1();
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m1().L();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (v1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        O4 n1 = n1();
        if (menuItem.getItemId() == 16908332 && n1 != null && (n1.o() & 4) != 0) {
            return u1();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m1().M(bundle);
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m1().N();
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onStart() {
        super.onStart();
        m1().P();
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onStop() {
        super.onStop();
        m1().Q();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m1().h0(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        O4 n1 = n1();
        if (getWindow().hasFeature(0)) {
            if (n1 == null || !n1.L()) {
                super.openOptionsMenu();
            }
        }
    }

    public void p1(C4040Ql2 c4040Ql2) {
        c4040Ql2.f(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        K0();
        m1().X(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m1().g0(i);
    }

    public boolean u1() {
        Intent z = z();
        if (z != null) {
            if (E1(z)) {
                C4040Ql2 j = C4040Ql2.j(this);
                p1(j);
                s1(j);
                j.H();
                try {
                    C5240b5.D(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            C1(z);
            return true;
        }
        return false;
    }

    public final boolean v1(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public void w1(Toolbar toolbar) {
        m1().f0(toolbar);
    }

    @Override // o.InterfaceC4291Tb
    public T4 y(T4.a aVar) {
        return null;
    }

    @Override // o.C4040Ql2.a
    public Intent z() {
        return C2867Eo1.a(this);
    }

    public ActivityC3020Gb(int i) {
        super(i);
        o1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        K0();
        m1().Y(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K0();
        m1().Z(view, layoutParams);
    }

    @Deprecated
    public void t1() {
    }

    @Deprecated
    public void A1(boolean z) {
    }

    @Override // o.InterfaceC4291Tb
    public void B(T4 t4) {
    }

    @Override // o.InterfaceC4291Tb
    public void P(T4 t4) {
    }

    public void q1(C9637t21 c9637t21) {
    }

    public void r1(int i) {
    }

    public void s1(C4040Ql2 c4040Ql2) {
    }

    @Deprecated
    public void x1(int i) {
    }

    @Deprecated
    public void y1(boolean z) {
    }

    @Deprecated
    public void z1(boolean z) {
    }
}
