package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.g;
import com.google.android.exoplayer2.ui.i;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import o.AD1;
import o.AbstractC5317bO0;
import o.AbstractC7373jp2;
import o.C10201vM;
import o.C3773Nr2;
import o.C8274nS;
import o.C9542sf;
import o.ES1;
import o.H6;
import o.HD1;
import o.HS1;
import o.InterfaceC11300zs1;
import o.InterfaceC7929m7;
import o.InterfaceC8317ne0;
import o.InterfaceC8800pd0;
import o.JF;
import o.PG2;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public class k extends FrameLayout implements InterfaceC7929m7 {
    public static final int B1 = 0;
    public static final int C1 = 1;
    public static final int D1 = 2;
    public static final int E1 = 0;
    public static final int F1 = 1;
    public static final int G1 = 2;
    public static final int H1 = 0;
    public static final int I1 = 1;
    public static final int J1 = 2;
    public static final int K1 = 3;
    public static final int L1 = 4;
    public boolean A1;
    public final b Y0;
    @InterfaceC11300zs1
    public final AspectRatioFrameLayout Z0;
    @InterfaceC11300zs1
    public final View a1;
    @InterfaceC11300zs1
    public final View b1;
    public final boolean c1;
    @InterfaceC11300zs1
    public final ImageView d1;
    @InterfaceC11300zs1
    public final SubtitleView e1;
    @InterfaceC11300zs1
    public final View f1;
    @InterfaceC11300zs1
    public final TextView g1;
    @InterfaceC11300zs1
    public final i h1;
    @InterfaceC11300zs1
    public final FrameLayout i1;
    @InterfaceC11300zs1
    public final FrameLayout j1;
    @InterfaceC11300zs1
    public HD1 k1;
    public boolean l1;
    @InterfaceC11300zs1
    public c m1;
    @InterfaceC11300zs1
    public i.m n1;
    @InterfaceC11300zs1
    public d o1;
    public int p1;
    @InterfaceC11300zs1
    public Drawable q1;
    public int r1;
    public boolean s1;
    @InterfaceC11300zs1
    public InterfaceC8317ne0<? super AD1> t1;
    @InterfaceC11300zs1
    public CharSequence u1;
    public int v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public int z1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* loaded from: classes2.dex */
    public final class b implements HD1.g, View.OnLayoutChangeListener, View.OnClickListener, i.m, i.d {
        public final AbstractC7373jp2.b X = new AbstractC7373jp2.b();
        @InterfaceC11300zs1
        public Object Y;

        public b() {
        }

        @Override // o.HD1.g
        public void G(C8274nS c8274nS) {
            if (k.this.e1 != null) {
                k.this.e1.setCues(c8274nS.X);
            }
        }

        @Override // o.HD1.g
        public void M(C3773Nr2 c3773Nr2) {
            AbstractC7373jp2 abstractC7373jp2;
            HD1 hd1 = (HD1) C9542sf.g(k.this.k1);
            if (hd1.T0(17)) {
                abstractC7373jp2 = hd1.e1();
            } else {
                abstractC7373jp2 = AbstractC7373jp2.X;
            }
            if (abstractC7373jp2.x()) {
                this.Y = null;
            } else if (hd1.T0(30) && !hd1.L0().d()) {
                this.Y = abstractC7373jp2.l(hd1.C1(), this.X, true).Y;
            } else {
                Object obj = this.Y;
                if (obj != null) {
                    int g = abstractC7373jp2.g(obj);
                    if (g != -1) {
                        if (hd1.c2() == abstractC7373jp2.k(g, this.X).Z) {
                            return;
                        }
                    }
                    this.Y = null;
                }
            }
            k.this.S(false);
        }

        @Override // o.HD1.g
        public void O(int i) {
            k.this.O();
            k.this.R();
            k.this.Q();
        }

        @Override // o.HD1.g
        public void R(HD1.k kVar, HD1.k kVar2, int i) {
            if (k.this.z() && k.this.x1) {
                k.this.w();
            }
        }

        @Override // o.HD1.g
        public void Z() {
            if (k.this.a1 != null) {
                k.this.a1.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.i.d
        public void d0(boolean z) {
            if (k.this.o1 != null) {
                k.this.o1.a(z);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.M();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            k.q((TextureView) view, k.this.z1);
        }

        @Override // o.HD1.g
        public void t(PG2 pg2) {
            if (!pg2.equals(PG2.d1) && k.this.k1 != null && k.this.k1.X() != 1) {
                k.this.N();
            }
        }

        @Override // o.HD1.g
        public void w0(boolean z, int i) {
            k.this.O();
            k.this.Q();
        }

        @Override // com.google.android.exoplayer2.ui.i.m
        public void y(int i) {
            k.this.P();
            if (k.this.m1 != null) {
                k.this.m1.a(i);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(int i);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(boolean z);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface e {
    }

    public k(Context context) {
        this(context, null);
    }

    private void A(boolean z) {
        boolean z2;
        if ((!z() || !this.x1) && U()) {
            if (this.h1.c0() && this.h1.getShowTimeoutMs() <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean I = I();
            if (z || z2 || I) {
                K(I);
            }
        }
    }

    @HS1({"artworkView"})
    private boolean F(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.p1 == 2) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                B(this.Z0, f);
                this.d1.setScaleType(scaleType);
                this.d1.setImageDrawable(drawable);
                this.d1.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void H(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    private boolean I() {
        HD1 hd1 = this.k1;
        if (hd1 == null) {
            return true;
        }
        int X = hd1.X();
        if (this.w1) {
            if (!this.k1.T0(17) || !this.k1.e1().x()) {
                if (X == 1 || X == 4 || !((HD1) C9542sf.g(this.k1)).u1()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private void K(boolean z) {
        int i;
        if (!U()) {
            return;
        }
        i iVar = this.h1;
        if (z) {
            i = 0;
        } else {
            i = this.v1;
        }
        iVar.setShowTimeoutMs(i);
        this.h1.o0();
    }

    public static void L(HD1 hd1, @InterfaceC11300zs1 k kVar, @InterfaceC11300zs1 k kVar2) {
        if (kVar != kVar2) {
            if (kVar2 != null) {
                kVar2.setPlayer(hd1);
            }
            if (kVar != null) {
                kVar.setPlayer(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (U() && this.k1 != null) {
            if (!this.h1.c0()) {
                A(true);
            } else if (this.y1) {
                this.h1.X();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        PG2 pg2;
        float f;
        HD1 hd1 = this.k1;
        if (hd1 != null) {
            pg2 = hd1.B();
        } else {
            pg2 = PG2.d1;
        }
        int i = pg2.X;
        int i2 = pg2.Y;
        int i3 = pg2.Z;
        float f2 = 0.0f;
        if (i2 != 0 && i != 0) {
            f = (i * pg2.Y0) / i2;
        } else {
            f = 0.0f;
        }
        View view = this.b1;
        if (view instanceof TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.z1 != 0) {
                view.removeOnLayoutChangeListener(this.Y0);
            }
            this.z1 = i3;
            if (i3 != 0) {
                this.b1.addOnLayoutChangeListener(this.Y0);
            }
            q((TextureView) this.b1, this.z1);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.Z0;
        if (!this.c1) {
            f2 = f;
        }
        B(aspectRatioFrameLayout, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r4.k1.u1() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O() {
        boolean z;
        if (this.f1 != null) {
            HD1 hd1 = this.k1;
            int i = 0;
            if (hd1 != null && hd1.X() == 2) {
                int i2 = this.r1;
                z = true;
                if (i2 != 2) {
                    if (i2 == 1) {
                    }
                }
                View view = this.f1;
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
            }
            z = false;
            View view2 = this.f1;
            if (!z) {
            }
            view2.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        i iVar = this.h1;
        String str = null;
        if (iVar != null && this.l1) {
            if (iVar.c0()) {
                if (this.y1) {
                    str = getResources().getString(g.k.g);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(g.k.u));
            return;
        }
        setContentDescription(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (z() && this.x1) {
            w();
        } else {
            A(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        AD1 ad1;
        InterfaceC8317ne0<? super AD1> interfaceC8317ne0;
        TextView textView = this.g1;
        if (textView != null) {
            CharSequence charSequence = this.u1;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.g1.setVisibility(0);
                return;
            }
            HD1 hd1 = this.k1;
            if (hd1 != null) {
                ad1 = hd1.c();
            } else {
                ad1 = null;
            }
            if (ad1 != null && (interfaceC8317ne0 = this.t1) != null) {
                this.g1.setText((CharSequence) interfaceC8317ne0.a(ad1).second);
                this.g1.setVisibility(0);
                return;
            }
            this.g1.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(boolean z) {
        HD1 hd1 = this.k1;
        if (hd1 != null && hd1.T0(30) && !hd1.L0().d()) {
            if (z && !this.s1) {
                r();
            }
            if (hd1.L0().f(2)) {
                v();
                return;
            }
            r();
            if (!T() || (!E(hd1) && !F(this.q1))) {
                v();
            }
        } else if (!this.s1) {
            v();
            r();
        }
    }

    @InterfaceC8800pd0(expression = {"artworkView"}, result = true)
    private boolean T() {
        if (this.p1 != 0) {
            C9542sf.k(this.d1);
            return true;
        }
        return false;
    }

    @InterfaceC8800pd0(expression = {"controller"}, result = true)
    private boolean U() {
        if (this.l1) {
            C9542sf.k(this.h1);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    private void r() {
        View view = this.a1;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void s(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(TD2.j0(context, resources, g.e.f169o));
        imageView.setBackgroundColor(resources.getColor(g.c.f));
    }

    @ES1(23)
    private static void t(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(TD2.j0(context, resources, g.e.f169o));
        imageView.setBackgroundColor(resources.getColor(g.c.f, null));
    }

    private void v() {
        ImageView imageView = this.d1;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.d1.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean y(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        HD1 hd1 = this.k1;
        if (hd1 != null && hd1.T0(16) && this.k1.O() && this.k1.u1()) {
            return true;
        }
        return false;
    }

    public void B(@InterfaceC11300zs1 AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public void C() {
        View view = this.b1;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void D() {
        View view = this.b1;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @HS1({"artworkView"})
    public final boolean E(HD1 hd1) {
        byte[] bArr;
        if (!hd1.T0(18) || (bArr = hd1.s2().e1) == null) {
            return false;
        }
        return F(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public void G(@InterfaceC11300zs1 long[] jArr, @InterfaceC11300zs1 boolean[] zArr) {
        C9542sf.k(this.h1);
        this.h1.m0(jArr, zArr);
    }

    public void J() {
        K(I());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        HD1 hd1 = this.k1;
        if (hd1 != null && hd1.T0(16) && this.k1.O()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean y = y(keyEvent.getKeyCode());
        if (y && U() && !this.h1.c0()) {
            A(true);
            return true;
        } else if (!u(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (y && U()) {
                A(true);
            }
            return false;
        } else {
            A(true);
            return true;
        }
    }

    @Override // o.InterfaceC7929m7
    public List<H6> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.j1;
        if (frameLayout != null) {
            arrayList.add(new H6(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        i iVar = this.h1;
        if (iVar != null) {
            arrayList.add(new H6(iVar, 1));
        }
        return AbstractC5317bO0.F(arrayList);
    }

    @Override // o.InterfaceC7929m7
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C9542sf.l(this.i1, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.p1;
    }

    public boolean getControllerAutoShow() {
        return this.w1;
    }

    public boolean getControllerHideOnTouch() {
        return this.y1;
    }

    public int getControllerShowTimeoutMs() {
        return this.v1;
    }

    @InterfaceC11300zs1
    public Drawable getDefaultArtwork() {
        return this.q1;
    }

    @InterfaceC11300zs1
    public FrameLayout getOverlayFrameLayout() {
        return this.j1;
    }

    @InterfaceC11300zs1
    public HD1 getPlayer() {
        return this.k1;
    }

    public int getResizeMode() {
        C9542sf.k(this.Z0);
        return this.Z0.getResizeMode();
    }

    @InterfaceC11300zs1
    public SubtitleView getSubtitleView() {
        return this.e1;
    }

    @Deprecated
    public boolean getUseArtwork() {
        if (this.p1 != 0) {
            return true;
        }
        return false;
    }

    public boolean getUseController() {
        return this.l1;
    }

    @InterfaceC11300zs1
    public View getVideoSurfaceView() {
        return this.b1;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (U() && this.k1 != null) {
            A(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        M();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        boolean z;
        if (i != 0 && this.d1 == null) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.i(z);
        if (this.p1 != i) {
            this.p1 = i;
            S(false);
        }
    }

    public void setAspectRatioListener(@InterfaceC11300zs1 AspectRatioFrameLayout.b bVar) {
        C9542sf.k(this.Z0);
        this.Z0.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.w1 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.x1 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C9542sf.k(this.h1);
        this.y1 = z;
        P();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@InterfaceC11300zs1 i.d dVar) {
        C9542sf.k(this.h1);
        this.o1 = null;
        this.h1.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        C9542sf.k(this.h1);
        this.v1 = i;
        if (this.h1.c0()) {
            J();
        }
    }

    public void setControllerVisibilityListener(@InterfaceC11300zs1 c cVar) {
        this.m1 = cVar;
        if (cVar != null) {
            setControllerVisibilityListener((i.m) null);
        }
    }

    public void setCustomErrorMessage(@InterfaceC11300zs1 CharSequence charSequence) {
        boolean z;
        if (this.g1 != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.u1 = charSequence;
        R();
    }

    public void setDefaultArtwork(@InterfaceC11300zs1 Drawable drawable) {
        if (this.q1 != drawable) {
            this.q1 = drawable;
            S(false);
        }
    }

    public void setErrorMessageProvider(@InterfaceC11300zs1 InterfaceC8317ne0<? super AD1> interfaceC8317ne0) {
        if (this.t1 != interfaceC8317ne0) {
            this.t1 = interfaceC8317ne0;
            R();
        }
    }

    public void setFullscreenButtonClickListener(@InterfaceC11300zs1 d dVar) {
        C9542sf.k(this.h1);
        this.o1 = dVar;
        this.h1.setOnFullScreenModeChangedListener(this.Y0);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.s1 != z) {
            this.s1 = z;
            S(false);
        }
    }

    public void setPlayer(@InterfaceC11300zs1 HD1 hd1) {
        boolean z;
        boolean z2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (hd1 != null && hd1.h1() != Looper.getMainLooper()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9542sf.a(z2);
        HD1 hd12 = this.k1;
        if (hd12 == hd1) {
            return;
        }
        if (hd12 != null) {
            hd12.f1(this.Y0);
            if (hd12.T0(27)) {
                View view = this.b1;
                if (view instanceof TextureView) {
                    hd12.A((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    hd12.G((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.e1;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.k1 = hd1;
        if (U()) {
            this.h1.setPlayer(hd1);
        }
        O();
        R();
        S(true);
        if (hd1 != null) {
            if (hd1.T0(27)) {
                View view2 = this.b1;
                if (view2 instanceof TextureView) {
                    hd1.w((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    hd1.o((SurfaceView) view2);
                }
                if (!hd1.T0(30) || hd1.L0().g(2)) {
                    N();
                }
            }
            if (this.e1 != null && hd1.T0(28)) {
                this.e1.setCues(hd1.s().X);
            }
            hd1.l1(this.Y0);
            A(false);
            return;
        }
        w();
    }

    public void setRepeatToggleModes(int i) {
        C9542sf.k(this.h1);
        this.h1.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C9542sf.k(this.Z0);
        this.Z0.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.r1 != i) {
            this.r1 = i;
            O();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C9542sf.k(this.h1);
        this.h1.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C9542sf.k(this.h1);
        this.h1.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C9542sf.k(this.h1);
        this.h1.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C9542sf.k(this.h1);
        this.h1.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C9542sf.k(this.h1);
        this.h1.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C9542sf.k(this.h1);
        this.h1.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        C9542sf.k(this.h1);
        this.h1.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        C9542sf.k(this.h1);
        this.h1.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(@JF int i) {
        View view = this.a1;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z && this.h1 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9542sf.i(z2);
        if (!z && !hasOnClickListeners()) {
            z3 = false;
        }
        setClickable(z3);
        if (this.l1 == z) {
            return;
        }
        this.l1 = z;
        if (U()) {
            this.h1.setPlayer(this.k1);
        } else {
            i iVar = this.h1;
            if (iVar != null) {
                iVar.X();
                this.h1.setPlayer(null);
            }
        }
        P();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.b1;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public boolean u(KeyEvent keyEvent) {
        if (U() && this.h1.T(keyEvent)) {
            return true;
        }
        return false;
    }

    public void w() {
        i iVar = this.h1;
        if (iVar != null) {
            iVar.X();
        }
    }

    public boolean x() {
        i iVar = this.h1;
        if (iVar != null && iVar.c0()) {
            return true;
        }
        return false;
    }

    public k(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        int i9;
        b bVar = new b();
        this.Y0 = bVar;
        if (isInEditMode()) {
            this.Z0 = null;
            this.a1 = null;
            this.b1 = null;
            this.c1 = false;
            this.d1 = null;
            this.e1 = null;
            this.f1 = null;
            this.g1 = null;
            this.h1 = null;
            this.i1 = null;
            this.j1 = null;
            ImageView imageView = new ImageView(context);
            if (TD2.a >= 23) {
                t(context, getResources(), imageView);
            } else {
                s(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i10 = g.i.h;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g.m.b2, i, 0);
            try {
                int i11 = g.m.E2;
                boolean hasValue = obtainStyledAttributes.hasValue(i11);
                int color = obtainStyledAttributes.getColor(i11, 0);
                int resourceId = obtainStyledAttributes.getResourceId(g.m.r2, i10);
                boolean z8 = obtainStyledAttributes.getBoolean(g.m.J2, true);
                int i12 = obtainStyledAttributes.getInt(g.m.f2, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(g.m.l2, 0);
                boolean z9 = obtainStyledAttributes.getBoolean(g.m.K2, true);
                int i13 = obtainStyledAttributes.getInt(g.m.F2, 1);
                int i14 = obtainStyledAttributes.getInt(g.m.t2, 0);
                int i15 = obtainStyledAttributes.getInt(g.m.C2, 5000);
                z2 = obtainStyledAttributes.getBoolean(g.m.n2, true);
                boolean z10 = obtainStyledAttributes.getBoolean(g.m.g2, true);
                int integer = obtainStyledAttributes.getInteger(g.m.z2, 0);
                this.s1 = obtainStyledAttributes.getBoolean(g.m.o2, this.s1);
                boolean z11 = obtainStyledAttributes.getBoolean(g.m.m2, true);
                obtainStyledAttributes.recycle();
                z = z10;
                i4 = integer;
                z6 = hasValue;
                i6 = resourceId2;
                z4 = z8;
                i7 = color;
                i5 = i14;
                z3 = z11;
                i10 = resourceId;
                i2 = i15;
                i3 = i13;
                z5 = z9;
                i8 = i12;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            z2 = true;
            z3 = true;
            i3 = 1;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            z4 = true;
            i8 = 1;
            z5 = true;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(g.C0102g.e0);
        this.Z0 = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            H(aspectRatioFrameLayout, i5);
        }
        View findViewById = findViewById(g.C0102g.L0);
        this.a1 = findViewById;
        if (findViewById != null && z6) {
            findViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.b1 = new TextureView(context);
            } else if (i3 == 3) {
                try {
                    this.b1 = (View) Class.forName("o.Na2").getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.b1.setLayoutParams(layoutParams);
                    this.b1.setOnClickListener(bVar);
                    this.b1.setClickable(false);
                    aspectRatioFrameLayout.addView(this.b1, 0);
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else if (i3 != 4) {
                this.b1 = new SurfaceView(context);
            } else {
                try {
                    this.b1 = (View) Class.forName("o.AF2").getConstructor(Context.class).newInstance(context);
                } catch (Exception e3) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                }
            }
            z7 = false;
            this.b1.setLayoutParams(layoutParams);
            this.b1.setOnClickListener(bVar);
            this.b1.setClickable(false);
            aspectRatioFrameLayout.addView(this.b1, 0);
        } else {
            this.b1 = null;
            z7 = false;
        }
        this.c1 = z7;
        this.i1 = (FrameLayout) findViewById(g.C0102g.W);
        this.j1 = (FrameLayout) findViewById(g.C0102g.w0);
        ImageView imageView2 = (ImageView) findViewById(g.C0102g.X);
        this.d1 = imageView2;
        this.p1 = (!z4 || i8 == 0 || imageView2 == null) ? 0 : 0;
        if (i6 != 0) {
            this.q1 = C10201vM.l(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(g.C0102g.O0);
        this.e1 = subtitleView;
        if (subtitleView != null) {
            subtitleView.e();
            subtitleView.f();
        }
        View findViewById2 = findViewById(g.C0102g.b0);
        this.f1 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.r1 = i4;
        TextView textView = (TextView) findViewById(g.C0102g.j0);
        this.g1 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i16 = g.C0102g.f0;
        i iVar = (i) findViewById(i16);
        View findViewById3 = findViewById(g.C0102g.g0);
        if (iVar != null) {
            this.h1 = iVar;
            i9 = 0;
        } else if (findViewById3 != null) {
            i9 = 0;
            i iVar2 = new i(context, null, 0, attributeSet);
            this.h1 = iVar2;
            iVar2.setId(i16);
            iVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(iVar2, indexOfChild);
        } else {
            i9 = 0;
            this.h1 = null;
        }
        i iVar3 = this.h1;
        this.v1 = iVar3 != null ? i2 : i9;
        this.y1 = z2;
        this.w1 = z;
        this.x1 = z3;
        this.l1 = (!z5 || iVar3 == null) ? i9 : 1;
        if (iVar3 != null) {
            iVar3.Y();
            this.h1.R(bVar);
        }
        if (z5) {
            setClickable(true);
        }
        P();
    }

    @Deprecated
    public void setControllerVisibilityListener(@InterfaceC11300zs1 i.m mVar) {
        C9542sf.k(this.h1);
        i.m mVar2 = this.n1;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.h1.j0(mVar2);
        }
        this.n1 = mVar;
        if (mVar != null) {
            this.h1.R(mVar);
            setControllerVisibilityListener((c) null);
        }
    }
}
