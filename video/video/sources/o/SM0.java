package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class SM0 {

    /* loaded from: classes.dex */
    public static final class a implements ImageDecoder$OnHeaderDecodedListener {
        public final /* synthetic */ XA0<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, C7458kA2> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(XA0<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C7458kA2> xa0) {
            this.a = xa0;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.a.P(imageDecoder, imageInfo, source);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ImageDecoder$OnHeaderDecodedListener {
        public final /* synthetic */ XA0<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, C7458kA2> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(XA0<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C7458kA2> xa0) {
            this.a = xa0;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.a.P(imageDecoder, imageInfo, source);
        }
    }

    public static final Bitmap a(ImageDecoder.Source source, XA0<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C7458kA2> xa0) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, PM0.a(new a(xa0)));
        return decodeBitmap;
    }

    public static final Drawable b(ImageDecoder.Source source, XA0<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C7458kA2> xa0) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, PM0.a(new b(xa0)));
        return decodeDrawable;
    }
}
