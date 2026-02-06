package o;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* renamed from: o.gu1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6665gu1 {
    public static final Matrix B = new Matrix();
    public C10874y70 A;
    public Canvas a;
    public b b;
    public c c;
    public RectF d;
    public RectF e;
    public Rect f;
    public RectF g;
    public RectF h;
    public Rect i;
    public RectF j;
    public Paint k;
    public Bitmap l;
    public Canvas m;
    public Rect n;

    /* renamed from: o  reason: collision with root package name */
    public C5353bY0 f754o;
    public Matrix p;
    public float[] q;
    public Bitmap r;
    public Bitmap s;
    public Canvas t;
    public Canvas u;
    public C5353bY0 v;
    public BlurMaskFilter w;
    public float x = 0.0f;
    public RenderNode y;
    public RenderNode z;

    /* renamed from: o.gu1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.SAVE_LAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.RENDER_NODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: o.gu1$b */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public EnumC8600oo b;
        public ColorFilter c;
        public C10874y70 d;

        public b() {
            f();
        }

        public boolean a() {
            EnumC8600oo enumC8600oo = this.b;
            if (enumC8600oo != null && enumC8600oo != EnumC8600oo.SRC_OVER) {
                return true;
            }
            return false;
        }

        public boolean b() {
            if (this.c != null) {
                return true;
            }
            return false;
        }

        public boolean c() {
            if (this.d != null) {
                return true;
            }
            return false;
        }

        public boolean d() {
            if (!e() && !a() && !c() && !b()) {
                return true;
            }
            return false;
        }

        public boolean e() {
            if (this.a < 255) {
                return true;
            }
            return false;
        }

        public void f() {
            this.a = 255;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    /* renamed from: o.gu1$c */
    /* loaded from: classes.dex */
    public enum c {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    public final Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public final RectF b(RectF rectF, C10874y70 c10874y70) {
        if (this.e == null) {
            this.e = new RectF();
        }
        if (this.g == null) {
            this.g = new RectF();
        }
        this.e.set(rectF);
        this.e.offsetTo(rectF.left + c10874y70.f(), rectF.top + c10874y70.g());
        this.e.inset(-c10874y70.h(), -c10874y70.h());
        this.g.set(rectF);
        this.e.union(this.g);
        return this.e;
    }

    public final c c(Canvas canvas, b bVar) {
        if (bVar.d()) {
            return c.DIRECT;
        }
        if (!bVar.c()) {
            return c.SAVE_LAYER;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && canvas.isHardwareAccelerated()) {
            if (i <= 31) {
                return c.BITMAP;
            }
            return c.RENDER_NODE;
        }
        return c.BITMAP;
    }

    public final void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public void e() {
        if (this.a != null && this.b != null && this.q != null && this.d != null) {
            int i = a.a[this.c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (this.y != null) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.a.save();
                                    Canvas canvas = this.a;
                                    float[] fArr = this.q;
                                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                                    this.y.endRecording();
                                    if (this.b.c()) {
                                        i(this.a, this.b.d);
                                    }
                                    this.a.drawRenderNode(this.y);
                                    this.a.restore();
                                } else {
                                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                                }
                            } else {
                                throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                            }
                        }
                    } else if (this.l != null) {
                        if (this.b.c()) {
                            h(this.a, this.b.d);
                        }
                        if (this.n == null) {
                            this.n = new Rect();
                        }
                        this.n.set(0, 0, (int) (this.d.width() * this.q[0]), (int) (this.d.height() * this.q[4]));
                        this.a.drawBitmap(this.l, this.n, this.d, this.k);
                    } else {
                        throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                    }
                } else {
                    this.a.restore();
                }
            } else {
                this.a.restore();
            }
            this.a = null;
            return;
        }
        throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
    }

    public boolean f() {
        if (this.c == c.RENDER_NODE) {
            return true;
        }
        return false;
    }

    public final boolean g(Bitmap bitmap, RectF rectF) {
        if (bitmap == null || rectF.width() >= bitmap.getWidth() || rectF.height() >= bitmap.getHeight() || rectF.width() < bitmap.getWidth() * 0.75f || rectF.height() < bitmap.getHeight() * 0.75f) {
            return true;
        }
        return false;
    }

    public final void h(Canvas canvas, C10874y70 c10874y70) {
        float f;
        C5353bY0 c5353bY0;
        RectF rectF = this.d;
        if (rectF != null && this.l != null) {
            RectF b2 = b(rectF, c10874y70);
            if (this.f == null) {
                this.f = new Rect();
            }
            this.f.set((int) Math.floor(b2.left), (int) Math.floor(b2.top), (int) Math.ceil(b2.right), (int) Math.ceil(b2.bottom));
            float[] fArr = this.q;
            float f2 = 1.0f;
            if (fArr != null) {
                f = fArr[0];
            } else {
                f = 1.0f;
            }
            if (fArr != null) {
                f2 = fArr[4];
            }
            if (this.h == null) {
                this.h = new RectF();
            }
            this.h.set(b2.left * f, b2.top * f2, b2.right * f, b2.bottom * f2);
            if (this.i == null) {
                this.i = new Rect();
            }
            this.i.set(0, 0, Math.round(this.h.width()), Math.round(this.h.height()));
            if (g(this.r, this.h)) {
                Bitmap bitmap = this.r;
                if (bitmap != null) {
                    d(bitmap);
                }
                Bitmap bitmap2 = this.s;
                if (bitmap2 != null) {
                    d(bitmap2);
                }
                this.r = a(this.h, Bitmap.Config.ARGB_8888);
                this.s = a(this.h, Bitmap.Config.ALPHA_8);
                this.t = new Canvas(this.r);
                this.u = new Canvas(this.s);
            } else {
                Canvas canvas2 = this.t;
                if (canvas2 != null && this.u != null && (c5353bY0 = this.f754o) != null) {
                    canvas2.drawRect(this.i, c5353bY0);
                    this.u.drawRect(this.i, this.f754o);
                } else {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                }
            }
            if (this.s != null) {
                if (this.v == null) {
                    this.v = new C5353bY0(1);
                }
                RectF rectF2 = this.d;
                this.u.drawBitmap(this.l, Math.round((rectF2.left - b2.left) * f), Math.round((rectF2.top - b2.top) * f2), (Paint) null);
                if (this.w == null || this.x != c10874y70.h()) {
                    float h = (c10874y70.h() * (f + f2)) / 2.0f;
                    if (h > 0.0f) {
                        this.w = new BlurMaskFilter(h, BlurMaskFilter.Blur.NORMAL);
                    } else {
                        this.w = null;
                    }
                    this.x = c10874y70.h();
                }
                this.v.setColor(c10874y70.e());
                if (c10874y70.h() > 0.0f) {
                    this.v.setMaskFilter(this.w);
                } else {
                    this.v.setMaskFilter(null);
                }
                this.v.setFilterBitmap(true);
                this.t.drawBitmap(this.s, Math.round(c10874y70.f() * f), Math.round(c10874y70.g() * f2), this.v);
                canvas.drawBitmap(this.r, this.i, this.f, this.k);
                return;
            }
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
    }

    public final void i(Canvas canvas, C10874y70 c10874y70) {
        float f;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.y != null && this.z != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                float[] fArr = this.q;
                float f2 = 1.0f;
                if (fArr != null) {
                    f = fArr[0];
                } else {
                    f = 1.0f;
                }
                if (fArr != null) {
                    f2 = fArr[4];
                }
                C10874y70 c10874y702 = this.A;
                if (c10874y702 == null || !c10874y70.j(c10874y702)) {
                    createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c10874y70.e(), PorterDuff.Mode.SRC_IN));
                    if (c10874y70.h() > 0.0f) {
                        float h = (c10874y70.h() * (f + f2)) / 2.0f;
                        createColorFilterEffect = RenderEffect.createBlurEffect(h, h, createColorFilterEffect, Shader.TileMode.CLAMP);
                    }
                    this.z.setRenderEffect(createColorFilterEffect);
                    this.A = c10874y70;
                }
                RectF b2 = b(this.d, c10874y70);
                RectF rectF = new RectF(b2.left * f, b2.top * f2, b2.right * f, b2.bottom * f2);
                this.z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                beginRecording = this.z.beginRecording((int) rectF.width(), (int) rectF.height());
                beginRecording.translate((-rectF.left) + (c10874y70.f() * f), (-rectF.top) + (c10874y70.g() * f2));
                beginRecording.drawRenderNode(this.y);
                this.z.endRecording();
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.drawRenderNode(this.z);
                canvas.restore();
                return;
            }
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
    }

    public Canvas j(Canvas canvas, RectF rectF, b bVar) {
        RecordingCanvas beginRecording;
        if (this.a == null) {
            if (this.q == null) {
                this.q = new float[9];
            }
            if (this.p == null) {
                this.p = new Matrix();
            }
            canvas.getMatrix(this.p);
            this.p.getValues(this.q);
            float[] fArr = this.q;
            float f = fArr[0];
            float f2 = fArr[4];
            if (this.j == null) {
                this.j = new RectF();
            }
            this.j.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
            this.a = canvas;
            this.b = bVar;
            this.c = c(canvas, bVar);
            if (this.d == null) {
                this.d = new RectF();
            }
            this.d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            if (this.k == null) {
                this.k = new C5353bY0();
            }
            this.k.reset();
            int i = a.a[this.c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                if (this.y == null) {
                                    this.y = C4656Wt1.a("OffscreenLayer.main");
                                }
                                if (bVar.c() && this.z == null) {
                                    this.z = C4656Wt1.a("OffscreenLayer.shadow");
                                    this.A = null;
                                }
                                if (bVar.a() || bVar.b()) {
                                    if (this.k == null) {
                                        this.k = new C5353bY0();
                                    }
                                    this.k.reset();
                                    C3889Ox1.c(this.k, bVar.b);
                                    this.k.setColorFilter(bVar.c);
                                    this.y.setUseCompositingLayer(true, this.k);
                                    if (bVar.c()) {
                                        RenderNode renderNode = this.z;
                                        if (renderNode != null) {
                                            renderNode.setUseCompositingLayer(true, this.k);
                                        } else {
                                            throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                                        }
                                    }
                                }
                                this.y.setAlpha(bVar.a / 255.0f);
                                if (bVar.c()) {
                                    RenderNode renderNode2 = this.z;
                                    if (renderNode2 != null) {
                                        renderNode2.setAlpha(bVar.a / 255.0f);
                                    } else {
                                        throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                                    }
                                }
                                this.y.setHasOverlappingRendering(true);
                                RenderNode renderNode3 = this.y;
                                RectF rectF2 = this.j;
                                renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                beginRecording = this.y.beginRecording((int) this.j.width(), (int) this.j.height());
                                beginRecording.setMatrix(B);
                                beginRecording.scale(f, f2);
                                beginRecording.translate(-rectF.left, -rectF.top);
                                return beginRecording;
                            }
                            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                        }
                        throw new RuntimeException("Invalid render strategy for OffscreenLayer");
                    }
                    if (this.f754o == null) {
                        C5353bY0 c5353bY0 = new C5353bY0();
                        this.f754o = c5353bY0;
                        c5353bY0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    if (g(this.l, this.j)) {
                        Bitmap bitmap = this.l;
                        if (bitmap != null) {
                            d(bitmap);
                        }
                        this.l = a(this.j, Bitmap.Config.ARGB_8888);
                        this.m = new Canvas(this.l);
                    } else {
                        Canvas canvas2 = this.m;
                        if (canvas2 != null) {
                            canvas2.setMatrix(B);
                            this.m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.f754o);
                        } else {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                        }
                    }
                    C3889Ox1.c(this.k, bVar.b);
                    this.k.setColorFilter(bVar.c);
                    this.k.setAlpha(bVar.a);
                    Canvas canvas3 = this.m;
                    canvas3.scale(f, f2);
                    canvas3.translate(-rectF.left, -rectF.top);
                    return canvas3;
                }
                this.k.setAlpha(bVar.a);
                this.k.setColorFilter(bVar.c);
                if (bVar.a()) {
                    C3889Ox1.c(this.k, bVar.b);
                }
                C6006eE2.o(canvas, rectF, this.k);
                return canvas;
            }
            canvas.save();
            return canvas;
        }
        throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
    }
}
