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
import com.google.android.exoplayer2.ui.e;
import com.google.android.exoplayer2.ui.g;
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
import o.C11005yf1;
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
import o.PG2;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public class PlayerView extends FrameLayout implements InterfaceC7929m7 {
    public static final int A1 = 1;
    public static final int B1 = 2;
    public static final int C1 = 0;
    public static final int D1 = 1;
    public static final int E1 = 2;
    public static final int F1 = 3;
    public static final int G1 = 4;
    public static final int z1 = 0;
    public final a Y0;
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
    public final e h1;
    @InterfaceC11300zs1
    public final FrameLayout i1;
    @InterfaceC11300zs1
    public final FrameLayout j1;
    @InterfaceC11300zs1
    public HD1 k1;
    public boolean l1;
    @InterfaceC11300zs1
    public e.InterfaceC0100e m1;
    public boolean n1;
    @InterfaceC11300zs1
    public Drawable o1;
    public int p1;
    public boolean q1;
    @InterfaceC11300zs1
    public InterfaceC8317ne0<? super AD1> r1;
    @InterfaceC11300zs1
    public CharSequence s1;
    public int t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public int x1;
    public boolean y1;

    /* loaded from: classes2.dex */
    public final class a implements HD1.g, View.OnLayoutChangeListener, View.OnClickListener, e.InterfaceC0100e {
        public final AbstractC7373jp2.b X = new AbstractC7373jp2.b();
        @InterfaceC11300zs1
        public Object Y;

        public a() {
        }

        @Override // o.HD1.g
        public void G(C8274nS c8274nS) {
            if (PlayerView.this.e1 != null) {
                PlayerView.this.e1.setCues(c8274nS.X);
            }
        }

        @Override // o.HD1.g
        public void M(C3773Nr2 c3773Nr2) {
            HD1 hd1 = (HD1) C9542sf.g(PlayerView.this.k1);
            AbstractC7373jp2 e1 = hd1.e1();
            if (e1.x()) {
                this.Y = null;
            } else if (!hd1.L0().d()) {
                this.Y = e1.l(hd1.C1(), this.X, true).Y;
            } else {
                Object obj = this.Y;
                if (obj != null) {
                    int g = e1.g(obj);
                    if (g != -1) {
                        if (hd1.c2() == e1.k(g, this.X).Z) {
                            return;
                        }
                    }
                    this.Y = null;
                }
            }
            PlayerView.this.Q(false);
        }

        @Override // o.HD1.g
        public void O(int i) {
            PlayerView.this.M();
            PlayerView.this.P();
            PlayerView.this.O();
        }

        @Override // o.HD1.g
        public void R(HD1.k kVar, HD1.k kVar2, int i) {
            if (PlayerView.this.x() && PlayerView.this.v1) {
                PlayerView.this.u();
            }
        }

        @Override // o.HD1.g
        public void Z() {
            if (PlayerView.this.a1 != null) {
                PlayerView.this.a1.setVisibility(4);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.K();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.o((TextureView) view, PlayerView.this.x1);
        }

        @Override // o.HD1.g
        public void t(PG2 pg2) {
            PlayerView.this.L();
        }

        @Override // o.HD1.g
        public void w0(boolean z, int i) {
            PlayerView.this.M();
            PlayerView.this.O();
        }

        @Override // com.google.android.exoplayer2.ui.e.InterfaceC0100e
        public void y(int i) {
            PlayerView.this.N();
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    public static void F(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public static void J(HD1 hd1, @InterfaceC11300zs1 PlayerView playerView, @InterfaceC11300zs1 PlayerView playerView2) {
        if (playerView != playerView2) {
            if (playerView2 != null) {
                playerView2.setPlayer(hd1);
            }
            if (playerView != null) {
                playerView.setPlayer(null);
            }
        }
    }

    public static void o(TextureView textureView, int i) {
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

    public static void q(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(TD2.j0(context, resources, g.e.f169o));
        imageView.setBackgroundColor(resources.getColor(g.c.f));
    }

    @ES1(23)
    public static void r(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(TD2.j0(context, resources, g.e.f169o));
        imageView.setBackgroundColor(resources.getColor(g.c.f, null));
    }

    public void A() {
        View view = this.b1;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void B() {
        View view = this.b1;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @HS1({"artworkView"})
    public final boolean C(C11005yf1 c11005yf1) {
        byte[] bArr = c11005yf1.e1;
        if (bArr == null) {
            return false;
        }
        return D(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    @HS1({"artworkView"})
    public final boolean D(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                z(this.Z0, intrinsicWidth / intrinsicHeight);
                this.d1.setImageDrawable(drawable);
                this.d1.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public void E(@InterfaceC11300zs1 long[] jArr, @InterfaceC11300zs1 boolean[] zArr) {
        C9542sf.k(this.h1);
        this.h1.J(jArr, zArr);
    }

    public final boolean G() {
        HD1 hd1 = this.k1;
        if (hd1 == null) {
            return true;
        }
        int X = hd1.X();
        if (this.u1) {
            if (X == 1 || X == 4 || !this.k1.u1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void H() {
        I(G());
    }

    public final void I(boolean z) {
        int i;
        if (!S()) {
            return;
        }
        e eVar = this.h1;
        if (z) {
            i = 0;
        } else {
            i = this.t1;
        }
        eVar.setShowTimeoutMs(i);
        this.h1.K();
    }

    public final void K() {
        if (S() && this.k1 != null) {
            if (!this.h1.D()) {
                y(true);
            } else if (this.w1) {
                this.h1.A();
            }
        }
    }

    public final void L() {
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
            if (this.x1 != 0) {
                view.removeOnLayoutChangeListener(this.Y0);
            }
            this.x1 = i3;
            if (i3 != 0) {
                this.b1.addOnLayoutChangeListener(this.Y0);
            }
            o((TextureView) this.b1, this.x1);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.Z0;
        if (!this.c1) {
            f2 = f;
        }
        z(aspectRatioFrameLayout, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r4.k1.u1() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        boolean z;
        if (this.f1 != null) {
            HD1 hd1 = this.k1;
            int i = 0;
            if (hd1 != null && hd1.X() == 2) {
                int i2 = this.p1;
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

    public final void N() {
        e eVar = this.h1;
        String str = null;
        if (eVar != null && this.l1) {
            if (eVar.getVisibility() == 0) {
                if (this.w1) {
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

    public final void O() {
        if (x() && this.v1) {
            u();
        } else {
            y(false);
        }
    }

    public final void P() {
        AD1 ad1;
        InterfaceC8317ne0<? super AD1> interfaceC8317ne0;
        TextView textView = this.g1;
        if (textView != null) {
            CharSequence charSequence = this.s1;
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
            if (ad1 != null && (interfaceC8317ne0 = this.r1) != null) {
                this.g1.setText((CharSequence) interfaceC8317ne0.a(ad1).second);
                this.g1.setVisibility(0);
                return;
            }
            this.g1.setVisibility(8);
        }
    }

    public final void Q(boolean z) {
        HD1 hd1 = this.k1;
        if (hd1 != null && hd1.T0(30) && !hd1.L0().d()) {
            if (z && !this.q1) {
                p();
            }
            if (hd1.L0().f(2)) {
                t();
                return;
            }
            p();
            if (!R() || (!C(hd1.s2()) && !D(this.o1))) {
                t();
            }
        } else if (!this.q1) {
            t();
            p();
        }
    }

    @InterfaceC8800pd0(expression = {"artworkView"}, result = true)
    public final boolean R() {
        if (this.n1) {
            C9542sf.k(this.d1);
            return true;
        }
        return false;
    }

    @InterfaceC8800pd0(expression = {"controller"}, result = true)
    public final boolean S() {
        if (this.l1) {
            C9542sf.k(this.h1);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        HD1 hd1 = this.k1;
        if (hd1 != null && hd1.O()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean w = w(keyEvent.getKeyCode());
        if (w && S() && !this.h1.D()) {
            y(true);
            return true;
        } else if (!s(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (w && S()) {
                y(true);
            }
            return false;
        } else {
            y(true);
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
        e eVar = this.h1;
        if (eVar != null) {
            arrayList.add(new H6(eVar, 1));
        }
        return AbstractC5317bO0.F(arrayList);
    }

    @Override // o.InterfaceC7929m7
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C9542sf.l(this.i1, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.u1;
    }

    public boolean getControllerHideOnTouch() {
        return this.w1;
    }

    public int getControllerShowTimeoutMs() {
        return this.t1;
    }

    @InterfaceC11300zs1
    public Drawable getDefaultArtwork() {
        return this.o1;
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

    public boolean getUseArtwork() {
        return this.n1;
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
        if (S() && this.k1 != null) {
            y(true);
            return true;
        }
        return false;
    }

    public final void p() {
        View view = this.a1;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        K();
        return super.performClick();
    }

    public boolean s(KeyEvent keyEvent) {
        if (S() && this.h1.y(keyEvent)) {
            return true;
        }
        return false;
    }

    public void setAspectRatioListener(@InterfaceC11300zs1 AspectRatioFrameLayout.b bVar) {
        C9542sf.k(this.Z0);
        this.Z0.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.u1 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.v1 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C9542sf.k(this.h1);
        this.w1 = z;
        N();
    }

    public void setControllerShowTimeoutMs(int i) {
        C9542sf.k(this.h1);
        this.t1 = i;
        if (this.h1.D()) {
            H();
        }
    }

    public void setControllerVisibilityListener(@InterfaceC11300zs1 e.InterfaceC0100e interfaceC0100e) {
        C9542sf.k(this.h1);
        e.InterfaceC0100e interfaceC0100e2 = this.m1;
        if (interfaceC0100e2 != interfaceC0100e) {
            if (interfaceC0100e2 != null) {
                this.h1.E(interfaceC0100e2);
            }
            this.m1 = interfaceC0100e;
            if (interfaceC0100e != null) {
                this.h1.w(interfaceC0100e);
            }
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
        this.s1 = charSequence;
        P();
    }

    public void setDefaultArtwork(@InterfaceC11300zs1 Drawable drawable) {
        if (this.o1 != drawable) {
            this.o1 = drawable;
            Q(false);
        }
    }

    public void setErrorMessageProvider(@InterfaceC11300zs1 InterfaceC8317ne0<? super AD1> interfaceC8317ne0) {
        if (this.r1 != interfaceC8317ne0) {
            this.r1 = interfaceC8317ne0;
            P();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.q1 != z) {
            this.q1 = z;
            Q(false);
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
        if (S()) {
            this.h1.setPlayer(hd1);
        }
        M();
        P();
        Q(true);
        if (hd1 != null) {
            if (hd1.T0(27)) {
                View view2 = this.b1;
                if (view2 instanceof TextureView) {
                    hd1.w((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    hd1.o((SurfaceView) view2);
                }
                L();
            }
            if (this.e1 != null && hd1.T0(28)) {
                this.e1.setCues(hd1.s().X);
            }
            hd1.l1(this.Y0);
            y(false);
            return;
        }
        u();
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
        if (this.p1 != i) {
            this.p1 = i;
            M();
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

    public void setShutterBackgroundColor(int i) {
        View view = this.a1;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        boolean z2;
        if (z && this.d1 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9542sf.i(z2);
        if (this.n1 != z) {
            this.n1 = z;
            Q(false);
        }
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
        if (S()) {
            this.h1.setPlayer(this.k1);
        } else {
            e eVar = this.h1;
            if (eVar != null) {
                eVar.A();
                this.h1.setPlayer(null);
            }
        }
        N();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.b1;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public final void t() {
        ImageView imageView = this.d1;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.d1.setVisibility(4);
        }
    }

    public void u() {
        e eVar = this.h1;
        if (eVar != null) {
            eVar.A();
        }
    }

    public boolean v() {
        e eVar = this.h1;
        if (eVar != null && eVar.D()) {
            return true;
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    public final boolean w(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public final boolean x() {
        HD1 hd1 = this.k1;
        if (hd1 != null && hd1.O() && this.k1.u1()) {
            return true;
        }
        return false;
    }

    public final void y(boolean z) {
        boolean z2;
        if ((!x() || !this.v1) && S()) {
            if (this.h1.D() && this.h1.getShowTimeoutMs() <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean G = G();
            if (z || z2 || G) {
                I(G);
            }
        }
    }

    public void z(@InterfaceC11300zs1 AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public PlayerView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        boolean z7;
        int i8;
        boolean z8;
        a aVar = new a();
        this.Y0 = aVar;
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
                r(context, getResources(), imageView);
            } else {
                q(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i9 = g.i.d;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g.m.I0, i, 0);
            try {
                int i10 = g.m.g1;
                boolean hasValue = obtainStyledAttributes.hasValue(i10);
                int color = obtainStyledAttributes.getColor(i10, 0);
                int resourceId = obtainStyledAttributes.getResourceId(g.m.V0, i9);
                boolean z9 = obtainStyledAttributes.getBoolean(g.m.l1, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(g.m.P0, 0);
                boolean z10 = obtainStyledAttributes.getBoolean(g.m.m1, true);
                int i11 = obtainStyledAttributes.getInt(g.m.h1, 1);
                int i12 = obtainStyledAttributes.getInt(g.m.X0, 0);
                int i13 = obtainStyledAttributes.getInt(g.m.f1, 5000);
                boolean z11 = obtainStyledAttributes.getBoolean(g.m.R0, true);
                boolean z12 = obtainStyledAttributes.getBoolean(g.m.L0, true);
                i4 = obtainStyledAttributes.getInteger(g.m.d1, 0);
                this.q1 = obtainStyledAttributes.getBoolean(g.m.S0, this.q1);
                boolean z13 = obtainStyledAttributes.getBoolean(g.m.Q0, true);
                obtainStyledAttributes.recycle();
                i9 = resourceId;
                i2 = i13;
                z2 = z13;
                z3 = z11;
                z = z12;
                i3 = i12;
                z6 = hasValue;
                i6 = color;
                i5 = i11;
                z5 = z10;
                i7 = resourceId2;
                z4 = z9;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            i3 = 0;
            i4 = 0;
            z2 = true;
            z3 = true;
            i5 = 1;
            i6 = 0;
            z4 = true;
            i7 = 0;
            z5 = true;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i9, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(g.C0102g.e0);
        this.Z0 = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            F(aspectRatioFrameLayout, i3);
        }
        View findViewById = findViewById(g.C0102g.L0);
        this.a1 = findViewById;
        if (findViewById != null && z6) {
            findViewById.setBackgroundColor(i6);
        }
        if (aspectRatioFrameLayout != null && i5 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i5 == 2) {
                this.b1 = new TextureView(context);
            } else if (i5 == 3) {
                try {
                    this.b1 = (View) Class.forName("o.Na2").getConstructor(Context.class).newInstance(context);
                    z8 = true;
                    this.b1.setLayoutParams(layoutParams);
                    this.b1.setOnClickListener(aVar);
                    this.b1.setClickable(false);
                    aspectRatioFrameLayout.addView(this.b1, 0);
                    z7 = z8;
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i5 != 4) {
                this.b1 = new SurfaceView(context);
            } else {
                try {
                    this.b1 = (View) Class.forName("o.AF2").getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z8 = false;
            this.b1.setLayoutParams(layoutParams);
            this.b1.setOnClickListener(aVar);
            this.b1.setClickable(false);
            aspectRatioFrameLayout.addView(this.b1, 0);
            z7 = z8;
        } else {
            this.b1 = null;
            z7 = false;
        }
        this.c1 = z7;
        this.i1 = (FrameLayout) findViewById(g.C0102g.W);
        this.j1 = (FrameLayout) findViewById(g.C0102g.w0);
        ImageView imageView2 = (ImageView) findViewById(g.C0102g.X);
        this.d1 = imageView2;
        this.n1 = z4 && imageView2 != null;
        if (i7 != 0) {
            this.o1 = C10201vM.l(getContext(), i7);
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
        this.p1 = i4;
        TextView textView = (TextView) findViewById(g.C0102g.j0);
        this.g1 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i14 = g.C0102g.f0;
        e eVar = (e) findViewById(i14);
        View findViewById3 = findViewById(g.C0102g.g0);
        if (eVar != null) {
            this.h1 = eVar;
            i8 = 0;
        } else if (findViewById3 != null) {
            i8 = 0;
            e eVar2 = new e(context, null, 0, attributeSet);
            this.h1 = eVar2;
            eVar2.setId(i14);
            eVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(eVar2, indexOfChild);
        } else {
            i8 = 0;
            this.h1 = null;
        }
        e eVar3 = this.h1;
        this.t1 = eVar3 != null ? i2 : i8;
        this.w1 = z3;
        this.u1 = z;
        this.v1 = z2;
        this.l1 = (!z5 || eVar3 == null) ? i8 : 1;
        if (eVar3 != null) {
            eVar3.A();
            this.h1.w(aVar);
        }
        if (z5) {
            setClickable(true);
        }
        N();
    }
}
