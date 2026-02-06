package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* renamed from: o.Sn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4242Sn implements InterfaceC7290jT1<ImageDecoder.Source, Bitmap> {
    public static final String b = "BitmapImageDecoder";
    public final InterfaceC4931Zn a = new C5171ao();

    @Override // o.InterfaceC7290jT1
    public /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, C5448bw1 c5448bw1) throws IOException {
        return d(C4142Rn.a(source), c5448bw1);
    }

    @Override // o.InterfaceC7290jT1
    public /* bridge */ /* synthetic */ InterfaceC5580cT1<Bitmap> b(ImageDecoder.Source source, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        return c(C4142Rn.a(source), i, i2, c5448bw1);
    }

    public InterfaceC5580cT1<Bitmap> c(ImageDecoder.Source source, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new C6191f00(i, i2, c5448bw1));
        if (Log.isLoggable(b, 2)) {
            Log.v(b, "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + C6566gU0.g);
        }
        return new C6141eo(decodeBitmap, this.a);
    }

    public boolean d(ImageDecoder.Source source, C5448bw1 c5448bw1) throws IOException {
        return true;
    }
}
