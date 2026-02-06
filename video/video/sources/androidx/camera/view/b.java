package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.view.PreviewView;
import o.C10589wx;
import o.C10907yF1;
import o.C3051Gi2;
import o.C4500Ve2;
import o.C5433bs2;
import o.C7433k41;

/* loaded from: classes.dex */
public final class b {
    public static final String i = "PreviewTransform";
    public static final PreviewView.g j = PreviewView.g.FILL_CENTER;
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public PreviewView.g h = j;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PreviewView.g.values().length];
            a = iArr;
            try {
                iArr[PreviewView.g.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PreviewView.g.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[PreviewView.g.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[PreviewView.g.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[PreviewView.g.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[PreviewView.g.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static RectF b(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    public static void p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.g gVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.a[gVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C7433k41.c(i, "Unexpected crop rect: " + gVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (gVar != PreviewView.g.FIT_CENTER && gVar != PreviewView.g.FIT_START && gVar != PreviewView.g.FIT_END) {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
            return;
        }
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
    }

    public Bitmap a(Bitmap bitmap, Size size, int i2) {
        if (!m()) {
            return bitmap;
        }
        Matrix k = k();
        RectF l = l(size, i2);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(k);
        matrix.postScale(l.width() / this.a.getWidth(), l.height() / this.a.getHeight());
        matrix.postTranslate(l.left, l.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    public Matrix c(Size size, int i2) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        j(size, i2).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public RectF d(Size size, int i2) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size f = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, f.getWidth(), f.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.h);
        matrix.mapRect(rectF2);
        if (i2 == 1) {
            return b(rectF2, size.getWidth() / 2.0f);
        }
        return rectF2;
    }

    public final int e() {
        if (!this.g) {
            return this.c;
        }
        return -C10589wx.c(this.e);
    }

    public final Size f() {
        if (C5433bs2.h(this.c)) {
            return new Size(this.b.height(), this.b.width());
        }
        return new Size(this.b.width(), this.b.height());
    }

    public PreviewView.g g() {
        return this.h;
    }

    public Matrix h(Size size, int i2) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.d);
        matrix.postConcat(j(size, i2));
        return matrix;
    }

    public Rect i() {
        return this.b;
    }

    public Matrix j(Size size, int i2) {
        RectF d;
        C10907yF1.n(m());
        if (n(size)) {
            d = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            d = d(size, i2);
        }
        Matrix d2 = C5433bs2.d(new RectF(this.b), d, this.c);
        if (this.f && this.g) {
            if (C5433bs2.h(this.c)) {
                d2.preScale(1.0f, -1.0f, this.b.centerX(), this.b.centerY());
                return d2;
            }
            d2.preScale(-1.0f, 1.0f, this.b.centerX(), this.b.centerY());
        }
        return d2;
    }

    public Matrix k() {
        C10907yF1.n(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        return C5433bs2.d(rectF, rectF, e());
    }

    public final RectF l(Size size, int i2) {
        C10907yF1.n(m());
        Matrix j2 = j(size, i2);
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        j2.mapRect(rectF);
        return rectF;
    }

    public final boolean m() {
        boolean z;
        if (this.g && this.e == -1) {
            z = false;
        } else {
            z = true;
        }
        if (this.b != null && this.a != null && z) {
            return true;
        }
        return false;
    }

    public boolean n(Size size) {
        return C5433bs2.j(size, true, f(), false);
    }

    public void o(int i2, int i3) {
        if (!this.g) {
            return;
        }
        this.c = i2;
        this.e = i3;
    }

    public void q(PreviewView.g gVar) {
        this.h = gVar;
    }

    public void r(C3051Gi2.h hVar, Size size, boolean z) {
        C7433k41.a(i, "Transformation info set: " + hVar + C4500Ve2.b + size + C4500Ve2.b + z);
        this.b = hVar.a();
        this.c = hVar.c();
        this.e = hVar.e();
        this.a = size;
        this.f = z;
        this.g = hVar.f();
        this.d = hVar.d();
    }

    public void s(Size size, int i2, View view) {
        boolean z;
        if (size.getHeight() != 0 && size.getWidth() != 0) {
            if (!m()) {
                return;
            }
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z2 = false;
                if (this.g && display != null && display.getRotation() != this.e) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.g && e() != 0) {
                    z2 = true;
                }
                if (z || z2) {
                    C7433k41.c(i, "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF l = l(size, i2);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(l.width() / this.a.getWidth());
            view.setScaleY(l.height() / this.a.getHeight());
            view.setTranslationX(l.left - view.getLeft());
            view.setTranslationY(l.top - view.getTop());
            return;
        }
        C7433k41.p(i, "Transform not applied due to PreviewView size: " + size);
    }
}
