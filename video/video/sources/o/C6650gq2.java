package o;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.Q;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.gq2 */
/* loaded from: classes2.dex */
public final class C6650gq2 {
    @NotNull
    public static final a i = new a(null);
    public static final long j = 6000;
    @NotNull
    public final String a;
    @NotNull
    public final WeakReference<View> b;
    @NotNull
    public final Context c;
    @Nullable
    public b d;
    @Nullable
    public PopupWindow e;
    @NotNull
    public c f;
    public long g;
    @NotNull
    public final ViewTreeObserver.OnScrollChangedListener h;

    /* renamed from: o.gq2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: o.gq2$b */
    /* loaded from: classes2.dex */
    public final class b extends FrameLayout {
        @NotNull
        public final ImageView Y0;
        @NotNull
        public final ImageView Z0;
        @NotNull
        public final View a1;
        @NotNull
        public final ImageView b1;
        public final /* synthetic */ C6650gq2 c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C6650gq2 c6650gq2, Context context) {
            super(context);
            C6562gT0.p(c6650gq2, "this$0");
            C6562gT0.p(context, "context");
            this.c1 = c6650gq2;
            LayoutInflater.from(context).inflate(Q.k.I, this);
            View findViewById = findViewById(Q.h.E0);
            if (findViewById != null) {
                this.Y0 = (ImageView) findViewById;
                View findViewById2 = findViewById(Q.h.C0);
                if (findViewById2 != null) {
                    this.Z0 = (ImageView) findViewById2;
                    View findViewById3 = findViewById(Q.h.v0);
                    C6562gT0.o(findViewById3, "findViewById(R.id.com_facebook_body_frame)");
                    this.a1 = findViewById3;
                    View findViewById4 = findViewById(Q.h.w0);
                    if (findViewById4 != null) {
                        this.b1 = (ImageView) findViewById4;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }

        @NotNull
        public final View a() {
            return this.a1;
        }

        @NotNull
        public final ImageView b() {
            return this.Z0;
        }

        @NotNull
        public final ImageView c() {
            return this.Y0;
        }

        @NotNull
        public final ImageView d() {
            return this.b1;
        }

        public final void e() {
            this.Y0.setVisibility(4);
            this.Z0.setVisibility(0);
        }

        public final void f() {
            this.Y0.setVisibility(0);
            this.Z0.setVisibility(4);
        }
    }

    /* renamed from: o.gq2$c */
    /* loaded from: classes2.dex */
    public enum c {
        BLUE,
        BLACK;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public C6650gq2(@NotNull String str, @NotNull View view) {
        C6562gT0.p(str, "text");
        C6562gT0.p(view, "anchor");
        this.a = str;
        this.b = new WeakReference<>(view);
        Context context = view.getContext();
        C6562gT0.o(context, "anchor.context");
        this.c = context;
        this.f = c.BLUE;
        this.g = j;
        this.h = new ViewTreeObserver.OnScrollChangedListener() { // from class: o.dq2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C6650gq2.c(C6650gq2.this);
            }
        };
    }

    public static /* synthetic */ void a(C6650gq2 c6650gq2, View view) {
        k(c6650gq2, view);
    }

    public static /* synthetic */ void b(C6650gq2 c6650gq2) {
        j(c6650gq2);
    }

    public static /* synthetic */ void c(C6650gq2 c6650gq2) {
        f(c6650gq2);
    }

    public static final void f(C6650gq2 c6650gq2) {
        PopupWindow popupWindow;
        if (!SQ.e(C6650gq2.class)) {
            try {
                C6562gT0.p(c6650gq2, "this$0");
                if (c6650gq2.b.get() != null && (popupWindow = c6650gq2.e) != null && popupWindow.isShowing()) {
                    if (popupWindow.isAboveAnchor()) {
                        b bVar = c6650gq2.d;
                        if (bVar != null) {
                            bVar.e();
                            return;
                        }
                        return;
                    }
                    b bVar2 = c6650gq2.d;
                    if (bVar2 != null) {
                        bVar2.f();
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, C6650gq2.class);
            }
        }
    }

    public static final void j(C6650gq2 c6650gq2) {
        if (SQ.e(C6650gq2.class)) {
            return;
        }
        try {
            C6562gT0.p(c6650gq2, "this$0");
            c6650gq2.d();
        } catch (Throwable th) {
            SQ.c(th, C6650gq2.class);
        }
    }

    public static final void k(C6650gq2 c6650gq2, View view) {
        if (SQ.e(C6650gq2.class)) {
            return;
        }
        try {
            C6562gT0.p(c6650gq2, "this$0");
            c6650gq2.d();
        } catch (Throwable th) {
            SQ.c(th, C6650gq2.class);
        }
    }

    public final void d() {
        if (!SQ.e(this)) {
            try {
                l();
                PopupWindow popupWindow = this.e;
                if (popupWindow == null) {
                    return;
                }
                popupWindow.dismiss();
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void e() {
        ViewTreeObserver viewTreeObserver;
        if (!SQ.e(this)) {
            try {
                l();
                View view = this.b.get();
                if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.addOnScrollChangedListener(this.h);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void g(long j2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.g = j2;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void h(@NotNull c cVar) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(cVar, "style");
            this.f = cVar;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void i() {
        if (!SQ.e(this)) {
            try {
                if (this.b.get() != null) {
                    b bVar = new b(this, this.c);
                    this.d = bVar;
                    View findViewById = bVar.findViewById(Q.h.D0);
                    if (findViewById != null) {
                        ((TextView) findViewById).setText(this.a);
                        if (this.f == c.BLUE) {
                            bVar.a().setBackgroundResource(Q.g.T0);
                            bVar.b().setImageResource(Q.g.U0);
                            bVar.c().setImageResource(Q.g.V0);
                            bVar.d().setImageResource(Q.g.W0);
                        } else {
                            bVar.a().setBackgroundResource(Q.g.P0);
                            bVar.b().setImageResource(Q.g.Q0);
                            bVar.c().setImageResource(Q.g.R0);
                            bVar.d().setImageResource(Q.g.S0);
                        }
                        View decorView = ((Activity) this.c).getWindow().getDecorView();
                        C6562gT0.o(decorView, "window.decorView");
                        int width = decorView.getWidth();
                        int height = decorView.getHeight();
                        e();
                        bVar.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                        PopupWindow popupWindow = new PopupWindow(bVar, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
                        this.e = popupWindow;
                        popupWindow.showAsDropDown(this.b.get());
                        m();
                        if (this.g > 0) {
                            bVar.postDelayed(new Runnable() { // from class: o.eq2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C6650gq2.b(C6650gq2.this);
                                }
                            }, this.g);
                        }
                        popupWindow.setTouchable(true);
                        bVar.setOnClickListener(new View.OnClickListener() { // from class: o.fq2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C6650gq2.a(C6650gq2.this, view);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void l() {
        ViewTreeObserver viewTreeObserver;
        if (!SQ.e(this)) {
            try {
                View view = this.b.get();
                if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(this.h);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void m() {
        if (!SQ.e(this)) {
            try {
                PopupWindow popupWindow = this.e;
                if (popupWindow != null && popupWindow.isShowing()) {
                    if (popupWindow.isAboveAnchor()) {
                        b bVar = this.d;
                        if (bVar != null) {
                            bVar.e();
                            return;
                        }
                        return;
                    }
                    b bVar2 = this.d;
                    if (bVar2 != null) {
                        bVar2.f();
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
