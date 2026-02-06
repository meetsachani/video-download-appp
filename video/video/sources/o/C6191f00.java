package o;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* renamed from: o.f00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6191f00 implements ImageDecoder$OnHeaderDecodedListener {
    public static final String h = "ImageDecoder";
    public final C5770dG0 a = C5770dG0.c();
    public final int b;
    public final int c;
    public final VV d;
    public final AbstractC8674p60 e;
    public final boolean f;
    public final EG1 g;

    /* renamed from: o.f00$a */
    /* loaded from: classes.dex */
    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C6191f00(int i, int i2, C5448bw1 c5448bw1) {
        boolean z;
        this.b = i;
        this.c = i2;
        this.d = (VV) c5448bw1.c(C10138v60.g);
        this.e = (AbstractC8674p60) c5448bw1.c(AbstractC8674p60.h);
        C4274Sv1<Boolean> c4274Sv1 = C10138v60.k;
        if (c5448bw1.c(c4274Sv1) != null && ((Boolean) c5448bw1.c(c4274Sv1)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.g = (EG1) c5448bw1.c(C10138v60.h);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace colorSpace;
        ColorSpace.Named a2;
        ColorSpace colorSpace2;
        if (this.a.g(this.b, this.c, this.f, false)) {
            WZ.a(imageDecoder, 3);
        } else {
            WZ.a(imageDecoder, 1);
        }
        if (this.d == VV.PREFER_RGB_565) {
            YZ.a(imageDecoder, 0);
        }
        ZZ.a(imageDecoder, new a());
        Size a3 = C4978a00.a(imageInfo);
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = a3.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = a3.getHeight();
        }
        float b = this.e.b(a3.getWidth(), a3.getHeight(), i, i2);
        int round = Math.round(a3.getWidth() * b);
        int round2 = Math.round(a3.getHeight() * b);
        if (Log.isLoggable(h, 2)) {
            Log.v(h, "Resizing from [" + a3.getWidth() + "x" + a3.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
        }
        C5221b00.a(imageDecoder, round, round2);
        EG1 eg1 = this.g;
        if (eg1 != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (eg1 == EG1.DISPLAY_P3 && C5463c00.a(imageInfo) != null && C5706d00.a(C5463c00.a(imageInfo))) {
                    a2 = C5948e00.a();
                } else {
                    a2 = C4533Vn.a();
                }
                colorSpace2 = ColorSpace.get(a2);
                XZ.a(imageDecoder, colorSpace2);
            } else if (i3 >= 26) {
                colorSpace = ColorSpace.get(C4533Vn.a());
                XZ.a(imageDecoder, colorSpace);
            }
        }
    }
}
