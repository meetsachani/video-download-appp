package o;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.AbstractC2355i;
import com.facebook.AbstractC2410t;
import com.facebook.C0376a;
import com.facebook.InterfaceC2407p;
import com.facebook.InterfaceC2411u;
import com.facebook.common.b;
import com.facebook.internal.C2356a;
import com.facebook.internal.C2361f;
import com.facebook.internal.C2379y;
import com.facebook.login.EnumC2389f;
import com.facebook.login.G;
import com.facebook.login.Q;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import o.C6650gq2;
import o.C9159r41;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.r41  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9159r41 extends AbstractC2410t {
    public static final int A1 = 0;
    @NotNull
    public static final a x1 = new a(null);
    public static final String y1 = C9159r41.class.getName();
    public static final int z1 = 255;
    public boolean h1;
    @Nullable
    public String i1;
    @Nullable
    public String j1;
    @NotNull
    public final b k1;
    public boolean l1;
    @NotNull
    public C6650gq2.c m1;
    @NotNull
    public d n1;
    public long o1;
    @Nullable
    public C6650gq2 p1;
    @Nullable
    public AbstractC2355i q1;
    @NotNull
    public EY0<? extends com.facebook.login.G> r1;
    @Nullable
    public Float s1;
    public int t1;
    @NotNull
    public final String u1;
    @Nullable
    public InterfaceC2407p v1;
    @Nullable
    public X5<Collection<String>> w1;

    /* renamed from: o.r41$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: o.r41$b */
    /* loaded from: classes2.dex */
    public static class b {
        @NotNull
        public EnumC2389f a = EnumC2389f.FRIENDS;
        @NotNull
        public List<String> b = C8222nF.H();
        @NotNull
        public com.facebook.login.v c = com.facebook.login.v.NATIVE_WITH_FALLBACK;
        @NotNull
        public String d = com.facebook.internal.c0.I;
        @NotNull
        public com.facebook.login.L e = com.facebook.login.L.FACEBOOK;
        public boolean f;
        @Nullable
        public String g;
        public boolean h;

        public final void a() {
            this.b = C8222nF.H();
        }

        @NotNull
        public final String b() {
            return this.d;
        }

        @NotNull
        public final EnumC2389f c() {
            return this.a;
        }

        @NotNull
        public final com.facebook.login.v d() {
            return this.c;
        }

        @NotNull
        public final com.facebook.login.L e() {
            return this.e;
        }

        @Nullable
        public final String f() {
            return this.g;
        }

        @NotNull
        public final List<String> g() {
            return this.b;
        }

        public final boolean h() {
            return this.h;
        }

        public final boolean i() {
            return this.f;
        }

        public final void j(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.d = str;
        }

        public final void k(@NotNull EnumC2389f enumC2389f) {
            C6562gT0.p(enumC2389f, "<set-?>");
            this.a = enumC2389f;
        }

        public final void l(@NotNull com.facebook.login.v vVar) {
            C6562gT0.p(vVar, "<set-?>");
            this.c = vVar;
        }

        public final void m(@NotNull com.facebook.login.L l) {
            C6562gT0.p(l, "<set-?>");
            this.e = l;
        }

        public final void n(@Nullable String str) {
            this.g = str;
        }

        public final void o(@NotNull List<String> list) {
            C6562gT0.p(list, "<set-?>");
            this.b = list;
        }

        public final void p(boolean z) {
            this.h = z;
        }

        public final void q(boolean z) {
            this.f = z;
        }
    }

    /* renamed from: o.r41$c */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ C9159r41 X;

        public c(C9159r41 c9159r41) {
            C6562gT0.p(c9159r41, "this$0");
            this.X = c9159r41;
        }

        public static final void q(com.facebook.login.G g, DialogInterface dialogInterface, int i) {
            if (SQ.e(c.class)) {
                return;
            }
            try {
                C6562gT0.p(g, "$loginManager");
                g.f0();
            } catch (Throwable th) {
                SQ.c(th, c.class);
            }
        }

        @NotNull
        public com.facebook.login.G b() {
            if (SQ.e(this)) {
                return null;
            }
            try {
                com.facebook.login.G e = com.facebook.login.G.j.e();
                e.D0(this.X.getDefaultAudience());
                e.G0(this.X.getLoginBehavior());
                e.H0(c());
                e.C0(this.X.getAuthType());
                e.F0(d());
                e.K0(this.X.getShouldSkipAccountDeduplication());
                e.I0(this.X.getMessengerPageId());
                e.J0(this.X.getResetMessengerState());
                return e;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }

        @NotNull
        public final com.facebook.login.L c() {
            if (SQ.e(this)) {
                return null;
            }
            try {
                return com.facebook.login.L.FACEBOOK;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }

        public final boolean d() {
            SQ.e(this);
            return false;
        }

        public final void f() {
            if (!SQ.e(this)) {
                try {
                    com.facebook.login.G b = b();
                    X5 x5 = this.X.w1;
                    if (x5 != null) {
                        G.d dVar = (G.d) x5.a();
                        InterfaceC2407p callbackManager = this.X.getCallbackManager();
                        if (callbackManager == null) {
                            callbackManager = new C2361f();
                        }
                        dVar.h(callbackManager);
                        x5.b(this.X.getProperties().g());
                    } else if (this.X.getFragment() != null) {
                        Fragment fragment = this.X.getFragment();
                        if (fragment != null) {
                            C9159r41 c9159r41 = this.X;
                            b.L(fragment, c9159r41.getProperties().g(), c9159r41.getLoggerID());
                        }
                    } else if (this.X.getNativeFragment() != null) {
                        android.app.Fragment nativeFragment = this.X.getNativeFragment();
                        if (nativeFragment == null) {
                            return;
                        }
                        C9159r41 c9159r412 = this.X;
                        b.J(nativeFragment, c9159r412.getProperties().g(), c9159r412.getLoggerID());
                    } else {
                        b.H(this.X.getActivity(), this.X.getProperties().g(), this.X.getLoggerID());
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }

        public final void g(@NotNull Context context) {
            String k;
            String string;
            if (SQ.e(this)) {
                return;
            }
            try {
                C6562gT0.p(context, "context");
                final com.facebook.login.G b = b();
                if (this.X.h1) {
                    String string2 = this.X.getResources().getString(Q.l.M);
                    C6562gT0.o(string2, "resources.getString(R.string.com_facebook_loginview_log_out_action)");
                    String string3 = this.X.getResources().getString(Q.l.I);
                    C6562gT0.o(string3, "resources.getString(R.string.com_facebook_loginview_cancel_action)");
                    com.facebook.d0 b2 = com.facebook.d0.c1.b();
                    if (b2 == null) {
                        k = null;
                    } else {
                        k = b2.k();
                    }
                    if (k != null) {
                        C8319ne2 c8319ne2 = C8319ne2.a;
                        String string4 = this.X.getResources().getString(Q.l.O);
                        C6562gT0.o(string4, "resources.getString(R.string.com_facebook_loginview_logged_in_as)");
                        string = String.format(string4, Arrays.copyOf(new Object[]{b2.k()}, 1));
                        C6562gT0.o(string, "java.lang.String.format(format, *args)");
                    } else {
                        string = this.X.getResources().getString(Q.l.P);
                        C6562gT0.o(string, "{\n          resources.getString(R.string.com_facebook_loginview_logged_in_using_facebook)\n        }");
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: o.s41
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C9159r41.c.q(com.facebook.login.G.this, dialogInterface, i);
                        }
                    }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                    builder.create().show();
                    return;
                }
                b.f0();
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            int i;
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this)) {
                        C6562gT0.p(view, "v");
                        this.X.b(view);
                        C0376a.d dVar = C0376a.g1;
                        C0376a i2 = dVar.i();
                        boolean k = dVar.k();
                        if (k) {
                            Context context = this.X.getContext();
                            C6562gT0.o(context, "context");
                            g(context);
                        } else {
                            f();
                        }
                        com.facebook.appevents.K k2 = new com.facebook.appevents.K(this.X.getContext());
                        Bundle bundle = new Bundle();
                        if (i2 != null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        bundle.putInt("logging_in", i);
                        bundle.putInt("access_token_expired", k ? 1 : 0);
                        k2.m(C2356a.g, bundle);
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    /* renamed from: o.r41$d */
    /* loaded from: classes2.dex */
    public enum d {
        AUTOMATIC(C2356a.c0, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        @NotNull
        public static final d Y0;
        @NotNull
        public static final a Z = new a(null);
        @NotNull
        public final String X;
        public final int Y;

        /* renamed from: o.r41$d$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @Nullable
            public final d a(int i) {
                d[] valuesCustom;
                for (d dVar : d.valuesCustom()) {
                    if (dVar.h() == i) {
                        return dVar;
                    }
                }
                return null;
            }

            @NotNull
            public final d b() {
                return d.Y0;
            }

            public a() {
            }
        }

        static {
            Y0 = r0;
        }

        d(String str, int i) {
            this.X = str;
            this.Y = i;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int h() {
            return this.Y;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.X;
        }
    }

    /* renamed from: o.r41$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.AUTOMATIC.ordinal()] = 1;
            iArr[d.DISPLAY_ALWAYS.ordinal()] = 2;
            iArr[d.NEVER_DISPLAY.ordinal()] = 3;
            a = iArr;
        }
    }

    /* renamed from: o.r41$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC2355i {
        public f() {
        }

        @Override // com.facebook.AbstractC2355i
        public void d(@Nullable C0376a c0376a, @Nullable C0376a c0376a2) {
            C9159r41.this.G();
            C9159r41.this.E();
        }
    }

    /* renamed from: o.r41$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC8052mY0 implements FA0<com.facebook.login.G> {
        public static final g X = new g();

        public g() {
            super(0);
        }

        @Override // o.FA0
        @NotNull
        /* renamed from: c */
        public final com.facebook.login.G invoke() {
            return com.facebook.login.G.j.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9159r41(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2, @NotNull String str, @NotNull String str2) {
        super(context, attributeSet, i, i2, str, str2);
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "analyticsButtonCreatedEventName");
        C6562gT0.p(str2, "analyticsButtonTappedEventName");
        this.k1 = new b();
        this.m1 = C6650gq2.c.BLUE;
        this.n1 = d.Z.b();
        this.o1 = C6650gq2.j;
        this.r1 = WY0.b(g.X);
        this.t1 = 255;
        String uuid = UUID.randomUUID().toString();
        C6562gT0.o(uuid, "randomUUID().toString()");
        this.u1 = uuid;
    }

    public static final void u(String str, final C9159r41 c9159r41) {
        C6562gT0.p(str, "$appId");
        C6562gT0.p(c9159r41, "this$0");
        com.facebook.internal.C c2 = com.facebook.internal.C.a;
        final C2379y q = com.facebook.internal.C.q(str, false);
        c9159r41.getActivity().runOnUiThread(new Runnable() { // from class: o.o41
            @Override // java.lang.Runnable
            public final void run() {
                C9159r41.v(C9159r41.this, q);
            }
        });
    }

    public static final void v(C9159r41 c9159r41, C2379y c2379y) {
        C6562gT0.p(c9159r41, "this$0");
        c9159r41.I(c2379y);
    }

    public final int A(String str) {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + f(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    public final void C(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(context, "context");
            d.a aVar = d.Z;
            this.n1 = aVar.b();
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, Q.n.f9, i, i2);
            C6562gT0.o(obtainStyledAttributes, "context\n            .theme\n            .obtainStyledAttributes(\n                attrs, R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes)");
            this.h1 = obtainStyledAttributes.getBoolean(Q.n.g9, true);
            setLoginText(obtainStyledAttributes.getString(Q.n.j9));
            setLogoutText(obtainStyledAttributes.getString(Q.n.k9));
            d a2 = aVar.a(obtainStyledAttributes.getInt(Q.n.l9, aVar.b().h()));
            if (a2 == null) {
                a2 = aVar.b();
            }
            this.n1 = a2;
            int i3 = Q.n.h9;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.s1 = Float.valueOf(obtainStyledAttributes.getDimension(i3, 0.0f));
            }
            int integer = obtainStyledAttributes.getInteger(Q.n.i9, 255);
            this.t1 = integer;
            int max = Math.max(0, integer);
            this.t1 = max;
            this.t1 = Math.min(255, max);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void D(@NotNull InterfaceC2407p interfaceC2407p, @NotNull InterfaceC2411u<com.facebook.login.J> interfaceC2411u) {
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(interfaceC2411u, "callback");
        this.r1.getValue().p0(interfaceC2407p, interfaceC2411u);
        InterfaceC2407p interfaceC2407p2 = this.v1;
        if (interfaceC2407p2 == null) {
            this.v1 = interfaceC2407p;
        } else if (interfaceC2407p2 != interfaceC2407p) {
            Log.w(y1, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public final void E() {
        if (SQ.e(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(C3220Ic.b(getContext(), b.g.I0), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        r2 = ((android.graphics.drawable.StateListDrawable) r1).getStateCount();
     */
    @TargetApi(29)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F() {
        int stateCount;
        Drawable stateDrawable;
        GradientDrawable gradientDrawable;
        if (!SQ.e(this)) {
            try {
                Float f2 = this.s1;
                if (f2 != null) {
                    float floatValue = f2.floatValue();
                    Drawable background = getBackground();
                    if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable) && stateCount > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            stateDrawable = ((StateListDrawable) background).getStateDrawable(i);
                            if (stateDrawable instanceof GradientDrawable) {
                                gradientDrawable = (GradientDrawable) stateDrawable;
                            } else {
                                gradientDrawable = null;
                            }
                            if (gradientDrawable != null) {
                                gradientDrawable.setCornerRadius(floatValue);
                            }
                            if (i2 >= stateCount) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    if (background instanceof GradientDrawable) {
                        ((GradientDrawable) background).setCornerRadius(floatValue);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void G() {
        if (SQ.e(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && C0376a.g1.k()) {
                String str = this.j1;
                if (str == null) {
                    str = resources.getString(Q.l.N);
                }
                setText(str);
                return;
            }
            String str2 = this.i1;
            if (str2 != null) {
                setText(str2);
                return;
            }
            String string = resources.getString(getLoginButtonContinueLabel());
            C6562gT0.o(string, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && A(string) > width) {
                string = resources.getString(Q.l.J);
                C6562gT0.o(string, "resources.getString(R.string.com_facebook_loginview_log_in_button)");
            }
            setText(string);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void H() {
        if (SQ.e(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.t1);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void I(C2379y c2379y) {
        if (!SQ.e(this) && c2379y != null) {
            try {
                if (c2379y.m() && getVisibility() == 0) {
                    y(c2379y.l());
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void J(@NotNull InterfaceC2407p interfaceC2407p) {
        C6562gT0.p(interfaceC2407p, "callbackManager");
        this.r1.getValue().O0(interfaceC2407p);
    }

    @Override // com.facebook.AbstractC2410t
    public void c(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(context, "context");
            super.c(context, attributeSet, i, i2);
            setInternalOnClickListener(getNewLoginClickListener());
            C(context, attributeSet, i, i2);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(b.e.V));
                setLoginText("Continue with Facebook");
            } else {
                this.q1 = new f();
            }
            G();
            F();
            H();
            E();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @NotNull
    public final String getAuthType() {
        return this.k1.b();
    }

    @Nullable
    public final InterfaceC2407p getCallbackManager() {
        return this.v1;
    }

    @NotNull
    public final EnumC2389f getDefaultAudience() {
        return this.k1.c();
    }

    @Override // com.facebook.AbstractC2410t
    public int getDefaultRequestCode() {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            return C2361f.c.Login.g();
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    @Override // com.facebook.AbstractC2410t
    public int getDefaultStyleResource() {
        return Q.m.a6;
    }

    @NotNull
    public final String getLoggerID() {
        return this.u1;
    }

    @NotNull
    public final com.facebook.login.v getLoginBehavior() {
        return this.k1.d();
    }

    @InterfaceC3329Je2
    public final int getLoginButtonContinueLabel() {
        return Q.l.K;
    }

    @NotNull
    public final EY0<com.facebook.login.G> getLoginManagerLazy() {
        return this.r1;
    }

    @NotNull
    public final com.facebook.login.L getLoginTargetApp() {
        return this.k1.e();
    }

    @Nullable
    public final String getLoginText() {
        return this.i1;
    }

    @Nullable
    public final String getLogoutText() {
        return this.j1;
    }

    @Nullable
    public final String getMessengerPageId() {
        return this.k1.f();
    }

    @NotNull
    public c getNewLoginClickListener() {
        return new c(this);
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.k1.g();
    }

    @NotNull
    public final b getProperties() {
        return this.k1;
    }

    public final boolean getResetMessengerState() {
        return this.k1.h();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.k1.i();
    }

    public final long getToolTipDisplayTime() {
        return this.o1;
    }

    @NotNull
    public final d getToolTipMode() {
        return this.n1;
    }

    @NotNull
    public final C6650gq2.c getToolTipStyle() {
        return this.m1;
    }

    @Override // com.facebook.AbstractC2410t, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (!SQ.e(this)) {
            try {
                super.onAttachedToWindow();
                if (getContext() instanceof InterfaceC5486c6) {
                    Context context = getContext();
                    if (context != null) {
                        this.w1 = ((InterfaceC5486c6) context).x().n("facebook-login", this.r1.getValue().m(this.v1, this.u1), new H5() { // from class: o.q41
                            @Override // o.H5
                            public final void a(Object obj) {
                                C9159r41.B((InterfaceC2407p.a) obj);
                            }
                        });
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                    }
                }
                AbstractC2355i abstractC2355i = this.q1;
                if (abstractC2355i != null && abstractC2355i.c()) {
                    abstractC2355i.e();
                    G();
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (SQ.e(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            X5<Collection<String>> x5 = this.w1;
            if (x5 != null) {
                x5.d();
            }
            AbstractC2355i abstractC2355i = this.q1;
            if (abstractC2355i != null) {
                abstractC2355i.f();
            }
            x();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @Override // com.facebook.AbstractC2410t, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(canvas, "canvas");
                super.onDraw(canvas);
                if (!this.l1 && !isInEditMode()) {
                    this.l1 = true;
                    t();
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (SQ.e(this)) {
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            try {
                G();
            } catch (Throwable th) {
                th = th;
                SQ.c(th, this);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int z = z(i);
            String str = this.j1;
            if (str == null) {
                str = resources.getString(Q.l.N);
                C6562gT0.o(str, "resources.getString(R.string.com_facebook_loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(z, A(str)), i), compoundPaddingTop);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(@NotNull View view, int i) {
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(view, "changedView");
                super.onVisibilityChanged(view, i);
                if (i != 0) {
                    x();
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void setAuthType(@NotNull String str) {
        C6562gT0.p(str, "value");
        this.k1.j(str);
    }

    public final void setDefaultAudience(@NotNull EnumC2389f enumC2389f) {
        C6562gT0.p(enumC2389f, "value");
        this.k1.k(enumC2389f);
    }

    public final void setLoginBehavior(@NotNull com.facebook.login.v vVar) {
        C6562gT0.p(vVar, "value");
        this.k1.l(vVar);
    }

    public final void setLoginManagerLazy(@NotNull EY0<? extends com.facebook.login.G> ey0) {
        C6562gT0.p(ey0, "<set-?>");
        this.r1 = ey0;
    }

    public final void setLoginTargetApp(@NotNull com.facebook.login.L l) {
        C6562gT0.p(l, "value");
        this.k1.m(l);
    }

    public final void setLoginText(@Nullable String str) {
        this.i1 = str;
        G();
    }

    public final void setLogoutText(@Nullable String str) {
        this.j1 = str;
        G();
    }

    public final void setMessengerPageId(@Nullable String str) {
        this.k1.n(str);
    }

    public final void setPermissions(@NotNull String... strArr) {
        C6562gT0.p(strArr, "permissions");
        this.k1.o(C8222nF.Q(Arrays.copyOf(strArr, strArr.length)));
    }

    @InterfaceC9150r20(message = "Use setPermissions instead", replaceWith = @IR1(expression = "setPermissions", imports = {}))
    public final void setPublishPermissions(@NotNull List<String> list) {
        C6562gT0.p(list, "permissions");
        this.k1.o(list);
    }

    @InterfaceC9150r20(message = "Use setPermissions instead", replaceWith = @IR1(expression = "setPermissions", imports = {}))
    public final void setReadPermissions(@NotNull List<String> list) {
        C6562gT0.p(list, "permissions");
        this.k1.o(list);
    }

    public final void setResetMessengerState(boolean z) {
        this.k1.p(z);
    }

    public final void setToolTipDisplayTime(long j) {
        this.o1 = j;
    }

    public final void setToolTipMode(@NotNull d dVar) {
        C6562gT0.p(dVar, "<set-?>");
        this.n1 = dVar;
    }

    public final void setToolTipStyle(@NotNull C6650gq2.c cVar) {
        C6562gT0.p(cVar, "<set-?>");
        this.m1 = cVar;
    }

    public final void t() {
        if (!SQ.e(this)) {
            try {
                int i = e.a[this.n1.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    String string = getResources().getString(Q.l.X);
                    C6562gT0.o(string, "resources.getString(R.string.com_facebook_tooltip_default)");
                    y(string);
                    return;
                }
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                final String K = com.facebook.internal.l0.K(getContext());
                com.facebook.M m = com.facebook.M.a;
                com.facebook.M.y().execute(new Runnable() { // from class: o.p41
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9159r41.u(K, this);
                    }
                });
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void w() {
        this.k1.a();
    }

    public final void x() {
        C6650gq2 c6650gq2 = this.p1;
        if (c6650gq2 != null) {
            c6650gq2.d();
        }
        this.p1 = null;
    }

    public final void y(String str) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6650gq2 c6650gq2 = new C6650gq2(str, this);
            c6650gq2.h(this.m1);
            c6650gq2.g(this.o1);
            c6650gq2.i();
            this.p1 = c6650gq2;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final int z(int i) {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String str = this.i1;
            if (str == null) {
                str = resources.getString(Q.l.K);
                int A = A(str);
                if (View.resolveSize(A, i) < A) {
                    str = resources.getString(Q.l.J);
                }
            }
            return A(str);
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    public final void setPermissions(@NotNull List<String> list) {
        C6562gT0.p(list, "value");
        this.k1.o(list);
    }

    @InterfaceC9150r20(message = "Use setPermissions instead", replaceWith = @IR1(expression = "setPermissions", imports = {}))
    public final void setPublishPermissions(@NotNull String... strArr) {
        C6562gT0.p(strArr, "permissions");
        this.k1.o(C8222nF.Q(Arrays.copyOf(strArr, strArr.length)));
    }

    @InterfaceC9150r20(message = "Use setPermissions instead", replaceWith = @IR1(expression = "setPermissions", imports = {}))
    public final void setReadPermissions(@NotNull String... strArr) {
        C6562gT0.p(strArr, "permissions");
        this.k1.o(C8222nF.Q(Arrays.copyOf(strArr, strArr.length)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9159r41(@NotNull Context context) {
        this(context, null, 0, 0, C2356a.p0, C2356a.v0);
        C6562gT0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9159r41(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, C2356a.p0, C2356a.v0);
        C6562gT0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9159r41(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, C2356a.p0, C2356a.v0);
        C6562gT0.p(context, "context");
    }

    public static final void B(InterfaceC2407p.a aVar) {
    }
}
