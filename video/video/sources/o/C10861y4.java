package o;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.G4;
import o.HL1;

/* renamed from: o.y4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10861y4 {
    public static final int A = 67108864;
    public static final int A0 = 8;
    public static final int B = 1;
    public static final int B0 = 16;
    public static final int C = 2;
    public static final int C0 = 32;
    public static final int D = 4;
    public static final int D0 = 50;
    public static final int E = 8;
    public static int E0 = 0;
    public static final int F = 16;
    public static final int G = 32;
    public static final int H = 64;
    public static final int I = 128;
    public static final int J = 256;
    public static final int K = 512;
    public static final int L = 1024;
    public static final int M = 2048;
    public static final int N = 4096;
    public static final int O = 8192;
    public static final int P = 16384;
    public static final int Q = 32768;
    public static final int R = 65536;
    public static final int S = 131072;
    public static final int T = 262144;
    public static final int U = 524288;
    public static final int V = 1048576;
    public static final int W = 2097152;
    public static final String X = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String Y = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String Z = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String a0 = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String b0 = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String c0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String d = "AccessibilityNodeInfo.roleDescription";
    public static final String d0 = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    public static final String e0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    public static final String f0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    public static final String g0 = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    public static final String h0 = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final String i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    public static final String i0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final String j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    public static final String j0 = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final String k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    public static final String k0 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final String l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    public static final int l0 = 1;
    public static final String m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    public static final int m0 = 2;
    public static final String n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    public static final int n0 = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final String f912o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
    public static final int o0 = 2;
    public static final String p = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";
    public static final int p0 = 4;
    public static final String q = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";
    public static final int q0 = 8;
    public static final String r = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";
    public static final int r0 = 16;
    public static final String s = "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY";
    public static final String s0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int t = 1;
    public static final String t0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY";
    public static final int u = 2;
    public static final String u0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final int v = 4;
    public static final String v0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int w = 8;
    public static final int w0 = 20000;
    public static final int x = 32;
    public static final int x0 = 1;
    public static final int y = 64;
    public static final int y0 = 2;
    public static final int z = 8388608;
    public static final int z0 = 4;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    /* renamed from: o.y4$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a W;
        public static final String e = "A11yActionCompat";
        public final Object a;
        public final int b;
        public final Class<? extends G4.a> c;
        public final G4 d;
        public static final a f = new a(1, null);
        public static final a g = new a(2, null);
        public static final a h = new a(4, null);
        public static final a i = new a(8, null);
        public static final a j = new a(16, null);
        public static final a k = new a(32, null);
        public static final a l = new a(64, null);
        public static final a m = new a(128, null);
        public static final a n = new a(256, (CharSequence) null, G4.b.class);

        /* renamed from: o  reason: collision with root package name */
        public static final a f913o = new a(512, (CharSequence) null, G4.b.class);
        public static final a p = new a(1024, (CharSequence) null, G4.c.class);
        public static final a q = new a(2048, (CharSequence) null, G4.c.class);
        public static final a r = new a(4096, null);
        public static final a s = new a(8192, null);
        public static final a t = new a(16384, null);
        public static final a u = new a(32768, null);
        public static final a v = new a(65536, null);
        public static final a w = new a(131072, (CharSequence) null, G4.g.class);
        public static final a x = new a(262144, null);
        public static final a y = new a(524288, null);
        public static final a z = new a(1048576, null);
        public static final a A = new a(2097152, (CharSequence) null, G4.h.class);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = null;
            int i2 = Build.VERSION.SDK_INT;
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, G4.e.class);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            if (i2 >= 29) {
                accessibilityAction = C7674l4.a();
            } else {
                accessibilityAction = null;
            }
            H = new a(accessibilityAction, 16908358, null, null, null);
            if (i2 >= 29) {
                accessibilityAction2 = C9400s4.a();
            } else {
                accessibilityAction2 = null;
            }
            I = new a(accessibilityAction2, 16908359, null, null, null);
            if (i2 >= 29) {
                accessibilityAction3 = C9643t4.a();
            } else {
                accessibilityAction3 = null;
            }
            J = new a(accessibilityAction3, 16908360, null, null, null);
            if (i2 >= 29) {
                accessibilityAction4 = C9886u4.a();
            } else {
                accessibilityAction4 = null;
            }
            K = new a(accessibilityAction4, 16908361, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, G4.f.class);
            if (i2 >= 26) {
                accessibilityAction5 = C10129v4.a();
            } else {
                accessibilityAction5 = null;
            }
            N = new a(accessibilityAction5, 16908354, null, null, G4.d.class);
            if (i2 >= 28) {
                accessibilityAction6 = C10375w4.a();
            } else {
                accessibilityAction6 = null;
            }
            O = new a(accessibilityAction6, 16908356, null, null, null);
            if (i2 >= 28) {
                accessibilityAction7 = C10618x4.a();
            } else {
                accessibilityAction7 = null;
            }
            P = new a(accessibilityAction7, 16908357, null, null, null);
            if (i2 >= 30) {
                accessibilityAction8 = C7917m4.a();
            } else {
                accessibilityAction8 = null;
            }
            Q = new a(accessibilityAction8, 16908362, null, null, null);
            if (i2 >= 30) {
                accessibilityAction9 = C8178n4.a();
            } else {
                accessibilityAction9 = null;
            }
            R = new a(accessibilityAction9, 16908372, null, null, null);
            if (i2 >= 32) {
                accessibilityAction10 = C8421o4.a();
            } else {
                accessibilityAction10 = null;
            }
            S = new a(accessibilityAction10, 16908373, null, null, null);
            if (i2 >= 32) {
                accessibilityAction11 = C8665p4.a();
            } else {
                accessibilityAction11 = null;
            }
            T = new a(accessibilityAction11, 16908374, null, null, null);
            if (i2 >= 32) {
                accessibilityAction12 = C8908q4.a();
            } else {
                accessibilityAction12 = null;
            }
            U = new a(accessibilityAction12, 16908375, null, null, null);
            if (i2 >= 33) {
                accessibilityAction13 = C9157r4.a();
            } else {
                accessibilityAction13 = null;
            }
            V = new a(accessibilityAction13, 16908376, null, null, null);
            if (i2 >= 34) {
                accessibilityAction14 = d.a();
            }
            W = new a(accessibilityAction14, 16908382, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, G4 g4) {
            return new a(null, this.b, charSequence, g4, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            String name;
            if (this.d != null) {
                Class<? extends G4.a> cls = this.c;
                G4.a aVar = null;
                if (cls != null) {
                    try {
                        G4.a newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                        try {
                            newInstance.a(bundle);
                            aVar = newInstance;
                        } catch (Exception e2) {
                            e = e2;
                            aVar = newInstance;
                            Class<? extends G4.a> cls2 = this.c;
                            if (cls2 == null) {
                                name = "null";
                            } else {
                                name = cls2.getName();
                            }
                            Log.e(e, "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                            return this.d.a(view, aVar);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                return this.d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            if (obj2 == null) {
                if (aVar.a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String o2 = C10861y4.o(this.b);
            if (o2.equals("ACTION_UNKNOWN") && c() != null) {
                o2 = c().toString();
            }
            sb.append(o2);
            return sb.toString();
        }

        public a(int i2, CharSequence charSequence, G4 g4) {
            this(null, i2, charSequence, g4, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i2, CharSequence charSequence, Class<? extends G4.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, G4 g4, Class<? extends G4.a> cls) {
            this.b = i2;
            this.d = g4;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    /* renamed from: o.y4$b */
    /* loaded from: classes.dex */
    public static class b {
        public static Object a(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* renamed from: o.y4$c */
    /* loaded from: classes.dex */
    public static class c {
        public static g a(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static C10861y4 b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return C10861y4.u2(accessibilityNodeInfo.getChild(i, i2));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static C10861y4 f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return C10861y4.u2(accessibilityNodeInfo.getParent(i));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* renamed from: o.y4$d */
    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    /* renamed from: o.y4$e */
    /* loaded from: classes.dex */
    public static class e {
        public static f a(int i, int i2, boolean z, int i3, int i4, int i5) {
            return new f(new AccessibilityNodeInfo.CollectionInfo.Builder().setRowCount(i).setColumnCount(i2).setHierarchical(z).setSelectionMode(i3).setItemCount(i4).setImportantForAccessibilityItemCount(i5).build());
        }

        public static int b(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getImportantForAccessibilityItemCount();
        }

        public static int c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getItemCount();
        }
    }

    /* renamed from: o.y4$f */
    /* loaded from: classes.dex */
    public static class f {
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = -1;
        public final Object a;

        /* renamed from: o.y4$f$a */
        /* loaded from: classes.dex */
        public static final class a {
            public int d;
            public int a = 0;
            public int b = 0;
            public boolean c = false;
            public int e = -1;
            public int f = -1;

            public f a() {
                if (Build.VERSION.SDK_INT >= 35) {
                    return e.a(this.a, this.b, this.c, this.d, this.e, this.f);
                }
                return f.h(this.a, this.b, this.c, this.d);
            }

            public a b(int i) {
                this.b = i;
                return this;
            }

            public a c(boolean z) {
                this.c = z;
                return this;
            }

            public a d(int i) {
                this.f = i;
                return this;
            }

            public a e(int i) {
                this.e = i;
                return this;
            }

            public a f(int i) {
                this.a = i;
                return this;
            }

            public a g(int i) {
                this.d = i;
                return this;
            }
        }

        public f(Object obj) {
            this.a = obj;
        }

        public static f g(int i, int i2, boolean z) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        public static f h(int i, int i2, boolean z, int i3) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.a).getColumnCount();
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 35) {
                return e.b(this.a);
            }
            return -1;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 35) {
                return e.c(this.a);
            }
            return -1;
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.a).getRowCount();
        }

        public int e() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.a).getSelectionMode();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.a).isHierarchical();
        }
    }

    /* renamed from: o.y4$g */
    /* loaded from: classes.dex */
    public static class g {
        public final Object a;

        /* renamed from: o.y4$g$a */
        /* loaded from: classes.dex */
        public static final class a {
            public boolean a;
            public int b;
            public int c;
            public int d;
            public int e;
            public boolean f;
            public String g;
            public String h;

            public g a() {
                if (Build.VERSION.SDK_INT >= 33) {
                    return c.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                }
                return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(this.c, this.e, this.b, this.d, this.a, this.f));
            }

            public a b(int i) {
                this.b = i;
                return this;
            }

            public a c(int i) {
                this.d = i;
                return this;
            }

            public a d(String str) {
                this.h = str;
                return this;
            }

            public a e(boolean z) {
                this.a = z;
                return this;
            }

            public a f(int i) {
                this.c = i;
                return this;
            }

            public a g(int i) {
                this.e = i;
                return this;
            }

            public a h(String str) {
                this.g = str;
                return this;
            }

            public a i(boolean z) {
                this.f = z;
                return this;
            }
        }

        public g(Object obj) {
            this.a = obj;
        }

        public static g i(int i, int i2, int i3, int i4, boolean z) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        public static g j(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnSpan();
        }

        public String c() {
            if (Build.VERSION.SDK_INT >= 33) {
                return c.c(this.a);
            }
            return null;
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowIndex();
        }

        public int e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowSpan();
        }

        public String f() {
            if (Build.VERSION.SDK_INT >= 33) {
                return c.d(this.a);
            }
            return null;
        }

        @Deprecated
        public boolean g() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isHeading();
        }

        public boolean h() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isSelected();
        }
    }

    @Deprecated
    public C10861y4(Object obj) {
        this.a = (AccessibilityNodeInfo) obj;
    }

    public static C10861y4 O0() {
        return t2(AccessibilityNodeInfo.obtain());
    }

    public static C10861y4 P0(View view) {
        return t2(AccessibilityNodeInfo.obtain(view));
    }

    public static C10861y4 Q0(View view, int i2) {
        return u2(AccessibilityNodeInfo.obtain(view, i2));
    }

    public static C10861y4 R0(C10861y4 c10861y4) {
        return t2(AccessibilityNodeInfo.obtain(c10861y4.a));
    }

    public static String o(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                switch (i2) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908382:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i2) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i2) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i2) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static C10861y4 t2(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C10861y4(accessibilityNodeInfo);
    }

    public static C10861y4 u2(Object obj) {
        if (obj != null) {
            return new C10861y4(obj);
        }
        return null;
    }

    public static ClickableSpan[] z(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public f A() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.a.getCollectionInfo();
        if (collectionInfo != null) {
            return new f(collectionInfo);
        }
        return null;
    }

    public boolean A0() {
        return this.a.isFocused();
    }

    public void A1(boolean z2) {
        d1(67108864, z2);
    }

    public g B() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new g(collectionItemInfo);
        }
        return null;
    }

    public boolean B0() {
        return r(67108864);
    }

    public void B1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            U3.a(this.a, z2);
        } else {
            d1(2, z2);
        }
    }

    public CharSequence C() {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.c(this.a);
        }
        return this.a.getExtras().getCharSequence(p);
    }

    public boolean C0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C7431k4.a(this.a);
        }
        if (r(2)) {
            return true;
        }
        g B2 = B();
        if (B2 != null && B2.g()) {
            return true;
        }
        return false;
    }

    public void C1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            W3.a(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence(g, charSequence);
        }
    }

    public CharSequence D() {
        return this.a.getContentDescription();
    }

    public boolean D0() {
        return this.a.isImportantForAccessibility();
    }

    public void D1(boolean z2) {
        this.a.setImportantForAccessibility(z2);
    }

    public int E() {
        return this.a.getDrawingOrder();
    }

    public boolean E0() {
        return this.a.isLongClickable();
    }

    public void E1(int i2) {
        this.a.setInputType(i2);
    }

    public CharSequence F() {
        return this.a.getError();
    }

    public boolean F0() {
        return this.a.isMultiLine();
    }

    public void F1(View view) {
        this.a.setLabelFor(view);
    }

    public AccessibilityNodeInfo.ExtraRenderingInfo G() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.e(this.a);
        }
        return null;
    }

    public boolean G0() {
        return this.a.isPassword();
    }

    public void G1(View view, int i2) {
        this.a.setLabelFor(view, i2);
    }

    public Bundle H() {
        return this.a.getExtras();
    }

    public boolean H0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Z3.a(this.a);
        }
        return r(1);
    }

    public void H1(View view) {
        this.a.setLabeledBy(view);
    }

    public CharSequence I() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C6704h4.a(this.a);
        }
        return this.a.getExtras().getCharSequence(g);
    }

    public boolean I0() {
        return this.a.isScrollable();
    }

    public void I1(View view, int i2) {
        this.a.setLabeledBy(view, i2);
    }

    @Deprecated
    public Object J() {
        return this.a;
    }

    public boolean J0() {
        return this.a.isSelected();
    }

    public void J1(int i2) {
        this.a.setLiveRegion(i2);
    }

    public int K() {
        return this.a.getInputType();
    }

    public boolean K0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4993a4.a(this.a);
        }
        return r(4);
    }

    public void K1(boolean z2) {
        this.a.setLongClickable(z2);
    }

    public C10861y4 L() {
        return u2(this.a.getLabelFor());
    }

    public boolean L0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return T3.a(this.a);
        }
        return r(8);
    }

    public void L1(int i2) {
        this.a.setMaxTextLength(i2);
    }

    public C10861y4 M() {
        return u2(this.a.getLabeledBy());
    }

    public boolean M0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.h(this.a);
        }
        return r(8388608);
    }

    public void M1(long j2) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.j(this.a, j2);
        } else {
            this.a.getExtras().putLong(r, j2);
        }
    }

    public int N() {
        return this.a.getLiveRegion();
    }

    public boolean N0() {
        return this.a.isVisibleToUser();
    }

    public void N1(int i2) {
        this.a.setMovementGranularities(i2);
    }

    public int O() {
        return this.a.getMaxTextLength();
    }

    public void O1(boolean z2) {
        this.a.setMultiLine(z2);
    }

    public long P() {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.d(this.a);
        }
        return this.a.getExtras().getLong(r);
    }

    public void P1(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public int Q() {
        return this.a.getMovementGranularities();
    }

    public void Q1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            C7188j4.a(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence(e, charSequence);
        }
    }

    public final SparseArray<WeakReference<ClickableSpan>> R(View view) {
        SparseArray<WeakReference<ClickableSpan>> Y2 = Y(view);
        if (Y2 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(HL1.e.g0, sparseArray);
            return sparseArray;
        }
        return Y2;
    }

    public void R1(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public CharSequence S() {
        return this.a.getPackageName();
    }

    public boolean S0(int i2) {
        return this.a.performAction(i2);
    }

    public void S1(View view, int i2) {
        this.b = i2;
        this.a.setParent(view, i2);
    }

    public CharSequence T() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5478c4.a(this.a);
        }
        return this.a.getExtras().getCharSequence(e);
    }

    public boolean T0(int i2, Bundle bundle) {
        return this.a.performAction(i2, bundle);
    }

    public void T1(boolean z2) {
        this.a.setPassword(z2);
    }

    public C10861y4 U() {
        return u2(this.a.getParent());
    }

    public void U1(View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.k(this.a, view, z2);
        }
    }

    public C10861y4 V(int i2) {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.f(this.a, i2);
        }
        return U();
    }

    public boolean V0() {
        return this.a.refresh();
    }

    public void V1(h hVar) {
        this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.a);
    }

    public h W() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.a.getRangeInfo();
        if (rangeInfo != null) {
            return new h(rangeInfo);
        }
        return null;
    }

    public boolean W0(a aVar) {
        return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void W1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.l(this.a, z2);
        } else {
            d1(32, z2);
        }
    }

    public CharSequence X() {
        return this.a.getExtras().getCharSequence(d);
    }

    public boolean X0(View view) {
        return this.a.removeChild(view);
    }

    public void X1(CharSequence charSequence) {
        this.a.getExtras().putCharSequence(d, charSequence);
    }

    public final SparseArray<WeakReference<ClickableSpan>> Y(View view) {
        return (SparseArray) view.getTag(HL1.e.g0);
    }

    public boolean Y0(View view, int i2) {
        return this.a.removeChild(view, i2);
    }

    public void Y1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            C6947i4.a(this.a, z2);
        } else {
            d1(1, z2);
        }
    }

    public CharSequence Z() {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.b(this.a);
        }
        return this.a.getExtras().getCharSequence(n);
    }

    public final void Z0(View view) {
        SparseArray<WeakReference<ClickableSpan>> Y2 = Y(view);
        if (Y2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < Y2.size(); i2++) {
                if (Y2.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Y2.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    public void Z1(boolean z2) {
        this.a.setScrollable(z2);
    }

    public void a(int i2) {
        this.a.addAction(i2);
    }

    public CharSequence a0() {
        if (m0()) {
            List<Integer> i2 = i(j);
            List<Integer> i3 = i(k);
            List<Integer> i4 = i(l);
            List<Integer> i5 = i(i);
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for (int i6 = 0; i6 < i2.size(); i6++) {
                spannableString.setSpan(new P3(i5.get(i6).intValue(), this, H().getInt(m)), i2.get(i6).intValue(), i3.get(i6).intValue(), i4.get(i6).intValue());
            }
            return spannableString;
        }
        return this.a.getText();
    }

    public void a1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.g(this.a, z2);
        } else {
            d1(64, z2);
        }
    }

    public void a2(boolean z2) {
        this.a.setSelected(z2);
    }

    public void b(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public int b0() {
        return this.a.getTextSelectionEnd();
    }

    public void b1(boolean z2) {
        this.a.setAccessibilityFocused(z2);
    }

    public void b2(boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            Y3.a(this.a, z2);
        } else {
            d1(4, z2);
        }
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public int c0() {
        return this.a.getTextSelectionStart();
    }

    public void c1(List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            X3.a(this.a, list);
        }
    }

    public void c2(View view) {
        this.c = -1;
        this.a.setSource(view);
    }

    public void d(View view, int i2) {
        this.a.addChild(view, i2);
    }

    public CharSequence d0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return V3.a(this.a);
        }
        return this.a.getExtras().getCharSequence(f);
    }

    public final void d1(int i2, boolean z2) {
        Bundle H2 = H();
        if (H2 != null) {
            int i3 = H2.getInt(h, 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            H2.putInt(h, i2 | i3);
        }
    }

    public void d2(View view, int i2) {
        this.c = i2;
        this.a.setSource(view, i2);
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        i(j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(i).add(Integer.valueOf(i2));
    }

    public i e0() {
        AccessibilityNodeInfo.TouchDelegateInfo a2;
        if (Build.VERSION.SDK_INT >= 29 && (a2 = C6461g4.a(this.a)) != null) {
            return new i(a2);
        }
        return null;
    }

    @Deprecated
    public void e1(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void e2(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence(n, charSequence);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10861y4)) {
            return false;
        }
        C10861y4 c10861y4 = (C10861y4) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (c10861y4.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c10861y4.a)) {
            return false;
        }
        if (this.c == c10861y4.c && this.b == c10861y4.b) {
            return true;
        }
        return false;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            h();
            Z0(view);
            ClickableSpan[] z2 = z(charSequence);
            if (z2 != null && z2.length > 0) {
                H().putInt(m, HL1.e.a);
                SparseArray<WeakReference<ClickableSpan>> R2 = R(view);
                for (int i2 = 0; i2 < z2.length; i2++) {
                    int n02 = n0(z2[i2], R2);
                    R2.put(n02, new WeakReference<>(z2[i2]));
                    e(z2[i2], (Spanned) charSequence, n02);
                }
            }
        }
    }

    public C10861y4 f0() {
        return u2(this.a.getTraversalAfter());
    }

    public void f1(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void f2(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean g() {
        return this.a.canOpenPopup();
    }

    public C10861y4 g0() {
        return u2(this.a.getTraversalBefore());
    }

    public void g1(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.h(this.a, rect);
        } else {
            this.a.getExtras().putParcelable(q, rect);
        }
    }

    public void g2(boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C5236b4.a(this.a, z2);
        } else {
            d1(8, z2);
        }
    }

    public final void h() {
        this.a.getExtras().remove(j);
        this.a.getExtras().remove(k);
        this.a.getExtras().remove(l);
        this.a.getExtras().remove(i);
    }

    public String h0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.g(this.a);
        }
        return this.a.getExtras().getString(f912o);
    }

    public void h1(boolean z2) {
        this.a.setCanOpenPopup(z2);
    }

    public void h2(boolean z2) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.i(this.a, z2);
        } else {
            d1(8388608, z2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public String i0() {
        return this.a.getViewIdResourceName();
    }

    public void i1(boolean z2) {
        this.a.setCheckable(z2);
    }

    public void i2(int i2, int i3) {
        this.a.setTextSelection(i2, i3);
    }

    public List<C10861y4> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(t2(findAccessibilityNodeInfosByText.get(i2)));
        }
        return arrayList;
    }

    public H4 j0() {
        return H4.y(this.a.getWindow());
    }

    public void j1(boolean z2) {
        this.a.setChecked(z2);
    }

    public void j2(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            C5721d4.a(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence(f, charSequence);
        }
    }

    public List<C10861y4> k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo accessibilityNodeInfo : findAccessibilityNodeInfosByViewId) {
            arrayList.add(t2(accessibilityNodeInfo));
        }
        return arrayList;
    }

    public int k0() {
        return this.a.getWindowId();
    }

    public void k1(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void k2(i iVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            C6206f4.a(this.a, iVar.a);
        }
    }

    public C10861y4 l(int i2) {
        return u2(this.a.findFocus(i2));
    }

    public boolean l0() {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.e(this.a);
        }
        return r(32);
    }

    public void l1(boolean z2) {
        this.a.setClickable(z2);
    }

    public void l2(View view) {
        this.a.setTraversalAfter(view);
    }

    public C10861y4 m(int i2) {
        return u2(this.a.focusSearch(i2));
    }

    public final boolean m0() {
        return !i(j).isEmpty();
    }

    public void m1(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((f) obj).a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void m2(View view, int i2) {
        this.a.setTraversalAfter(view, i2);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    public final int n0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = E0;
        E0 = i3 + 1;
        return i3;
    }

    public void n1(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public void n2(View view) {
        this.a.setTraversalBefore(view);
    }

    public boolean o0() {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.f(this.a);
        }
        return r(64);
    }

    public void o1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.i(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence(p, charSequence);
        }
    }

    public void o2(View view, int i2) {
        this.a.setTraversalBefore(view, i2);
    }

    @Deprecated
    public int p() {
        return this.a.getActions();
    }

    public boolean p0() {
        return this.a.isAccessibilityFocused();
    }

    public void p1(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void p2(String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.j(this.a, str);
        } else {
            this.a.getExtras().putString(f912o, str);
        }
    }

    public List<String> q() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C5963e4.a(this.a);
        }
        return Collections.EMPTY_LIST;
    }

    public boolean q0() {
        return this.a.isCheckable();
    }

    public void q1(boolean z2) {
        this.a.setContentInvalid(z2);
    }

    public void q2(String str) {
        this.a.setViewIdResourceName(str);
    }

    public final boolean r(int i2) {
        Bundle H2 = H();
        if (H2 == null || (H2.getInt(h, 0) & i2) != i2) {
            return false;
        }
        return true;
    }

    public boolean r0() {
        return this.a.isChecked();
    }

    public void r1(boolean z2) {
        this.a.setContextClickable(z2);
    }

    public void r2(boolean z2) {
        this.a.setVisibleToUser(z2);
    }

    @Deprecated
    public void s(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public boolean s0() {
        return this.a.isClickable();
    }

    public void s1(boolean z2) {
        this.a.setDismissable(z2);
    }

    public AccessibilityNodeInfo s2() {
        return this.a;
    }

    public void t(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public boolean t0() {
        return this.a.isContentInvalid();
    }

    public void t1(int i2) {
        this.a.setDrawingOrder(i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        s(rect);
        sb.append("; boundsInParent: " + rect);
        t(rect);
        sb.append("; boundsInScreen: " + rect);
        u(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(S());
        sb.append("; className: ");
        sb.append(y());
        sb.append("; text: ");
        sb.append(a0());
        sb.append("; error: ");
        sb.append(F());
        sb.append("; maxTextLength: ");
        sb.append(O());
        sb.append("; stateDescription: ");
        sb.append(Z());
        sb.append("; contentDescription: ");
        sb.append(D());
        sb.append("; tooltipText: ");
        sb.append(d0());
        sb.append("; viewIdResName: ");
        sb.append(i0());
        sb.append("; uniqueId: ");
        sb.append(h0());
        sb.append("; checkable: ");
        sb.append(q0());
        sb.append("; checked: ");
        sb.append(r0());
        sb.append("; fieldRequired: ");
        sb.append(y0());
        sb.append("; focusable: ");
        sb.append(z0());
        sb.append("; focused: ");
        sb.append(A0());
        sb.append("; selected: ");
        sb.append(J0());
        sb.append("; clickable: ");
        sb.append(s0());
        sb.append("; longClickable: ");
        sb.append(E0());
        sb.append("; contextClickable: ");
        sb.append(u0());
        sb.append("; enabled: ");
        sb.append(x0());
        sb.append("; password: ");
        sb.append(G0());
        sb.append("; scrollable: " + I0());
        sb.append("; containerTitle: ");
        sb.append(C());
        sb.append("; granularScrollingSupported: ");
        sb.append(B0());
        sb.append("; importantForAccessibility: ");
        sb.append(D0());
        sb.append("; visible: ");
        sb.append(N0());
        sb.append("; isTextSelectable: ");
        sb.append(M0());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(o0());
        sb.append("; [");
        List<a> n2 = n();
        for (int i2 = 0; i2 < n2.size(); i2++) {
            a aVar = n2.get(i2);
            String o2 = o(aVar.b());
            if (o2.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                o2 = aVar.c().toString();
            }
            sb.append(o2);
            if (i2 != n2.size() - 1) {
                sb.append(C6566gU0.h);
            }
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public void u(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.a, rect);
            return;
        }
        Rect rect2 = (Rect) this.a.getExtras().getParcelable(q);
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public boolean u0() {
        return this.a.isContextClickable();
    }

    public void u1(boolean z2) {
        this.a.setEditable(z2);
    }

    public C10861y4 v(int i2) {
        return u2(this.a.getChild(i2));
    }

    public boolean v0() {
        return this.a.isDismissable();
    }

    public void v1(boolean z2) {
        this.a.setEnabled(z2);
    }

    public C10861y4 w(int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.b(this.a, i2, i3);
        }
        return v(i2);
    }

    public boolean w0() {
        return this.a.isEditable();
    }

    public void w1(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public int x() {
        return this.a.getChildCount();
    }

    public boolean x0() {
        return this.a.isEnabled();
    }

    public void x1(boolean z2) {
        this.a.getExtras().putBoolean(s, z2);
    }

    public CharSequence y() {
        return this.a.getClassName();
    }

    public boolean y0() {
        return this.a.getExtras().getBoolean(s);
    }

    public void y1(boolean z2) {
        this.a.setFocusable(z2);
    }

    public boolean z0() {
        return this.a.isFocusable();
    }

    public void z1(boolean z2) {
        this.a.setFocused(z2);
    }

    /* renamed from: o.y4$h */
    /* loaded from: classes.dex */
    public static class h {
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public final Object a;

        public h(Object obj) {
            this.a = obj;
        }

        public static h e(int i, float f, float f2, float f3) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.a).getType();
        }

        public h(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.a = b.a(i, f, f2, f3);
            } else {
                this.a = AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
            }
        }
    }

    /* renamed from: o.y4$i */
    /* loaded from: classes.dex */
    public static final class i {
        public final AccessibilityNodeInfo.TouchDelegateInfo a;

        public i(Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.a = C4.a(map);
            } else {
                this.a = null;
            }
        }

        public Region a(int i) {
            if (Build.VERSION.SDK_INT >= 29) {
                return A4.a(this.a, i);
            }
            return null;
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return B4.a(this.a);
            }
            return 0;
        }

        public C10861y4 c(Region region) {
            AccessibilityNodeInfo a;
            if (Build.VERSION.SDK_INT >= 29 && (a = C11104z4.a(this.a, region)) != null) {
                return C10861y4.t2(a);
            }
            return null;
        }

        public i(AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.a = touchDelegateInfo;
        }
    }

    public C10861y4(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    @Deprecated
    public void U0() {
    }
}
