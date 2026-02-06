package o;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* renamed from: o.tM0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9716tM0 {
    public static final Object e = new Object();
    public final Context a;
    public final String b;
    public InterfaceC9473sM0 c;
    public final Map<String, C9653t61> d;

    public C9716tM0(Drawable.Callback callback, String str, InterfaceC9473sM0 interfaceC9473sM0, Map<String, C9653t61> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.b = str + '/';
        } else {
            this.b = str;
        }
        this.d = map;
        e(interfaceC9473sM0);
        if (!(callback instanceof View)) {
            this.a = null;
        } else {
            this.a = ((View) callback).getContext().getApplicationContext();
        }
    }

    public Bitmap a(String str) {
        C9653t61 c9653t61 = this.d.get(str);
        if (c9653t61 == null) {
            return null;
        }
        Bitmap b = c9653t61.b();
        if (b != null) {
            return b;
        }
        InterfaceC9473sM0 interfaceC9473sM0 = this.c;
        if (interfaceC9473sM0 != null) {
            Bitmap a = interfaceC9473sM0.a(c9653t61);
            if (a != null) {
                d(str, a);
            }
            return a;
        }
        Context context = this.a;
        if (context == null) {
            return null;
        }
        String d = c9653t61.d();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (d.startsWith("data:") && d.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(d.substring(d.indexOf(44) + 1), 0);
                try {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    if (decodeByteArray == null) {
                        C7190j41.e("Decoded image `" + str + "` is null.");
                        return null;
                    }
                    return d(str, C6006eE2.n(decodeByteArray, c9653t61.g(), c9653t61.e()));
                } catch (IllegalArgumentException e2) {
                    C7190j41.f("Unable to decode image `" + str + "`.", e2);
                    return null;
                }
            } catch (IllegalArgumentException e3) {
                C7190j41.f("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.b)) {
                AssetManager assets = context.getAssets();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.b + d), null, options);
                    if (decodeStream == null) {
                        C7190j41.e("Decoded image `" + str + "` is null.");
                        return null;
                    }
                    return d(str, C6006eE2.n(decodeStream, c9653t61.g(), c9653t61.e()));
                } catch (IllegalArgumentException e4) {
                    C7190j41.f("Unable to decode image `" + str + "`.", e4);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e5) {
            C7190j41.f("Unable to open asset.", e5);
            return null;
        }
    }

    public C9653t61 b(String str) {
        return this.d.get(str);
    }

    public boolean c(Context context) {
        if (context == null) {
            if (this.a != null) {
                return false;
            }
            return true;
        }
        if (this.a instanceof Application) {
            context = context.getApplicationContext();
        }
        if (context != this.a) {
            return false;
        }
        return true;
    }

    public final Bitmap d(String str, Bitmap bitmap) {
        synchronized (e) {
            this.d.get(str).i(bitmap);
        }
        return bitmap;
    }

    public void e(InterfaceC9473sM0 interfaceC9473sM0) {
        this.c = interfaceC9473sM0;
    }

    public Bitmap f(String str, Bitmap bitmap) {
        if (bitmap == null) {
            C9653t61 c9653t61 = this.d.get(str);
            Bitmap b = c9653t61.b();
            c9653t61.i(null);
            return b;
        }
        Bitmap b2 = this.d.get(str).b();
        d(str, bitmap);
        return b2;
    }
}
