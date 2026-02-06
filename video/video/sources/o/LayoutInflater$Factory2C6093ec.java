package o;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.c;
import androidx.lifecycle.f;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o.C10231vT1;
import o.C9061qh2;
import o.C9271rX0;
import o.OL1;
import o.Q4;
import o.T4;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.ec  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C6093ec extends AbstractC5608cc implements e.a, LayoutInflater.Factory2 {
    public static final C9654t62<String, Integer> r2 = new C9654t62<>();
    public static final boolean s2 = false;
    public static final int[] t2 = {16842836};
    public static final boolean u2 = !"robolectric".equals(Build.FINGERPRINT);
    public static boolean v2 = false;
    public static final String w2 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    public j A1;
    public v B1;
    public T4 C1;
    public ActionBarContextView D1;
    public PopupWindow E1;
    public Runnable F1;
    public ZH2 G1;
    public boolean H1;
    public boolean I1;
    public ViewGroup J1;
    public TextView K1;
    public View L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public u[] U1;
    public u V1;
    public boolean W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public Configuration a2;
    public int b2;
    public int c2;
    public int d2;
    public boolean e2;
    public r f2;
    public r g2;
    public boolean h2;
    public int i2;
    public final Runnable j2;
    public boolean k2;
    public Rect l2;
    public Rect m2;
    public C4586Wc n2;
    public C10492wY0 o2;
    public OnBackInvokedDispatcher p2;
    public OnBackInvokedCallback q2;
    public final Object r1;
    public final Context s1;
    public Window t1;
    public p u1;
    public final InterfaceC4291Tb v1;
    public O4 w1;
    public MenuInflater x1;
    public CharSequence y1;
    public InterfaceC10485wW z1;

    /* renamed from: o.ec$a */
    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        public final boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null || (!message.contains("drawable") && !message.contains("Drawable"))) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + LayoutInflater$Factory2C6093ec.w2);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    /* renamed from: o.ec$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec = LayoutInflater$Factory2C6093ec.this;
            if ((layoutInflater$Factory2C6093ec.i2 & 1) != 0) {
                layoutInflater$Factory2C6093ec.A0(0);
            }
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec2 = LayoutInflater$Factory2C6093ec.this;
            if ((layoutInflater$Factory2C6093ec2.i2 & 4096) != 0) {
                layoutInflater$Factory2C6093ec2.A0(108);
            }
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec3 = LayoutInflater$Factory2C6093ec.this;
            layoutInflater$Factory2C6093ec3.h2 = false;
            layoutInflater$Factory2C6093ec3.i2 = 0;
        }
    }

    /* renamed from: o.ec$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC10336vu1 {
        public c() {
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, RL2 rl2) {
            int r = rl2.r();
            int x1 = LayoutInflater$Factory2C6093ec.this.x1(rl2, null);
            if (r != x1) {
                rl2 = rl2.D(rl2.p(), x1, rl2.q(), rl2.o());
            }
            return C6516gH2.l1(view, rl2);
        }
    }

    /* renamed from: o.ec$d */
    /* loaded from: classes.dex */
    public class d implements c.a {
        public d() {
        }

        @Override // androidx.appcompat.widget.c.a
        public void a(Rect rect) {
            rect.top = LayoutInflater$Factory2C6093ec.this.x1(null, rect);
        }
    }

    /* renamed from: o.ec$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: o.ec$f$a */
        /* loaded from: classes.dex */
        public class a extends C5537cI2 {
            public a() {
            }

            @Override // o.C5537cI2, o.InterfaceC5295bI2
            public void b(View view) {
                LayoutInflater$Factory2C6093ec.this.D1.setAlpha(1.0f);
                LayoutInflater$Factory2C6093ec.this.G1.t(null);
                LayoutInflater$Factory2C6093ec.this.G1 = null;
            }

            @Override // o.C5537cI2, o.InterfaceC5295bI2
            public void c(View view) {
                LayoutInflater$Factory2C6093ec.this.D1.setVisibility(0);
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec = LayoutInflater$Factory2C6093ec.this;
            layoutInflater$Factory2C6093ec.E1.showAtLocation(layoutInflater$Factory2C6093ec.D1, 55, 0, 0);
            LayoutInflater$Factory2C6093ec.this.B0();
            if (LayoutInflater$Factory2C6093ec.this.n1()) {
                LayoutInflater$Factory2C6093ec.this.D1.setAlpha(0.0f);
                LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec2 = LayoutInflater$Factory2C6093ec.this;
                layoutInflater$Factory2C6093ec2.G1 = C6516gH2.h(layoutInflater$Factory2C6093ec2.D1).b(1.0f);
                LayoutInflater$Factory2C6093ec.this.G1.t(new a());
                return;
            }
            LayoutInflater$Factory2C6093ec.this.D1.setAlpha(1.0f);
            LayoutInflater$Factory2C6093ec.this.D1.setVisibility(0);
        }
    }

    /* renamed from: o.ec$g */
    /* loaded from: classes.dex */
    public class g extends C5537cI2 {
        public g() {
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void b(View view) {
            LayoutInflater$Factory2C6093ec.this.D1.setAlpha(1.0f);
            LayoutInflater$Factory2C6093ec.this.G1.t(null);
            LayoutInflater$Factory2C6093ec.this.G1 = null;
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void c(View view) {
            LayoutInflater$Factory2C6093ec.this.D1.setVisibility(0);
            if (LayoutInflater$Factory2C6093ec.this.D1.getParent() instanceof View) {
                C6516gH2.C1((View) LayoutInflater$Factory2C6093ec.this.D1.getParent());
            }
        }
    }

    /* renamed from: o.ec$h */
    /* loaded from: classes.dex */
    public class h implements Q4.b {
        public h() {
        }

        @Override // o.Q4.b
        public void a(Drawable drawable, int i) {
            O4 C = LayoutInflater$Factory2C6093ec.this.C();
            if (C != null) {
                C.k0(drawable);
                C.h0(i);
            }
        }

        @Override // o.Q4.b
        public Drawable b() {
            C2872Ep2 F = C2872Ep2.F(d(), null, new int[]{OL1.b.E1});
            Drawable h = F.h(0);
            F.I();
            return h;
        }

        @Override // o.Q4.b
        public void c(int i) {
            O4 C = LayoutInflater$Factory2C6093ec.this.C();
            if (C != null) {
                C.h0(i);
            }
        }

        @Override // o.Q4.b
        public Context d() {
            return LayoutInflater$Factory2C6093ec.this.G0();
        }

        @Override // o.Q4.b
        public boolean e() {
            O4 C = LayoutInflater$Factory2C6093ec.this.C();
            if (C != null && (C.o() & 4) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.ec$i */
    /* loaded from: classes.dex */
    public interface i {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: o.ec$j */
    /* loaded from: classes.dex */
    public final class j implements j.a {
        public j() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            LayoutInflater$Factory2C6093ec.this.s0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback P0 = LayoutInflater$Factory2C6093ec.this.P0();
            if (P0 != null) {
                P0.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* renamed from: o.ec$k */
    /* loaded from: classes.dex */
    public class k implements T4.a {
        public T4.a a;

        /* renamed from: o.ec$k$a */
        /* loaded from: classes.dex */
        public class a extends C5537cI2 {
            public a() {
            }

            @Override // o.C5537cI2, o.InterfaceC5295bI2
            public void b(View view) {
                LayoutInflater$Factory2C6093ec.this.D1.setVisibility(8);
                LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec = LayoutInflater$Factory2C6093ec.this;
                PopupWindow popupWindow = layoutInflater$Factory2C6093ec.E1;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C6093ec.D1.getParent() instanceof View) {
                    C6516gH2.C1((View) LayoutInflater$Factory2C6093ec.this.D1.getParent());
                }
                LayoutInflater$Factory2C6093ec.this.D1.t();
                LayoutInflater$Factory2C6093ec.this.G1.t(null);
                LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec2 = LayoutInflater$Factory2C6093ec.this;
                layoutInflater$Factory2C6093ec2.G1 = null;
                C6516gH2.C1(layoutInflater$Factory2C6093ec2.J1);
            }
        }

        public k(T4.a aVar) {
            this.a = aVar;
        }

        @Override // o.T4.a
        public boolean a(T4 t4, Menu menu) {
            return this.a.a(t4, menu);
        }

        @Override // o.T4.a
        public void b(T4 t4) {
            this.a.b(t4);
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec = LayoutInflater$Factory2C6093ec.this;
            if (layoutInflater$Factory2C6093ec.E1 != null) {
                layoutInflater$Factory2C6093ec.t1.getDecorView().removeCallbacks(LayoutInflater$Factory2C6093ec.this.F1);
            }
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec2 = LayoutInflater$Factory2C6093ec.this;
            if (layoutInflater$Factory2C6093ec2.D1 != null) {
                layoutInflater$Factory2C6093ec2.B0();
                LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec3 = LayoutInflater$Factory2C6093ec.this;
                layoutInflater$Factory2C6093ec3.G1 = C6516gH2.h(layoutInflater$Factory2C6093ec3.D1).b(0.0f);
                LayoutInflater$Factory2C6093ec.this.G1.t(new a());
            }
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec4 = LayoutInflater$Factory2C6093ec.this;
            InterfaceC4291Tb interfaceC4291Tb = layoutInflater$Factory2C6093ec4.v1;
            if (interfaceC4291Tb != null) {
                interfaceC4291Tb.P(layoutInflater$Factory2C6093ec4.C1);
            }
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec5 = LayoutInflater$Factory2C6093ec.this;
            layoutInflater$Factory2C6093ec5.C1 = null;
            C6516gH2.C1(layoutInflater$Factory2C6093ec5.J1);
            LayoutInflater$Factory2C6093ec.this.v1();
        }

        @Override // o.T4.a
        public boolean c(T4 t4, MenuItem menuItem) {
            return this.a.c(t4, menuItem);
        }

        @Override // o.T4.a
        public boolean d(T4 t4, Menu menu) {
            C6516gH2.C1(LayoutInflater$Factory2C6093ec.this.J1);
            return this.a.d(t4, menu);
        }
    }

    /* renamed from: o.ec$l */
    /* loaded from: classes.dex */
    public static class l {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: o.ec$m */
    /* loaded from: classes.dex */
    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static C9637t21 b(Configuration configuration) {
            return C9637t21.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(C9637t21 c9637t21) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c9637t21.m()));
        }

        public static void d(Configuration configuration, C9637t21 c9637t21) {
            configuration.setLocales(LocaleList.forLanguageTags(c9637t21.m()));
        }
    }

    /* renamed from: o.ec$n */
    /* loaded from: classes.dex */
    public static class n {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((C6336fc.a(configuration) & 3) != (C6336fc.a(configuration2) & 3)) {
                C6591gc.a(configuration3, C6336fc.a(configuration3) | (C6336fc.a(configuration2) & 3));
            }
            if ((C6336fc.a(configuration) & 12) != (C6336fc.a(configuration2) & 12)) {
                C6591gc.a(configuration3, C6336fc.a(configuration3) | (C6336fc.a(configuration2) & 12));
            }
        }
    }

    /* renamed from: o.ec$o */
    /* loaded from: classes.dex */
    public static class o {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return C7561kc.a(activity);
        }

        public static OnBackInvokedCallback b(Object obj, final LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec) {
            Objects.requireNonNull(layoutInflater$Factory2C6093ec);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: o.mc
                public final void onBackInvoked() {
                    LayoutInflater$Factory2C6093ec.this.W0();
                }
            };
            C7077ic.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            C7077ic.a(obj).unregisterOnBackInvokedCallback(C6834hc.a(obj2));
        }
    }

    /* renamed from: o.ec$p */
    /* loaded from: classes.dex */
    public class p extends Window$CallbackC7745lL2 {
        public i Y;
        public boolean Y0;
        public boolean Z;
        public boolean Z0;

        public p(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.Y0 = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.Y0 = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.Z = true;
                callback.onContentChanged();
            } finally {
                this.Z = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.Z0 = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.Z0 = false;
            }
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.Y0) {
                return a().dispatchKeyEvent(keyEvent);
            }
            if (!LayoutInflater$Factory2C6093ec.this.z0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !LayoutInflater$Factory2C6093ec.this.Z0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        public void e(i iVar) {
            this.Y = iVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            C9061qh2.a aVar = new C9061qh2.a(LayoutInflater$Factory2C6093ec.this.s1, callback);
            T4 i0 = LayoutInflater$Factory2C6093ec.this.i0(aVar);
            if (i0 != null) {
                return aVar.e(i0);
            }
            return null;
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public void onContentChanged() {
            if (this.Z) {
                a().onContentChanged();
            }
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i == 0 && !(menu instanceof androidx.appcompat.view.menu.e)) {
                return false;
            }
            return super.onCreatePanelMenu(i, menu);
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            i iVar = this.Y;
            if (iVar != null && (onCreatePanelView = iVar.onCreatePanelView(i)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i);
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C6093ec.this.c1(i);
            return true;
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.Z0) {
                a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C6093ec.this.d1(i);
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar;
            if (menu instanceof androidx.appcompat.view.menu.e) {
                eVar = (androidx.appcompat.view.menu.e) menu;
            } else {
                eVar = null;
            }
            if (i == 0 && eVar == null) {
                return false;
            }
            boolean z = true;
            if (eVar != null) {
                eVar.j0(true);
            }
            i iVar = this.Y;
            if (iVar == null || !iVar.a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.j0(false);
            }
            return z;
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            u M0 = LayoutInflater$Factory2C6093ec.this.M0(0, true);
            if (M0 != null && (eVar = M0.j) != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // o.Window$CallbackC7745lL2, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (LayoutInflater$Factory2C6093ec.this.I() && i == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    /* renamed from: o.ec$q */
    /* loaded from: classes.dex */
    public class q extends r {
        public final PowerManager c;

        public q(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // o.LayoutInflater$Factory2C6093ec.r
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // o.LayoutInflater$Factory2C6093ec.r
        public int c() {
            if (l.a(this.c)) {
                return 2;
            }
            return 1;
        }

        @Override // o.LayoutInflater$Factory2C6093ec.r
        public void e() {
            LayoutInflater$Factory2C6093ec.this.h();
        }
    }

    /* renamed from: o.ec$r */
    /* loaded from: classes.dex */
    public abstract class r {
        public BroadcastReceiver a;

        /* renamed from: o.ec$r$a */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                r.this.e();
            }
        }

        public r() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C6093ec.this.s1.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public boolean d() {
            if (this.a != null) {
                return true;
            }
            return false;
        }

        public abstract void e();

        public void f() {
            a();
            IntentFilter b = b();
            if (b != null && b.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                LayoutInflater$Factory2C6093ec.this.s1.registerReceiver(this.a, b);
            }
        }
    }

    /* renamed from: o.ec$s */
    /* loaded from: classes.dex */
    public class s extends r {
        public final C7154iv2 c;

        public s(C7154iv2 c7154iv2) {
            super();
            this.c = c7154iv2;
        }

        @Override // o.LayoutInflater$Factory2C6093ec.r
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // o.LayoutInflater$Factory2C6093ec.r
        public int c() {
            if (this.c.d()) {
                return 2;
            }
            return 1;
        }

        @Override // o.LayoutInflater$Factory2C6093ec.r
        public void e() {
            LayoutInflater$Factory2C6093ec.this.h();
        }
    }

    /* renamed from: o.ec$t */
    /* loaded from: classes.dex */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        public final boolean c(int i, int i2) {
            if (i >= -5 && i2 >= -5 && i <= getWidth() + 5 && i2 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!LayoutInflater$Factory2C6093ec.this.z0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflater$Factory2C6093ec.this.u0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C3220Ic.b(getContext(), i));
        }
    }

    /* renamed from: o.ec$u */
    /* loaded from: classes.dex */
    public static final class u {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public androidx.appcompat.view.menu.e j;
        public androidx.appcompat.view.menu.c k;
        public Context l;
        public boolean m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f729o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public boolean s;
        public Bundle t;
        public Bundle u;

        /* renamed from: o.ec$u$a */
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0273a();
            public int X;
            public boolean Y;
            public Bundle Z;

            /* renamed from: o.ec$u$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0273a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return a.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return a.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public static a a(Parcel parcel, ClassLoader classLoader) {
                a aVar = new a();
                aVar.X = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                aVar.Y = z;
                if (z) {
                    aVar.Z = parcel.readBundle(classLoader);
                }
                return aVar;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.X);
                parcel.writeInt(this.Y ? 1 : 0);
                if (this.Y) {
                    parcel.writeBundle(this.Z);
                }
            }
        }

        public u(int i) {
            this.a = i;
        }

        public void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.e eVar = this.j;
            if (eVar != null && (bundle = this.t) != null) {
                eVar.V(bundle);
                this.t = null;
            }
        }

        public void b() {
            androidx.appcompat.view.menu.e eVar = this.j;
            if (eVar != null) {
                eVar.T(this.k);
            }
            this.k = null;
        }

        public androidx.appcompat.view.menu.k c(j.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, OL1.j.q);
                this.k = cVar;
                cVar.d(aVar);
                this.j.b(this.k);
            }
            return this.k.g(this.g);
        }

        public boolean d() {
            if (this.h == null) {
                return false;
            }
            if (this.i == null && this.k.b().getCount() <= 0) {
                return false;
            }
            return true;
        }

        public void e(Parcelable parcelable) {
            a aVar = (a) parcelable;
            this.a = aVar.X;
            this.s = aVar.Y;
            this.t = aVar.Z;
            this.h = null;
            this.g = null;
        }

        public Parcelable f() {
            a aVar = new a();
            aVar.X = this.a;
            aVar.Y = this.f729o;
            if (this.j != null) {
                Bundle bundle = new Bundle();
                aVar.Z = bundle;
                this.j.X(bundle);
            }
            return aVar;
        }

        public void g(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.T(this.k);
                }
                this.j = eVar;
                if (eVar != null && (cVar = this.k) != null) {
                    eVar.b(cVar);
                }
            }
        }

        public void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(OL1.b.c, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(OL1.b.x2, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(OL1.l.P3, true);
            }
            BM bm = new BM(context, 0);
            bm.getTheme().setTo(newTheme);
            this.l = bm;
            TypedArray obtainStyledAttributes = bm.obtainStyledAttributes(OL1.m.S0);
            this.b = obtainStyledAttributes.getResourceId(OL1.m.B2, 0);
            this.f = obtainStyledAttributes.getResourceId(OL1.m.U0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o.ec$v */
    /* loaded from: classes.dex */
    public final class v implements j.a {
        public v() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            boolean z2;
            androidx.appcompat.view.menu.e G = eVar.G();
            if (G != eVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec = LayoutInflater$Factory2C6093ec.this;
            if (z2) {
                eVar = G;
            }
            u E0 = layoutInflater$Factory2C6093ec.E0(eVar);
            if (E0 != null) {
                if (z2) {
                    LayoutInflater$Factory2C6093ec.this.r0(E0.a, E0, G);
                    LayoutInflater$Factory2C6093ec.this.v0(E0, true);
                    return;
                }
                LayoutInflater$Factory2C6093ec.this.v0(E0, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback P0;
            if (eVar == eVar.G()) {
                LayoutInflater$Factory2C6093ec layoutInflater$Factory2C6093ec = LayoutInflater$Factory2C6093ec.this;
                if (layoutInflater$Factory2C6093ec.O1 && (P0 = layoutInflater$Factory2C6093ec.P0()) != null && !LayoutInflater$Factory2C6093ec.this.Z1) {
                    P0.onMenuOpened(108, eVar);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    public LayoutInflater$Factory2C6093ec(Activity activity, InterfaceC4291Tb interfaceC4291Tb) {
        this(activity, null, interfaceC4291Tb, activity);
    }

    public static Configuration F0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            m.a(configuration, configuration2, configuration3);
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & CK1.x;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & CK1.x)) {
                configuration3.screenLayout |= i22 & CK1.x;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            int i37 = configuration.densityDpi;
            int i38 = configuration2.densityDpi;
            if (i37 != i38) {
                configuration3.densityDpi = i38;
            }
        }
        return configuration3;
    }

    public void A0(int i2) {
        u M0;
        u M02 = M0(i2, true);
        if (M02.j != null) {
            Bundle bundle = new Bundle();
            M02.j.W(bundle);
            if (bundle.size() > 0) {
                M02.u = bundle;
            }
            M02.j.n0();
            M02.j.clear();
        }
        M02.r = true;
        M02.q = true;
        if ((i2 == 108 || i2 == 0) && this.z1 != null && (M0 = M0(0, false)) != null) {
            M0.m = false;
            i1(M0, null);
        }
    }

    public void B0() {
        ZH2 zh2 = this.G1;
        if (zh2 != null) {
            zh2.d();
        }
    }

    @Override // o.AbstractC5608cc
    public O4 C() {
        Q0();
        return this.w1;
    }

    public final void C0() {
        if (!this.I1) {
            this.J1 = x0();
            CharSequence O0 = O0();
            if (!TextUtils.isEmpty(O0)) {
                InterfaceC10485wW interfaceC10485wW = this.z1;
                if (interfaceC10485wW != null) {
                    interfaceC10485wW.setWindowTitle(O0);
                } else if (g1() != null) {
                    g1().A0(O0);
                } else {
                    TextView textView = this.K1;
                    if (textView != null) {
                        textView.setText(O0);
                    }
                }
            }
            n0();
            e1(this.J1);
            this.I1 = true;
            u M0 = M0(0, false);
            if (!this.Z1) {
                if (M0 == null || M0.j == null) {
                    U0(108);
                }
            }
        }
    }

    @Override // o.AbstractC5608cc
    public boolean D(int i2) {
        boolean z;
        int k1 = k1(i2);
        if (k1 != 1) {
            if (k1 != 2) {
                if (k1 != 5) {
                    if (k1 != 10) {
                        if (k1 != 108) {
                            if (k1 != 109) {
                                z = false;
                            } else {
                                z = this.P1;
                            }
                        } else {
                            z = this.O1;
                        }
                    } else {
                        z = this.Q1;
                    }
                } else {
                    z = this.N1;
                }
            } else {
                z = this.M1;
            }
        } else {
            z = this.S1;
        }
        if (!z && !this.t1.hasFeature(i2)) {
            return false;
        }
        return true;
    }

    public final void D0() {
        if (this.t1 == null) {
            Object obj = this.r1;
            if (obj instanceof Activity) {
                o0(((Activity) obj).getWindow());
            }
        }
        if (this.t1 != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    @Override // o.AbstractC5608cc
    public void E() {
        LayoutInflater from = LayoutInflater.from(this.s1);
        if (from.getFactory() == null) {
            C10735xY0.d(from, this);
        } else if (!(from.getFactory2() instanceof LayoutInflater$Factory2C6093ec)) {
            Log.i(AbstractC5608cc.Y, "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public u E0(Menu menu) {
        int i2;
        u[] uVarArr = this.U1;
        if (uVarArr != null) {
            i2 = uVarArr.length;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            u uVar = uVarArr[i3];
            if (uVar != null && uVar.j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // o.AbstractC5608cc
    public void F() {
        if (g1() != null && !C().C()) {
            U0(0);
        }
    }

    public final Context G0() {
        Context context;
        O4 C = C();
        if (C != null) {
            context = C.z();
        } else {
            context = null;
        }
        if (context == null) {
            return this.s1;
        }
        return context;
    }

    public final int H0(Context context) {
        int i2;
        if (!this.e2 && (this.r1 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = 786432;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.r1.getClass()), i2);
                if (activityInfo != null) {
                    this.d2 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d(AbstractC5608cc.Y, "Exception while getting ActivityInfo", e2);
                this.d2 = 0;
            }
        }
        this.e2 = true;
        return this.d2;
    }

    @Override // o.AbstractC5608cc
    public boolean I() {
        return this.H1;
    }

    public final r I0(Context context) {
        if (this.g2 == null) {
            this.g2 = new q(context);
        }
        return this.g2;
    }

    @Override // o.AbstractC5608cc
    public void J(Configuration configuration) {
        O4 C;
        if (this.O1 && this.I1 && (C = C()) != null) {
            C.H(configuration);
        }
        C9038qc.b().g(this.s1);
        this.a2 = new Configuration(this.s1.getResources().getConfiguration());
        m0(false, false);
    }

    public final r J0() {
        return K0(this.s1);
    }

    @Override // o.AbstractC5608cc
    public void K(Bundle bundle) {
        String str;
        this.X1 = true;
        l0(false);
        D0();
        Object obj = this.r1;
        if (obj instanceof Activity) {
            try {
                str = C2867Eo1.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                O4 g1 = g1();
                if (g1 == null) {
                    this.k2 = true;
                } else {
                    g1.W(true);
                }
            }
            AbstractC5608cc.e(this);
        }
        this.a2 = new Configuration(this.s1.getResources().getConfiguration());
        this.Y1 = true;
    }

    public final r K0(Context context) {
        if (this.f2 == null) {
            this.f2 = new s(C7154iv2.a(context));
        }
        return this.f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // o.AbstractC5608cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L() {
        O4 o4;
        if (this.r1 instanceof Activity) {
            AbstractC5608cc.R(this);
        }
        if (this.h2) {
            this.t1.getDecorView().removeCallbacks(this.j2);
        }
        this.Z1 = true;
        if (this.b2 != -100) {
            Object obj = this.r1;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                r2.put(this.r1.getClass().getName(), Integer.valueOf(this.b2));
                o4 = this.w1;
                if (o4 != null) {
                    o4.I();
                }
                t0();
            }
        }
        r2.remove(this.r1.getClass().getName());
        o4 = this.w1;
        if (o4 != null) {
        }
        t0();
    }

    public C9637t21 L0(Configuration configuration) {
        return m.b(configuration);
    }

    @Override // o.AbstractC5608cc
    public void M(Bundle bundle) {
        C0();
    }

    public u M0(int i2, boolean z) {
        u[] uVarArr = this.U1;
        if (uVarArr == null || uVarArr.length <= i2) {
            u[] uVarArr2 = new u[i2 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.U1 = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i2];
        if (uVar == null) {
            u uVar2 = new u(i2);
            uVarArr[i2] = uVar2;
            return uVar2;
        }
        return uVar;
    }

    @Override // o.AbstractC5608cc
    public void N() {
        O4 C = C();
        if (C != null) {
            C.t0(true);
        }
    }

    public ViewGroup N0() {
        return this.J1;
    }

    public final CharSequence O0() {
        Object obj = this.r1;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.y1;
    }

    @Override // o.AbstractC5608cc
    public void P() {
        m0(true, false);
    }

    public final Window.Callback P0() {
        return this.t1.getCallback();
    }

    @Override // o.AbstractC5608cc
    public void Q() {
        O4 C = C();
        if (C != null) {
            C.t0(false);
        }
    }

    public final void Q0() {
        C0();
        if (this.O1 && this.w1 == null) {
            Object obj = this.r1;
            if (obj instanceof Activity) {
                this.w1 = new C8249nL2((Activity) this.r1, this.P1);
            } else if (obj instanceof Dialog) {
                this.w1 = new C8249nL2((Dialog) this.r1);
            }
            O4 o4 = this.w1;
            if (o4 != null) {
                o4.W(this.k2);
            }
        }
    }

    public final boolean R0(u uVar) {
        View view = uVar.i;
        if (view != null) {
            uVar.h = view;
            return true;
        } else if (uVar.j == null) {
            return false;
        } else {
            if (this.B1 == null) {
                this.B1 = new v();
            }
            View view2 = (View) uVar.c(this.B1);
            uVar.h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    public final boolean S0(u uVar) {
        uVar.h(G0());
        uVar.g = new t(uVar.l);
        uVar.c = 81;
        return true;
    }

    @Override // o.AbstractC5608cc
    public boolean T(int i2) {
        int k1 = k1(i2);
        if (this.S1 && k1 == 108) {
            return false;
        }
        if (this.O1 && k1 == 1) {
            this.O1 = false;
        }
        if (k1 != 1) {
            if (k1 != 2) {
                if (k1 != 5) {
                    if (k1 != 10) {
                        if (k1 != 108) {
                            if (k1 != 109) {
                                return this.t1.requestFeature(k1);
                            }
                            r1();
                            this.P1 = true;
                            return true;
                        }
                        r1();
                        this.O1 = true;
                        return true;
                    }
                    r1();
                    this.Q1 = true;
                    return true;
                }
                r1();
                this.N1 = true;
                return true;
            }
            r1();
            this.M1 = true;
            return true;
        }
        r1();
        this.S1 = true;
        return true;
    }

    public final boolean T0(u uVar) {
        Resources.Theme theme;
        Context context = this.s1;
        int i2 = uVar.a;
        if ((i2 == 0 || i2 == 108) && this.z1 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(OL1.b.j, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(OL1.b.k, typedValue, true);
            } else {
                theme2.resolveAttribute(OL1.b.k, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                BM bm = new BM(context, 0);
                bm.getTheme().setTo(theme);
                context = bm;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.Y(this);
        uVar.g(eVar);
        return true;
    }

    public final void U0(int i2) {
        this.i2 = (1 << i2) | this.i2;
        if (!this.h2) {
            C6516gH2.w1(this.t1.getDecorView(), this.j2);
            this.h2 = true;
        }
    }

    public int V0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        return I0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return K0(context).c();
            }
        }
        return i2;
    }

    public boolean W0() {
        boolean z = this.W1;
        this.W1 = false;
        u M0 = M0(0, false);
        if (M0 != null && M0.f729o) {
            if (!z) {
                v0(M0, true);
            }
            return true;
        }
        T4 t4 = this.C1;
        if (t4 != null) {
            t4.c();
            return true;
        }
        O4 C = C();
        if (C == null || !C.l()) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC5608cc
    public void X(int i2) {
        C0();
        ViewGroup viewGroup = (ViewGroup) this.J1.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.s1).inflate(i2, viewGroup);
        this.u1.c(this.t1.getCallback());
    }

    public boolean X0(int i2, KeyEvent keyEvent) {
        boolean z = true;
        if (i2 != 4) {
            if (i2 == 82) {
                Y0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.W1 = z;
        }
        return false;
    }

    @Override // o.AbstractC5608cc
    public void Y(View view) {
        C0();
        ViewGroup viewGroup = (ViewGroup) this.J1.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.u1.c(this.t1.getCallback());
    }

    public final boolean Y0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            u M0 = M0(i2, true);
            if (!M0.f729o) {
                return i1(M0, keyEvent);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC5608cc
    public void Z(View view, ViewGroup.LayoutParams layoutParams) {
        C0();
        ViewGroup viewGroup = (ViewGroup) this.J1.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.u1.c(this.t1.getCallback());
    }

    public boolean Z0(int i2, KeyEvent keyEvent) {
        O4 C = C();
        if (C != null && C.J(i2, keyEvent)) {
            return true;
        }
        u uVar = this.V1;
        if (uVar != null && h1(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.V1;
            if (uVar2 != null) {
                uVar2.n = true;
            }
            return true;
        }
        if (this.V1 == null) {
            u M0 = M0(0, true);
            i1(M0, keyEvent);
            boolean h1 = h1(M0, keyEvent.getKeyCode(), keyEvent, 1);
            M0.m = false;
            if (h1) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u E0;
        Window.Callback P0 = P0();
        if (P0 != null && !this.Z1 && (E0 = E0(eVar.G())) != null) {
            return P0.onMenuItemSelected(E0.a, menuItem);
        }
        return false;
    }

    public boolean a1(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                b1(0, keyEvent);
                return true;
            }
        } else if (W0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        j1(true);
    }

    @Override // o.AbstractC5608cc
    public void b0(boolean z) {
        this.H1 = z;
    }

    public final boolean b1(int i2, KeyEvent keyEvent) {
        boolean z;
        InterfaceC10485wW interfaceC10485wW;
        if (this.C1 != null) {
            return false;
        }
        boolean z2 = true;
        u M0 = M0(i2, true);
        if (i2 == 0 && (interfaceC10485wW = this.z1) != null && interfaceC10485wW.d() && !ViewConfiguration.get(this.s1).hasPermanentMenuKey()) {
            if (!this.z1.h()) {
                if (!this.Z1 && i1(M0, keyEvent)) {
                    z2 = this.z1.f();
                }
                z2 = false;
            } else {
                z2 = this.z1.e();
            }
        } else {
            boolean z3 = M0.f729o;
            if (!z3 && !M0.n) {
                if (M0.m) {
                    if (M0.r) {
                        M0.m = false;
                        z = i1(M0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        f1(M0, keyEvent);
                    }
                }
                z2 = false;
            } else {
                v0(M0, true);
                z2 = z3;
            }
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.s1.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return z2;
            }
            Log.w(AbstractC5608cc.Y, "Couldn't get audio manager");
        }
        return z2;
    }

    public void c1(int i2) {
        O4 C;
        if (i2 == 108 && (C = C()) != null) {
            C.m(true);
        }
    }

    @Override // o.AbstractC5608cc
    public void d0(int i2) {
        if (this.b2 != i2) {
            this.b2 = i2;
            if (this.X1) {
                h();
            }
        }
    }

    public void d1(int i2) {
        if (i2 == 108) {
            O4 C = C();
            if (C != null) {
                C.m(false);
            }
        } else if (i2 == 0) {
            u M0 = M0(i2, true);
            if (M0.f729o) {
                v0(M0, false);
            }
        }
    }

    @Override // o.AbstractC5608cc
    public void e0(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.e0(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.p2;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.q2) != null) {
            o.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.q2 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.r1;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.p2 = o.a((Activity) this.r1);
                v1();
            }
        }
        this.p2 = onBackInvokedDispatcher;
        v1();
    }

    @Override // o.AbstractC5608cc
    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        C0();
        ((ViewGroup) this.J1.findViewById(16908290)).addView(view, layoutParams);
        this.u1.c(this.t1.getCallback());
    }

    @Override // o.AbstractC5608cc
    public void f0(Toolbar toolbar) {
        if (!(this.r1 instanceof Activity)) {
            return;
        }
        O4 C = C();
        if (!(C instanceof C8249nL2)) {
            this.x1 = null;
            if (C != null) {
                C.I();
            }
            this.w1 = null;
            if (toolbar != null) {
                C8611oq2 c8611oq2 = new C8611oq2(toolbar, O0(), this.u1);
                this.w1 = c8611oq2;
                this.u1.e(c8611oq2.k);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.u1.e(null);
            }
            F();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(u uVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!uVar.f729o && !this.Z1) {
            if (uVar.a == 0 && (this.s1.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
            Window.Callback P0 = P0();
            if (P0 != null && !P0.onMenuOpened(uVar.a, uVar.j)) {
                v0(uVar, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.s1.getSystemService("window");
            if (windowManager != null && i1(uVar, keyEvent)) {
                ViewGroup viewGroup = uVar.g;
                if (viewGroup != null && !uVar.q) {
                    View view = uVar.i;
                    if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                        i2 = -1;
                        uVar.n = false;
                        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, uVar.d, uVar.e, 1002, 8519680, -3);
                        layoutParams2.gravity = uVar.c;
                        layoutParams2.windowAnimations = uVar.f;
                        windowManager.addView(uVar.g, layoutParams2);
                        uVar.f729o = true;
                        if (uVar.a != 0) {
                            v1();
                            return;
                        }
                        return;
                    }
                } else {
                    if (viewGroup == null) {
                        if (!S0(uVar) || uVar.g == null) {
                            return;
                        }
                    } else if (uVar.q && viewGroup.getChildCount() > 0) {
                        uVar.g.removeAllViews();
                    }
                    if (R0(uVar) && uVar.d()) {
                        ViewGroup.LayoutParams layoutParams3 = uVar.h.getLayoutParams();
                        if (layoutParams3 == null) {
                            layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        uVar.g.setBackgroundResource(uVar.b);
                        ViewParent parent = uVar.h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(uVar.h);
                        }
                        uVar.g.addView(uVar.h, layoutParams3);
                        if (!uVar.h.hasFocus()) {
                            uVar.h.requestFocus();
                        }
                    } else {
                        uVar.q = true;
                        return;
                    }
                }
                i2 = -2;
                uVar.n = false;
                WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, uVar.d, uVar.e, 1002, 8519680, -3);
                layoutParams22.gravity = uVar.c;
                layoutParams22.windowAnimations = uVar.f;
                windowManager.addView(uVar.g, layoutParams22);
                uVar.f729o = true;
                if (uVar.a != 0) {
                }
            }
        }
    }

    @Override // o.AbstractC5608cc
    public boolean g() {
        if (AbstractC5608cc.G(this.s1) && AbstractC5608cc.A() != null && !AbstractC5608cc.A().equals(AbstractC5608cc.B())) {
            k(this.s1);
        }
        return l0(true);
    }

    @Override // o.AbstractC5608cc
    public void g0(int i2) {
        this.c2 = i2;
    }

    public final O4 g1() {
        return this.w1;
    }

    @Override // o.AbstractC5608cc
    public boolean h() {
        return l0(true);
    }

    @Override // o.AbstractC5608cc
    public final void h0(CharSequence charSequence) {
        this.y1 = charSequence;
        InterfaceC10485wW interfaceC10485wW = this.z1;
        if (interfaceC10485wW != null) {
            interfaceC10485wW.setWindowTitle(charSequence);
        } else if (g1() != null) {
            g1().A0(charSequence);
        } else {
            TextView textView = this.K1;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean h1(u uVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.m || i1(uVar, keyEvent)) && (eVar = uVar.j) != null) {
            z = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.z1 == null) {
            v0(uVar, true);
        }
        return z;
    }

    @Override // o.AbstractC5608cc
    public T4 i0(T4.a aVar) {
        InterfaceC4291Tb interfaceC4291Tb;
        if (aVar != null) {
            T4 t4 = this.C1;
            if (t4 != null) {
                t4.c();
            }
            k kVar = new k(aVar);
            O4 C = C();
            if (C != null) {
                T4 C0 = C.C0(kVar);
                this.C1 = C0;
                if (C0 != null && (interfaceC4291Tb = this.v1) != null) {
                    interfaceC4291Tb.B(C0);
                }
            }
            if (this.C1 == null) {
                this.C1 = q1(kVar);
            }
            v1();
            return this.C1;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final boolean i1(u uVar, KeyEvent keyEvent) {
        boolean z;
        InterfaceC10485wW interfaceC10485wW;
        int i2;
        boolean z2;
        InterfaceC10485wW interfaceC10485wW2;
        InterfaceC10485wW interfaceC10485wW3;
        if (this.Z1) {
            return false;
        }
        if (uVar.m) {
            return true;
        }
        u uVar2 = this.V1;
        if (uVar2 != null && uVar2 != uVar) {
            v0(uVar2, false);
        }
        Window.Callback P0 = P0();
        if (P0 != null) {
            uVar.i = P0.onCreatePanelView(uVar.a);
        }
        int i3 = uVar.a;
        if (i3 != 0 && i3 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (interfaceC10485wW3 = this.z1) != null) {
            interfaceC10485wW3.i();
        }
        if (uVar.i == null && (!z || !(g1() instanceof C8611oq2))) {
            androidx.appcompat.view.menu.e eVar = uVar.j;
            if (eVar == null || uVar.r) {
                if (eVar == null && (!T0(uVar) || uVar.j == null)) {
                    return false;
                }
                if (z && this.z1 != null) {
                    if (this.A1 == null) {
                        this.A1 = new j();
                    }
                    this.z1.g(uVar.j, this.A1);
                }
                uVar.j.n0();
                if (!P0.onCreatePanelMenu(uVar.a, uVar.j)) {
                    uVar.g(null);
                    if (z && (interfaceC10485wW = this.z1) != null) {
                        interfaceC10485wW.g(null, this.A1);
                    }
                    return false;
                }
                uVar.r = false;
            }
            uVar.j.n0();
            Bundle bundle = uVar.u;
            if (bundle != null) {
                uVar.j.U(bundle);
                uVar.u = null;
            }
            if (!P0.onPreparePanel(0, uVar.i, uVar.j)) {
                if (z && (interfaceC10485wW2 = this.z1) != null) {
                    interfaceC10485wW2.g(null, this.A1);
                }
                uVar.j.m0();
                return false;
            }
            if (keyEvent != null) {
                i2 = keyEvent.getDeviceId();
            } else {
                i2 = -1;
            }
            if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            uVar.p = z2;
            uVar.j.setQwertyMode(z2);
            uVar.j.m0();
        }
        uVar.m = true;
        uVar.n = false;
        this.V1 = uVar;
        return true;
    }

    public final void j1(boolean z) {
        InterfaceC10485wW interfaceC10485wW = this.z1;
        if (interfaceC10485wW != null && interfaceC10485wW.d() && (!ViewConfiguration.get(this.s1).hasPermanentMenuKey() || this.z1.k())) {
            Window.Callback P0 = P0();
            if (this.z1.h() && z) {
                this.z1.e();
                if (!this.Z1) {
                    P0.onPanelClosed(108, M0(0, true).j);
                    return;
                }
                return;
            } else if (P0 != null && !this.Z1) {
                if (this.h2 && (this.i2 & 1) != 0) {
                    this.t1.getDecorView().removeCallbacks(this.j2);
                    this.j2.run();
                }
                u M0 = M0(0, true);
                androidx.appcompat.view.menu.e eVar = M0.j;
                if (eVar != null && !M0.r && P0.onPreparePanel(0, M0.i, eVar)) {
                    P0.onMenuOpened(108, M0.j);
                    this.z1.f();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        u M02 = M0(0, true);
        M02.q = true;
        v0(M02, false);
        f1(M02, null);
    }

    public final int k1(int i2) {
        if (i2 == 8) {
            Log.i(AbstractC5608cc.Y, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 == 9) {
            Log.i(AbstractC5608cc.Y, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i2;
        }
    }

    public final boolean l0(boolean z) {
        return m0(z, true);
    }

    public void l1(Configuration configuration, C9637t21 c9637t21) {
        m.d(configuration, c9637t21);
    }

    @Override // o.AbstractC5608cc
    public Context m(Context context) {
        Context context2;
        Configuration configuration;
        this.X1 = true;
        int V0 = V0(context, q0());
        if (AbstractC5608cc.G(context)) {
            AbstractC5608cc.k0(context);
        }
        C9637t21 p0 = p0(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(w0(context2, V0, p0, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof BM) {
            try {
                ((BM) context2).a(w0(context2, V0, p0, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!u2) {
            return super.m(context2);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context2.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context2.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = F0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration w0 = w0(context2, V0, p0, configuration, true);
        BM bm = new BM(context2, OL1.l.Theme_AppCompat_Empty);
        bm.a(w0);
        try {
            if (context2.getTheme() != null) {
                C10231vT1.g.a(bm.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.m(bm);
    }

    public final boolean m0(boolean z, boolean z2) {
        C9637t21 c9637t21;
        if (this.Z1) {
            return false;
        }
        int q0 = q0();
        int V0 = V0(this.s1, q0);
        if (Build.VERSION.SDK_INT < 33) {
            c9637t21 = p0(this.s1);
        } else {
            c9637t21 = null;
        }
        if (!z2 && c9637t21 != null) {
            c9637t21 = L0(this.s1.getResources().getConfiguration());
        }
        boolean u1 = u1(V0, c9637t21, z);
        if (q0 == 0) {
            K0(this.s1).f();
        } else {
            r rVar = this.f2;
            if (rVar != null) {
                rVar.a();
            }
        }
        if (q0 == 3) {
            I0(this.s1).f();
            return u1;
        }
        r rVar2 = this.g2;
        if (rVar2 != null) {
            rVar2.a();
        }
        return u1;
    }

    public void m1(C9637t21 c9637t21) {
        m.c(c9637t21);
    }

    public final void n0() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.J1.findViewById(16908290);
        View decorView = this.t1.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.s1.obtainStyledAttributes(OL1.m.S0);
        obtainStyledAttributes.getValue(OL1.m.n3, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(OL1.m.o3, contentFrameLayout.getMinWidthMinor());
        int i2 = OL1.m.l3;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = OL1.m.m3;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = OL1.m.j3;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = OL1.m.k3;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean n1() {
        ViewGroup viewGroup;
        if (this.I1 && (viewGroup = this.J1) != null && viewGroup.isLaidOut()) {
            return true;
        }
        return false;
    }

    public final void o0(Window window) {
        if (this.t1 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof p)) {
                p pVar = new p(callback);
                this.u1 = pVar;
                window.setCallback(pVar);
                C2872Ep2 F = C2872Ep2.F(this.s1, null, t2);
                Drawable i2 = F.i(0);
                if (i2 != null) {
                    window.setBackgroundDrawable(i2);
                }
                F.I();
                this.t1 = window;
                if (Build.VERSION.SDK_INT >= 33 && this.p2 == null) {
                    e0(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final boolean o1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.t1.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return r(view, str, context, attributeSet);
    }

    public C9637t21 p0(Context context) {
        C9637t21 A;
        if (Build.VERSION.SDK_INT >= 33 || (A = AbstractC5608cc.A()) == null) {
            return null;
        }
        C9637t21 L0 = L0(context.getApplicationContext().getResources().getConfiguration());
        C9637t21 c2 = C10855y21.c(A, L0);
        if (c2.j()) {
            return L0;
        }
        return c2;
    }

    public boolean p1() {
        if (this.p2 == null) {
            return false;
        }
        u M0 = M0(0, false);
        if ((M0 == null || !M0.f729o) && this.C1 == null) {
            return false;
        }
        return true;
    }

    public final int q0() {
        int i2 = this.b2;
        if (i2 != -100) {
            return i2;
        }
        return AbstractC5608cc.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T4 q1(T4.a aVar) {
        T4 t4;
        Context context;
        T4 t42;
        InterfaceC4291Tb interfaceC4291Tb;
        B0();
        T4 t43 = this.C1;
        if (t43 != null) {
            t43.c();
        }
        if (!(aVar instanceof k)) {
            aVar = new k(aVar);
        }
        InterfaceC4291Tb interfaceC4291Tb2 = this.v1;
        if (interfaceC4291Tb2 != null && !this.Z1) {
            try {
                t4 = interfaceC4291Tb2.y(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (t4 == null) {
                this.C1 = t4;
            } else {
                boolean z = true;
                if (this.D1 == null) {
                    if (this.R1) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.s1.getTheme();
                        theme.resolveAttribute(OL1.b.j, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.s1.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new BM(this.s1, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.s1;
                        }
                        this.D1 = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, OL1.b.y);
                        this.E1 = popupWindow;
                        IE1.d(popupWindow, 2);
                        this.E1.setContentView(this.D1);
                        this.E1.setWidth(-1);
                        context.getTheme().resolveAttribute(OL1.b.d, typedValue, true);
                        this.D1.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.E1.setHeight(-2);
                        this.F1 = new f();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.J1.findViewById(OL1.g.l);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(G0()));
                            this.D1 = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.D1 != null) {
                    B0();
                    this.D1.t();
                    Context context2 = this.D1.getContext();
                    ActionBarContextView actionBarContextView = this.D1;
                    if (this.E1 != null) {
                        z = false;
                    }
                    C2816Eb2 c2816Eb2 = new C2816Eb2(context2, actionBarContextView, aVar, z);
                    if (aVar.a(c2816Eb2, c2816Eb2.e())) {
                        c2816Eb2.k();
                        this.D1.q(c2816Eb2);
                        this.C1 = c2816Eb2;
                        if (n1()) {
                            this.D1.setAlpha(0.0f);
                            ZH2 b2 = C6516gH2.h(this.D1).b(1.0f);
                            this.G1 = b2;
                            b2.t(new g());
                        } else {
                            this.D1.setAlpha(1.0f);
                            this.D1.setVisibility(0);
                            if (this.D1.getParent() instanceof View) {
                                C6516gH2.C1((View) this.D1.getParent());
                            }
                        }
                        if (this.E1 != null) {
                            this.t1.getDecorView().post(this.F1);
                        }
                    } else {
                        this.C1 = null;
                    }
                }
            }
            t42 = this.C1;
            if (t42 != null && (interfaceC4291Tb = this.v1) != null) {
                interfaceC4291Tb.B(t42);
            }
            v1();
            return this.C1;
        }
        t4 = null;
        if (t4 == null) {
        }
        t42 = this.C1;
        if (t42 != null) {
            interfaceC4291Tb.B(t42);
        }
        v1();
        return this.C1;
    }

    @Override // o.AbstractC5608cc
    public View r(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.n2 == null) {
            TypedArray obtainStyledAttributes = this.s1.obtainStyledAttributes(OL1.m.S0);
            String string = obtainStyledAttributes.getString(OL1.m.f3);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.n2 = new C4586Wc();
            } else {
                try {
                    this.n2 = (C4586Wc) this.s1.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i(AbstractC5608cc.Y, "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.n2 = new C4586Wc();
                }
            }
        }
        boolean z2 = s2;
        boolean z3 = false;
        if (z2) {
            if (this.o2 == null) {
                this.o2 = new C10492wY0();
            }
            if (this.o2.a(attributeSet)) {
                z = true;
                return this.n2.r(view, str, context, attributeSet, z, z2, true, NE2.d());
            } else if (attributeSet instanceof XmlPullParser) {
                if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z3 = true;
                }
            } else {
                z3 = o1((ViewParent) view);
            }
        }
        z = z3;
        return this.n2.r(view, str, context, attributeSet, z, z2, true, NE2.d());
    }

    public void r0(int i2, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i2 >= 0) {
                u[] uVarArr = this.U1;
                if (i2 < uVarArr.length) {
                    uVar = uVarArr[i2];
                }
            }
            if (uVar != null) {
                menu = uVar.j;
            }
        }
        if ((uVar == null || uVar.f729o) && !this.Z1) {
            this.u1.d(this.t1.getCallback(), i2, menu);
        }
    }

    public final void r1() {
        if (!this.I1) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    @Override // o.AbstractC5608cc
    public <T extends View> T s(int i2) {
        C0();
        return (T) this.t1.findViewById(i2);
    }

    public void s0(androidx.appcompat.view.menu.e eVar) {
        if (this.T1) {
            return;
        }
        this.T1 = true;
        this.z1.q();
        Window.Callback P0 = P0();
        if (P0 != null && !this.Z1) {
            P0.onPanelClosed(108, eVar);
        }
        this.T1 = false;
    }

    public final ActivityC3020Gb s1() {
        for (Context context = this.s1; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC3020Gb) {
                return (ActivityC3020Gb) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void t0() {
        r rVar = this.f2;
        if (rVar != null) {
            rVar.a();
        }
        r rVar2 = this.g2;
        if (rVar2 != null) {
            rVar2.a();
        }
    }

    public final void t1(Configuration configuration) {
        Activity activity = (Activity) this.r1;
        if (activity instanceof KZ0) {
            if (((KZ0) activity).b().b().g(f.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.Y1 && !this.Z1) {
            activity.onConfigurationChanged(configuration);
        }
    }

    @Override // o.AbstractC5608cc
    public Context u() {
        return this.s1;
    }

    public void u0(int i2) {
        v0(M0(i2, true), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u1(int i2, C9637t21 c9637t21, boolean z) {
        C9637t21 L0;
        int i3;
        boolean z2;
        Configuration w0 = w0(this.s1, i2, c9637t21, null, false);
        int H0 = H0(this.s1);
        Configuration configuration = this.a2;
        if (configuration == null) {
            configuration = this.s1.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = w0.uiMode & 48;
        C9637t21 L02 = L0(configuration);
        if (c9637t21 == null) {
            L0 = null;
        } else {
            L0 = L0(w0);
        }
        boolean z3 = false;
        if (i4 != i5) {
            i3 = 512;
        } else {
            i3 = 0;
        }
        if (L0 != null && !L02.equals(L0)) {
            i3 |= 8196;
        }
        boolean z4 = true;
        if (((~H0) & i3) != 0 && z && this.X1 && (u2 || this.Y1)) {
            Object obj = this.r1;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i3 & 8192) != 0) {
                    ((Activity) this.r1).getWindow().getDecorView().setLayoutDirection(w0.getLayoutDirection());
                }
                C5240b5.K((Activity) this.r1);
                z2 = true;
                if (z2 && i3 != 0) {
                    if ((i3 & H0) == i3) {
                        z3 = true;
                    }
                    w1(i5, L0, z3, null);
                } else {
                    z4 = z2;
                }
                if (z4) {
                    Object obj2 = this.r1;
                    if (obj2 instanceof ActivityC3020Gb) {
                        if ((i3 & 512) != 0) {
                            ((ActivityC3020Gb) obj2).r1(i2);
                        }
                        if ((i3 & 4) != 0) {
                            ((ActivityC3020Gb) this.r1).q1(c9637t21);
                        }
                    }
                }
                if (L0 != null) {
                    m1(L0(this.s1.getResources().getConfiguration()));
                }
                return z4;
            }
        }
        z2 = false;
        if (z2) {
        }
        z4 = z2;
        if (z4) {
        }
        if (L0 != null) {
        }
        return z4;
    }

    public void v0(u uVar, boolean z) {
        ViewGroup viewGroup;
        InterfaceC10485wW interfaceC10485wW;
        if (z && uVar.a == 0 && (interfaceC10485wW = this.z1) != null && interfaceC10485wW.h()) {
            s0(uVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.s1.getSystemService("window");
        if (windowManager != null && uVar.f729o && (viewGroup = uVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                r0(uVar.a, uVar, null);
            }
        }
        uVar.m = false;
        uVar.n = false;
        uVar.f729o = false;
        uVar.h = null;
        uVar.q = true;
        if (this.V1 == uVar) {
            this.V1 = null;
        }
        if (uVar.a == 0) {
            v1();
        }
    }

    public void v1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean p1 = p1();
            if (p1 && this.q2 == null) {
                this.q2 = o.b(this.p2, this);
            } else if (!p1 && (onBackInvokedCallback = this.q2) != null) {
                o.c(this.p2, onBackInvokedCallback);
                this.q2 = null;
            }
        }
    }

    @Override // o.AbstractC5608cc
    public final Q4.b w() {
        return new h();
    }

    public final Configuration w0(Context context, int i2, C9637t21 c9637t21, Configuration configuration, boolean z) {
        int i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i3 = 32;
            }
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (c9637t21 != null) {
            l1(configuration2, c9637t21);
        }
        return configuration2;
    }

    public final void w1(int i2, C9637t21 c9637t21, boolean z, Configuration configuration) {
        Resources resources = this.s1.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        if (c9637t21 != null) {
            l1(configuration2, c9637t21);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            C10963yT1.a(resources);
        }
        int i3 = this.c2;
        if (i3 != 0) {
            this.s1.setTheme(i3);
            this.s1.getTheme().applyStyle(this.c2, true);
        }
        if (z && (this.r1 instanceof Activity)) {
            t1(configuration2);
        }
    }

    @Override // o.AbstractC5608cc
    public int x() {
        return this.b2;
    }

    public final ViewGroup x0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.s1.obtainStyledAttributes(OL1.m.S0);
        int i2 = OL1.m.g3;
        if (obtainStyledAttributes.hasValue(i2)) {
            if (obtainStyledAttributes.getBoolean(OL1.m.p3, false)) {
                T(1);
            } else if (obtainStyledAttributes.getBoolean(i2, false)) {
                T(108);
            }
            if (obtainStyledAttributes.getBoolean(OL1.m.h3, false)) {
                T(109);
            }
            if (obtainStyledAttributes.getBoolean(OL1.m.i3, false)) {
                T(10);
            }
            this.R1 = obtainStyledAttributes.getBoolean(OL1.m.T0, false);
            obtainStyledAttributes.recycle();
            D0();
            this.t1.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.s1);
            if (!this.S1) {
                if (this.R1) {
                    viewGroup = (ViewGroup) from.inflate(OL1.j.m, (ViewGroup) null);
                    this.P1 = false;
                    this.O1 = false;
                } else if (this.O1) {
                    TypedValue typedValue = new TypedValue();
                    this.s1.getTheme().resolveAttribute(OL1.b.j, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new BM(this.s1, typedValue.resourceId);
                    } else {
                        context = this.s1;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(OL1.j.x, (ViewGroup) null);
                    InterfaceC10485wW interfaceC10485wW = (InterfaceC10485wW) viewGroup.findViewById(OL1.g.x);
                    this.z1 = interfaceC10485wW;
                    interfaceC10485wW.setWindowCallback(P0());
                    if (this.P1) {
                        this.z1.m(109);
                    }
                    if (this.M1) {
                        this.z1.m(2);
                    }
                    if (this.N1) {
                        this.z1.m(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.Q1 ? (ViewGroup) from.inflate(OL1.j.w, (ViewGroup) null) : (ViewGroup) from.inflate(OL1.j.v, (ViewGroup) null);
            }
            if (viewGroup != null) {
                C6516gH2.l2(viewGroup, new c());
                if (this.z1 == null) {
                    this.K1 = (TextView) viewGroup.findViewById(OL1.g.s0);
                }
                C11163zI2.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(OL1.g.b);
                ViewGroup viewGroup2 = (ViewGroup) this.t1.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.t1.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.O1 + ", windowActionBarOverlay: " + this.P1 + ", android:windowIsFloating: " + this.R1 + ", windowActionModeOverlay: " + this.Q1 + ", windowNoTitle: " + this.S1 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public final int x1(RL2 rl2, Rect rect) {
        int i2;
        boolean z;
        int p2;
        int q2;
        boolean z2;
        int i3 = 0;
        if (rl2 != null) {
            i2 = rl2.r();
        } else if (rect != null) {
            i2 = rect.top;
        } else {
            i2 = 0;
        }
        ActionBarContextView actionBarContextView = this.D1;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.D1.getLayoutParams();
            boolean z3 = true;
            if (this.D1.isShown()) {
                if (this.l2 == null) {
                    this.l2 = new Rect();
                    this.m2 = new Rect();
                }
                Rect rect2 = this.l2;
                Rect rect3 = this.m2;
                if (rl2 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(rl2.p(), rl2.r(), rl2.q(), rl2.o());
                }
                C11163zI2.a(this.J1, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                RL2 t0 = C6516gH2.t0(this.J1);
                if (t0 == null) {
                    p2 = 0;
                } else {
                    p2 = t0.p();
                }
                if (t0 == null) {
                    q2 = 0;
                } else {
                    q2 = t0.q();
                }
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 > 0 && this.L1 == null) {
                    View view = new View(this.s1);
                    this.L1 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = p2;
                    layoutParams.rightMargin = q2;
                    this.J1.addView(this.L1, -1, layoutParams);
                } else {
                    View view2 = this.L1;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != p2 || marginLayoutParams2.rightMargin != q2) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = p2;
                            marginLayoutParams2.rightMargin = q2;
                            this.L1.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.L1;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    y1(this.L1);
                }
                if (!this.Q1 && z3) {
                    i2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.D1.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view4 = this.L1;
        if (view4 != null) {
            if (!z) {
                i3 = 8;
            }
            view4.setVisibility(i3);
        }
        return i2;
    }

    public void y0() {
        androidx.appcompat.view.menu.e eVar;
        InterfaceC10485wW interfaceC10485wW = this.z1;
        if (interfaceC10485wW != null) {
            interfaceC10485wW.q();
        }
        if (this.E1 != null) {
            this.t1.getDecorView().removeCallbacks(this.F1);
            if (this.E1.isShowing()) {
                try {
                    this.E1.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.E1 = null;
        }
        B0();
        u M0 = M0(0, false);
        if (M0 != null && (eVar = M0.j) != null) {
            eVar.close();
        }
    }

    public final void y1(View view) {
        int g2;
        if ((C6516gH2.H0(view) & 8192) != 0) {
            g2 = C10201vM.g(this.s1, OL1.d.abc_decor_view_status_guard_light);
        } else {
            g2 = C10201vM.g(this.s1, OL1.d.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(g2);
    }

    @Override // o.AbstractC5608cc
    public MenuInflater z() {
        Context context;
        if (this.x1 == null) {
            Q0();
            O4 o4 = this.w1;
            if (o4 != null) {
                context = o4.z();
            } else {
                context = this.s1;
            }
            this.x1 = new C9796th2(context);
        }
        return this.x1;
    }

    public boolean z0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.r1;
        if (((obj instanceof C9271rX0.a) || (obj instanceof DialogC8552oc)) && (decorView = this.t1.getDecorView()) != null && C9271rX0.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.u1.b(this.t1.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return X0(keyCode, keyEvent);
        }
        return a1(keyCode, keyEvent);
    }

    public LayoutInflater$Factory2C6093ec(Dialog dialog, InterfaceC4291Tb interfaceC4291Tb) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC4291Tb, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public LayoutInflater$Factory2C6093ec(Context context, Window window, InterfaceC4291Tb interfaceC4291Tb) {
        this(context, window, interfaceC4291Tb, context);
    }

    public LayoutInflater$Factory2C6093ec(Context context, Activity activity, InterfaceC4291Tb interfaceC4291Tb) {
        this(context, null, interfaceC4291Tb, activity);
    }

    public LayoutInflater$Factory2C6093ec(Context context, Window window, InterfaceC4291Tb interfaceC4291Tb, Object obj) {
        C9654t62<String, Integer> c9654t62;
        Integer num;
        ActivityC3020Gb s1;
        this.G1 = null;
        this.H1 = true;
        this.b2 = -100;
        this.j2 = new b();
        this.s1 = context;
        this.v1 = interfaceC4291Tb;
        this.r1 = obj;
        if (this.b2 == -100 && (obj instanceof Dialog) && (s1 = s1()) != null) {
            this.b2 = s1.m1().x();
        }
        if (this.b2 == -100 && (num = (c9654t62 = r2).get(obj.getClass().getName())) != null) {
            this.b2 = num.intValue();
            c9654t62.remove(obj.getClass().getName());
        }
        if (window != null) {
            o0(window);
        }
        C9038qc.i();
    }

    /* renamed from: o.ec$e */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        public e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C6093ec.this.y0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // o.AbstractC5608cc
    public void O(Bundle bundle) {
    }

    public void e1(ViewGroup viewGroup) {
    }
}
