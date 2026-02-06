package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import o.C10861y4;
import o.C6516gH2;
import o.C8736pL2;
import o.HL1;
import o.Q3;
import o.RL2;

/* renamed from: o.gH2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6516gH2 {
    @Deprecated
    public static final int A = 16777216;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 4;
    public static final int J = 8;
    public static final int K = 16;
    public static final int L = 32;
    public static Method M = null;
    public static Method N = null;
    public static boolean O = false;
    public static WeakHashMap<View, String> P = null;
    public static WeakHashMap<View, ZH2> Q = null;
    public static Method R = null;
    public static Field S = null;
    public static boolean T = false;
    public static boolean U = true;
    public static ThreadLocal<Rect> V = null;
    public static final int[] W = {HL1.e.b, HL1.e.c, HL1.e.n, HL1.e.y, HL1.e.B, HL1.e.C, HL1.e.D, HL1.e.E, HL1.e.F, HL1.e.G, HL1.e.d, HL1.e.e, HL1.e.f, HL1.e.g, HL1.e.h, HL1.e.i, HL1.e.j, HL1.e.k, HL1.e.l, HL1.e.m, HL1.e.f482o, HL1.e.p, HL1.e.q, HL1.e.r, HL1.e.s, HL1.e.t, HL1.e.u, HL1.e.v, HL1.e.w, HL1.e.x, HL1.e.z, HL1.e.A};
    public static final InterfaceC6669gv1 X = new InterfaceC6669gv1() { // from class: o.fH2
        @Override // o.InterfaceC6669gv1
        public final KL a(KL kl) {
            return C6516gH2.a(kl);
        }
    };
    public static final e Y = new e();
    public static final String a = "ViewCompat";
    @Deprecated
    public static final int b = 0;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    @Deprecated
    public static final int j = 0;
    @Deprecated
    public static final int k = 1;
    @Deprecated
    public static final int l = 2;
    @Deprecated
    public static final int m = 4;
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f746o = 1;
    public static final int p = 2;
    @Deprecated
    public static final int q = 0;
    @Deprecated
    public static final int r = 1;
    @Deprecated
    public static final int s = 2;
    @Deprecated
    public static final int t = 0;
    @Deprecated
    public static final int u = 1;
    @Deprecated
    public static final int v = 2;
    @Deprecated
    public static final int w = 3;
    @Deprecated
    public static final int x = 16777215;
    @Deprecated
    public static final int y = -16777216;
    @Deprecated
    public static final int z = 16;

    /* renamed from: o.gH2$a */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        public a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // o.C6516gH2.f
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(l.d(view));
        }

        @Override // o.C6516gH2.f
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        @Override // o.C6516gH2.f
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: o.gH2$b */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        public b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // o.C6516gH2.f
        /* renamed from: h */
        public CharSequence c(View view) {
            return l.b(view);
        }

        @Override // o.C6516gH2.f
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        @Override // o.C6516gH2.f
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: o.gH2$c */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        public c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // o.C6516gH2.f
        /* renamed from: h */
        public CharSequence c(View view) {
            return n.c(view);
        }

        @Override // o.C6516gH2.f
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            n.g(view, charSequence);
        }

        @Override // o.C6516gH2.f
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: o.gH2$d */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        public d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // o.C6516gH2.f
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        @Override // o.C6516gH2.f
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        @Override // o.C6516gH2.f
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: o.gH2$f */
    /* loaded from: classes.dex */
    public static abstract class f<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                return false;
            }
            return true;
        }

        public final boolean b() {
            if (Build.VERSION.SDK_INT >= this.c) {
                return true;
            }
            return false;
        }

        public abstract T c(View view);

        public abstract void d(View view, T t);

        public T e(View view) {
            if (b()) {
                return c(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public void f(View view, T t) {
            if (b()) {
                d(view, t);
            } else if (g(e(view), t)) {
                C6516gH2.D(view);
                view.setTag(this.a, t);
                C6516gH2.i1(view, this.d);
            }
        }

        public boolean g(T t, T t2) {
            return !t2.equals(t);
        }

        public f(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    /* renamed from: o.gH2$g */
    /* loaded from: classes.dex */
    public static class g {
        private g() {
        }

        public static WindowInsets a(View view, WindowInsets windowInsets) {
            if (C8477oH2.d) {
                return C8477oH2.c(view, windowInsets);
            }
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: o.gH2$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: o.gH2$h$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public RL2 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ InterfaceC10336vu1 c;

            public a(View view, InterfaceC10336vu1 interfaceC10336vu1) {
                this.b = view;
                this.c = interfaceC10336vu1;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                RL2 M = RL2.M(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    h.a(windowInsets, this.b);
                    if (M.equals(this.a)) {
                        return this.c.a(view, M).K();
                    }
                }
                this.a = M;
                RL2 a = this.c.a(view, M);
                if (i >= 30) {
                    return a.K();
                }
                C6516gH2.C1(view);
                return a.K();
            }
        }

        private h() {
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(HL1.e.t0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static RL2 b(View view, RL2 rl2, Rect rect) {
            WindowInsets K = rl2.K();
            if (K != null) {
                return RL2.M(view.computeSystemWindowInsets(K, rect), view);
            }
            rect.setEmpty();
            return rl2;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static RL2 j(View view) {
            return RL2.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, InterfaceC10336vu1 interfaceC10336vu1) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
            if (interfaceC10336vu1 != null) {
                onApplyWindowInsetsListener = new a(view, interfaceC10336vu1);
            } else {
                onApplyWindowInsetsListener = null;
            }
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(HL1.e.k0, onApplyWindowInsetsListener);
            }
            if (view.getTag(HL1.e.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (onApplyWindowInsetsListener != null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(HL1.e.t0));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: o.gH2$i */
    /* loaded from: classes.dex */
    public static class i {
        private i() {
        }

        public static RL2 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            RL2 L = RL2.L(rootWindowInsets);
            L.H(L);
            L.d(view.getRootView());
            return L;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: o.gH2$j */
    /* loaded from: classes.dex */
    public static class j {
        private j() {
        }

        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: o.gH2$k */
    /* loaded from: classes.dex */
    public static class k {
        private k() {
        }

        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: o.gH2$l */
    /* loaded from: classes.dex */
    public static class l {
        private l() {
        }

        public static void a(View view, final u uVar) {
            int i = HL1.e.s0;
            C9654t62 c9654t62 = (C9654t62) view.getTag(i);
            if (c9654t62 == null) {
                c9654t62 = new C9654t62();
                view.setTag(i, c9654t62);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: o.hH2
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C6516gH2.u.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            c9654t62.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C9654t62 c9654t62 = (C9654t62) view.getTag(HL1.e.s0);
            if (c9654t62 != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c9654t62.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, C3444Kj c3444Kj) {
            AutofillId a;
            if (c3444Kj == null) {
                a = null;
            } else {
                a = c3444Kj.a();
            }
            view.setAutofillId(a);
        }

        public static void j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: o.gH2$m */
    /* loaded from: classes.dex */
    public static class m {
        private m() {
        }

        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void e(View view, FL fl) {
            ContentCaptureSession f;
            if (fl == null) {
                f = null;
            } else {
                f = fl.f();
            }
            view.setContentCaptureSession(f);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }

        public static void g(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }
    }

    /* renamed from: o.gH2$n */
    /* loaded from: classes.dex */
    public static class n {
        private n() {
        }

        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static int b(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence c(View view) {
            return view.getStateDescription();
        }

        public static C10450wM2 d(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return C10450wM2.l(windowInsetsController);
            }
            return null;
        }

        public static boolean e(View view) {
            return view.isImportantForContentCapture();
        }

        public static void f(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        public static void g(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: o.gH2$o */
    /* loaded from: classes.dex */
    public static final class o {
        private o() {
        }

        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static KL b(View view, KL kl) {
            ContentInfo l = kl.l();
            ContentInfo performReceiveContent = view.performReceiveContent(l);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == l) {
                return kl;
            }
            return KL.m(performReceiveContent);
        }

        public static void c(View view, String[] strArr, InterfaceC6414fv1 interfaceC6414fv1) {
            if (interfaceC6414fv1 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(interfaceC6414fv1));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.gH2$p */
    /* loaded from: classes.dex */
    public @interface p {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.gH2$q */
    /* loaded from: classes.dex */
    public @interface q {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.gH2$r */
    /* loaded from: classes.dex */
    public @interface r {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.gH2$s */
    /* loaded from: classes.dex */
    public @interface s {
    }

    /* renamed from: o.gH2$t */
    /* loaded from: classes.dex */
    public static final class t implements OnReceiveContentListener {
        public final InterfaceC6414fv1 a;

        public t(InterfaceC6414fv1 interfaceC6414fv1) {
            this.a = interfaceC6414fv1;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            KL m = KL.m(contentInfo);
            KL a = this.a.a(view, m);
            if (a == null) {
                return null;
            }
            if (a == m) {
                return contentInfo;
            }
            return a.l();
        }
    }

    /* renamed from: o.gH2$u */
    /* loaded from: classes.dex */
    public interface u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.gH2$v */
    /* loaded from: classes.dex */
    public @interface v {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.gH2$w */
    /* loaded from: classes.dex */
    public @interface w {
    }

    /* renamed from: o.gH2$x */
    /* loaded from: classes.dex */
    public static class x {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static x a(View view) {
            int i = HL1.e.r0;
            x xVar = (x) view.getTag(i);
            if (xVar == null) {
                x xVar2 = new x();
                view.setTag(i, xVar2);
                return xVar2;
            }
            return xVar;
        }

        public static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = d;
            synchronized (arrayList) {
                try {
                    Iterator<WeakReference<View>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                            return;
                        }
                    }
                    d.add(new WeakReference<>(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static void i(View view) {
            synchronized (d) {
                int i = 0;
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = d;
                        if (i < arrayList.size()) {
                            if (arrayList.get(i).get() == view) {
                                arrayList.remove(i);
                                return;
                            }
                            i++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c));
                }
            }
            if (c != null) {
                return true;
            }
            return false;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(HL1.e.s0);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return x.a(view).b(view, keyEvent);
    }

    public static CharSequence A0(View view) {
        return P2().e(view);
    }

    public static void A1(View view, u uVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.e(view, uVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(HL1.e.s0);
        if (arrayList != null) {
            arrayList.remove(uVar);
            if (arrayList.size() == 0) {
                x.i(view);
            }
        }
    }

    public static void A2(View view, int i2, int i3) {
        i.d(view, i2, i3);
    }

    public static boolean B(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return x.a(view).f(keyEvent);
    }

    public static List<Rect> B0(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.c(view);
        }
        return Collections.EMPTY_LIST;
    }

    public static void B1(View view, C10861y4.a aVar, CharSequence charSequence, G4 g4) {
        if (g4 == null && charSequence == null) {
            y1(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, g4));
        }
    }

    public static void B2(View view, CharSequence charSequence) {
        P2().f(view, charSequence);
    }

    public static void C(View view) {
        D(view);
    }

    public static String C0(View view) {
        return h.k(view);
    }

    public static void C1(View view) {
        g.c(view);
    }

    public static void C2(View view, List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.f(view, list);
        }
    }

    public static void D(View view) {
        Q3 G2 = G(view);
        if (G2 == null) {
            G2 = new Q3();
        }
        I1(view, G2);
    }

    @JR1(expression = "view.getTranslationX()")
    @Deprecated
    public static float D0(View view) {
        return view.getTranslationX();
    }

    public static <T extends View> T D1(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) l.f(view, i2);
        }
        T t2 = (T) view.findViewById(i2);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void D2(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.p(view, charSequence);
        }
    }

    public static void E(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            E(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        matrix.preConcat(view.getMatrix());
    }

    @JR1(expression = "view.getTranslationY()")
    @Deprecated
    public static float E0(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    public static int E1(int i2, int i3, int i4) {
        return View.resolveSizeAndState(i2, i3, i4);
    }

    public static void E2(View view, String str) {
        h.v(view, str);
    }

    @Deprecated
    public static int F() {
        return View.generateViewId();
    }

    public static float F0(View view) {
        return h.l(view);
    }

    public static boolean F1(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.j(view);
        }
        return view.requestFocus();
    }

    @JR1(expression = "view.setTranslationX(value)")
    @Deprecated
    public static void F2(View view, float f2) {
        view.setTranslationX(f2);
    }

    public static Q3 G(View view) {
        View.AccessibilityDelegate H2 = H(view);
        if (H2 == null) {
            return null;
        }
        if (H2 instanceof Q3.a) {
            return ((Q3.a) H2).a;
        }
        return new Q3(H2);
    }

    @Deprecated
    public static C10450wM2 G0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.d(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return C8006mL2.a(window, view);
            }
        }
        return null;
    }

    public static void G1(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    @JR1(expression = "view.setTranslationY(value)")
    @Deprecated
    public static void G2(View view, float f2) {
        view.setTranslationY(f2);
    }

    public static View.AccessibilityDelegate H(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(view);
        }
        return I(view);
    }

    @JR1(expression = "view.getWindowSystemUiVisibility()")
    @Deprecated
    public static int H0(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static f<Boolean> H1() {
        return new a(HL1.e.n0, Boolean.class, 28);
    }

    public static void H2(View view, float f2) {
        h.w(view, f2);
    }

    public static View.AccessibilityDelegate I(View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    @JR1(expression = "view.getX()")
    @Deprecated
    public static float I0(View view) {
        return view.getX();
    }

    public static void I1(View view, Q3 q3) {
        View.AccessibilityDelegate d2;
        if (q3 == null && (H(view) instanceof Q3.a)) {
            q3 = new Q3();
        }
        b2(view);
        if (q3 == null) {
            d2 = null;
        } else {
            d2 = q3.d();
        }
        view.setAccessibilityDelegate(d2);
    }

    public static void I2(View view, C8736pL2.b bVar) {
        C8736pL2.h(view, bVar);
    }

    @JR1(expression = "view.getAccessibilityLiveRegion()")
    @Deprecated
    public static int J(View view) {
        return view.getAccessibilityLiveRegion();
    }

    @JR1(expression = "view.getY()")
    @Deprecated
    public static float J0(View view) {
        return view.getY();
    }

    public static void J1(View view, boolean z2) {
        b().f(view, Boolean.valueOf(z2));
    }

    @JR1(expression = "view.setX(value)")
    @Deprecated
    public static void J2(View view, float f2) {
        view.setX(f2);
    }

    public static D4 K(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new D4(accessibilityNodeProvider);
        }
        return null;
    }

    public static float K0(View view) {
        return h.m(view);
    }

    @JR1(expression = "view.setAccessibilityLiveRegion(mode)")
    @Deprecated
    public static void K1(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    @JR1(expression = "view.setY(value)")
    @Deprecated
    public static void K2(View view, float f2) {
        view.setY(f2);
    }

    public static CharSequence L(View view) {
        return p1().e(view);
    }

    public static boolean L0(View view) {
        if (H(view) != null) {
            return true;
        }
        return false;
    }

    public static void L1(View view, CharSequence charSequence) {
        p1().f(view, charSequence);
        if (charSequence != null) {
            Y.a(view);
        } else {
            Y.d(view);
        }
    }

    public static void L2(View view, float f2) {
        h.x(view, f2);
    }

    public static List<C10861y4.a> M(View view) {
        int i2 = HL1.e.f0;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static boolean M0(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.e(view);
        }
        return view.hasFocusable();
    }

    @JR1(expression = "view.setActivated(activated)")
    @Deprecated
    public static void M1(View view, boolean z2) {
        view.setActivated(z2);
    }

    public static boolean M2(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i2) {
        return j.e(view, clipData, dragShadowBuilder, obj, i2);
    }

    @JR1(expression = "view.getAlpha()")
    @Deprecated
    public static float N(View view) {
        return view.getAlpha();
    }

    public static boolean N0(View view) {
        return h.n(view);
    }

    @JR1(expression = "view.setAlpha(value)")
    @Deprecated
    public static void N1(View view, float f2) {
        view.setAlpha(f2);
    }

    public static boolean N2(View view, int i2) {
        return h.y(view, i2);
    }

    public static C3444Kj O(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3444Kj.b(k.b(view));
        }
        return null;
    }

    public static boolean O0(View view, int i2) {
        if (view instanceof InterfaceC8849pp1) {
            ((InterfaceC8849pp1) view).b(i2);
            return false;
        } else if (i2 == 0) {
            return N0(view);
        } else {
            return false;
        }
    }

    public static void O1(View view, String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.k(view, strArr);
        }
    }

    public static boolean O2(View view, int i2, int i3) {
        if (view instanceof InterfaceC8849pp1) {
            return ((InterfaceC8849pp1) view).d(i2, i3);
        }
        if (i3 == 0) {
            return N2(view, i2);
        }
        return false;
    }

    public static int P(View view, CharSequence charSequence) {
        boolean z2;
        List<C10861y4.a> M2 = M(view);
        for (int i2 = 0; i2 < M2.size(); i2++) {
            if (TextUtils.equals(charSequence, M2.get(i2).c())) {
                return M2.get(i2).b();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = W;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z3 = true;
            for (int i6 = 0; i6 < M2.size(); i6++) {
                if (M2.get(i6).b() != i5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 &= z2;
            }
            if (z3) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    @JR1(expression = "view.hasOnClickListeners()")
    @Deprecated
    public static boolean P0(View view) {
        return view.hasOnClickListeners();
    }

    public static void P1(View view, C3444Kj c3444Kj) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.i(view, c3444Kj);
        }
    }

    public static f<CharSequence> P2() {
        return new c(HL1.e.o0, CharSequence.class, 64, 30);
    }

    public static ColorStateList Q(View view) {
        return h.g(view);
    }

    @JR1(expression = "view.hasOverlappingRendering()")
    @Deprecated
    public static boolean Q0(View view) {
        return view.hasOverlappingRendering();
    }

    @JR1(expression = "view.setBackground(background)")
    @Deprecated
    public static void Q1(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void Q2(View view) {
        h.z(view);
    }

    public static PorterDuff.Mode R(View view) {
        return h.h(view);
    }

    @JR1(expression = "view.hasTransientState()")
    @Deprecated
    public static boolean R0(View view) {
        return view.hasTransientState();
    }

    public static void R1(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static void R2(View view, int i2) {
        if (view instanceof InterfaceC8849pp1) {
            ((InterfaceC8849pp1) view).g(i2);
        } else if (i2 == 0) {
            Q2(view);
        }
    }

    @JR1(expression = "view.getClipBounds()")
    @Deprecated
    public static Rect S(View view) {
        return view.getClipBounds();
    }

    public static boolean S0(View view) {
        Boolean e2 = b().e(view);
        if (e2 != null && e2.booleanValue()) {
            return true;
        }
        return false;
    }

    public static void S1(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static void S2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static FL T(View view) {
        ContentCaptureSession b2;
        if (Build.VERSION.SDK_INT < 29 || (b2 = m.b(view)) == null) {
            return null;
        }
        return FL.g(b2, view);
    }

    @JR1(expression = "view.isAttachedToWindow()")
    @Deprecated
    public static boolean T0(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static void T1(ViewGroup viewGroup, boolean z2) {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                Log.e(a, "Unable to find childrenDrawingOrderEnabled", e2);
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z2));
        } catch (IllegalAccessException e3) {
            Log.e(a, "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (IllegalArgumentException e4) {
            Log.e(a, "Unable to invoke childrenDrawingOrderEnabled", e4);
        } catch (InvocationTargetException e5) {
            Log.e(a, "Unable to invoke childrenDrawingOrderEnabled", e5);
        }
    }

    public static void T2(View view, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.g(view, matrix);
            return;
        }
        if (U) {
            try {
                m.g(view, matrix);
                return;
            } catch (NoSuchMethodError unused) {
                U = false;
            }
        }
        E(view, matrix);
    }

    @JR1(expression = "view.getDisplay()")
    @Deprecated
    public static Display U(View view) {
        return view.getDisplay();
    }

    public static boolean U0(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.f(view);
        }
        return false;
    }

    @JR1(expression = "view.setClipBounds(clipBounds)")
    @Deprecated
    public static void U1(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void U2(View view, View.DragShadowBuilder dragShadowBuilder) {
        j.f(view, dragShadowBuilder);
    }

    public static float V(View view) {
        return h.i(view);
    }

    public static boolean V0(View view) {
        return h.o(view);
    }

    public static void V1(View view, FL fl) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.e(view, fl);
        }
    }

    public static Rect W() {
        if (V == null) {
            V = new ThreadLocal<>();
        }
        Rect rect = V.get();
        if (rect == null) {
            rect = new Rect();
            V.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean W0(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.g(view);
        }
        return true;
    }

    public static void W1(View view, float f2) {
        h.s(view, f2);
    }

    public static InterfaceC6669gv1 X(View view) {
        if (view instanceof InterfaceC6669gv1) {
            return (InterfaceC6669gv1) view;
        }
        return X;
    }

    public static boolean X0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.e(view);
        }
        return false;
    }

    @JR1(expression = "view.setFitsSystemWindows(fitSystemWindows)")
    @Deprecated
    public static void X1(View view, boolean z2) {
        view.setFitsSystemWindows(z2);
    }

    @JR1(expression = "view.getFitsSystemWindows()")
    @Deprecated
    public static boolean Y(View view) {
        return view.getFitsSystemWindows();
    }

    @JR1(expression = "view.isInLayout()")
    @Deprecated
    public static boolean Y0(View view) {
        return view.isInLayout();
    }

    public static void Y1(View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.l(view, z2);
        }
    }

    @JR1(expression = "view.getImportantForAccessibility()")
    @Deprecated
    public static int Z(View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean Z0(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.h(view);
        }
        return false;
    }

    @JR1(expression = "view.setHasTransientState(hasTransientState)")
    @Deprecated
    public static void Z1(View view, boolean z2) {
        view.setHasTransientState(z2);
    }

    public static /* synthetic */ KL a(KL kl) {
        return kl;
    }

    public static int a0(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return 0;
    }

    @JR1(expression = "view.isLaidOut()")
    @Deprecated
    public static boolean a1(View view) {
        return view.isLaidOut();
    }

    @JR1(expression = "view.setImportantForAccessibility(mode)")
    @Deprecated
    public static void a2(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static f<Boolean> b() {
        return new d(HL1.e.h0, Boolean.class, 28);
    }

    public static int b0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.b(view);
        }
        return 0;
    }

    @JR1(expression = "view.isLayoutDirectionResolved()")
    @Deprecated
    public static boolean b1(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void b2(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int c(View view, CharSequence charSequence, G4 g4) {
        int P2 = P(view, charSequence);
        if (P2 != -1) {
            d(view, new C10861y4.a(P2, charSequence, g4));
        }
        return P2;
    }

    @JR1(expression = "view.getLabelFor()")
    @Deprecated
    public static int c0(View view) {
        return view.getLabelFor();
    }

    public static boolean c1(View view) {
        return h.p(view);
    }

    public static void c2(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, i2);
        }
    }

    public static void d(View view, C10861y4.a aVar) {
        D(view);
        z1(aVar.b(), view);
        M(view).add(aVar);
        i1(view, 0);
    }

    @JR1(expression = "view.getLayerType()")
    @Deprecated
    public static int d0(View view) {
        return view.getLayerType();
    }

    @JR1(expression = "view.isOpaque()")
    @Deprecated
    public static boolean d1(View view) {
        return view.isOpaque();
    }

    public static void d2(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            n.f(view, i2);
        }
    }

    public static void e(View view, Collection<View> collection, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.a(view, collection, i2);
        }
    }

    @JR1(expression = "view.getLayoutDirection()")
    @Deprecated
    public static int e0(View view) {
        return view.getLayoutDirection();
    }

    @JR1(expression = "view.isPaddingRelative()")
    @Deprecated
    public static boolean e1(View view) {
        return view.isPaddingRelative();
    }

    public static void e2(View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.n(view, z2);
        }
    }

    public static void f(View view, u uVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.a(view, uVar);
            return;
        }
        int i2 = HL1.e.s0;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i2, arrayList);
        }
        arrayList.add(uVar);
        if (arrayList.size() == 1) {
            x.h(view);
        }
    }

    @JR1(expression = "view.getMatrix()")
    @Deprecated
    public static Matrix f0(View view) {
        return view.getMatrix();
    }

    public static boolean f1(View view) {
        Boolean e2 = H1().e(view);
        if (e2 != null && e2.booleanValue()) {
            return true;
        }
        return false;
    }

    @JR1(expression = "view.setLabelFor(labeledId)")
    @Deprecated
    public static void f2(View view, int i2) {
        view.setLabelFor(i2);
    }

    public static void g(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        C8724pI2.b((View) view.getParent(), viewGroup);
    }

    @JR1(expression = "view.getMeasuredHeightAndState()")
    @Deprecated
    public static int g0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @JR1(expression = "view.jumpDrawablesToCurrentState()")
    @Deprecated
    public static void g1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @JR1(expression = "view.setLayerPaint(paint)")
    @Deprecated
    public static void g2(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static ZH2 h(View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        ZH2 zh2 = Q.get(view);
        if (zh2 == null) {
            ZH2 zh22 = new ZH2(view);
            Q.put(view, zh22);
            return zh22;
        }
        return zh2;
    }

    @JR1(expression = "view.getMeasuredState()")
    @Deprecated
    public static int h0(View view) {
        return view.getMeasuredState();
    }

    public static View h1(View view, View view2, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.i(view, view2, i2);
        }
        return null;
    }

    @JR1(expression = "view.setLayerType(layerType, paint)")
    @Deprecated
    public static void h2(View view, int i2, Paint paint) {
        view.setLayerType(i2, paint);
    }

    public static void i() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException e2) {
            Log.e(a, "Couldn't find method", e2);
        }
        O = true;
    }

    @JR1(expression = "view.getMeasuredWidthAndState()")
    @Deprecated
    public static int i0(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static void i1(View view, int i2) {
        boolean z2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (L(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z2) {
                if (i2 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i2);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(L(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                } else if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e(a, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                        return;
                    }
                } else {
                    return;
                }
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z2) {
                i3 = 2048;
            }
            obtain2.setEventType(i3);
            obtain2.setContentChangeTypes(i2);
            if (z2) {
                obtain2.getText().add(L(view));
                b2(view);
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    @JR1(expression = "view.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void i2(View view, int i2) {
        view.setLayoutDirection(i2);
    }

    @JR1(expression = "view.canScrollHorizontally(direction)")
    @Deprecated
    public static boolean j(View view, int i2) {
        return view.canScrollHorizontally(i2);
    }

    @JR1(expression = "view.getMinimumHeight()")
    @Deprecated
    public static int j0(View view) {
        return view.getMinimumHeight();
    }

    public static void j1(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static void j2(View view, boolean z2) {
        h.t(view, z2);
    }

    @JR1(expression = "view.canScrollVertically(direction)")
    @Deprecated
    public static boolean k(View view, int i2) {
        return view.canScrollVertically(i2);
    }

    @JR1(expression = "view.getMinimumWidth()")
    @Deprecated
    public static int k0(View view) {
        return view.getMinimumWidth();
    }

    public static void k1(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    public static void k2(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.o(view, i2);
        }
    }

    public static void l(View view) {
        j.a(view);
    }

    public static int l0(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.d(view);
        }
        return -1;
    }

    public static RL2 l1(View view, RL2 rl2) {
        WindowInsets K2 = rl2.K();
        if (K2 != null) {
            WindowInsets b2 = g.b(view, K2);
            if (!b2.equals(K2)) {
                return RL2.M(b2, view);
            }
        }
        return rl2;
    }

    public static void l2(View view, InterfaceC10336vu1 interfaceC10336vu1) {
        h.u(view, interfaceC10336vu1);
    }

    @Deprecated
    public static int m(int i2, int i3) {
        return View.combineMeasuredStates(i2, i3);
    }

    public static String[] m0(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o.a(view);
        }
        return (String[]) view.getTag(HL1.e.m0);
    }

    @JR1(expression = "v.onInitializeAccessibilityEvent(event)")
    @Deprecated
    public static void m1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void m2(View view, String[] strArr, InterfaceC6414fv1 interfaceC6414fv1) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 31) {
            o.c(view, strArr, interfaceC6414fv1);
            return;
        }
        strArr = (strArr == null || strArr.length == 0) ? null : null;
        boolean z3 = false;
        if (interfaceC6414fv1 != null) {
            if (strArr != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C10907yF1.b(z2, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (strArr[i2].startsWith("*")) {
                    z3 = true;
                    break;
                } else {
                    i2++;
                }
            }
            C10907yF1.b(!z3, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(HL1.e.m0, strArr);
        view.setTag(HL1.e.l0, interfaceC6414fv1);
    }

    public static void n(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            S2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                S2((View) parent);
            }
        }
    }

    @JR1(expression = "view.getOverScrollMode()")
    @Deprecated
    public static int n0(View view) {
        return view.getOverScrollMode();
    }

    @JR1(expression = "v.onInitializeAccessibilityNodeInfo(info.unwrap())")
    @Deprecated
    public static void n1(View view, C10861y4 c10861y4) {
        view.onInitializeAccessibilityNodeInfo(c10861y4.s2());
    }

    @JR1(expression = "view.setOverScrollMode(overScrollMode)")
    @Deprecated
    public static void n2(View view, int i2) {
        view.setOverScrollMode(i2);
    }

    public static void o(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            S2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                S2((View) parent);
            }
        }
    }

    @JR1(expression = "view.getPaddingEnd()")
    @Deprecated
    public static int o0(View view) {
        return view.getPaddingEnd();
    }

    @JR1(expression = "v.onPopulateAccessibilityEvent(event)")
    @Deprecated
    public static void o1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @JR1(expression = "view.setPaddingRelative(start, top, end, bottom)")
    @Deprecated
    public static void o2(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static RL2 p(View view, RL2 rl2, Rect rect) {
        return h.b(view, rl2, rect);
    }

    @JR1(expression = "view.getPaddingStart()")
    @Deprecated
    public static int p0(View view) {
        return view.getPaddingStart();
    }

    public static f<CharSequence> p1() {
        return new b(HL1.e.i0, CharSequence.class, 8, 28);
    }

    @JR1(expression = "view.setPivotX(value)")
    @Deprecated
    public static void p2(View view, float f2) {
        view.setPivotX(f2);
    }

    public static RL2 q(View view, RL2 rl2) {
        WindowInsets a2;
        int i2 = Build.VERSION.SDK_INT;
        WindowInsets K2 = rl2.K();
        if (K2 != null) {
            if (i2 >= 30) {
                a2 = n.a(view, K2);
            } else {
                a2 = g.a(view, K2);
            }
            if (!a2.equals(K2)) {
                return RL2.M(a2, view);
            }
        }
        return rl2;
    }

    @JR1(expression = "view.getParentForAccessibility()")
    @Deprecated
    public static ViewParent q0(View view) {
        return view.getParentForAccessibility();
    }

    @JR1(expression = "view.performAccessibilityAction(action, arguments)")
    @Deprecated
    public static boolean q1(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    @JR1(expression = "view.setPivotY(value)")
    @Deprecated
    public static void q2(View view, float f2) {
        view.setPivotY(f2);
    }

    public static void r(View view) {
        j.b(view);
    }

    @JR1(expression = "view.getPivotX()")
    @Deprecated
    public static float r0(View view) {
        return view.getPivotX();
    }

    public static boolean r1(View view, int i2) {
        int a2 = C5527cG0.a(i2);
        if (a2 == -1) {
            return false;
        }
        return view.performHapticFeedback(a2);
    }

    public static void r2(View view, ZD1 zd1) {
        Object obj;
        if (zd1 != null) {
            obj = zd1.b();
        } else {
            obj = null;
        }
        j.d(view, (PointerIcon) obj);
    }

    public static boolean s(View view, float f2, float f3, boolean z2) {
        return h.c(view, f2, f3, z2);
    }

    @JR1(expression = "view.getPivotY()")
    @Deprecated
    public static float s0(View view) {
        return view.getPivotY();
    }

    public static boolean s1(View view, int i2, int i3) {
        int a2 = C5527cG0.a(i2);
        if (a2 == -1) {
            return false;
        }
        return view.performHapticFeedback(a2, i3);
    }

    @JR1(expression = "view.setRotation(value)")
    @Deprecated
    public static void s2(View view, float f2) {
        view.setRotation(f2);
    }

    public static boolean t(View view, float f2, float f3) {
        return h.d(view, f2, f3);
    }

    public static RL2 t0(View view) {
        return i.a(view);
    }

    public static KL t1(View view, KL kl) {
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "performReceiveContent: " + kl + ", view=" + view.getClass().getSimpleName() + C6566gU0.f + view.getId() + C6566gU0.g);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, kl);
        }
        InterfaceC6414fv1 interfaceC6414fv1 = (InterfaceC6414fv1) view.getTag(HL1.e.l0);
        if (interfaceC6414fv1 != null) {
            KL a2 = interfaceC6414fv1.a(view, kl);
            if (a2 == null) {
                return null;
            }
            return X(view).a(a2);
        }
        return X(view).a(kl);
    }

    @JR1(expression = "view.setRotationX(value)")
    @Deprecated
    public static void t2(View view, float f2) {
        view.setRotationX(f2);
    }

    public static boolean u(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return h.e(view, i2, i3, iArr, iArr2);
    }

    @JR1(expression = "view.getRotation()")
    @Deprecated
    public static float u0(View view) {
        return view.getRotation();
    }

    @JR1(expression = "view.postInvalidateOnAnimation()")
    @Deprecated
    public static void u1(View view) {
        view.postInvalidateOnAnimation();
    }

    @JR1(expression = "view.setRotationY(value)")
    @Deprecated
    public static void u2(View view, float f2) {
        view.setRotationY(f2);
    }

    public static boolean v(View view, int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        if (view instanceof InterfaceC8849pp1) {
            return ((InterfaceC8849pp1) view).f(i2, i3, iArr, iArr2, i4);
        }
        if (i4 == 0) {
            return u(view, i2, i3, iArr, iArr2);
        }
        return false;
    }

    @JR1(expression = "view.getRotationX()")
    @Deprecated
    public static float v0(View view) {
        return view.getRotationX();
    }

    @JR1(expression = "view.postInvalidateOnAnimation(left, top, right, bottom)")
    @Deprecated
    public static void v1(View view, int i2, int i3, int i4, int i5) {
        view.postInvalidateOnAnimation(i2, i3, i4, i5);
    }

    @JR1(expression = "view.setSaveFromParentEnabled(enabled)")
    @Deprecated
    public static void v2(View view, boolean z2) {
        view.setSaveFromParentEnabled(z2);
    }

    public static void w(View view, int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        if (view instanceof InterfaceC9092qp1) {
            ((InterfaceC9092qp1) view).a(i2, i3, i4, i5, iArr, i6, iArr2);
        } else {
            y(view, i2, i3, i4, i5, iArr, i6);
        }
    }

    @JR1(expression = "view.getRotationY()")
    @Deprecated
    public static float w0(View view) {
        return view.getRotationY();
    }

    @JR1(expression = "view.postOnAnimation(action)")
    @Deprecated
    public static void w1(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @JR1(expression = "view.setScaleX(value)")
    @Deprecated
    public static void w2(View view, float f2) {
        view.setScaleX(f2);
    }

    public static boolean x(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return h.f(view, i2, i3, i4, i5, iArr);
    }

    @JR1(expression = "view.getScaleX()")
    @Deprecated
    public static float x0(View view) {
        return view.getScaleX();
    }

    @JR1(expression = "view.postOnAnimationDelayed(action, delayMillis)")
    @Deprecated
    public static void x1(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    @JR1(expression = "view.setScaleY(value)")
    @Deprecated
    public static void x2(View view, float f2) {
        view.setScaleY(f2);
    }

    public static boolean y(View view, int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        if (view instanceof InterfaceC8849pp1) {
            return ((InterfaceC8849pp1) view).e(i2, i3, i4, i5, iArr, i6);
        }
        if (i6 == 0) {
            return x(view, i2, i3, i4, i5, iArr);
        }
        return false;
    }

    @JR1(expression = "view.getScaleY()")
    @Deprecated
    public static float y0(View view) {
        return view.getScaleY();
    }

    public static void y1(View view, int i2) {
        z1(i2, view);
        i1(view, 0);
    }

    public static void y2(View view, boolean z2) {
        H1().f(view, Boolean.valueOf(z2));
    }

    public static void z(View view) {
        j.c(view);
    }

    public static int z0(View view) {
        return i.b(view);
    }

    public static void z1(int i2, View view) {
        List<C10861y4.a> M2 = M(view);
        for (int i3 = 0; i3 < M2.size(); i3++) {
            if (M2.get(i3).b() == i2) {
                M2.remove(i3);
                return;
            }
        }
    }

    public static void z2(View view, int i2) {
        i.c(view, i2);
    }

    /* renamed from: o.gH2$e */
    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> X = new WeakHashMap<>();

        public void a(View view) {
            boolean z;
            WeakHashMap<View, Boolean> weakHashMap = this.X;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        public final void b(Map.Entry<View, Boolean> entry) {
            boolean z;
            int i;
            View key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            if (key.isShown() && key.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (booleanValue != z) {
                if (z) {
                    i = 16;
                } else {
                    i = 32;
                }
                C6516gH2.i1(key, i);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.X.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.X.entrySet()) {
                    b(entry);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
