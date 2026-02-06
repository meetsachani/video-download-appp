package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import o.AX0;
import o.BC1;
import o.C10624x51;
import o.C3220Ic;
import o.C4079Qw0;
import o.C6006eE2;
import o.C61;
import o.C7190j41;
import o.C8431o61;
import o.C9410s61;
import o.C9816tm2;
import o.D61;
import o.EnumC10223vR1;
import o.EnumC3623Mf;
import o.EnumC8675p61;
import o.H61;
import o.InterfaceC10871y61;
import o.InterfaceC9473sM0;
import o.J61;
import o.L72;
import o.O61;
import o.T51;
import o.T72;
import o.ZX0;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final String o1 = "LottieAnimationView";
    public static final InterfaceC10871y61<Throwable> p1 = new InterfaceC10871y61() { // from class: o.v51
        @Override // o.InterfaceC10871y61
        public final void onResult(Object obj) {
            LottieAnimationView.b((Throwable) obj);
        }
    };
    public final InterfaceC10871y61<C10624x51> b1;
    public final InterfaceC10871y61<Throwable> c1;
    public InterfaceC10871y61<Throwable> d1;
    public int e1;
    public final C8431o61 f1;
    public String g1;
    public int h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public final Set<c> l1;
    public final Set<C61> m1;
    public J61<C10624x51> n1;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class a<T> extends O61<T> {
        public final /* synthetic */ T72 d;

        public a(T72 t72) {
            this.d = t72;
        }

        @Override // o.O61
        public T a(C9410s61<T> c9410s61) {
            return (T) this.d.a(c9410s61);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public String X;
        public int Y;
        public boolean Y0;
        public float Z;
        public String Z0;
        public int a1;
        public int b1;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.X);
            parcel.writeFloat(this.Z);
            parcel.writeInt(this.Y0 ? 1 : 0);
            parcel.writeString(this.Z0);
            parcel.writeInt(this.a1);
            parcel.writeInt(this.b1);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public b(Parcel parcel) {
            super(parcel);
            this.X = parcel.readString();
            this.Z = parcel.readFloat();
            this.Y0 = parcel.readInt() == 1;
            this.Z0 = parcel.readString();
            this.a1 = parcel.readInt();
            this.b1 = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* loaded from: classes.dex */
    public static class d implements InterfaceC10871y61<Throwable> {
        public final WeakReference<LottieAnimationView> a;

        public d(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference<>(lottieAnimationView);
        }

        @Override // o.InterfaceC10871y61
        /* renamed from: a */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.e1 != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.e1);
            }
            (lottieAnimationView.d1 == null ? LottieAnimationView.p1 : lottieAnimationView.d1).onResult(th);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements InterfaceC10871y61<C10624x51> {
        public final WeakReference<LottieAnimationView> a;

        public e(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference<>(lottieAnimationView);
        }

        @Override // o.InterfaceC10871y61
        /* renamed from: a */
        public void onResult(C10624x51 c10624x51) {
            LottieAnimationView lottieAnimationView = this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c10624x51);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.b1 = new e(this);
        this.c1 = new d(this);
        this.e1 = 0;
        this.f1 = new C8431o61();
        this.i1 = false;
        this.j1 = false;
        this.k1 = true;
        this.l1 = new HashSet();
        this.m1 = new HashSet();
        z(null, a.C0058a.lottieAnimationViewStyle);
    }

    public static /* synthetic */ H61 a(LottieAnimationView lottieAnimationView, String str) {
        if (lottieAnimationView.k1) {
            return T51.A(lottieAnimationView.getContext(), str);
        }
        return T51.B(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void b(Throwable th) {
        if (C6006eE2.k(th)) {
            C7190j41.f("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    public static /* synthetic */ H61 d(LottieAnimationView lottieAnimationView, int i) {
        if (lottieAnimationView.k1) {
            return T51.V(lottieAnimationView.getContext(), i);
        }
        return T51.W(lottieAnimationView.getContext(), i, null);
    }

    private void setCompositionTask(J61<C10624x51> j61) {
        H61<C10624x51> e2 = j61.e();
        C8431o61 c8431o61 = this.f1;
        if (e2 != null && c8431o61 == getDrawable() && c8431o61.V() == e2.b()) {
            return;
        }
        this.l1.add(c.SET_ANIMATION);
        q();
        p();
        this.n1 = j61.d(this.b1).c(this.c1);
    }

    public boolean A() {
        return this.f1.s0();
    }

    public boolean B(EnumC8675p61 enumC8675p61) {
        return this.f1.w0(enumC8675p61);
    }

    public boolean C() {
        return this.f1.w0(EnumC8675p61.MergePathsApi19);
    }

    @Deprecated
    public void D(boolean z) {
        int i;
        C8431o61 c8431o61 = this.f1;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        c8431o61.q1(i);
    }

    public void E() {
        this.j1 = false;
        this.f1.C0();
    }

    public void F() {
        this.l1.add(c.PLAY_OPTION);
        this.f1.D0();
    }

    public void G() {
        this.f1.E0();
    }

    public void H() {
        this.m1.clear();
    }

    public void I() {
        this.f1.F0();
    }

    public void J(Animator.AnimatorListener animatorListener) {
        this.f1.G0(animatorListener);
    }

    public void K(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1.H0(animatorPauseListener);
    }

    public boolean L(C61 c61) {
        return this.m1.remove(c61);
    }

    public void M(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f1.I0(animatorUpdateListener);
    }

    public List<AX0> N(AX0 ax0) {
        return this.f1.K0(ax0);
    }

    public void O() {
        this.l1.add(c.PLAY_OPTION);
        this.f1.L0();
    }

    public void P() {
        this.f1.M0();
    }

    public void Q(InputStream inputStream, String str) {
        setCompositionTask(T51.F(inputStream, str));
    }

    public void R(ZipInputStream zipInputStream, String str) {
        setCompositionTask(T51.d0(zipInputStream, str));
    }

    public void S(String str, String str2) {
        Q(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void T(String str, String str2) {
        setCompositionTask(T51.Y(getContext(), str, str2));
    }

    public final void U() {
        boolean A = A();
        setImageDrawable(null);
        setImageDrawable(this.f1);
        if (A) {
            this.f1.L0();
        }
    }

    public void V(int i, int i2) {
        this.f1.f1(i, i2);
    }

    public void W(String str, String str2, boolean z) {
        this.f1.h1(str, str2, z);
    }

    public void X(float f, float f2) {
        this.f1.i1(f, f2);
    }

    public final void Y(float f, boolean z) {
        if (z) {
            this.l1.add(c.SET_PROGRESS);
        }
        this.f1.o1(f);
    }

    public Bitmap Z(String str, Bitmap bitmap) {
        return this.f1.y1(str, bitmap);
    }

    public EnumC3623Mf getAsyncUpdates() {
        return this.f1.Q();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f1.R();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f1.T();
    }

    public boolean getClipToCompositionBounds() {
        return this.f1.U();
    }

    public C10624x51 getComposition() {
        Drawable drawable = getDrawable();
        C8431o61 c8431o61 = this.f1;
        if (drawable == c8431o61) {
            return c8431o61.V();
        }
        return null;
    }

    public long getDuration() {
        C10624x51 composition = getComposition();
        if (composition != null) {
            return composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f1.Y();
    }

    public String getImageAssetsFolder() {
        return this.f1.b0();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f1.d0();
    }

    public float getMaxFrame() {
        return this.f1.f0();
    }

    public float getMinFrame() {
        return this.f1.g0();
    }

    public BC1 getPerformanceTracker() {
        return this.f1.h0();
    }

    public float getProgress() {
        return this.f1.i0();
    }

    public EnumC10223vR1 getRenderMode() {
        return this.f1.j0();
    }

    public int getRepeatCount() {
        return this.f1.k0();
    }

    public int getRepeatMode() {
        return this.f1.l0();
    }

    public float getSpeed() {
        return this.f1.m0();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f1.u(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof C8431o61) && ((C8431o61) drawable).j0() == EnumC10223vR1.SOFTWARE) {
            this.f1.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C8431o61 c8431o61 = this.f1;
        if (drawable2 == c8431o61) {
            super.invalidateDrawable(c8431o61);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void j(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1.v(animatorPauseListener);
    }

    public void k(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f1.w(animatorUpdateListener);
    }

    public boolean l(C61 c61) {
        C10624x51 composition = getComposition();
        if (composition != null) {
            c61.a(composition);
        }
        return this.m1.add(c61);
    }

    public <T> void m(AX0 ax0, T t, O61<T> o61) {
        this.f1.x(ax0, t, o61);
    }

    public <T> void n(AX0 ax0, T t, T72<T> t72) {
        this.f1.x(ax0, t, new a(t72));
    }

    public void o() {
        this.j1 = false;
        this.l1.add(c.PLAY_OPTION);
        this.f1.B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.j1) {
            this.f1.D0();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.g1 = bVar.X;
        Set<c> set = this.l1;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.g1)) {
            setAnimation(this.g1);
        }
        this.h1 = bVar.Y;
        if (!this.l1.contains(cVar) && (i = this.h1) != 0) {
            setAnimation(i);
        }
        if (!this.l1.contains(c.SET_PROGRESS)) {
            Y(bVar.Z, false);
        }
        if (!this.l1.contains(c.PLAY_OPTION) && bVar.Y0) {
            F();
        }
        if (!this.l1.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.Z0);
        }
        if (!this.l1.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.a1);
        }
        if (!this.l1.contains(c.SET_REPEAT_COUNT)) {
            setRepeatCount(bVar.b1);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.X = this.g1;
        bVar.Y = this.h1;
        bVar.Z = this.f1.i0();
        bVar.Y0 = this.f1.t0();
        bVar.Z0 = this.f1.b0();
        bVar.a1 = this.f1.l0();
        bVar.b1 = this.f1.k0();
        return bVar;
    }

    public final void p() {
        J61<C10624x51> j61 = this.n1;
        if (j61 != null) {
            j61.k(this.b1);
            this.n1.j(this.c1);
        }
    }

    public final void q() {
        this.f1.C();
    }

    public <T> void r(AX0 ax0, T t) {
        this.f1.x(ax0, t, null);
    }

    @Deprecated
    public void s() {
        this.f1.G();
    }

    public void setAnimation(int i) {
        this.h1 = i;
        this.g1 = null;
        setCompositionTask(w(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        S(str, null);
    }

    public void setAnimationFromUrl(String str) {
        J61<C10624x51> Y;
        if (this.k1) {
            Y = T51.X(getContext(), str);
        } else {
            Y = T51.Y(getContext(), str, null);
        }
        setCompositionTask(Y);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f1.O0(z);
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.f1.P0(z);
    }

    public void setAsyncUpdates(EnumC3623Mf enumC3623Mf) {
        this.f1.Q0(enumC3623Mf);
    }

    public void setCacheComposition(boolean z) {
        this.k1 = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        this.f1.R0(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f1.S0(z);
    }

    public void setComposition(C10624x51 c10624x51) {
        if (ZX0.a) {
            String str = o1;
            Log.v(str, "Set Composition \n" + c10624x51);
        }
        this.f1.setCallback(this);
        this.i1 = true;
        boolean T0 = this.f1.T0(c10624x51);
        if (this.j1) {
            this.f1.D0();
        }
        this.i1 = false;
        if (getDrawable() != this.f1 || T0) {
            if (!T0) {
                U();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (C61 c61 : this.m1) {
                c61.a(c10624x51);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f1.U0(str);
    }

    public void setFailureListener(InterfaceC10871y61<Throwable> interfaceC10871y61) {
        this.d1 = interfaceC10871y61;
    }

    public void setFallbackResource(int i) {
        this.e1 = i;
    }

    public void setFontAssetDelegate(C4079Qw0 c4079Qw0) {
        this.f1.V0(c4079Qw0);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f1.W0(map);
    }

    public void setFrame(int i) {
        this.f1.X0(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f1.Y0(z);
    }

    public void setImageAssetDelegate(InterfaceC9473sM0 interfaceC9473sM0) {
        this.f1.Z0(interfaceC9473sM0);
    }

    public void setImageAssetsFolder(String str) {
        this.f1.a1(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.h1 = 0;
        this.g1 = null;
        p();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.h1 = 0;
        this.g1 = null;
        p();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.h1 = 0;
        this.g1 = null;
        p();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f1.b1(z);
    }

    public void setMaxFrame(int i) {
        this.f1.c1(i);
    }

    public void setMaxProgress(float f) {
        this.f1.e1(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f1.g1(str);
    }

    public void setMinFrame(int i) {
        this.f1.j1(i);
    }

    public void setMinProgress(float f) {
        this.f1.l1(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f1.m1(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f1.n1(z);
    }

    public void setProgress(float f) {
        Y(f, true);
    }

    public void setRenderMode(EnumC10223vR1 enumC10223vR1) {
        this.f1.p1(enumC10223vR1);
    }

    public void setRepeatCount(int i) {
        this.l1.add(c.SET_REPEAT_COUNT);
        this.f1.q1(i);
    }

    public void setRepeatMode(int i) {
        this.l1.add(c.SET_REPEAT_MODE);
        this.f1.r1(i);
    }

    public void setSafeMode(boolean z) {
        this.f1.s1(z);
    }

    public void setSpeed(float f) {
        this.f1.t1(f);
    }

    public void setTextDelegate(C9816tm2 c9816tm2) {
        this.f1.v1(c9816tm2);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f1.w1(z);
    }

    public void t(EnumC8675p61 enumC8675p61, boolean z) {
        this.f1.K(enumC8675p61, z);
    }

    public void u(boolean z) {
        this.f1.K(EnumC8675p61.MergePathsApi19, z);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C8431o61 c8431o61;
        if (!this.i1 && drawable == (c8431o61 = this.f1) && c8431o61.s0()) {
            E();
        } else if (!this.i1 && (drawable instanceof C8431o61)) {
            C8431o61 c8431o612 = (C8431o61) drawable;
            if (c8431o612.s0()) {
                c8431o612.C0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public final J61<C10624x51> v(final String str) {
        if (isInEditMode()) {
            return new J61<>(new Callable() { // from class: o.u51
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.a(LottieAnimationView.this, str);
                }
            }, true);
        }
        if (this.k1) {
            return T51.y(getContext(), str);
        }
        return T51.z(getContext(), str, null);
    }

    public final J61<C10624x51> w(final int i) {
        if (isInEditMode()) {
            return new J61<>(new Callable() { // from class: o.w51
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.d(LottieAnimationView.this, i);
                }
            }, true);
        }
        if (this.k1) {
            return T51.T(getContext(), i);
        }
        return T51.U(getContext(), i, null);
    }

    public boolean x() {
        return this.f1.p0();
    }

    public boolean y() {
        return this.f1.q0();
    }

    public final void z(AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.c.a, i, 0);
        this.k1 = obtainStyledAttributes.getBoolean(a.c.f, true);
        int i2 = a.c.r;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = a.c.m;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = a.c.w;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(a.c.l, 0));
        if (obtainStyledAttributes.getBoolean(a.c.e, false)) {
            this.j1 = true;
        }
        if (obtainStyledAttributes.getBoolean(a.c.p, false)) {
            this.f1.q1(-1);
        }
        int i5 = a.c.u;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = a.c.t;
        if (obtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = a.c.v;
        if (obtainStyledAttributes.hasValue(i7)) {
            setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
        }
        int i8 = a.c.h;
        if (obtainStyledAttributes.hasValue(i8)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i8, true));
        }
        int i9 = a.c.g;
        if (obtainStyledAttributes.hasValue(i9)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(i9, false));
        }
        int i10 = a.c.j;
        if (obtainStyledAttributes.hasValue(i10)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(i10));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(a.c.f68o));
        int i11 = a.c.q;
        Y(obtainStyledAttributes.getFloat(i11, 0.0f), obtainStyledAttributes.hasValue(i11));
        u(obtainStyledAttributes.getBoolean(a.c.k, false));
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(a.c.b, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(a.c.c, true));
        int i12 = a.c.i;
        if (obtainStyledAttributes.hasValue(i12)) {
            m(new AX0("**"), D61.N, new O61(new L72(C3220Ic.a(getContext(), obtainStyledAttributes.getResourceId(i12, -1)).getDefaultColor())));
        }
        int i13 = a.c.s;
        if (obtainStyledAttributes.hasValue(i13)) {
            EnumC10223vR1 enumC10223vR1 = EnumC10223vR1.AUTOMATIC;
            int i14 = obtainStyledAttributes.getInt(i13, enumC10223vR1.ordinal());
            if (i14 >= EnumC10223vR1.values().length) {
                i14 = enumC10223vR1.ordinal();
            }
            setRenderMode(EnumC10223vR1.values()[i14]);
        }
        int i15 = a.c.d;
        if (obtainStyledAttributes.hasValue(i15)) {
            EnumC3623Mf enumC3623Mf = EnumC3623Mf.AUTOMATIC;
            int i16 = obtainStyledAttributes.getInt(i15, enumC3623Mf.ordinal());
            if (i16 >= EnumC10223vR1.values().length) {
                i16 = enumC3623Mf.ordinal();
            }
            setAsyncUpdates(EnumC3623Mf.values()[i16]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(a.c.n, false));
        int i17 = a.c.x;
        if (obtainStyledAttributes.hasValue(i17)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(i17, false));
        }
        obtainStyledAttributes.recycle();
    }

    public void setMaxFrame(String str) {
        this.f1.d1(str);
    }

    public void setMinFrame(String str) {
        this.f1.k1(str);
    }

    public void setAnimation(String str) {
        this.g1 = str;
        this.h1 = 0;
        setCompositionTask(v(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b1 = new e(this);
        this.c1 = new d(this);
        this.e1 = 0;
        this.f1 = new C8431o61();
        this.i1 = false;
        this.j1 = false;
        this.k1 = true;
        this.l1 = new HashSet();
        this.m1 = new HashSet();
        z(attributeSet, a.C0058a.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b1 = new e(this);
        this.c1 = new d(this);
        this.e1 = 0;
        this.f1 = new C8431o61();
        this.i1 = false;
        this.j1 = false;
        this.k1 = true;
        this.l1 = new HashSet();
        this.m1 = new HashSet();
        z(attributeSet, i);
    }
}
