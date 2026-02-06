package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.internal.M;
import com.facebook.login.Q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class MI1 extends FrameLayout {
    @NotNull
    public static final a j1 = new a(null);
    @NotNull
    public static final String k1;
    public static final int l1 = -1;
    public static final int m1 = -2;
    public static final int n1 = -3;
    public static final int o1 = -4;
    public static final int p1 = 1;
    public static final boolean q1 = true;
    @NotNull
    public static final String r1 = "ProfilePictureView_superState";
    @NotNull
    public static final String s1 = "ProfilePictureView_profileId";
    @NotNull
    public static final String t1 = "ProfilePictureView_presetSize";
    @NotNull
    public static final String u1 = "ProfilePictureView_isCropped";
    @NotNull
    public static final String v1 = "ProfilePictureView_bitmap";
    @NotNull
    public static final String w1 = "ProfilePictureView_width";
    @NotNull
    public static final String x1 = "ProfilePictureView_height";
    @NotNull
    public static final String y1 = "ProfilePictureView_refresh";
    @NotNull
    public final ImageView Y0;
    public int Z0;
    public int a1;
    @Nullable
    public Bitmap b1;
    @Nullable
    public com.facebook.internal.M c1;
    @Nullable
    public Bitmap d1;
    @Nullable
    public com.facebook.g0 e1;
    @Nullable
    public String f1;
    public boolean g1;
    @Nullable
    public b h1;
    public int i1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final String a() {
            return MI1.k1;
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void b(@NotNull C2416z c2416z);
    }

    /* loaded from: classes2.dex */
    public static final class c extends com.facebook.g0 {
        public c() {
        }

        @Override // com.facebook.g0
        public void c(@Nullable com.facebook.d0 d0Var, @Nullable com.facebook.d0 d0Var2) {
            String e;
            MI1 mi1 = MI1.this;
            if (d0Var2 == null) {
                e = null;
            } else {
                e = d0Var2.e();
            }
            mi1.setProfileId(e);
            MI1.this.k(true);
        }
    }

    static {
        String simpleName = MI1.class.getSimpleName();
        C6562gT0.o(simpleName, "ProfilePictureView::class.java.simpleName");
        k1 = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI1(@NotNull Context context) {
        super(context);
        C6562gT0.p(context, "context");
        this.Y0 = new ImageView(getContext());
        this.g1 = true;
        this.i1 = -1;
        f();
    }

    public static final void m(MI1 mi1, com.facebook.internal.N n) {
        C6562gT0.p(mi1, "this$0");
        mi1.j(n);
    }

    private final void setImageBitmap(Bitmap bitmap) {
        if (SQ.e(this) || bitmap == null) {
            return;
        }
        try {
            this.b1 = bitmap;
            this.Y0.setImageBitmap(bitmap);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final int d(boolean z) {
        int i;
        if (SQ.e(this)) {
            return 0;
        }
        try {
            int i2 = this.i1;
            if (i2 == -1 && !z) {
                return 0;
            }
            if (i2 != -4) {
                if (i2 != -3) {
                    if (i2 != -2) {
                        if (i2 != -1) {
                            return 0;
                        }
                        i = Q.f.T0;
                    } else {
                        i = Q.f.U0;
                    }
                } else {
                    i = Q.f.T0;
                }
            } else {
                i = Q.f.S0;
            }
            return getResources().getDimensionPixelSize(i);
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    public final Uri e(String str) {
        com.facebook.d0 b2 = com.facebook.d0.c1.b();
        if (b2 != null && C0376a.g1.m()) {
            return b2.n(this.a1, this.Z0);
        }
        return com.facebook.internal.M.f.b(this.f1, this.a1, this.Z0, str);
    }

    public final void f() {
        if (SQ.e(this)) {
            return;
        }
        try {
            removeAllViews();
            this.Y0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.Y0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.Y0);
            this.e1 = new c();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final boolean g() {
        return this.g1;
    }

    @Nullable
    public final b getOnErrorListener() {
        return this.h1;
    }

    public final int getPresetSize() {
        return this.i1;
    }

    @Nullable
    public final String getProfileId() {
        return this.f1;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        com.facebook.g0 g0Var = this.e1;
        if (g0Var == null) {
            return false;
        }
        return g0Var.b();
    }

    public final boolean h() {
        if (this.a1 == 0 && this.Z0 == 0) {
            return true;
        }
        return false;
    }

    public final void i(AttributeSet attributeSet) {
        if (SQ.e(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Q.n.m9);
            C6562gT0.o(obtainStyledAttributes, "context.obtainStyledAttributes(attrs, R.styleable.com_facebook_profile_picture_view)");
            setPresetSize(obtainStyledAttributes.getInt(Q.n.o9, -1));
            setCropped(obtainStyledAttributes.getBoolean(Q.n.n9, true));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void j(com.facebook.internal.N n) {
        if (!SQ.e(this) && n != null) {
            try {
                if (C6562gT0.g(n.c(), this.c1)) {
                    this.c1 = null;
                    Bitmap a2 = n.a();
                    Exception b2 = n.b();
                    if (b2 != null) {
                        b bVar = this.h1;
                        if (bVar != null) {
                            bVar.b(new C2416z(C6562gT0.C("Error in downloading profile picture for profileId: ", this.f1), b2));
                        } else {
                            com.facebook.internal.V.e.b(com.facebook.b0.REQUESTS, 6, k1, b2.toString());
                        }
                    } else if (a2 != null) {
                        setImageBitmap(a2);
                        if (n.d()) {
                            l(false);
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void k(boolean z) {
        if (!SQ.e(this)) {
            try {
                boolean o2 = o();
                String str = this.f1;
                if (str != null && str.length() != 0 && !h()) {
                    if (!o2 && !z) {
                        return;
                    }
                    l(true);
                    return;
                }
                n();
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void l(boolean z) {
        C0376a i;
        String x;
        if (SQ.e(this)) {
            return;
        }
        try {
            C0376a.d dVar = C0376a.g1;
            String str = "";
            if (dVar.k() && (i = dVar.i()) != null && (x = i.x()) != null) {
                str = x;
            }
            Uri e = e(str);
            Context context = getContext();
            C6562gT0.o(context, "context");
            com.facebook.internal.M a2 = new M.a(context, e).f(z).h(this).g(new M.b() { // from class: o.LI1
                @Override // com.facebook.internal.M.b
                public final void a(com.facebook.internal.N n) {
                    MI1.m(MI1.this, n);
                }
            }).a();
            com.facebook.internal.M m = this.c1;
            if (m != null) {
                com.facebook.internal.L l = com.facebook.internal.L.a;
                com.facebook.internal.L.d(m);
            }
            this.c1 = a2;
            com.facebook.internal.L l2 = com.facebook.internal.L.a;
            com.facebook.internal.L.g(a2);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void n() {
        int i;
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.internal.M m = this.c1;
            if (m != null) {
                com.facebook.internal.L l = com.facebook.internal.L.a;
                com.facebook.internal.L.d(m);
            }
            Bitmap bitmap = this.d1;
            if (bitmap == null) {
                if (this.g1) {
                    i = Q.g.O0;
                } else {
                    i = Q.g.N0;
                }
                setImageBitmap(BitmapFactory.decodeResource(getResources(), i));
                return;
            }
            o();
            setImageBitmap(Bitmap.createScaledBitmap(bitmap, this.a1, this.Z0, false));
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final boolean o() {
        if (SQ.e(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = true;
            if (width >= 1 && height >= 1) {
                int d = d(false);
                if (d != 0) {
                    height = d;
                    width = height;
                }
                if (width <= height) {
                    if (this.g1) {
                        height = width;
                    } else {
                        height = 0;
                    }
                } else if (this.g1) {
                    width = height;
                } else {
                    width = 0;
                }
                if (width == this.a1 && height == this.Z0) {
                    z = false;
                }
                this.a1 = width;
                this.Z0 = height;
                return z;
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c1 = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i2) != 1073741824 && layoutParams.height == -2) {
            size = d(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        } else {
            z = false;
        }
        if (View.MeasureSpec.getMode(i) != 1073741824 && layoutParams.width == -2) {
            size2 = d(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        } else {
            z2 = z;
        }
        if (z2) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable parcelable) {
        C6562gT0.p(parcelable, "state");
        if (!C6562gT0.g(parcelable.getClass(), Bundle.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(r1));
        setProfileId(bundle.getString(s1));
        setPresetSize(bundle.getInt(t1));
        setCropped(bundle.getBoolean(u1));
        this.a1 = bundle.getInt(w1);
        this.Z0 = bundle.getInt(x1);
        k(true);
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        boolean z;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(r1, onSaveInstanceState);
        bundle.putString(s1, this.f1);
        bundle.putInt(t1, this.i1);
        bundle.putBoolean(u1, this.g1);
        bundle.putInt(w1, this.a1);
        bundle.putInt(x1, this.Z0);
        if (this.c1 != null) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean(y1, z);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.g1 = z;
        k(false);
    }

    public final void setDefaultProfilePicture(@Nullable Bitmap bitmap) {
        this.d1 = bitmap;
    }

    public final void setOnErrorListener(@Nullable b bVar) {
        this.h1 = bVar;
    }

    public final void setPresetSize(int i) {
        if (i != -4 && i != -3 && i != -2 && i != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.i1 = i;
        requestLayout();
    }

    public final void setProfileId(@Nullable String str) {
        String str2 = this.f1;
        boolean z = true;
        if (str2 != null && str2.length() != 0 && C9545sf2.c2(this.f1, str, true)) {
            z = false;
        } else {
            n();
        }
        this.f1 = str;
        k(z);
    }

    public final void setShouldUpdateOnProfileChange(boolean z) {
        if (z) {
            com.facebook.g0 g0Var = this.e1;
            if (g0Var != null) {
                g0Var.d();
                return;
            }
            return;
        }
        com.facebook.g0 g0Var2 = this.e1;
        if (g0Var2 == null) {
            return;
        }
        g0Var2.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI1(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        C6562gT0.p(context, "context");
        C6562gT0.p(attributeSet, "attrs");
        this.Y0 = new ImageView(getContext());
        this.g1 = true;
        this.i1 = -1;
        f();
        i(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI1(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C6562gT0.p(context, "context");
        C6562gT0.p(attributeSet, "attrs");
        this.Y0 = new ImageView(getContext());
        this.g1 = true;
        this.i1 = -1;
        f();
        i(attributeSet);
    }
}
