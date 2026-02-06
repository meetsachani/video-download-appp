package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: o.Dc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2719Dc {
    public static final int[] c = {16843067, 16843068};
    public final ProgressBar a;
    public Bitmap b;

    /* renamed from: o.Dc$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public C2719Dc(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Bitmap b() {
        return this.b;
    }

    public void c(AttributeSet attributeSet, int i) {
        C2872Ep2 G = C2872Ep2.G(this.a.getContext(), attributeSet, c, i, 0);
        Drawable i2 = G.i(0);
        if (i2 != null) {
            this.a.setIndeterminateDrawable(e(i2));
        }
        Drawable i3 = G.i(1);
        if (i3 != null) {
            this.a.setProgressDrawable(d(i3, false));
        }
        G.I();
    }

    public Drawable d(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof CN2) {
            CN2 cn2 = (CN2) drawable;
            Drawable a2 = cn2.a();
            if (a2 != null) {
                cn2.b(d(a2, z));
                return drawable;
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = d(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                a.a(layerDrawable, layerDrawable2, i2);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.b == null) {
                this.b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable d = d(animationDrawable.getFrame(i), true);
                d.setLevel(10000);
                animationDrawable2.addFrame(d, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }
}
